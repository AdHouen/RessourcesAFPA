import java.text.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
//
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("MMM d  K a / H");

        cal.set(Calendar.HOUR_OF_DAY, 0);
        System.out.println(df.format(cal.getTime()));     // Nov 1  0 AM / 0
        cal.set(Calendar.HOUR_OF_DAY, 13);
        System.out.println(df.format(cal.getTime()));     // Nov 1  1 PM / 13
        cal.set(Calendar.HOUR_OF_DAY, 24);
        System.out.println(df.format(cal.getTime()));     // Nov 2  0 AM / 0
        cal.set(Calendar.HOUR_OF_DAY, -1);
        System.out.println(df.format(cal.getTime()));     // Oct 31  11 PM / 23

        // The hour can be set using the HOUR calendar field.
        cal.set(Calendar.HOUR, 13);
        cal.clear(Calendar.HOUR_OF_DAY);
        System.out.println(df.format(cal.getTime()));     // Nov 2  1 AM / 13
//
    }
}

