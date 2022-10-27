import java.util.*;

class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));

        // Is midnight am or pm?
        cal.setTime(new Date(0));
        System.out.println(cal.get(Calendar.AM_PM));    // 0        <AM>

        // A millisecond before midnight?
        cal.setTime(new Date(-1));
        System.out.println(cal.get(Calendar.AM_PM));    // 1        <PM>

        // How about noon?
        cal.setTime(new Date(12*60*60*1000));
        System.out.println(cal.get(Calendar.AM_PM));    // 1        <PM>

        // Add 12 hours to the current time.
        cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.AM_PM));    // 0        <AM>
        cal.add(Calendar.HOUR, 12);
        System.out.println(cal.get(Calendar.AM_PM));    // 1        <PM>
    }
}
