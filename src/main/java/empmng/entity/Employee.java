//社員データを保持するクラス

package empmng.entity;

import java.time.LocalDate;
import java.time.Period;

import empmng.util.DateUtil;

public class Employee implements Comparable<Employee> {
    
    private int no;
    private String name;
    private LocalDate birthday;
    
    
    public Employee() {
        
    }
    
    public Employee(String no, String name, String birthday) {
        this.no = Integer.parseInt(no);
        this.name = name;
        this.birthday = DateUtil.parseDate(birthday);
    }
    

    
    //社員番号を取得
    public int getNo() {
        return this.no;
        
    }
    
    //int型の社員番号をインスタンス変数noに代入
    public void setNo(int no) {
        this.no = no;
    }
    
    //名前を取得
    public String getName() {
        return this.name;
        
    }
    
    //String型の名前をインスタンス変数nameに代入
    public void setName(String name) {
        this.name = name;
    }
    
    //誕生日を取得
    public LocalDate getBirthday() {
        return this.birthday;
        
    }
    
    //LocalDate型の誕生日をインスタンス変数birthdayに代入
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    
    //年齢算出
    public int getAge() {
        return Period.between(birthday,LocalDate.now()).getYears();
        //現在と誕生日の差（Period型）を年齢（int型）にする
    }
    
    // インタフェースComparable<Employee>を実装
    // this < otherのとき負　
    @Override
    public int compareTo(Employee other) {
        return this.no - other.no;
    }

}
