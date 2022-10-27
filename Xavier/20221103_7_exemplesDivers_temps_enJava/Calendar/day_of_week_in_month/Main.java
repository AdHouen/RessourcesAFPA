import java.util.*;
import java.text.*;

class Main {
    // Prints the date of the n'th dayOfWeek in month, year.
    static void printDate(int n, int dayOfWeek, int month, int year) {
        DateFormat formatter = new SimpleDateFormat("MMM dd yyyy");
        Calendar cal = Calendar.getInstance();

        cal.clear();
        cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, n);
        cal.set(Calendar.DAY_OF_WEEK, dayOfWeek);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.YEAR, year);
        System.out.println(formatter.format(cal.getTime()));
    }

    public static void main(String[] args) {
        // 1st Sunday of Jan 1997
        printDate(1, Calendar.SUNDAY, Calendar.JANUARY, 1997);   // Jan 05 1997
        // 4th Sunday of Jan 1997
        printDate(4, Calendar.SUNDAY, Calendar.JANUARY, 1997);   // Jan 26 1997
        // 9th Sunday of Jan 1997
        printDate(8, Calendar.SUNDAY, Calendar.JANUARY, 1997);   // Feb 23 1997

        // last Sunday of Jan 1997
        printDate(-1, Calendar.SUNDAY, Calendar.JANUARY, 1997);  // Jan 26 1997
        // 4th to last Sunday of Jan 1997
        printDate(-4, Calendar.SUNDAY, Calendar.JANUARY, 1997);  // Jan 05 1997
        // 8th to last Sunday of Jan 1997
        printDate(-8, Calendar.SUNDAY, Calendar.JANUARY, 1997);  // Dec 08 1996
    }
}
