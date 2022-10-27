import java.util.*;

class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.isLenient());               // true
        cal.set(Calendar.MONTH, 100);
        System.out.println(cal.get(Calendar.MONTH));       // 4
        cal.set(Calendar.DATE, -100);
        System.out.println(cal.get(Calendar.DATE));        // 20

        cal.setLenient(false);
        cal.set(Calendar.MONTH, 100);
        //System.out.println(cal.get(Calendar.MONTH));     // IllegalArgumentEx
        cal.set(Calendar.DATE, -100);
        //System.out.println(cal.get(Calendar.DATE));      // IllegalArgumentEx
    }
}
