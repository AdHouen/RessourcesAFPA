import java.util.Date;

class Old {
    public static void main(String[] args) {
        long utcTime = Date.UTC(95,10,2,10,30,4);
        long parsedTime = Date.parse("11 November 1996");

        Date utcDate = new Date(utcTime);
        Date parsedDate = new Date("11 Nov 1996");
        int tracker;

        if (utcDate.before(parsedDate)) {
            tracker = -1;
            utcDate.setTime(parsedTime); // reset
        } else if (utcDate.after(parsedDate)) {
            tracker = 1;
            utcDate.setTime(parsedTime); // reset
        } else if (utcDate.equals(parsedDate)) 
            tracker = 0;
        // Print the date in the three formats
        System.out.println("GMT: " + utcDate.toGMTString());
        System.out.println("Locale: " + utcDate.toLocaleString());
        System.out.println("ctime: " + utcDate.toString());
    }
}
