import java.text.*;
import java.util.*;

class Main {
    static void printDate(Calendar cal) {
        System.out.println(new SimpleDateFormat("yyyy/M/dd").format(
            cal.getTime()));
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        cal.clear();
        cal.set(Calendar.YEAR, 1997);
        // printDate(cal);                                // IllegalArgumentEx
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        // printDate(cal);                                // IllegalArgumentEx
        cal.set(Calendar.DATE, 25);
        printDate(cal);                                   // 1997/12/25

        // This sequence does not produce the correct date.
        cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_YEAR, 100);
        printDate(cal);                                   // 1997/10/29

        // This prints the correct date.
        cal.clear(Calendar.MONTH);
        cal.set(Calendar.DAY_OF_YEAR, 100);
        printDate(cal);                                   // 1997/4/09
    }
}
