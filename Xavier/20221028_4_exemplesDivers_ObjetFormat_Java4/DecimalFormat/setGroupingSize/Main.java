import java.text.*;
import java.util.Locale;

class Main {

    static NumberFormat numform = NumberFormat.getInstance(Locale.FRANCE);
    static DecimalFormat decform;

    public static void main(String[] args) {

        // Test before casting.
        if (numform instanceof DecimalFormat) {

            decform = (DecimalFormat)numform;

            decform.applyPattern("#,##0.#;(#,##0.#)");      // Paren for neg val
            System.out.println(decform.format(12345.67));   // 12 345.7
            System.out.println(decform.format(-12345.67));  // (12 345.7)

            decform.setGroupingSize(4);
            decform.setNegativePrefix("[");
            decform.setNegativeSuffix("]");
            decform.setPositivePrefix("+");
            decform.setPositiveSuffix("+");

            print(decform.getGroupingSize());               //  "4"
            print(decform.getNegativePrefix());             //  "["
            print(decform.getNegativeSuffix());             //  "]"
            print(decform.getPositivePrefix());             //  "+"
            print(decform.getPositiveSuffix());             //  "+"

            System.out.println(decform.format(12345.67));   // +1 2345,7+
            System.out.println(decform.format(-12345.67));  // [1 2345,7]
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
