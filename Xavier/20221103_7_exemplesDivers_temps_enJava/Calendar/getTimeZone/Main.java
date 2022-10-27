import java.util.*;

class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        TimeZone tz = cal.getTimeZone();
        System.out.println(tz.getID());            // PST
    }
}