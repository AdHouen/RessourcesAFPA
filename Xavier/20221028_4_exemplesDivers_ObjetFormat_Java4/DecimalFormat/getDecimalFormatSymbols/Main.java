import java.text.*;
import java.util.Locale;

class Main {

    public static void main(String[] args) {

        Locale[] locales = NumberFormat.getAvailableLocales();
        NumberFormat numform = null;
        DecimalFormat decform = null;
        DecimalFormatSymbols sym = null;
        int WIDTHCOL = 33;
        int WIDTHCOL1 = 29;

        for (int i = 0; i < locales.length; ++i) {

            // Print out language and country names.
            printAlignColumn(locales[i].getDisplayName(), WIDTHCOL);
 
            // Get the number format for the locale.
            numform = NumberFormat.getInstance(locales[i]);

            // Cast the number format to a decimal format.
            if (numform instanceof DecimalFormat) {

                decform = (DecimalFormat)numform;
                sym = decform.getDecimalFormatSymbols();

                                                     //-- US Values --
                print(sym.getZeroDigit());            //  0
                print(sym.getGroupingSeparator());    //  ,
                print(sym.getDecimalSeparator());     //  .
                print(sym.getPerMill());              //  \u2030
                print(sym.getPercent());              //  %
                print(sym.getDigit());                //  #
                print(sym.getPatternSeparator());     //  ;
                print(sym.getInfinity());             //  \u221E
                print(sym.getNaN());                  //  \uFFFD
                print(sym.getMinusSign());            //  -
                print("\n");
            }
        }
    }

    static void printAlignColumn(String str, int col) {
        System.out.print(str);
        for (int p = str.length(); p < col; ++p) {
            System.out.print(" ");
        }
    }

    static void print(char ch) {
        System.out.print(ch);
    }

    static void print(String str) {
        System.out.print(str);
    }
}
