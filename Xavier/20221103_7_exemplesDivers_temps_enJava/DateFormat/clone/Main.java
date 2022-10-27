import java.text.DateFormat;
import java.util.Calendar;

class Main {

    public static void main(String args[]) {

        // Create a date format.
        DateFormat df = DateFormat.getInstance();

        // Get the day of week from calendar.
        System.out.println(df.getCalendar().get(Calendar.DAY_OF_WEEK));

        // Create a clone.
        DateFormat dfCopy = (DateFormat)df.clone(); 

        // Get the day of week from clone's calendar.
        System.out.println(dfCopy.getCalendar().get(Calendar.DAY_OF_WEEK));

        if(df.equals(dfCopy)) {
            System.out.println("Copy is equal to original");
        } else {
            System.out.println("Copy is not equal to original");
        }

        // Compute hashcode.
        int hc = df.hashCode();
        System.out.println("Hash code is: " + hc);
    }
}
