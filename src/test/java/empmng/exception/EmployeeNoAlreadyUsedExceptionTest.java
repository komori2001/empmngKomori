package empmng.exception;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeNoAlreadyUsedExceptionTest {

    @Test
    void testEmployeeNoAlreadyUsedException() {
        EmployeeNoAlreadyUsedException exception = new EmployeeNoAlreadyUsedException(1);
        
        assertThat(exception).isInstanceOf(Exception.class);
        
        assertThat(exception.getMessage()).isEqualTo("社員番号[1]はすでに使われています");
    }

}
