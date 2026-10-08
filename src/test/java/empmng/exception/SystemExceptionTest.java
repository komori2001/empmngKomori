package empmng.exception;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SystemExceptionTest {

    @Test
    void testSystemException() {
        Throwable cause = new RuntimeException();
        SystemException exception = new SystemException("システムエラーが発生しました", cause);
        
        
        assertThat(exception).isInstanceOf(RuntimeException.class);
        
        assertThat(exception.getMessage()).isEqualTo("システムエラーが発生しました");
        
        assertThat(exception.getCause()).isEqualTo(cause);


    }

}
