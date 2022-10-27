import java.util.*;

class Main {
    static int daysIn(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, cal.getMaximum(Calendar.DAY_OF_MONTH));

        while (cal.get(Calendar.MONTH) != month) {
            cal.add(Calendar.DAY_OF_MONTH, -1);
        }
        return cal.get(Calendar.DAY_OF_MONTH);
    }

    public static void main(String[] args) {
        System.out.println(daysIn(2000, Calendar.FEBRUARY));
        System.out.println(daysIn(2001, Calendar.FEBRUARY));

        for (int i=Calendar.JANUARY; i<=Calendar.DECEMBER; i++) {
            System.out.print(daysIn(1997, i) + " ");
        }
        System.out.println();           // 31 28 31 30 31 30 31 31 30 31 30 31 
    }
}
