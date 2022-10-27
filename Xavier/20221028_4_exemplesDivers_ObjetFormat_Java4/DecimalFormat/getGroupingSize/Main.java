import java.text.*;
import java.util.Locale;

class Main {

    // Create number format.
    static NumberFormat numform  = 
            (DecimalFormat)NumberFormat.getInstance(Locale.JAPANESE);

    // Declare decimal format.
    static DecimalFormat decform;

    public static void main(String[] args) {

        if (numform instanceof DecimalFormat) {
            decform = (DecimalFormat)numform;

            decform.applyPattern("#,##0.#;(#,##0.#)");     // Paren for neg val
            System.out.println(decform.format(-1234.56));  // (1,234.6)

            print(decform.getGroupingSize());              //  "3"
            print(decform.getNegativePrefix());            //  "("
            print(decform.getNegativeSuffix());            //  ")"
            print(decform.getPositivePrefix());            //  ""
            print(decform.getPositiveSuffix());            //  ""
        }
    }

    static String QUOTE = "\"";

    // To help with readability.
    static void print(Object s) {
        System.out.println(QUOTE + s + QUOTE);
    }

    static void print(int i) {
        System.out.println(QUOTE + i + QUOTE);
    }
}
