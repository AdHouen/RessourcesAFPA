import java.util.*;

class Main {
    public static void main(String[] args) {
//
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   
        // Make sure both calendars have identical times.
        Date date = new Date();
        cal1.setTime(date);
        cal2.setTime(date);

        // Demonstrates that calendar times are independent to the time zone.
        System.out.println(cal1.after(cal2));        // false
        System.out.println(cal2.after(cal1));        // false

        cal2.set(1000, Calendar.JANUARY, 1);
        System.out.println(cal1.after(cal2));        // true

        cal2.set(3000, Calendar.JANUARY, 1);
        System.out.println(cal1.after(cal2));        // false
//
    }
}
