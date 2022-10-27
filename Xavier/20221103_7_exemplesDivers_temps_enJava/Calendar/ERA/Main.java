import java.text.*;
import java.util.*;

class Main {
    static void printDate(Calendar cal) {
        System.out.println(new SimpleDateFormat("yyyy/M/dd EE G").format(
            cal.getTime()));
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        printDate(cal);                            // 1997/6/03 Tue AD

        // Change the era.
        cal.set(Calendar.ERA, GregorianCalendar.BC);
        printDate(cal);                            // 1997/6/03 Mon BC

        cal.set(Calendar.YEAR, 0);
        printDate(cal);                            // 0001/6/03 Fri AD

        cal.set(Calendar.YEAR, -1000);
        printDate(cal);                            // 1001/6/03 Tue AD

        cal.set(Calendar.YEAR, 1000);
        printDate(cal);                            // 1000/6/03 Mon BC
    }
}
