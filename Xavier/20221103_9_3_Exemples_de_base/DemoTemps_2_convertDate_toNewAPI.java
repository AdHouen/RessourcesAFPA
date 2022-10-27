package essai;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

//source https://www.baeldung.com/java-date-to-localdate-and-localdatetime
//Convertion Date to LocalDate or LocalDateTime and Back
public class DemoTemps_2_convertDate_toNewAPI {
 
//////////////////////////////
//Convertion Date to LocalDate
//////////////////////////////
/* JAVA 9*/
public static LocalDate convertToLocalDate(Date dateToConvert) {
    return LocalDate.ofInstant(
    		 dateToConvert.toInstant(), ZoneId.systemDefault());
}
/*Converting java.util.Date to java.time.LocalDate  V1
  On passe par java.time.Instant*/
public static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
    return dateToConvert.toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
}

/*Converting java.util.Date to java.time.LocalDate  V2
  On passe par java.time.Instant*/
public static LocalDate convertToLocalDateViaMilisecond(Date dateToConvert) {
    return Instant.ofEpochMilli(dateToConvert.getTime())
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
}

// POUR JDBC
/*Converting java.sql.Date to java.time.LocalDate*/
public static LocalDate convertToLocalDateViaSqlDate(Date dateToConvert) {
    return new java.sql.Date(dateToConvert.getTime()).toLocalDate();
}


//////////////////////////////////
//Convertion Date to LocalDateTime
//////////////////////////////////

/* JAVA 9*/
public static LocalDateTime convertToLocalDateTime(Date dateToConvert) {
    return LocalDateTime.ofInstant(
    		dateToConvert.toInstant(), ZoneId.systemDefault() );
}
/*Converting java.util.Date to java.time.LocalDateTime  V1
 On passe par java.time.Instant*/
public static LocalDateTime convertToLocalDateTimeViaInstant(Date dateToConvert) {
    return dateToConvert.toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDateTime();
}
 
/*Converting java.util.Date to java.time.LocalDateTime  V2
  On passe par java.time.Instant*/
public static LocalDateTime convertToLocalDateTimeViaMilisecond(Date dateToConvert) {
    return Instant.ofEpochMilli(dateToConvert.getTime())
      .atZone(ZoneId.systemDefault())
      .toLocalDateTime();
}
// POUR JDBC
/*Converting java.sql.Timestamp to java.time.LocalDateTime*/
public static LocalDateTime convertToLocalDateTimeViaSqlTimestamp(Date dateToConvert) {
    return new java.sql.Timestamp( dateToConvert.getTime() ).toLocalDateTime();
}

public static void main(String[] args) {
	System.out.println("Affichage toString de convertToLocalDateTime:" + convertToLocalDate(new Date()) );
	System.out.println("Affichage toString de convertToLocalDateViaInstant:" + convertToLocalDateViaInstant(new Date()) );
	System.out.println("Affichage toString de convertToLocalDateViaInstant:" + convertToLocalDateViaMilisecond(new Date()) );



}
}
