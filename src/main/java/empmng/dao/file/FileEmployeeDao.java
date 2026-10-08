package empmng.dao.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import empmng.dao.EmployeeDao;
import empmng.entity.Employee;
import empmng.exception.SystemException;
import empmng.util.DateUtil;

public class FileEmployeeDao implements EmployeeDao {
    
    private static final String FILENAME = "employees.csv";

    
    //全ての社員情報取得
    @Override
    public List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList<>();
        File file = new File (FILENAME);

        
        //ファイルが存在しないとき
        if (!file.exists()) {
            return new ArrayList<>();
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            
            String s = null;     //慣習：ローカル変数を宣言したら初期値を入れる
            while ((s = reader.readLine()) != null) {
                String[] cols = s.split(",");
                Employee emp = new Employee(cols[0], cols[1], cols[2]);
                employees.add(emp);
            }
            
        }catch(IOException e) {
            throw new SystemException("ファイルの読み込み中にエラーが発生しました", e);
        }
        return employees;
    }
    

    //社員番号noの社員情報削除
    @Override
    public void removeEmployee(int no) {
        List<Employee> employees = getEmployees();
        
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getNo() == no) {
                employees.remove(i);
                break;
            }
        }
        save(employees);
    }
    
    //パラメータの社員情報を追加
    @Override
    public void addEmployee(Employee employee) {
        
        List<Employee> employees = getEmployees();
        employees.add(employee);
        save(employees);
    }
    
    //社員番号noの社員が存在するか調べる
    @Override
    public boolean isExist(int no) {
        
        List<Employee> employees = getEmployees();

        for (Employee emp : employees) {
            //(型名 変数名：リスト名)
            if (emp.getNo() == no) {
                return true;
            }
        }
        return false;
    }
//        List<Employee> employees = getEmployees();
//        for (Employee emp : employees) {
//            System.out.println("登録済みNo = " + emp.getNo());
//            System.out.println("検索No = " + no);
//
//            if (emp.getNo() == no) {
//                return true;
//             }
//        }
//        return false;
//    }
        
        
    //ソート（社員番号順）してファイルに保存
    private void save(List<Employee> employees) {
        Collections.sort(employees);
        
        File file = new File (FILENAME);
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            
            for (Employee emp : employees) {
                //引数全てString型　　Employee(String no, String name, String birthday)
                
                String a =emp.getNo() + "," + emp.getName() + "," + DateUtil.formatDate(emp.getBirthday());
                writer.write(a);
                writer.newLine();
            }
        }catch(IOException e) {
            throw new SystemException("ファイルの保存中にエラーが発生しました", e);
        }
    }

}


