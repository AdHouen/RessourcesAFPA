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
public class DemoTemps_0 {
public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
	////////////////////////////////
	//la LocalDate  (jj/mm/aaaa + calendrier)
	////////////////////////////////
	System.out.println();
	System.out.println("La LocalDate :");
	System.out.println("--------------------------");
	LocalDate now = LocalDate.now();
	System.out.println("Affichage toString de now:" + now + "    mal localisé!!");

	System.out.println();

	////////////////////////////////////////
	// Construction avec of d'une LocalDate (factory method  ~ valueOf des wrappers)
	//of  : retourne une instance de la classe initialisée avec les différentes
	//  valeurs passées comme paramètres
	//
	//Rq: LocalDate ne comporte pas de décalage avec UTC, ni le fuseau horaire
	System.out.println("Construction avec of d'une LocalDate :");
	LocalDate d1 = LocalDate.of(2019, Month.MAY, 8);
	
	System.out.print("Affichage toString de d1 :" + d1 + "    mal localisé!!");
	System.out.println();
	
	//////////////////////////////////////////////////////////
	//Construction avec parsing par défaut (suivant la Locale) (sans objet format)
	//////////////////////////////////////////////////////////
	System.out.println("Parsing par defaut (non-localisé)");
	//LocalDate d7 = LocalDate.parse("29/12/2019"); //DateTimeParseException
	LocalDate d7 = LocalDate.parse("2019-12-29");
	//LocalDate d7 = LocalDate.parse("2019.12.29");

	System.out.println("Affichage toString de d7 :" + d7);
	
	
	System.out.println();
	System.out.println("création d'un format :");

	/////////////////////////////////////
	//Un objet format pour la LocalDate  (~ valueOf des wrappers)
	/////////////////////////////////////
	/////////////////////////////////////
	// formater avec un objet format
	/////////////////////////////////////
	DateTimeFormatter df = DateTimeFormatter
							.ofPattern("dd/MM/yyyy");//MAJUSCULE !!
	//Changement du pattern "dd/MM/yyyy" impossible
	//le DateTimeFormatter est non-mutable
	
	//La façon de coder JAVA7 fonctionne encore
	//System.out.println("Affichage formaté v1 de \"now\":" + df.format(now));
	
	//nouvelle façon de coder
	System.out.println("Affichage avec format de \"now\":" + now.format(df));
	
	System.out.println("Affichage avec format de d1:" + d1.format(df));
	
	LocalDate d2 = LocalDate.of(2019, Month.JULY, 14);
	System.out.println("Affichage avec format de d2:" + d2.format(df));

	//////////////////////////////////////////////
	//parsing des zones de saisie d'un formulaire en passant l'objet format
	//////////////////////////////////////////////
	
	System.out.println();
	System.out.println("Parsing d'une LocalDate grâce au format:");
	System.out.println("------------------------------------------");
	LocalDate d3 = null;
	try {
		d3 = LocalDate.parse("11/11/2019", df);
		System.out.println("Affichage avec format de d3  :" + d3.format(df));
	} catch (DateTimeParseException ex) {
		System.out.println("le parse à échoué");
		System.out.println("Une exception est levée :" + ex);
		System.out.println("message :" + ex.getMessage());
	}
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
	////////////////////////////////
	//la LocalTime  (hh:mm:ss + calendrier)
	////////////////////////////////
	System.out.println();
	System.out.println("La LocalTime :");
	System.out.println("--------------");
	LocalTime now3 = LocalTime.now();
	System.out.println("Affichage toString de now3 :" + now3);	
	System.out.println();

	//of  : retourne une instance de la classe initialisée avec les différentes
	//valeurs passées comme paramètres
	System.out.println("Construction avec of d'une LocalTime :");
	LocalTime midi = LocalTime.of(12,0,0);
	System.out.println("Affichage toString de midi  :" + midi );

	System.out.println();

	//////////////////////////////////////////////////////////
	//parsing par défaut (suivant la Locale) sans objet format
	//////////////////////////////////////////////////////////
	System.out.println("Parsing par defaut (non-localisé)");
	LocalTime horloge = LocalTime.parse("22:45:03");
	System.out.println("Affichage toString de horloge :" + horloge);
	
	System.out.println();
	System.out.println("création d'un format :");

	//////////////////////////////////////
	//Un format pour l'heure
	//////////////////////////////////////
	//le DateTimeFormatter est non-mutable
	DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");//Majuscule
	
	//System.out.println("Affichage  de now3  :" + tf.format(now3) );//possible
	System.out.println("Affichage avec format de now3  :" + now3.format(tf) );
	//////////////////////////////////////////////
	//parsing des zones de saisie d'un formulaire
	//////////////////////////////////////////////
	
	System.out.println();
	System.out.println("Parsing d'une LocalTime grâce au format:");
	System.out.println("------------------------------------------");
	LocalTime t3 = LocalTime.parse("12:45:03", tf);
	System.out.println("Affichage toString de t3  :" + t3);
	System.out.println("Affichage  de t3 avec le format :" + t3.format(tf) );

	
	/*
	 * // create a formater DateTimeFormatter formatter =
	 * DateTimeFormatter.ISO_LOCAL_TIME;
	 * 
	 * // create an LocalTime object and LocalTime lt = LocalTime .parse("10:15:45",
	 * formatter);
	 * 
	 * // print result System.out.println("LocalTime : " + lt);
	 */

////////////////////////////////////////////////////////////////////////	
////////////////////////////////////////////////////////////////////////////
	////////////////////////////////
	// la LocalDateTime  (jj/mm/aaaa hh:mm:ss + calendrier)
	////////////////////////////////
	System.out.println();
	System.out.println("La LocalDateTime (la date-heure):");
	System.out.println("--------------------------------");
	LocalDateTime now2 = LocalDateTime.now();
	System.out.println("Affichage toString de now2 :" + now2);
	
	System.out.println();
	
	//of  : retourne une instance de la classe initialisée avec les différentes valeurs passées comme paramètres
	// en Java7, on utilisait le constructeur de  java.util.Calendar
	//
	//LocalDateTime ne comporte pas de décalage avec UTC, ni le fuseau
	System.out.println("Construction avec of d'une LocalDateTime :");
	LocalDateTime dt2 = LocalDateTime.of(2019, Month.AUGUST, 15, 9, 37, 52);
	
	System.out.println("Affichage toString de dt2  :" + dt2);	
	
	System.out.println();	
	//////////////////////////////////////////////////////////
	//Construction avec parsing par défaut (suivant la Locale) (sans objet format)
	//parsing des zones de saisie d'un formulaire
	//////////////////////////////////////////////////////////
	System.out.println("Parsing par defaut (non-localisé)");
	//LocalDateTime dt8 = LocalDateTime.parse("2019-12-29 22:45:03");//plante
	LocalDateTime dt8 = LocalDateTime.parse("2018-12-03T10:15:30");
	System.out.print("Affichage toString de dt8 :" + dt8);
	
	System.out.println();
	System.out.println("création d'un format :");
	//////////////////////////////////////
	//Un nouveau format pour la date-heure
	//////////////////////////////////////
	//le DateTimeFormatter est non-mutable pour le pattern
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss",Locale.FRANCE);//Majuscule!!
	//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss");

	System.out.println("Affichage toString de now2 :" + now2);
	System.out.println("Affichage avec format de now2  :" + now2.format(dtf) );

	System.out.println();

	System.out.println();
	System.out.println("Parsing d'une LocalDateTime grâce au format:  NOK");
	System.out.println("------------------------------------------");
	LocalDateTime dt9 = LocalDateTime.parse("29/12/2019 22:45:03", dtf);//plante

	System.out.println("Affichage toString de dt9  :" + dt9);
	System.out.println("Affichage avec format de dt9 :" + dt9.format(dtf) );

}}
