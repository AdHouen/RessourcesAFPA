package essai;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//source https://www.baeldung.com/java-date-to-localdate-and-localdatetime
//Convertion LocalDate or LocalDateTime to Date
public class DemoTemps_3_convertNewAPI_toDate {
	///////////////////////////////
	//Convertion LocalDate to Date
	///////////////////////////////
	public static Date convertToDateViaSqlDate(LocalDate dateToConvert) {
	    return java.sql.Date.valueOf(dateToConvert);  //transtypage ascendant
	}
	
	public static  Date convertToDateViaInstant(LocalDate dateToConvert) {
	    return java.util.Date.from(dateToConvert.atStartOfDay()
	      .atZone(ZoneId.systemDefault())
	      .toInstant());
	}

	//////////////////////////////////
	//Convertion LocalDateTime to Date
	//////////////////////////////////

	public static  Date convertToDateViaSqlTimestamp(LocalDateTime dateToConvert) {
	    return java.sql.Timestamp.valueOf(dateToConvert);
	}
	
	public static Date convertToDateViaInstant(LocalDateTime dateToConvert) {
	    return java.util.Date
	      .from(dateToConvert
	    		  .atZone(ZoneId.systemDefault())
	    		  .toInstant());
	}
	
	public static void main(String[] args) {
		//DateFormat df8 = DateFormat.getInstance();
		//DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.LONG);
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		
		System.out.println("new Date() toString  :" + new Date());

		System.out.println("new Date() avec un format  :" + df2.format(new Date()));

		GregorianCalendar dc1 = new java.util.GregorianCalendar(2019,Calendar.APRIL,16,13,15,30);
		System.out.println("dc1.getTime() avec un format  :" + df2.format(dc1.getTime()));
		
		LocalDate d1 = LocalDate.of(2019, Month.MAY, 8);
		
		System.out.println(" avec un format new Date() :" + df2.format(new Date()));
		System.out.println(" avec un format convertToDateViaSqlDate :" + df2.format(convertToDateViaSqlDate(d1)));


	}
}
