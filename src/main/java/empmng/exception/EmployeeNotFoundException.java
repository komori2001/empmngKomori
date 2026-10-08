package empmng.exception;

public class EmployeeNotFoundException extends Exception {
    
    public EmployeeNotFoundException(int no) {
        super("社員番号[" + no + "]に該当する社員情報は存在しません");
    }

}
