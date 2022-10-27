import java.text.*;
import java.util.Locale;

class Main {

    public static void main(String[] args) {

        Locale loc = Locale.FRENCH;
        NumberFormat numform = null;
        DecimalFormat decform = null;
        DecimalFormatSymbols sym = new DecimalFormatSymbols(loc);

        // Print out language and country names.
        System.out.println(loc.getDisplayName());

        // Get the number format for the locale.
        numform = NumberFormat.getInstance(loc);

        // Test before casting.
        if (numform instanceof DecimalFormat) {

            // Cast the number format to a decimal format.
            decform = (DecimalFormat)numform;

            // Set the symbols for the given locale.
            decform.setDecimalFormatSymbols(sym);
                                                 //--French Values--
            print(sym.getZeroDigit());            //  "0"
            print(sym.getGroupingSeparator());    //  " "
            print(sym.getDecimalSeparator());     //  ","
            print(sym.getPerMill());              //  \u2030
            print(sym.getPercent());              //  "%"
            print(sym.getDigit());                //  "#"
            print(sym.getPatternSeparator());     //  ";"
            print(sym.getInfinity());             //  \u221E
            print(sym.getNaN());                  //  \uFFFD
            print(sym.getMinusSign());            //  "-"
            print("\n");
        }
    }

    static void print(char ch) {
        System.out.print(ch);
    }

    static void print(String str) {
        System.out.print(str);
    }
}
