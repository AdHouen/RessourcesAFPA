import java.util.*;
import java.text.*;

class Main {
    public static void main(String[] args) {
        Calendar oldCal = Calendar.getInstance();
        DateFormat df = DateFormat.getInstance();

        System.out.println(df.format(oldCal.getTime()));    // 11/8/97 7:45 PM

    // Modify AM_PM
        Calendar cal = (Calendar)oldCal.clone();
        cal.set(Calendar.AM_PM, Calendar.AM);
        cal.clear(Calendar.HOUR_OF_DAY);
        System.out.println(df.format(cal.getTime()));       // 11/8/97 7:45 AM
    // Modify DAY_OF_WEEK and use WEEK_OF_MONTH
        cal = (Calendar)oldCal.clone();
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        cal.clear(Calendar.DAY_OF_MONTH);
        System.out.println(df.format(cal.getTime()));       // 11/2/97 7:45 PM

    // Modify DAY_OF_WEEK and use WEEK_OF_YEAR
        cal = (Calendar)oldCal.clone();
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        cal.clear(Calendar.MONTH);
        cal.clear(Calendar.DAY_OF_YEAR);
        System.out.println(df.format(cal.getTime()));       // 11/2/97 7:45 PM

    // Modify DAY_OF_WEEK_IN_MONTH
        cal = (Calendar)oldCal.clone();
        cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, -1);
        cal.clear(Calendar.DAY_OF_MONTH);
        cal.clear(Calendar.WEEK_OF_MONTH);
        System.out.println(df.format(cal.getTime()));       // 11/29/97 7:45 PM

    // Modify DAY_OF_YEAR
        cal = (Calendar)oldCal.clone();
        cal.set(Calendar.DAY_OF_YEAR, 32);
        cal.clear(Calendar.MONTH);
        System.out.println(df.format(cal.getTime()));       // 2/1/97 7:45 PM

    // Modify HOUR
        cal = (Calendar)oldCal.clone();
        cal.set(Calendar.HOUR, 13);
        cal.clear(Calendar.HOUR_OF_DAY);
        System.out.println(df.format(cal.getTime()));       // 11/9/97 1:45 AM
          // Since AM_PM field is PM, the time is 1:34 am the next day.
          // If the AM_PM field were AM, the time would be 1:34 pm the same day.

    // Modify WEEK_OF_MONTH
        cal = (Calendar)oldCal.clone();
        cal.set(Calendar.WEEK_OF_MONTH, 4);
        cal.clear(Calendar.DAY_OF_MONTH);
        System.out.println(df.format(cal.getTime()));       // 11/22/97 7:45 PM

    // Modify WEEK_OF_YEAR
        cal = (Calendar)oldCal.clone();
        cal.set(Calendar.WEEK_OF_YEAR, 5);
        cal.clear(Calendar.MONTH);
        cal.clear(Calendar.DAY_OF_YEAR);
        System.out.println(df.format(cal.getTime()));       // 2/1/97 7:45 PM
    }
}
