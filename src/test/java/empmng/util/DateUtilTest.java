package empmng.util;

import static org.assertj.core.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class DateUtilTest {

    @Test
    void testParseDate() {
        LocalDate result = DateUtil.parseDate("2026/10/05");
        
        assertThat(result).isEqualTo(LocalDate.of(2026, 10, 5));
    }

    @Test
    void testFormatDate() {
        LocalDate date = LocalDate.of(2026, 10, 5);
        String result = DateUtil.formatDate(date);
        
        assertThat(result).isEqualTo("2026/10/05");
    }

}
