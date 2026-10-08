package empmng.exception;


//環境不備等、復旧できないエラー
public class SystemException extends RuntimeException {
    
    public SystemException(String message, Throwable cause) {
        super(message, cause);
        
    }
}
