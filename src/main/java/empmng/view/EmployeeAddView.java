package empmng.view;

import empmng.entity.Employee;
import empmng.exception.EmployeeNoAlreadyUsedException;
import empmng.logic.EmployeeLogic;

public class EmployeeAddView extends View {

    @Override
    protected void showContents() {
        String no = readinputData("No. > ");
        String name = readinputData("Name > ");
        String birthday = readinputData("Birthday > ");
        
        Employee employee = new Employee(no, name, birthday);
        EmployeeLogic logic = new EmployeeLogic();
        
        try {
            logic.addEmployee(employee);
        } 
        catch (EmployeeNoAlreadyUsedException e) {
            System.out.println(e);
        }
        
    }
    
    @Override
    protected  String getTitle() {
        return "Add Employee" ;
    }

}




