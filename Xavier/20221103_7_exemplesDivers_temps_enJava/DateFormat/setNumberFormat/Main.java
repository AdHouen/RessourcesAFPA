import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

class Main {

    public static void main(String args[]) {

        // Create a date format.
        DateFormat df = DateFormat.getInstance();

        // Create a new number format.
        NumberFormat numFormat = NumberFormat.getNumberInstance(Locale.FRANCE);

        // Set the new calendar to this date format.
        df.setNumberFormat(numFormat);

        // Print the new number instance.
        System.out.print(df.getNumberFormat());   // "java.text.DecimalFormat"
    }
}
