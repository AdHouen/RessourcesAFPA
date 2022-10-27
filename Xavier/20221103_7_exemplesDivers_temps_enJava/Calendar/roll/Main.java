import java.util.*;
import java.text.*;

class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getInstance();

        cal.set(1997, Calendar.JANUARY, 31);

        System.out.println(df.format(cal.getTime()));     // 1/31/97 9:54 AM
        cal.roll(Calendar.MONTH, false);
        System.out.println(df.format(cal.getTime()));     // 12/31/97 9:54 AM
        cal.roll(Calendar.DATE, true);
        System.out.println(df.format(cal.getTime()));     // 12/1/97 9:54 AM

        //cal.roll(Calendar.DST_OFFSET, true);            // IllegalArgumentEx
        //cal.roll(Calendar.ZONE_OFFSET, true);           // IllegalArgumentEx
    }
}
