import java.text.*;
import java.util.Locale;

class Main {

    // Create number format.
    static NumberFormat numform = NumberFormat.getInstance(Locale.US);
    static DecimalFormat decform;

    public static void main(String[] args) {

        // Test before casting.
        if (numform instanceof DecimalFormat) {

            decform = (DecimalFormat)numform;

            printValue();                                 //  -1.23

            // Percent
            decform.setPositiveSuffix("%");
            decform.setNegativeSuffix("%");
            decform.setMultiplier(100);
            printValue();                                 //  -123%

            // Permill
            decform.setPositiveSuffix("\u2030");
            decform.setNegativeSuffix("\u2030"); 
            decform.setMultiplier(1000); 
            printValue();                                 //  -1,230\u2030

            // Apply percent with a pattern
            decform.applyPattern("#,##0.#%;(#,##0.#%)");
            System.out.println(decform.getMultiplier());  //  100
            printValue();                                 //  (123%)
        }
    }

    static void printValue() {
        System.out.println(decform.format(-1.23));
    }
}
