package vol1examples.text.DecimalFormat;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;
import java.text.ParseException;

class Main {

    public static void main(String[] args) {
        Locale[] locales = NumberFormat.getAvailableLocales();
        double myNumber = 1234.56;
        NumberFormat numform;
        DecimalFormat decform = null;
        int WIDTHCOL1 = 33;
        int WIDTHCOL2 = 29;
        int WIDTHCOL3 = 14;
        int WIDTHCOL0 = 10;

        for (int j = 0; j < 3; ++j) {
            switch (j) {
            case 0:
                printInColumn("\n", 0);
                printInColumn("COUNTRY", WIDTHCOL1 - WIDTHCOL0);
                printInColumn("DECIMAL:", WIDTHCOL0);
                printInColumn("PATTERN", WIDTHCOL2);
                printInColumn("FORMATTED", WIDTHCOL3);
                printInColumn("PARSED\n", 0); 
                break;
            case 1:
                printInColumn("\n", 0);
                printInColumn("COUNTRY", WIDTHCOL1 - WIDTHCOL0);
                printInColumn("PERCENT:", WIDTHCOL0);
                printInColumn("PATTERN", WIDTHCOL2);
                printInColumn("FORMATTED", WIDTHCOL3);
                printInColumn("PARSED\n", 0); 
                break;
            default:
                printInColumn("\n", 0);
                printInColumn("COUNTRY", WIDTHCOL1 - WIDTHCOL0);
                printInColumn("CURRENCY:", WIDTHCOL0);
                printInColumn("PATTERN", WIDTHCOL2);
                printInColumn("FORMATTED", WIDTHCOL3);
                printInColumn("PARSED\n", 0); 
                break;
            }
            for (int i = 0; i < locales.length; ++i) {

                printInColumn(locales[i].getDisplayName(), WIDTHCOL1);

                switch (j) {
                case 0:
                    numform = NumberFormat.getInstance(locales[i]); 
                    break;
                case 1:
                    numform = NumberFormat.getPercentInstance(locales[i]);
                    break;
                default:
                    numform = NumberFormat.getCurrencyInstance(locales[i]);
                	//numform = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            		//numform = NumberFormat.getCurrencyInstance(Locale.getDefault());
                    break;
                }

                // Test numform is instance of DecimalFormat before casting.
                if (numform instanceof DecimalFormat) {

                    // Cast numform to a decimal format.
                    decform = (DecimalFormat)numform;

                    try {
                        // Print pattern.
                        printInColumn((decform).toLocalizedPattern(),
                                                                WIDTHCOL2);

                        // Print formatted number (a string).
                        printInColumn(decform.format(myNumber), WIDTHCOL3);
                    } catch (IllegalArgumentException iae) { }

                    try {
                        // Print the parsed string (a number).
                        print(decform.parse(decform.format(myNumber)));
                    } catch (ParseException pe) { 
                        print("Parse exception");
                    }
                }
            }
        }
    }

    static void printInColumn(String str, int col) {
        System.out.print(str);
        for (int p = str.length(); p < col; ++p) {
            System.out.print(" ");
        }
    }

    static void print(Object obj) {
        System.out.println(obj);
    }
}
