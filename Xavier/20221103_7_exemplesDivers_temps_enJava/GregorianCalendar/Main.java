import java.text.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main <1-based month> <year>");
            System.exit(1);
        }
        int month = Integer.parseInt(args[0])-1;
        int year = Integer.parseInt(args[1]);

        // Create a calendar object with the desired month and year.
        Calendar cal = new GregorianCalendar(year, month, 1);

        // Use SimpleDateFormat to get weekNames.
        cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
        cal.set(Calendar.WEEK_OF_MONTH, 2);
        cal.clear(Calendar.DAY_OF_MONTH);
        do {
            SimpleDateFormat sdf = new SimpleDateFormat("E");
            String s = sdf.format(cal.getTime());

            // Only take the first two characters.
            if (s.length () > 2) {
                System.out.print(s.substring(0, 2) + " ");
            } else if (s.length () < 2) {
                System.out.print(s + "  ");
            } else {
                System.out.print(s + " ");
            }
            cal.roll(Calendar.DAY_OF_WEEK, true);
        } while (cal.get(Calendar.DAY_OF_WEEK) != cal.getFirstDayOfWeek());
        System.out.println();

        // Get the day of the week of the first day.
        cal.set(year, month, 1);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
      
        // Print blanks for the columns preceding the first day.
        for (int i=cal.getFirstDayOfWeek(); i<dayOfWeek; i++) {
            System.out.print("   ");
        }

        // Print the days.
        cal.set(Calendar.MONTH, month);
        for (int i=cal.getMinimum(Calendar.DAY_OF_MONTH); 
                i<=cal.getMaximum(Calendar.DAY_OF_MONTH); i++) {
            cal.set(Calendar.DATE, i);

            // Make sure we haven't skipped to the next month.
            if (cal.get(Calendar.MONTH) != month) {
                break;
            }

            // If start of new week, print a newline.
            if (cal.get(Calendar.DAY_OF_WEEK) == cal.getFirstDayOfWeek()) {
                System.out.println();
            }

            // Ensure that all number take up two character positions.
            if (i < 10) {
                System.out.print(" ");
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
