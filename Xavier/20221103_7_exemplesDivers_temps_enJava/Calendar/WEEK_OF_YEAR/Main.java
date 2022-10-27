import java.text.*;
import java.util.*;

class Main {
    // Returns number of weeks in a year.
    static int numWeeksInYear(int year) {
        Calendar cal = Calendar.getInstance();

        cal.clear(Calendar.MONTH);
        cal.clear(Calendar.DAY_OF_YEAR);
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        cal.set(Calendar.WEEK_OF_YEAR, cal.getMaximum(Calendar.WEEK_OF_YEAR));

        while (cal.get(Calendar.YEAR) != year) {
            cal.add(Calendar.WEEK_OF_YEAR, -1);
        }
        return cal.get(Calendar.WEEK_OF_YEAR);
    }

    public static void main(String[] args) {
        for (int i=1000; i<2000; i++) {
            int n = numWeeksInYear(i);
            if (n == 54) {
                System.out.print(i + " ");
            }
        }
// 1004 1032 1060 1088 1116 1144 1172 1200 1228 1256 1284 1312 1340 1368 1396 
// 1424 1452 1480 1508 1536 1564 1600 1628 1656 1684 1724 1752 1780 1820 1848 
// 1876 1916 1944 1972     
    }
}
