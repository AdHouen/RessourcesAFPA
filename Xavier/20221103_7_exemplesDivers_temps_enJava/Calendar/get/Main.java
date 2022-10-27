import java.util.*;

class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.get(Calendar.YEAR));     // 1997

        cal.clear();
        cal.set(Calendar.YEAR, 2000);
        // Not enough information in cal to resolve to a date.
        // System.out.println(cal.get(Calendar.DATE));  // IllegalArgumentEx
    }
}
