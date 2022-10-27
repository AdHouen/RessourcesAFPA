import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;

class Main {

    public static void main(String[] args) {

//      String dateString = "dd.MM.yyyy 'à' H:mm:ss zzzz"
        
        Locale loc = Locale.FRENCH;

        System.out.println("Locale:              " + loc.getDisplayName());

        Date date = new Date();

        // Create a date formatter. 
        SimpleDateFormat dateformat = 
            new SimpleDateFormat ("", loc); 

        System.out.println("\napplyPattern ---------------------------");

        dateformat.applyPattern("dd.MMM.yyyy - H:mm:ss zzz");

        System.out.println("toLocalizedPattern:  " 
            + dateformat.toLocalizedPattern());

        System.out.println("toPattern:           " 
            + dateformat.toPattern());

        System.out.println("format:              " 
            + dateformat.format(date));

        System.out.println("\napplyLocalizedPattern ------------------");

        dateformat.applyLocalizedPattern("jj.nnn.aaaa - H:mm:ss zzz");

        System.out.println("toLocalizedPattern:  " 
            + dateformat.toLocalizedPattern());

        System.out.println("toPattern:           " 
            + dateformat.toPattern());

        System.out.println("format:              " 
            + dateformat.format(date));
    }
}
