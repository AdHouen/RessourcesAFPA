import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;

class Main extends Frame {
    Main(int year) {
        super("Calendar Example: Year " + year);
        setLayout(new GridLayout(3, 4));

        Calendar cal = Calendar.getInstance();
        for (int i=cal.getMinimum(Calendar.MONTH); 
             i<=cal.getMaximum(Calendar.MONTH); i++) {
            cal.set(year, i, 1);
            add(new MonthCanvas(cal));
        }
        setSize(500, 400);
        show();
    }
    public static void main(String[] args) {
        if (args.length < 1) {
            new Main(Calendar.getInstance().get(Calendar.YEAR));
        } else {
            new Main(Integer.parseInt(args[0]));
        }
    }
}

class MonthCanvas extends Container {
    static String[] monthNames;
    static String[] weekNames;

    MonthCanvas(Calendar cal) {
        setLayout(new BorderLayout());
        
        // Add the month label.
        Panel p = new Panel(new GridLayout(2, 1));
        Label l = new Label(monthNames[cal.get(Calendar.MONTH)], Label.CENTER);
        l.setBackground(Color.black);
        l.setForeground(Color.white);
        p.add(l);

        // Add the day of the week labels.
        Panel q = new Panel(new GridLayout(1, weekNames.length));
        for (int i=0; i<weekNames.length; i++) {
            l = new Label(weekNames[i], Label.CENTER);
            l.setBackground(Color.gray);
            q.add(l);
        }
        p.add(q);
        add(p, BorderLayout.NORTH);

        // Create a grid for the days.
        p = new Panel(new GridLayout(0, weekNames.length));
        
        // Get the day of the week of the first day.
        cal.set(Calendar.DAY_OF_MONTH, 1);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // Fill the first few cells with blanks.
        for (int i=cal.getFirstDayOfWeek(); i<dayOfWeek; i++) {
            p.add(new Label());
        }

        // Add the days.
        for (int i=cal.getMinimum(Calendar.DAY_OF_MONTH); 
                i<=cal.getMaximum(Calendar.DAY_OF_MONTH); i++) {
            Calendar c = Calendar.getInstance();
            c.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), i);

            // Make sure we haven't skipped to the next month.
            if (c.get(Calendar.MONTH) != cal.get(Calendar.MONTH)) {
                break;
            }
            p.add(new DayCanvas(c));
        }
        add(p, BorderLayout.CENTER);
    }

    static {
        // Initialize month names.
        Calendar cal = Calendar.getInstance();
        monthNames = new String[cal.getMaximum(Calendar.MONTH) - 
                                cal.getMinimum(Calendar.MONTH) + 1];

        // Roll the calendar until it uses the first month.
        while (cal.get(Calendar.MONTH) != cal.getMinimum(Calendar.MONTH)) {
            cal.roll(Calendar.MONTH, false);
        }

        // Use SimpleDateFormat to fill monthNames.
        for (int i=0; i<monthNames.length; i++) {
            SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
            monthNames[i] = sdf.format(cal.getTime());
            cal.roll(Calendar.MONTH, true);
        }

        // Initialize day of week names.  The first element contains the name
        // of getFirstDayOfWeek().
        weekNames = new String[cal.getMaximum(Calendar.DAY_OF_WEEK) - 
                               cal.getMinimum(Calendar.DAY_OF_WEEK) + 1];

        // Roll the calendar until it uses the first day of week.
        while (cal.get(Calendar.DAY_OF_WEEK) != cal.getFirstDayOfWeek()) {
            cal.roll(Calendar.DAY_OF_WEEK, false);
        }

        // Use SimpleDateFormat to fill weekNames.
        for (int i=0; i<weekNames.length; i++) {
            SimpleDateFormat sdf = new SimpleDateFormat("E");
            weekNames[i] = sdf.format(cal.getTime());

            // Only take the first two characters.
            if (weekNames[i].length() > 2) {
                weekNames[i] = weekNames[i].substring(0, 2);
            }
            cal.roll(Calendar.DAY_OF_WEEK, true);
        }
    }
}

class DayCanvas extends Component implements MouseListener {
    int day;
    Calendar cal;

    DayCanvas(Calendar cal) {
        this.cal = cal;
        addMouseListener(this);
    }
    
    public void paint(Graphics g) {
        int day = cal.get(Calendar.DAY_OF_MONTH);
        FontMetrics fm = g.getFontMetrics();

        g.setColor(Color.black);
        g.drawString("" + day, 
            (getSize().width-fm.stringWidth(""+day))/2,
            (getSize().height-fm.getHeight())/2+fm.getAscent());
    }

    // Event handling methods.
    int[] fieldValues = {
        Calendar.ERA, Calendar.YEAR, Calendar.MONTH, 
        Calendar.DAY_OF_MONTH, Calendar.DAY_OF_WEEK,
        Calendar.DAY_OF_WEEK_IN_MONTH, Calendar.DAY_OF_YEAR,
        Calendar.WEEK_OF_MONTH, Calendar.WEEK_OF_YEAR,
        Calendar.HOUR, Calendar.HOUR_OF_DAY, Calendar.AM_PM,
        Calendar.MILLISECOND, Calendar.MINUTE, Calendar.SECOND,
        Calendar.ZONE_OFFSET, Calendar.DST_OFFSET,};
    String[] fieldNames = {
        "ERA", "YEAR", "MONTH", 
        "DAY_OF_MONTH", "DAY_OF_WEEK", 
        "DAY_OF_WEEK_IN_MONTH", "DAY_OF_YEAR", 
        "WEEK_OF_MONTH", "WEEK_OF_YEAR",
        "HOUR", "HOUR_OF_DAY", "AM_PM", 
        "MILLISECOND", "MINUTE", "SECOND",
        "ZONE_OFFSET", "DST_OFFSET", };

    public void mousePressed(MouseEvent e) {
        System.out.println("---------------------------------");
        for (int i=0; i<Calendar.FIELD_COUNT; i++) {
            System.out.print(fieldNames[i] + "=" + cal.get(fieldValues[i]));
            System.out.println("        ("+cal.getMaximum(fieldValues[i])+")");
        }
    }
    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
