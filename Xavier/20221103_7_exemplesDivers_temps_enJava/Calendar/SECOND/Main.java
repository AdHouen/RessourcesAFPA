import java.text.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
//
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");

        cal.set(Calendar.SECOND, 12);
        System.out.println(df.format(cal.getTime()));     // 19:39:12
        cal.set(Calendar.SECOND, 60);
        System.out.println(df.format(cal.getTime()));     // 19:40:00
        cal.set(Calendar.SECOND, -1);
        System.out.println(df.format(cal.getTime()));     // 19:38:59
//
    }
}

