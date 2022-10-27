import java.text.SimpleDateFormat;
import java.util.*;

class Main1 {
    // Set column widths.
    static int NARROW = 12;
    static int WIDE = 42;

    // Create the date January 3, 1956
    static Date date = 
        (new GregorianCalendar(1956, Calendar.JANUARY, 3, 2, 5)).getTime();

    // Create a date format.
    static SimpleDateFormat[] sdf = new SimpleDateFormat[] {
                            new SimpleDateFormat ("", Locale.US),
                            new SimpleDateFormat ("", Locale.FRENCH), 
                            new SimpleDateFormat ("", Locale.GERMAN), 
                            new SimpleDateFormat ("", new Locale("cs", "CZ")), 
                            new SimpleDateFormat ("", Locale.ITALY)
                        };

    public static void main(String[] args) {

        System.out.println("Date:    " + date + "\n");

        System.out.println("PATTERN     US                     " +
                           "FRENCH      GERMAN      CZECH       ITALIAN");
        
        System.out.println("LETTER      EXAMPLE                " + 
                           "EXAMPLE     EXAMPLE     EXAMPLE     EXAMPLE");

                                      // US          FRENCH
                                      // EXAMPLE     EXAMPLE
        formatPatternLetters("d");      // 3         3
        formatPatternLetters("dd");     // 03        03
        formatPatternLetters("D");      // 3         3
        formatPatternLetters("DD");     // 03        03
        formatPatternLetters("F");      // 1         1
        formatPatternLetters("FF");     // 01        01
        formatPatternLetters("E");      // Tue       mar
        formatPatternLetters("EE");     // Tue       mar
        formatPatternLetters("EEE");    // Tue       mar
        formatPatternLetters("EEEE");   // Tuesday   mardi 
        formatPatternLetters("w");      // 1         2
        formatPatternLetters("ww");     // 01        02
        formatPatternLetters("W");      // 1         2
        formatPatternLetters("WW");     // 01        02
        formatPatternLetters("M");      // 1         1
        formatPatternLetters("MM");     // 01        01
        formatPatternLetters("MMM");    // Jan       jan
        formatPatternLetters("MMMM");   // January   janvier 
        formatPatternLetters("y");      // 56        56
        formatPatternLetters("yy");     // 56        56
        formatPatternLetters("yyy");    // 56        56
        formatPatternLetters("yyyy");   // 1956      1956
        formatPatternLetters("yyyyy");  // 01956     1956
        formatPatternLetters("G");      // AD        ap. J.-C.
        formatPatternLetters("GG");     // AD        ap. J.-C.
        formatPatternLetters("GGG");    // AD        ap. J.-C.
        formatPatternLetters("K");      // 2         11
        formatPatternLetters("KK");     // 02        11
        formatPatternLetters("h");      // 2         11
        formatPatternLetters("hh");     // 02        11
        formatPatternLetters("H");      // 2         11
        formatPatternLetters("HH");     // 02        11
        formatPatternLetters("m");      // 5         5
        formatPatternLetters("mm");     // 05        05
        formatPatternLetters("s");      // 0         0
        formatPatternLetters("ss");     // 00        00
        formatPatternLetters("S");      // 0         0
        formatPatternLetters("SS");     // 00        00
        formatPatternLetters("a");      // AM        AM
        formatPatternLetters("aa");     // AM        AM
        formatPatternLetters("aaa");    // AM        AM
        formatPatternLetters("z");      // PST       GMT+01:00
        formatPatternLetters("zz");     // PST       GMT+01:00
        formatPatternLetters("zzz");    // PST       GMT+01:00
        formatPatternLetters("zzzz");   // Pacific Standard Time  GMT+01:00

        System.out.println();

        System.out.print("PATTERNS");
        System.out.print(" ------------------------------------------ ");
        System.out.println("LOCALE  " + "\n");

        formatPattern("EEEE, MMMM d, yyyy", 0);             // US
                    // Tuesday, January 3, 1956

        formatPattern("EEEE d MMMM yyyy", 1);               // FRENCH
                    // mardi 3 janvier 1956

        formatPattern("EEE, MMM d, ''yy", 0);               // US
                    // Tue, Jan 3, '56

        formatPattern("EEE d MMM yy", 1);                   // FRENCH
                    // mar 3 jan 56

        formatPattern("h:mm a z", 0);                       // US
                    // 2:05 AM PST

        formatPattern("k'H'mm z", 1);                       // FRENCH
                    // 11H05 GMT+01:00

        formatPattern("h 'o''clock' a, zzzz", 0);           // US
                    // 2 o'clock AM, Pacific Standard Time

        formatPattern("h 'heures' zzzz", 1);                // FRENCH
                    // 11 heures GMT+01:00

        formatPattern("yyyy.MM.dd G 'at' hh:mm:ss z" , 0);  // US
                    // 1956.02.03 AD at 02:05:00 PST

        formatPattern("yyyy.MM.dd G 'à' kk:mm:ss z" , 1);   // FRENCH
                    // 1956.02.03 AD à  02:05:00 GMT+01:00
    }

    public static void formatPatternLetters(String pattern) {
        sdf[0].applyPattern(pattern);
        System.out.print(pattern);
        int currentColumnTextWidth = pattern.length();
        String example;
        int narrowTmp;

        // Apply the pattern.
        for (int loc = 0; loc < sdf.length; loc++) {
            sdf[loc].applyPattern(pattern);

            // Add more space for "Pacific Standard Time"
            if (loc == 1) {
                narrowTmp = NARROW + 11;
            } else {
                narrowTmp = NARROW;
            }
            // Print spaces for the example date.
            printSpaces(narrowTmp - currentColumnTextWidth);

            // Format and print the example date.
            example = sdf[loc].format(date);
            System.out.print(example);

            currentColumnTextWidth = example.length();
        }
        System.out.println();
    }

    public static void formatPattern(String pattern, int localeIndex) {
        sdf[0].applyPattern(pattern);
        System.out.print("Pattern:  " + pattern);
        int currentColumnTextWidth = pattern.length();
        String example;
        String localeString = "";

        // Apply the pattern.
        sdf[localeIndex].applyPattern(pattern);

        // Space over for the example date.
        printSpaces(WIDE - currentColumnTextWidth);

        switch (localeIndex) {
            case 0:  localeString = "US      "; break;
            case 1:  localeString = "FRENCH  "; break;
            case 2:  localeString = "GERMAN  "; break;
            case 3:  localeString = "CZECH   "; break;
            case 4:  localeString = "ITALIAN "; break;
        }
        System.out.println(localeString);

        // Format and print the example date.
        example = sdf[localeIndex].format(date);
        System.out.println("Example:  " + example);
        System.out.println();
    }

    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}
