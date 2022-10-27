import java.text.*;
import java.util.Locale;

class MainKEEP {

    // Create decimal format.
    static DecimalFormat decimalForm  = 
            (DecimalFormat)NumberFormat.getInstance(Locale.US);

    public static void main(String[] args) {

        // Create string buffer to hold decimal.
        StringBuffer strbuf = new StringBuffer("");

        // Default pattern
        System.out.println(decimalForm.format(-1234.56));   // -1,234.56

        // Apply different patterns and format each one
        decimalForm.applyPattern("0.##;-0.##");             // 2 decimal places
        System.out.println(decimalForm.format(-1234.56));   // -1234.56

        decimalForm.applyPattern("0.#;-0.#");               // 1 decimal place
        System.out.println(decimalForm.format(-1234.56));   // -1234.6 	

        decimalForm.applyPattern("#,##0.##;-#,##0.##");	    // Grouping separator
        System.out.println(decimalForm.format(-1234.56));   // -1,234.56

        decimalForm.applyPattern("00,000.000;-00,000.000"); // Leading/trailing zeros
        System.out.println(decimalForm.format(-1234.56));   // -01,234.560

        decimalForm.applyPattern("0;-0");                   // No decimal separator
        System.out.println(decimalForm.format(-1234.56));   // -1235

        decimalForm.applyPattern("###0.#;(###0.#)");        // Paren for neg val
        System.out.println(decimalForm.format(-1234.56));   // (1234.6)

        decimalForm.applyPattern("###0.#;###0.#-");         // Suffix minus sign
        System.out.println(decimalForm.format(-1234.56));   // 1234.6-

        decimalForm.applyPattern("#,##0%;#,##0%");          // Percentage
        System.out.println(decimalForm.format(-1234.56));   // -123,456%
    }
}
