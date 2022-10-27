import java.util.*;

class Main {
    static int[] fieldValues = {
        Calendar.ERA, Calendar.YEAR, Calendar.MONTH, Calendar.DATE,
        Calendar.DAY_OF_MONTH, Calendar.DAY_OF_WEEK,
        Calendar.DAY_OF_WEEK_IN_MONTH, Calendar.DAY_OF_YEAR,
        Calendar.WEEK_OF_MONTH, Calendar.WEEK_OF_YEAR,
        Calendar.HOUR, Calendar.HOUR_OF_DAY, Calendar.AM_PM,
        Calendar.MILLISECOND, Calendar.MINUTE, Calendar.SECOND,
        Calendar.ZONE_OFFSET, Calendar.DST_OFFSET,};
    static String[] fieldNames = {
        "ERA", "YEAR", "MONTH", "DATE", 
        "DAY_OF_MONTH", "DAY_OF_WEEK", 
        "DAY_OF_WEEK_IN_MONTH", "DAY_OF_YEAR", 
        "WEEK_OF_MONTH", "WEEK_OF_YEAR",
        "HOUR", "HOUR_OF_DAY", "AM_PM", 
        "MILLISECOND", "MINUTE", "SECOND",
        "ZONE_OFFSET", "DST_OFFSET", };

    static void printField(String s) {
        System.out.print(" ");
        for (int i=0; i<12-s.length(); i++) {
            System.out.print(" ");
        }
        System.out.print(s);
    }

    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();

        System.out.println(
          "Field              minimum  greatestMin leastMaximum      maximum");
        for (int i=0; i<Calendar.FIELD_COUNT; i++) {
            printField(fieldNames[i]);
            printField(""+cal.getMinimum(fieldValues[i]));
            printField(""+cal.getGreatestMinimum(fieldValues[i]));
            printField(""+cal.getLeastMaximum(fieldValues[i]));
            printField(""+cal.getMaximum(fieldValues[i]));
            System.out.println();
        }
    }
}
