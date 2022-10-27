import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.*;

class Main {
    public static void main(String[] args) {

        // Create a date formatter. 
        SimpleDateFormat dateformat = 
            new SimpleDateFormat (); 

        // Create an instance of DateFormatSymbols.
        DateFormatSymbols dfs = new DateFormatSymbols();

        // Modify the short month string to be all uppercase.
        dfs.setShortMonths(new String[]
                        {"JAN", "FEB", "MAR", "APR", "MAY", "JUN",
                         "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"});

        // Apply pattern.
        dateformat.applyPattern("dd-MMM-yyyy - H:mm:ss zzzz");

        // Apply the symbols to this date format.
        dateformat.setDateFormatSymbols(dfs);

        // Format the current time.
        String dateString = dateformat.format(new Date());
        System.out.println(dateString + "\n");
                                         // "27-NOV-1997 - 5:44:47 GMT+01:00"

        // Get and print out the first short month string.
        String month = dateformat.getDateFormatSymbols().getShortMonths()[0];
        System.out.println(month);       // "JAN"
    }
}
