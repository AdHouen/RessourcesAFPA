import java.util.*;

class Main {
    // Pads the value with a zero on the left if val is a single digit.
    static void printTwoDigits(int val) {
        if (val < 10) {
            System.out.print("0");
        }
        System.out.print(val);
    }

    // Prints the time.
    static void printTime(Calendar cal) {
        printTwoDigits(cal.get(Calendar.HOUR));
        System.out.print(":");
        printTwoDigits(cal.get(Calendar.MINUTE));
        System.out.print(":");
        printTwoDigits(cal.get(Calendar.SECOND));

        System.out.println(
            (cal.get(Calendar.AM_PM) == Calendar.AM) ? " am" : " pm");
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        printTime(cal);                                     // 07:08:40 pm

        // Set the new time zone.
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));

        // This step causes the calendar object to recompute all the fields.
        cal.setTime(cal.getTime());
        printTime(cal);                                     // 02:08:40 am
    }
}