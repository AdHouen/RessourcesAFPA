import java.util.*;

class Main {
    public static void main(String[] args) {
        GregorianCalendar cal1 = new GregorianCalendar();
        GregorianCalendar cal2 = (GregorianCalendar)cal1.clone();

        System.out.println(cal1.equals(null));                // false
        System.out.println(cal1.equals(cal2));                // true

        // Create one with a different time zone.
        cal2 = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        cal2.setTime(cal1.getTime());
        System.out.println(cal1.equals(cal2));                // false
    }
}