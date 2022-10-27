import java.text.*;
import java.util.*;

public class Main extends DateFormat {

    public Main(Locale loc) {
        initialize(loc);
    }

    // Required when subclassing DateFormat.
    public StringBuffer format(Date d, StringBuffer buf, FieldPosition pos) {
        // Some implementation goes here.
        return buf;
    }

    // Required when subclassing DateFormat.
    public Date parse(String sourceStr, ParsePosition pos) {
        // Some implementation goes here.
        return (new Date());
    }

    // Required when subclassing Format.
    public Object parseObject(String sourceStr, ParsePosition pos) {
        // Some implementation goes here.
        return (new Date());
    }

    private void initialize(Locale loc) {
        calendar = Calendar.getInstance(TimeZone.getTimeZone("PST"));
        numberFormat = NumberFormat.getInstance(loc);

        System.out.println(calendar);         // java.util.GregorianCalendar@0
        System.out.println(numberFormat);     // java.text.DecimalFormat@2a796
    }

    public static void main(String args[]) {

        // Create a date format.
        DateFormat df = DateFormat.getInstance();

        new Main(Locale.FRANCE);
    }
}
