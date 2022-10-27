import java.util.Date;

class Old {
    private final static String[] WeekDays = 
        {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private final static String[] Months =
        {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
         "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static String fixWidth(int num) {
        if (num == 0) 
            return "00";
        if (num < 10)
            return ("0" + num);
        return (Integer.toString(num, 10));
    }
    // prints out date in the form
    // Tue Oct 17 1995 hh:mm:ss GMT+HHMM
    private static String dateToString(Date d) {
        String buf = WeekDays[d.getDay()] + " " +
            Months[d.getMonth()] + " " +
            d.getDate() + " " +
            (d.getYear() + 1900) + " " +
            d.getHours() + ":" +
            d.getMinutes() + ":" +
            d.getSeconds() + " GMT" +
            ((d.getTimezoneOffset() >= 0) ? "+" : "-") +
            fixWidth((d.getTimezoneOffset()/60)) +
            fixWidth((d.getTimezoneOffset()%60));
        return (buf);
    }
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("today: " + dateToString(d));
    }
}
