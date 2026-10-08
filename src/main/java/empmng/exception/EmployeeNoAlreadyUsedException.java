package empmng.exception;

public class EmployeeNoAlreadyUsedException extends Exception {
    
    public EmployeeNoAlreadyUsedException(int no) {
        super("社員番号[" + no + "]はすでに使われています");
        
        
    }

}
