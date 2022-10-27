import java.util.*;
import java.text.*;

class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        // We are interested in the time at GMT.
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));

        // Print the date at GMT at time 0.
        cal.setTime(new Date(0));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));  // 5    <THURSDAY>

        // Print the date at GMT at time -1 day.
        cal.setTime(new Date(-24*60*60*1000));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));  // 4    <WEDNESDAY>
    }
}
