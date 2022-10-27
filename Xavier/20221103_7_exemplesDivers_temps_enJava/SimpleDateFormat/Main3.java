import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.*;

class Main3 {
    public static void main(String[] args) {

        Locale locale = Locale.FRENCH;

        // Create an instance of DateFormat.
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.SHORT,
                                      DateFormat.SHORT, locale);

        if (df instanceof SimpleDateFormat) {
            SimpleDateFormat formatter = (SimpleDateFormat)df;

            // Apply a pattern. 
            formatter.applyPattern("yyyy.MM.dd 'at' hh:mm:ss a zzz"); 

            // Format the current time.
            String dateString = formatter.format(new Date());
            System.out.println(dateString + "\n");
                                    // 1997.11.27 at 05:44:10 AM GMT+01:00
        }
    }
}
