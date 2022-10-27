package vol1examples.text.NumberFormat;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;
import java.text.ParseException;

class Main {

    public static void main(String[] args) {
        Locale loc = Locale.US;
        double myNumber = 1234.56;
        NumberFormat numform;
        DecimalFormat decform;
        int WIDTHCOL1 = 33;
        int WIDTHCOL2 = 29;
        int WIDTHCOL3 = 14;
        int WIDTHCOL0 = 10;

        printAlignColumn("COUNTRY:  ", 0);
        printAlignColumn(loc.getDisplayName(), 0);
        printAlignColumn("\n", 0);

        for (int j = 0; j < 4; ++j) {
            switch (j) {
            case 0:
                printAlignColumn("\n", 0);
                printAlignColumn("INSTANCE:", WIDTHCOL0);
                printAlignColumn("PATTERN", WIDTHCOL2);
                printAlignColumn("FORMATTED", WIDTHCOL3);
                printAlignColumn("PARSED\n", 0); 
                break;
            case 1:
                printAlignColumn("\n", 0);
                printAlignColumn("NUMBER:", WIDTHCOL0);
                printAlignColumn("PATTERN", WIDTHCOL2);
                printAlignColumn("FORMATTED", WIDTHCOL3);
                printAlignColumn("PARSED\n", 0); 
                break;
            case 2:
                printAlignColumn("\n", 0);
                printAlignColumn("PERCENT:", WIDTHCOL0);
                printAlignColumn("PATTERN", WIDTHCOL2);
                printAlignColumn("FORMATTED", WIDTHCOL3);
                printAlignColumn("PARSED\n", 0); 
                break;
            default:
                printAlignColumn("\n", 0);
                printAlignColumn("CURRENCY:", WIDTHCOL0);
                printAlignColumn("PATTERN", WIDTHCOL2);
                printAlignColumn("FORMATTED", WIDTHCOL3);
                printAlignColumn("PARSED\n", 0); 
                break;
            }

            printAlignColumn("", WIDTHCOL0);

            switch (j) {
            case 0:
              numform =
                 NumberFormat.getInstance(loc);         // 1,234.56
                break;
            case 1:
              numform =
                 NumberFormat.getNumberInstance(loc);   // 1,234.56
                break;
            case 2:
              numform =
                 NumberFormat.getPercentInstance(loc);  // 123,456%
                break;
            default:
              numform =
                 NumberFormat.getCurrencyInstance(loc); // $1,234.56
                break;
            }

                // Test before casting
            if (numform instanceof DecimalFormat) {

                // Cast to DecimalFormat
                decform = (DecimalFormat)numform;
                try {
                    // Print pattern.
                    printAlignColumn(decform.toPattern(), WIDTHCOL2);

                    // Print formatted number (a string).
                    printAlignColumn(decform.format(myNumber), WIDTHCOL3);

                } catch (IllegalArgumentException iae) { }

                try {

                    // Print parsed string (a number).
                    System.out.println(decform.parse(decform.format(myNumber)));

                } catch (ParseException pe) { 
                    System.out.println("Parse exception");
                }
            }
        }
    }

    static void printAlignColumn(String str, int col) {
        System.out.print(str);
        for (int p = str.length(); p < col; ++p) {
            System.out.print(" ");
        }
    }
}
