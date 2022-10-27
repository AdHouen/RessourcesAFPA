import java.util.*;
import java.text.*;

class New {
    public static void main(String[] args) {
        try {
        long utcTime = (new GregorianCalendar(1995,10,2,10,30,4)).
                getTime().getTime();
        SimpleDateFormat df = new SimpleDateFormat("d MMMM yyyy");
        long parsedTime = (df.parse("11 November 1996")).getTime();

        Date utcDate = new Date(utcTime);
        SimpleDateFormat df2 = new SimpleDateFormat("d MMM yyyy");
        Date parsedDate = df2.parse("11 Nov 1996");
        int tracker;

        if (utcDate.before(parsedDate)) {
            tracker = -1;
            utcDate.setTime(parsedTime); // reset
        } else if (utcDate.after(parsedDate)) {
            tracker = 1;
            utcDate.setTime(parsedTime); // reset
        } else if (utcDate.equals(parsedDate)) 
            tracker = 0;

        // Print the date in the three formats
        SimpleDateFormat df3 = 
            new SimpleDateFormat("d MMM yyyy HH:mm:ss 'GMT'", 
                Locale.US);
        df3.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println("GMT: " + df3.format(utcDate));

        DateFormat df4 = DateFormat.getDateTimeInstance();
        df4.setTimeZone(TimeZone.getDefault());
        System.out.println("Locale: " + df4.format(utcDate));

        System.out.println("ctime: " + utcDate.toString());
    } catch (ParseException e) {
        e.printStackTrace();
    }
    }
}
