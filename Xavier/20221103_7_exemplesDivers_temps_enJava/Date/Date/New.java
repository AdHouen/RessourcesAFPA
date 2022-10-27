import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;

class New {
    public static void main(String[] args) {
	Date ymd = 			// Oct 17, 1989
	    (new GregorianCalendar(1989, Calendar.OCTOBER, 17)).getTime();
	Date ymdhm = 			// Oct 17, 1989, 5:04pm
	    (new GregorianCalendar(1989, Calendar.OCTOBER, 17, 17, 4)).
	    	getTime();
	Date ymdhms = 			// Oct 17, 1989, 5:04:15pm
	    (new GregorianCalendar(1989, Calendar.OCTOBER, 17, 17, 4, 15)).
	    	getTime();
	try {
	    DateFormat f1 = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
	    DateFormat f2 = new SimpleDateFormat("dd MMM yyyy");
	    DateFormat f3 = new SimpleDateFormat("EEE, dd MMM yyyy");
	    DateFormat f4 = new SimpleDateFormat(
		"EEE, dd MMM yyyy HH:mm:ss 'GMT'");

	    Date s1 = f1.parse("17 Oct 1989 17:04:15");
	    Date s2 = f2.parse("17 Oct 1989");
	    Date s3 = f3.parse("Thu, 2 Nov 1995");
	    Date s4 = f4.parse("Sat, 12 Aug 1995 13:30:00 GMT");
	} catch (ParseException e) {
	    e.printStackTrace();
	}
    }
}
