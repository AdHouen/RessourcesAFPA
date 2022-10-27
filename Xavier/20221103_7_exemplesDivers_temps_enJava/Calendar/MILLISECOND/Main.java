import java.text.*;
import java.util.*;

class Main {
    static void printTime(Calendar cal) {
    }

    public static void main(String[] args) {
//
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("mm:ss:SSS");

        cal.set(Calendar.MILLISECOND, 12);
        System.out.println(df.format(cal.getTime()));     // 25:54:012
        cal.set(Calendar.MILLISECOND, 1000);
        System.out.println(df.format(cal.getTime()));     // 25:55:000
        cal.set(Calendar.MILLISECOND, -1);
        System.out.println(df.format(cal.getTime()));     // 25:53:999
//
    }
}

