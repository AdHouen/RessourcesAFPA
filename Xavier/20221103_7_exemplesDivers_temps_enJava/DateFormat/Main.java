import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

class Main {

    public static void main(String args[]) {
        int COL1WIDTH = 19;
        int COL2WIDTH = 10;
        String myString;
        Date date = new Date();
        Locale[] locArray = DateFormat.getAvailableLocales();
        int[] styles = { DateFormat.SHORT, 
                         DateFormat.MEDIUM, 
                         DateFormat.LONG, 
                         DateFormat.FULL,
                         DateFormat.DEFAULT };

        String[] styleNames = { "SHORT", "MEDIUM", "LONG", "FULL", "DEFAULT" };

        // Loop over the locales.
        for (int i = 0; i < locArray.length; ++i) {
            Locale loc = locArray[i];

            System.out.println("\n" + "----------------------------------");
            System.out.println(loc.getDisplayName() + "\n");

            System.out.println("getDateInstance()");

            // Create a instance of the current date in each style and print it.
            for (int s = 0; s < styles.length; s++) {
                myString = 
                DateFormat.getDateInstance(styles[s], loc).format(date);

                printInColumn("  Date", COL1WIDTH);
                printInColumn(styleNames[s], COL2WIDTH);
                System.out.println(myString);
            }

            System.out.println();
            System.out.println("getTimeInstance()");

            for (int s = 0; s < styles.length; s++) {
                myString = 
                DateFormat.getTimeInstance(styles[s], loc).format(date);

                printInColumn("  Time", COL1WIDTH);
                printInColumn(styleNames[s], COL2WIDTH);
                System.out.println(myString);
            }

            System.out.println();
            System.out.println("getDateTimeInstance()");

            for (int s = 0; s < styles.length; s++) {

                myString = 
                DateFormat.getDateTimeInstance(styles[s], 
                                               styles[s], loc).format(date);

                printInColumn("  Date and Time", COL1WIDTH);
                printInColumn((styleNames[s]), COL2WIDTH);
                System.out.println(myString);
            }

            System.out.println();
            System.out.println("getInstance()");

            myString = 
            DateFormat.getInstance().format(date);

            printInColumn("  Default", COL1WIDTH);
            printInColumn("SHORT", COL2WIDTH);
            System.out.println(myString);
        }
    }

    static void printInColumn(String str, int col) {
        System.out.print(str);
        for (int p = str.length(); p < col; ++p) {
            System.out.print(" ");
        }
    }
}
