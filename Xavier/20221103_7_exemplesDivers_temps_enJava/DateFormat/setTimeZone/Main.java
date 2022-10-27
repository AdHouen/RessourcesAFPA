import java.text.DateFormat;
import java.util.TimeZone;

class Main {

    public static void main(String args[]) {

        // Create a date format.
        DateFormat df = DateFormat.getInstance();

        // Set the time zone of the calendar.
        df.setTimeZone(TimeZone.getTimeZone("PST"));

        // Get the time zone from the calendar.
        TimeZone tz = df.getTimeZone();

        // Print the time zone string.
        System.out.println(tz.getID());     // "PDT"
    }
}
