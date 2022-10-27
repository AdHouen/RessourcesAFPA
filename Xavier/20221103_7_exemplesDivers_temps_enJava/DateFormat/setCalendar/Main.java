import java.text.DateFormat;
import java.util.Calendar;
import java.util.TimeZone;

class Main {

    public static void main(String args[]) {

        // Create a date format.
        DateFormat df = DateFormat.getInstance();

        // Create a new calendar.
        Calendar newCalendar = 
            Calendar.getInstance(TimeZone.getTimeZone("PST"));

        // Set the new calendar to this date format.
        df.setCalendar(newCalendar);

        // Print the new calendar.
        System.out.print(df.getCalendar());   // "java.util.GregorianCalendar"
    }
}
