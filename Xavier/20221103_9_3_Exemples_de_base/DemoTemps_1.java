package essai;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Locale;

/**
 * JAVA 8
 * Les objets LocalDate (jj/mm/aaaa + calendrier)
 * affichages des dates
 *   SimpleDateFormat,
 * affichages des dates à l'aide de 
 * @author Afpa */
public class DemoTemps_1 {
public static void main(String[] args) {

	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");//MAJUSCULE !!
	DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");//Majuscule
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss",Locale.FRANCE);//Majuscule!!

	LocalDate d1 = LocalDate.of(2019, Month.MAY, 8);
	LocalDate now = LocalDate.now();
	LocalDateTime dt2 = LocalDateTime.of(2019, Month.AUGUST, 15, 9, 37, 52);

/////////////////////////////////////////////////////////////////////////
	System.out.println("Quelques méthodes");
	System.out.println("-----------------");

	System.out.println("méthodes withXxxx pour forcer des parties");
	//withXxxx  retourne une nouvelle instance en imposant la composante
	//indiquée par Xxxx par la valeur passée comme paramètre :
	//withDayOfMonth, withMonth, withYear, withHour, ...
	System.out.println("Affichage  de dt2  :" + dt2.format(dtf));	
	dt2 = dt2.withDayOfMonth(10).withYear(2015);
	System.out.println("Affichage  de dt2 modifié :" + dt2.format(dtf));	
	
	System.out.println();
	
	System.out.println("méthodes plusXxxx et minusXxxx pour ajout ou retrait");
	//plusXxxx et minusXxxx  retournent une nouvelle instance de la classe
	// après ajout ou retrait du nombre d’unités indiqué par le paramètre
	//Xxxx indique ce qui est ajouté ou retranché
	LocalDate paques = LocalDate.of(2019,4,22);
	System.out.println("Affichage  de pâques:" + paques.format(df));
	LocalDate ascension = paques.plusDays(38);
	System.out.println("Affichage  de ascension:" + ascension.format(df));

	System.out.println();
	
	System.out.println("méthodes from (pour la conversion)");
	LocalDateTime maintenant = LocalDateTime.now();
	System.out.println("Affichage  de maintenant  :" + maintenant.format(dtf) );

	//from permet la conversion entre les différents types
	//En cas de conversion vers un type moins complet, il y a perte d’informations
	// exemple de conversion d'une LocalDateTime en LocalDate avec perte de l’heure 

	LocalDate d4 = LocalDate.from(maintenant);
	System.out.println("Affichage  de d4 :" + d4.format(df));

	System.out.println();
	
	System.out.println("méthodes atXxxx fusionne ");
	//atXxxx : fusionne l’objet reçu comme paramètre avec l’objet courant
	//et retourne le résultat 
	//On peut par exemple fusionner un LocalDate et un LocalTime pour
	//obtenir un objet LocalDateTime
	//LocalDate jourMatch;
	LocalDate jourMatch = LocalDate.of(2019,7,14);
	System.out.println("Affichage  de jourMatch :" + jourMatch.format(df));
	//LocalTime heureMatch
	LocalTime heureMatch = LocalTime.of(21,00); 
	System.out.println("Affichage  de heureMatch  :" + heureMatch.format(tf) );
	LocalDateTime fusion = jourMatch.atTime(heureMatch);
	System.out.println("Affichage de la fusion  :" + fusion.format(dtf));	

	
	System.out.println();
	
	//Period : nb jours
	
	System.out.println("Calcul du nb de jours (intervalle) entre 2 LocalDate:");
	System.out.println("méthodes between ");
	Period dif = Period.between( d1, now );
	System.out.println("Affichage de la periode :" + dif);	
	System.out.println("Affichage du getDays :" + dif.getDays());
	System.out.println("Affichage du getMonths :" + dif.getMonths());
	System.out.println("Affichage du getYears :" + dif.getYears());
	System.out.println("Affichage du getUnits :" + dif.getUnits());
	System.out.println();

	//Duration dur; interval en heure-minute-seconde
	//Duration dur = Duration.between(startInclusive, endExclusive);

	
	//////////////////////////////////
	//la date/heure avec décalage /UTC 
	//////////////////////////////////
	//source :https://www.baeldung.com/java-zoneddatetime-offsetdatetime
//	OffsetDateTime:
//
//		stores all date and time fields, to a precision of nanoseconds, as well as the offset from GMT/UTC (no timezone information)
//		should be used for storing a date in the database or communicating it over a network
	ZoneOffset zoneOffSet= ZoneOffset.of("+02:00");
	OffsetDateTime offsetDateTime = OffsetDateTime.now(zoneOffSet);
	
	System.out.println("Affichage de offsetDateTime :" + offsetDateTime);	
	System.out.println();
	//////////////////////////////////////////////////
	//la date/heure avec fuseau horaire ZonedDateTime
	//////////////////////////////////////////////////
	//source :https://www.baeldung.com/java-zoneddatetime-offsetdatetime
//	ZonedDateTime:
//		stores all date and time fields, to a precision of nanoseconds, and a timezone, with a zone offset used to handle ambiguous local date-times
//		can't freely set offsets, as the zone controls the valid offset values
//		is fully DST-aware and handles daylight savings adjustments
//		comes in handy for displaying date-time fields in a user-specific timezone
	ZonedDateTime zonedDateTime = ZonedDateTime.now();
	ZonedDateTime parse = ZonedDateTime.parse( "2018-12-03T10:15:30+01:00[Europe/Paris]");
	
	System.out.println("Affichage de zonedDateTime :" + zonedDateTime);	

	ZoneId zone = ZoneId.of("Europe/Berlin");
	ZonedDateTime zonedDateTime2 = ZonedDateTime.now(zone);
	System.out.println("Affichage de zonedDateTime2 :" + zonedDateTime2);	

	//ZonedDateTime sourceZonedDateTime;
	//ZonedDateTime destZonedDateTime =  sourceZonedDateTime.withZoneSameInstant(destZoneId);

}}
