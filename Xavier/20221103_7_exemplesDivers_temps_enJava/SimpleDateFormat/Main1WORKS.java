import java.text.SimpleDateFormat;
import java.util.*;

class Main1 {
    static int NARROW = 9;
    static int WIDE = 32;
    static int COLWIDTH;

    // Create the date January 3, 1956
    static Date date = 
        (new GregorianCalendar(1956, Calendar.JANUARY, 3, 2, 5)).getTime();

    // Create a date format.
    static SimpleDateFormat dfUS = new SimpleDateFormat ("", Locale.US); 
    static SimpleDateFormat dfFR = new SimpleDateFormat ("", Locale.FRENCH); 

    public static void main(String[] args) {

        System.out.println("Date:    " + date + "\n");

        COLWIDTH = NARROW;

        System.out.println("PATTERN  US        FRENCH");
        System.out.println("LETTER   EXAMPLE   EXAMPLE");

        formatPattern("d");      // 3
        formatPattern("dd");     // 03
        formatPattern("D");      // 3
        formatPattern("DD");     // 03
        formatPattern("F");      // 1
        formatPattern("FF");     // 01
        formatPattern("E");      // Tue
        formatPattern("EE");     // Tue
        formatPattern("EEE");    // Tue
        formatPattern("EEEE");   // Tuesday
        formatPattern("w");      // 1
        formatPattern("ww");     // 01
        formatPattern("W");      // 1
        formatPattern("WW");     // 01
        formatPattern("M");      // 1
        formatPattern("MM");     // 01
        formatPattern("MMM");    // Jan
        formatPattern("MMMM");   // January
        formatPattern("y");      // 56
        formatPattern("yy");     // 56
        formatPattern("yyy");    // 56
        formatPattern("yyyy");   // 1956
        formatPattern("yyyyy");  // 01956
        formatPattern("G");      // AD
        formatPattern("GG");      // AD
        formatPattern("GGG");      // AD
        formatPattern("K");      // 2
        formatPattern("KK");     // 02
        formatPattern("h");      // 2
        formatPattern("hh");     // 02
        formatPattern("H");      // 2
        formatPattern("HH");     // 02
        formatPattern("m");      // 5
        formatPattern("mm");     // 05
        formatPattern("s");      // 0
        formatPattern("ss");     // 00
        formatPattern("S");      // 0
        formatPattern("SS");     // 00
        formatPattern("a");      // AM
        formatPattern("aa");      // AM
        formatPattern("aaa");      // AM
        formatPattern("z");      // PST
        formatPattern("zz");      // PST
        formatPattern("zzz");      // PST

        System.out.println();

        COLWIDTH = WIDE;

        System.out.print("PATTERN ----------------------  ");
        System.out.println("EXAMPLE ---------------------------");
        formatPattern("yyyy.MM.dd G 'at' hh:mm:ss z");
                                 // 1956.02.03 AD at 02:30:00 PST

        formatPattern("EEE, MMM d, ''yy");
        formatPattern("h:mm a");
        formatPattern("H:mm");
        formatPattern("hh 'o''clock' a, zzzz");
        formatPattern("K:mm a, z"); 
        formatPattern("yyyyy.MMMMM.dd GGG hh:mm aaa");

    }

    public static void formatPattern(String pattern) {
        // Apply the pattern
        dfUS.applyPattern(pattern);

        // Space over for the US date.
        System.out.print(pattern);
        for (int i = 0; i < COLWIDTH - pattern.length(); i++) {
            System.out.print(" ");
        }
        // Format and print the US date.
        String us_result = dfUS.format(date);
        System.out.print(us_result);

        dfFR.applyPattern(pattern);

        // Space over for the French date.
        if (COLWIDTH == NARROW) {
            for (int i = 0; i < 10 - us_result.length(); i++) {
                System.out.print(" ");
            }
        } else {
            System.out.println();
            for (int i = 0; i < COLWIDTH; i++) {
                System.out.print(" ");
            }
        }
        System.out.println(dfFR.format(date));
    }
}
