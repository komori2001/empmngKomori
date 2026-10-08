package empmng.view;

import empmng.exception.EmployeeNotFoundException;
import empmng.logic.EmployeeLogic;

public class EmployeeDeleteView extends View {
    
    
    

    @Override
    protected void showContents() {
        String no = readinputData("No. > ");
        EmployeeLogic logic = new EmployeeLogic();
        try {
            logic.removeEmployee(Integer.parseInt(no));
            
        } 
        catch (EmployeeNotFoundException e) {
            System.out.println(e);
        }
    }
    
    @Override
    protected String getTitle() {
        return "Delete Employee";
    }

}

