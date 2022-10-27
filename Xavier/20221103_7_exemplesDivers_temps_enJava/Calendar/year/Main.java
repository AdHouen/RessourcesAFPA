import java.text.*;
import java.util.*;

class Main {
    static void printDate(Calendar cal) {
        System.out.println(new SimpleDateFormat("yyyy/M/dd G").format(
            cal.getTime()));
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, -1000);
        printDate(cal);                                // 1001/10/29 BC
        cal.set(Calendar.YEAR, -1);
        printDate(cal);                                // 0002/10/29 BC
        cal.set(Calendar.YEAR, 0);
        printDate(cal);                                // 0001/10/29 BC
        cal.set(Calendar.YEAR, 1);
        printDate(cal);                                // 0001/10/29 AD
        cal.set(Calendar.YEAR, 2000);
        printDate(cal);                                // 2000/10/29 AD

        cal = Calendar.getInstance();
        cal.set(Calendar.ERA, GregorianCalendar.BC);
        cal.set(Calendar.YEAR, 0);
        printDate(cal);                                // 0001/10/29 AD

        // Print out some years in which March 15th falls on a Sunday.
        cal.set(0, Calendar.MARCH, 15);
        for (int i=2000; i<=2050; i++) {
            cal.set(Calendar.YEAR, i);
            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.print(i + " ");
            }
        }
        System.out.println();             // 2001 2006 2012 2023 2029 2034 2040 
    }
}
