package empmng.view;


import empmng.entity.Employee;
import empmng.logic.EmployeeLogic;
import empmng.util.DateUtil;

public class EmployeeListView extends View  {

    @Override
    protected void showContents() {
        EmployeeLogic view = new EmployeeLogic();
        view.getEmployees();
        
        System.out.println("No   Name                 Age Birthday");
        System.out.println("---- -------------------- --- ----------");
        
        
        for (Employee emp : view.getEmployees()) {
            int no = emp.getNo();
            String name = emp.getName();
            int age = emp.getAge();
            String birthday = DateUtil.formatDate(emp.getBirthday());
            

            
            //0 ゼロ埋め, - 左詰め, s int, d String 
            System.out.printf("%04d" + " " + "%-20s" + " " + "%3d" + " " + "%10s" ,no, name, age, birthday);
            System.out.println("");
        }
    }
    
    @Override
    protected String getTitle() {
        return "Employee List";
    }

}

