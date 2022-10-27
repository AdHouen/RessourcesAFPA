import java.text.SimpleDateFormat;
import java.util.*;

class Main2 {
    public static void main(String[] args) {

        Locale locale = Locale.FRENCH;

        // Create a date formatter. 
        SimpleDateFormat formatter = 
            new SimpleDateFormat ("dd.MM.yyyy 'à' H:mm:ss zzzz", locale); 

        // Format the current time.
        String dateString = formatter.format(new Date());
        System.out.println(dateString + "\n");
                                          // 27.11.1997 à 5:44:10 GMT+01:00
    }
}
