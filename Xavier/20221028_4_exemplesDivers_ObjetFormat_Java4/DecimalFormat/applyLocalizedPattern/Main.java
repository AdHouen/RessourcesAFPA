package vol1examples.text.DecimalFormat.applyLocalizedPattern;

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Locale;

class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Main <German number>");
            System.err.println("where <German number> is of form: 1234567,89");
            System.exit(1);
        }
        
        Locale loc = Locale.GERMAN;
        NumberFormat numform = NumberFormat.getInstance(loc);
        Number num = null;

        try {
            num = numform.parse(args[0]);
        } catch (ParseException pe) {
            System.out.println("Parse exception");
        }

        System.out.println("Locale:              " + loc.getDisplayName());

        // Check that numform is a DecimalFormat.
        if (numform instanceof DecimalFormat) {

            DecimalFormat decform = (DecimalFormat)numform;

            System.out.println("\napplyPattern ---------------------------");

            decform.applyPattern("#,##0.00;(#,##0.00)");

            System.out.println("toLocalizedPattern:  " 
                + decform.toLocalizedPattern());

            System.out.println("toPattern:           " 
                + decform.toPattern());

            System.out.println("format:              " 
                + decform.format(num));

            System.out.println("format (negative):   " 
                + decform.format((-1) * num.doubleValue()));

            System.out.println("\napplyLocalizedPattern ------------------");

            decform.applyLocalizedPattern("#.##0,00;(#.##0,00)");

            System.out.println("toLocalizedPattern:  " 
                + decform.toLocalizedPattern());

            System.out.println("toPattern:           " 
                + decform.toPattern());

            System.out.println("format:              " 
                + decform.format(num));

            System.out.println("format: (negative)   " 
                + decform.format((-1) * num.doubleValue()));

        }
    }
}
