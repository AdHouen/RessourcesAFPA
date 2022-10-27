import java.text.DateFormat;
import java.text.ParsePosition;

class Main {

    // Create a parse position object to track parsing.
    static ParsePosition pos = new ParsePosition(0);

    public static void main(String args[]) {

        // Create a date format.
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);

        System.out.println(df.isLenient());   // true

        // Print normal date.
        print(df.parse("10-Feb-98", pos));    // Tue Feb 10 00:00:00 PST 1998

        // Reset parse position to start.
        pos.setIndex(0);

        // Print date outside of normal range.
        print(df.parse("38-Feb-98", pos));    // Tue Mar 10 00:00:00 PST 1998

        // Turn off lenient.
        df.setLenient(false); 

        // Reset parse position to start.
        pos.setIndex(0);

        // Print dates with lenient false.
        print(df.parse("10-Feb-98", pos));    // Tue Feb 10 00:00:00 PST 1998

        // Reset parse position to start.
        pos.setIndex(0);

        print(df.parse("31-Feb-98", pos)); 
                                     // IllegalArgumentException (JDK 1.1.5)
                                     // ParseException           (JDK 1.1.6)
    }

    static void print(Object s) {
        System.out.println(s);
    }
}
