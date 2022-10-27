import java.text.SimpleDateFormat;
import java.text.ParsePosition;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Locale locale = Locale.FRENCH;

        // Create a date formatter. 
        SimpleDateFormat formatter = 
            new SimpleDateFormat ("dd.MM.yyyy 'à' H:mm:ss zzzz", locale); 

        // Specify a date string.
        String dateString = "27.11.1997 à 16:30:00 GMT+01:00";

        // Parse a string into a Date. 
        ParsePosition pos = new ParsePosition(0); 
        Date currentTime = formatter.parse(dateString, pos);

        // Format the date to a string and print it out.
        System.out.println(formatter.format(currentTime) + "\n");
                                       // 27.11.1997 à 16:30:00 GMT+01:00
    }
}
