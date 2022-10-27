import java.text.*;
import java.util.Locale;

class Main {

    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getInstance(Locale.ITALIAN);
        DecimalFormat df = null;

        // Test before casting.
        if (nf instanceof DecimalFormat) {

            // Cast number format.
            df = (DecimalFormat)nf;

            long lg = 1234;

            df.setDecimalSeparatorAlwaysShown(true);
            System.out.println(df.format(lg));                       // 1.234,

            df.setDecimalSeparatorAlwaysShown(false);
            System.out.println(df.format(lg));                       // 1.234

            System.out.println(df.isDecimalSeparatorAlwaysShown());  // false

        }
    }
}
