package empmng.exception;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeNotFoundExceptionTest {

    @Test
    void testEmployeeNotFoundException() {
        EmployeeNotFoundException exception = new EmployeeNotFoundException(1);
        
        
        assertThat(exception).isInstanceOf(Exception.class);
        
        assertThat(exception.getMessage()).isEqualTo("社員番号[1]に該当する社員情報は存在しません");

    }

}
