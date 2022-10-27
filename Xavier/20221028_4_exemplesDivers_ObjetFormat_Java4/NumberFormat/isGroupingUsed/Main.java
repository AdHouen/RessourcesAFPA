package vol1examples.text.NumberFormat.isGroupingUsed;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Locale;

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

        numform =
             NumberFormat.getCurrencyInstance(loc);     // $1,234.56

        // Set the format to parse only integers
        numform.setParseIntegerOnly(true);
        System.out.println("isParseIntegerOnly: " 
                                   + numform.isParseIntegerOnly());

        // Set the format to not use grouping separator
        numform.setGroupingUsed(false);
        System.out.println("isGroupingUsed: " 
                                   + numform.isGroupingUsed());

        // Print the headings
        printAlignColumn("\n", 0);
        printAlignColumn("CURRENCY:", WIDTHCOL0);
        printAlignColumn("PATTERN", WIDTHCOL2);
        printAlignColumn("FORMATTED", WIDTHCOL3);
        printAlignColumn("PARSED\n", 0); 
        printAlignColumn("", WIDTHCOL0);

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

    static void printAlignColumn(String str, int col) {
        System.out.print(str);
        for (int p = str.length(); p < col; ++p) {
            System.out.print(" ");
        }
    }
}
