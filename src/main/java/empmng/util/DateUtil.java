package empmng.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    
   

    
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    
    //文字列→日付
    public static LocalDate parseDate(String text) {
        return LocalDate.parse(text, formatter);
        
    }
    
    //日付→文字列
    public static String formatDate(LocalDate date) {
        
        return date.format(formatter);
        
    }
    
 

}
