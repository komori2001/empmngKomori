package empmng.view;

public class MainMenuView extends View{
    
    
    protected void showContents() {
        System.out.println("1.  Show Employees List");
        System.out.println("2.  Add New Employee");
        System.out.println("3.  Delete Employee");
        System.out.println("");
        System.out.println("9.Exit");
        System.out.println("");
        
        String num = readinputData("Select No.  > ");
        
        if  (num.equals("9")) {
            System.exit(0);
        } 
        
        View view = selectView(num);
        
        
        if (view != null) {
            view.doStart();
        } else {
            showErrorMessage("不正な番号が指定されました");
        }
    }
    
    @Override
    protected String getTitle() {
        return "MENU";
    }
    
    
    private View selectView(String selectedNo)  {

        if (selectedNo.equals("1")) {
            EmployeeListView view = new EmployeeListView();
            return view;
            
        } else if (selectedNo.equals("2")) {
            EmployeeAddView view = new EmployeeAddView();
            return view;
            
        } else if (selectedNo.equals("3")) {
            EmployeeDeleteView view = new EmployeeDeleteView();
            return view;
            
        } 
        return null;                  // return は}の横には書かない
    }

}
