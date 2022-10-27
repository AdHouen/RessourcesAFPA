import java.text.SimpleDateFormat;
import java.text.ParsePosition;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Locale locale = Locale.FRENCH;

        // Create a date formatter. 
        SimpleDateFormat formatter = 
            new SimpleDateFormat ("dd.MM.yy", locale); 

        printList(formatter);

        // Set a new start date.
        ParsePosition pos = new ParsePosition(0);
        Date newTwoDigitYearStart = formatter.parse("01.01.1950", pos);
        formatter.set2DigitYearStart(newTwoDigitYearStart);

        printList(formatter);
    }

    static void printList(SimpleDateFormat formatter) {
        // Print the start of the 2-digit year
        System.out.println("Starting year: " 
                      + formatter.get2DigitYearStart() + "\n");

        // Create a list of 2-digit years at 10-year intervals
        for (int i=00; i<=90; i+=10) {
            String dateString = "03.11." + i;

            // Parse this string into a Date. 
            ParsePosition pos = new ParsePosition(0); 
            Date parsedDate = formatter.parse(dateString, pos);
            System.out.println(dateString + "   " + parsedDate);
        }
        System.out.println();
    }
}
