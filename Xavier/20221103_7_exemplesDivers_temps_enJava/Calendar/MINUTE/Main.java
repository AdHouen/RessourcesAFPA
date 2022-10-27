import java.text.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
//
        Calendar cal = Calendar.getInstance();
        DateFormat df = DateFormat.getInstance();

        cal.set(Calendar.MINUTE, 12);
        System.out.println(df.format(cal.getTime()));     // 11/1/97 7:12 PM
        cal.set(Calendar.MINUTE, 60);
        System.out.println(df.format(cal.getTime()));     // 11/1/97 8:00 PM
        cal.set(Calendar.MINUTE, -1);
        System.out.println(df.format(cal.getTime()));     // 11/1/97 6:59 PM
//
    }
}

