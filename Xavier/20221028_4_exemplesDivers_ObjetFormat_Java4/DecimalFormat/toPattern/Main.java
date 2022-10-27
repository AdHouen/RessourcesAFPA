import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Locale;

class Main {

    public static void main(String[] args) {
        
        NumberFormat numform_GERMAN = NumberFormat.getInstance(Locale.GERMAN);
        NumberFormat numform_FRENCH = NumberFormat.getInstance(Locale.FRENCH);
        Number num = null;

        DecimalFormat decform_GERMAN = null;
        DecimalFormat decform_FRENCH = null;

        // Temporary string for the pattern.
        String pattern = null;

        if (numform_GERMAN instanceof DecimalFormat) {

            decform_GERMAN = (DecimalFormat)numform_GERMAN;

            decform_GERMAN.applyPattern("#,##0.00;(#,##0.00)");

            // Print out the German pattern.
            print("toLocalizedPattern: (German) " 
               + (decform_GERMAN.toLocalizedPattern()));  // #.##0,00;(#.##0,00)

            // Print out the non-localized pattern.
            pattern =  (decform_GERMAN).toPattern();
            print("toPattern:   (Non-localized) " 
               + pattern);                                // #,##0.00;(#,##0.00)

        }

        if (numform_FRENCH instanceof DecimalFormat) {

            decform_FRENCH = (DecimalFormat)numform_FRENCH;

            decform_FRENCH.applyPattern(pattern);

            // Print out the French pattern.
            print("toLocalizedPattern: (French) " 
               + (decform_FRENCH).toLocalizedPattern());  // # ##0,00;(# ##0,00)
        }
    }

    static void print(String s) {
        System.out.println(s);
    }
}
