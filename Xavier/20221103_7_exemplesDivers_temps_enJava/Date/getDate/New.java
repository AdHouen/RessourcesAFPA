import java.util.*;
import java.text.SimpleDateFormat;

class New {
    private final static String[] WeekDays = 
        {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private final static String[] Months =
        {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
         "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static String fixWidth(int num) {
        if (num == 0) 
            return "00";
        if (num < 10)
            return ("0" + num);
        return (Integer.toString(num, 10));
    }
    // prints out date in the form
    // Tue Oct 17 1995 hh:mm:ss GMT+HHMM
    private static String dateToString(Date d) {
        GregorianCalendar cal = new GregorianCalendar();
        int offset = (cal.get(Calendar.ZONE_OFFSET)+
            cal.get(Calendar.DST_OFFSET))/60000;
        cal.setTime(d);
        String buf = WeekDays[cal.get(Calendar.DAY_OF_WEEK)-1] + 
            " " + Months[cal.get(Calendar.MONTH)] + " " +
            cal.get(Calendar.DAY_OF_MONTH) + " " +
            cal.get(Calendar.YEAR) + " " +
            cal.get(Calendar.HOUR_OF_DAY) + ":" +
            cal.get(Calendar.MINUTE) + ":" +
            cal.get(Calendar.SECOND) + " GMT" +
            ((offset >= 0) ? "+" : "-") +
                fixWidth(Math.abs(offset/60)) + 
                fixWidth(Math.abs(offset%60));
        return (buf);
    }
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("today: " + dateToString(d));
        SimpleDateFormat df = 
            new SimpleDateFormat("EEE MMM d yyyy HH:mm:ss zzz");
        System.out.println(df.format(d));
    }
}
