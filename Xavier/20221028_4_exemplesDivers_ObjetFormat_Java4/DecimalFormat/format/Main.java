import java.text.*;
import java.io.*;
import java.util.*;

class Main {
    // Create field position objects for dates.
    static FieldPosition intPos = 
        new FieldPosition(DecimalFormat.INTEGER_FIELD);
    static FieldPosition fractPos = 
        new FieldPosition(DecimalFormat.FRACTION_FIELD);

    // Create number format.
    static NumberFormat numform = NumberFormat.getInstance(Locale.US);

    // Declare the decimal format.
    static DecimalFormat decform;
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Main <number>");
            System.err.println("where <number> is of form: 12345.678");
            System.exit(1);
        }

        if (numform instanceof DecimalFormat) {
            decform = (DecimalFormat)NumberFormat.getInstance(Locale.US);

            // Declare number.
            Number num = null;

            // Convert the string passed in to a number.
            try {
                num = decform.parse(args[0]);
            } catch (ParseException pe) {
                System.out.println("Parse exception");
            }

            // Create string buffer to hold decimal.
            StringBuffer sb = new StringBuffer("");

            // Format the integer portion of the number.
            decform.format(num, sb, intPos);
            System.out.println("\nDecimal:   " + sb);

            printIntegerValue(sb);
            sb.setLength(0);

            decform.format(num, sb, fractPos);
            printFractionValue(sb);
            sb.setLength(0);

            System.out.println("\nInteger field:  " + intPos.getField());
            System.out.println("Fraction field: " + fractPos.getField());
        }
    }
    static void printIntegerValue(StringBuffer sb) {
        System.out.print("Integer:   ");
        System.out.println(sb.toString().substring(intPos.getBeginIndex(),
                                                       intPos.getEndIndex()));
    }
    static void printFractionValue(StringBuffer sb) {
        System.out.print("Fraction:  ");
        System.out.println(sb.toString().substring(fractPos.getBeginIndex(),
                                                     fractPos.getEndIndex()));
    }
}
