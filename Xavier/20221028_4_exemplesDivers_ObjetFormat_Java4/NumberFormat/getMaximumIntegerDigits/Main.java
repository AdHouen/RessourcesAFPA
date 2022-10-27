package vol1examples.text.NumberFormat.getMaximumIntegerDigits;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Locale;

class Main {

    public static void main(String[] args) {
        Locale loc = Locale.US;
        double[] myNumber = {123456.654321, 123.321};
        NumberFormat numform;
        DecimalFormat decform;
        int WIDTHCOL1 = 35;
        int WIDTHCOL2 = 20;

        printAlignColumn("COUNTRY:  ", 0);
        printAlignColumn(loc.getDisplayName(), 0);
        printAlignColumn("\n", 0);

        numform =
             NumberFormat.getCurrencyInstance(loc);     // $1,234.56

        // Set the maximum number of integer digits
        numform.setMaximumIntegerDigits(5);
        println("getMaximumIntegerDigits:  " 
                                + numform.getMaximumIntegerDigits());

        // Set the minimum number of integer digits
        numform.setMinimumIntegerDigits(4);
        println("getMinimumIntegerDigits:  " 
                                + numform.getMinimumIntegerDigits());


        // Set the maximum number of fraction digits
        numform.setMaximumFractionDigits(5);
        println("getMaximumFractionDigits: " 
                                + numform.getMaximumFractionDigits());

        // Set the minimum number of fraction digits
        numform.setMinimumFractionDigits(4);
        println("getMinimumFractionDigits: " 
                                + numform.getMinimumFractionDigits());

        for(int i=0; i<2; ++i) {

            println("\nOriginal number: "
                                  + Double.toString(myNumber[i]));

            // Print the headings
            printAlignColumn("\n", 0);
            println("CURRENCY");
            printAlignColumn("PATTERN", WIDTHCOL1);
            printAlignColumn("FORMATTED", WIDTHCOL2);
            printAlignColumn("PARSED\n", 0); 

            // Test before casting
            if (numform instanceof DecimalFormat) {

                // Cast to DecimalFormat
                decform = (DecimalFormat)numform;
                try {
                    // Print pattern.
                    printAlignColumn(decform.toPattern(), WIDTHCOL1);

                    // Print formatted number (a string).
                    printAlignColumn(decform.format(myNumber[i]), WIDTHCOL2);

                } catch (IllegalArgumentException iae) { }

                try {

                    // Print parsed string (a number).
                    println(decform.parse(decform.format(myNumber[i])));

                } catch (ParseException pe) { 
                    println("Parse exception");
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

    static void println(Object obj) {
        System.out.println(obj);
    }
}
