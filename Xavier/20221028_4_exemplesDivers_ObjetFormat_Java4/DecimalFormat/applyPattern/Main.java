package vol1examples.text.DecimalFormat.applyPattern;

import java.text.*;
import java.util.Locale;

class Main {

    // Create number format.
    static NumberFormat numform = NumberFormat.getInstance(Locale.US);

    static DecimalFormat decform;

    public static void main(String[] args) {

        // Test that numform is a decimal format before casting.
        if (numform instanceof DecimalFormat) {

            decform = (DecimalFormat)numform;

            // Default pattern
            print(decform.format(-1234.56));                // -1,234.56

            // Apply patterns and format each one
            decform.applyPattern("0.##;-0.##");             // 2 decimal places
            print(decform.format(-1234.56));                // -1234.56

            decform.applyPattern("0.#;-0.#");               // 1 decimal place
            print(decform.format(-1234.56));                // -1234.6

            decform.applyPattern("#,##0.##;-#,##0.##");     // Group separator
            print(decform.format(-1234.56));                // -1,234.56

            decform.applyPattern("00,000.000;-00,000.000"); // Lead/trail zeros
            print(decform.format(-1234.56));                // -01,234.560

            decform.applyPattern("0;-0");                   // No decimal sep
            print(decform.format(-1234.56));                // -1235

            decform.applyPattern("###0.#;(###0.#)");        // Paren for neg val
            print(decform.format(-1234.56));                // (1234.6)

            decform.applyPattern("###0.#;###0.#-");         // Suffix minus sign
            print(decform.format(-1234.56));                // 1234.6-

            decform.applyPattern("#,##0%;#,##0%");          // Percentage
            print(decform.format(-1234.56));                // -123,456%
        }

    }

    // To help with readability.
    static void print(String s) {
        System.out.println(s);
    }
}
