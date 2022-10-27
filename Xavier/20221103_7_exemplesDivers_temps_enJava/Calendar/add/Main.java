import java.text.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getInstance();

        System.out.println(df.format(cal.getTime()));     // 6/2/97 9:35 AM
        cal.add(Calendar.MONTH, 12);
        System.out.println(df.format(cal.getTime()));     // 6/2/98 9:35 AM
        cal.add(Calendar.DATE, 40);
        System.out.println(df.format(cal.getTime()));     // 7/12/98 9:35 AM
        cal.add(Calendar.HOUR, -12);
        System.out.println(df.format(cal.getTime()));     // 7/11/98 9:35 PM

        //cal.add(Calendar.DST_OFFSET, 1);                // IllegalArgumentEx
        //cal.add(Calendar.ZONE_OFFSET, 1);               // IllegalArgumentEx
    }
}
