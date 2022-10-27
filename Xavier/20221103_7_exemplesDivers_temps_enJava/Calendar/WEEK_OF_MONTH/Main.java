import java.text.*;
import java.util.*;

class Main {
    // Returns the number of week in the given month.
    static int weeksIn(Calendar cal, int month) {
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, cal.getMaximum(Calendar.DAY_OF_MONTH));

        while (cal.get(Calendar.MONTH) != month) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        return cal.get(Calendar.WEEK_OF_MONTH);
    }

    // Print the date of the given month, week-of-month, and day-of-week.
    static void dayInWeek(Calendar cal, int month, int week_of_month, 
                int day_of_week) {
        cal.clear(Calendar.DAY_OF_MONTH);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_WEEK, day_of_week);
        cal.set(Calendar.WEEK_OF_MONTH, week_of_month);
        System.out.println(DateFormat.getInstance().format(cal.getTime()));
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        cal.setFirstDayOfWeek(Calendar.SUNDAY);
        for (int i=Calendar.JANUARY; i<=Calendar.DECEMBER; i++) {
            System.out.print(weeksIn(cal, i) + " ");
        }
        System.out.println();                   // 5 5 6 5 5 5 5 6 5 5 6 5 

        cal.setFirstDayOfWeek(Calendar.MONDAY);
        for (int i=Calendar.JANUARY; i<=Calendar.DECEMBER; i++) {
            System.out.print(weeksIn(cal, i) + " ");
        }
        System.out.println();                   // 5 5 6 5 5 6 5 5 5 5 5 5 

        // What day is Sunday in the 1st week in February?
        dayInWeek(cal, Calendar.FEBRUARY, 1, Calendar.SUNDAY);//1/26/97 1:08 AM

        // What day is Sunday in the 6th week in February?
        dayInWeek(cal, Calendar.FEBRUARY, 6, Calendar.SUNDAY);//3/2/97 1:08 AM

        // What day is Sunday in the 0th week in February?
        dayInWeek(cal, Calendar.FEBRUARY, 0, Calendar.SUNDAY);//1/19/97 1:08 AM
    }
}
