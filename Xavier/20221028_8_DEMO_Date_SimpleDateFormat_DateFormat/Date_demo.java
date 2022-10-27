package demo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * JAVA 7
 * Les objets Date, affichages des dates avec "printf-style",
 * affichages des dates avec  SimpleDateFormat,
 * affichages des dates à l'aide de DateFormat (classe abstraite)
 * @author Afpa 
 */
public class Date_demo {
public static void main(String[] args) throws ParseException {

System.out.println("Création et affichage d'objets Date:" );
System.out.println("------------------------------------" );

//aujourd'hui
Date d2 = new Date();
System.out.println("Aujourd'hui :" + d2);//toString de Date (non localisé)
System.out.println("CONCLUSION: toString() de Date est utilisable mais NON localisé");
//toString() ne tient pas compte de la locale fr_FR// non "Locale-sensitive"
System.out.println();

System.out.println("récupération du long (le timestamp) :" + d2.getTime());
System.out.println("valeur de System.currentTimeMillis() :" + System.currentTimeMillis());


System.out.println();
Date d4 = new Date(0);
System.out.println("la date Epoch :" + d4);//1 janvier 1970 00h00m00s  UTC
//Construction d'une autre date avant epoch
Date d1 = new Date(-8000000000000L);
System.out.println("une date AVANT epoch:" + d1);

//Construction d'une autre date avant epoch
Date d7 = new Date(-8000000L);
System.out.println("une date AVANT epoch:" + d7);

//Construction d'une autre date avant epoch
Date d8 = new Date(-80000000000000L);
System.out.println("une date AVANT epoch:" + d8);

//Construction d'une autre date avant epoch
Date d10 = new Date(-99000000000000L);
System.out.println("une date AVANT epoch:" + d10);
System.out.printf( "d10 vaut:%1$tA %1$te %1$tB %1$tY \n", d10 );


/////////////////////////////////////////////////////////////////
//FORMATTAGES "printf-style" des dates (JAVA 5), Locale-sensitive?
/////////////////////////////////////////////////////////////////
// Affichage à la console
System.out.println("\n affichages des dates avec \"printf-style\" (localisé!) :");
System.out.println("----------------------------------------------------------:");

System.out.printf( "%tD \n" , new Date() );
System.out.printf( "%tF \n" , new Date() );
System.out.printf( "%1$te %1$tb %1$ty \n" , new Date() );
System.out.printf( "%1$te %2$tb %2$ty \n" , new Date(), new Date(),new Date());
System.out.printf( "%1$tA %1$te %1$tB %1$tY \n", new Date() );
System.out.printf( "%1$tr \n" , new Date() );

////////////////////////////////////////////////////////////////////////////////
// Rappel sur le formattage dans une chaîne (équivalent au sprintf en langage C)
String chaineFormattee = String.format(" appel à String.format:%tF\n", new Date());
System.out.printf( "La chaîne Formattée :" + chaineFormattee);
//VOIR la documentation de : java.util.Formatter 
//Autre Rappel: java.util.Scanner.nextFloat() est localisé, il attend une virgule

System.out.println();

//////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////
//    Les objets FORMATS POUR LES DATES  , Locale-sensitive?
//////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////


////////////////////////////////////
//  Utilisation du SimpleDateFormat
////////////////////////////////////
System.out.println("\nUtilisation du SimpleDateFormat (localisé):");
System.out.println("---------------------------------------------");

//FORMATTAGE// formatting
SimpleDateFormat sdf2= new java.text.SimpleDateFormat();
System.out.println("formattage de ma date avec SimpleDateFormat  :" + sdf2.format(new Date()));

//On force un modèle (pattern) dans l'objet format
SimpleDateFormat sdf1= new java.text.SimpleDateFormat("dd/MM/yyyy");
//!!!!!!!!!!!!ATENTION  MM en majuscule!!!!!!!!!!!! pas de contrôle si erreur sur le modèle
System.out.println("formattage de ma date avec SimpleDateFormat \"dd/MM/yyyy\" :" + sdf1.format(d2));
System.out.println("formattage de ma date avec SimpleDateFormat \"dd/MM/yyyy\" :" + sdf1.format(new Date()));
System.out.println();

//Changement du pattern dans l'objet format
//sdf1.applyPattern("yyyyMMdd");
sdf1.applyPattern("dd-MM-yyyy");
System.out.println("pattern de SimpleDateFormat modifié  :" + sdf1.format(d2));


//PARSING
//la SAISIE DES VALEURS d'un formulaire, on doit recomposer la chaîne au format attendu
//Pas pratique. On aura plus de facilité avec une date-calendrier
Date d3 = sdf1.parse("16-02-2018");
System.out.println("ma date parsée par un SimpleDateFormat  :" + sdf1.format(d3));
// Exception si non conforme au modèle attendu
//System.out.println("ma date parsée par un SimpleDateFormat  :" + sdf1.parse("16/02-2015"));

//écriture possible, pour créer de nombreuses dates
Date d6 = new SimpleDateFormat("dd/MM/yyyy").parse("16/04/2018");
System.out.println("(autre écriture) de ma date parsée par un SimpleDateFormat  :" + sdf1.format(d6));
//Date d7 = (new SimpleDateFormat("dd/MM/yyyy")).parse("16/07/2014");
//Date d8 = new SimpleDateFormat("dd/MM/yyyy").parse("13/02/2015");
//Date d9 = new SimpleDateFormat("dd/MM/yyyy").parse("16/08/2018");


///////////////////////////////////////////////////////////////////////////////////
//	Utilisation de la classe  abstraite DateFormat pour obtenir un format pour date
//	C'est une écriture à privilégier en JAVA
//  On s'éloigne de la classe d'implémentation SimpleDateFormat
//	Autrement dit:  On élève le niveau d'abstraction du code
///////////////////////////////////////////////////////////////////////////////////
System.out.println("\n\nUtilisation de la classe  abstraite DateFormat (localisée):");
System.out.println("------------------------------------------------------------- :");

////////////////////////////////
// AFFICHAGE (formatting)
////////////////////////////////
DateFormat df8 = DateFormat.getInstance();
System.out.println("ma date formatée par un DateFormat.getInstance  :" + df8.format(d3));


DateFormat df1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
//DateFormat df7 = SimpleDateFormat.getDateInstance(DateFormat.MEDIUM);
System.out.println("ma date formatée par un DateFormat.getDateInstance MEDIUM :" + df1.format(d3));

DateFormat df9 = DateFormat.getTimeInstance(DateFormat.LONG);
System.out.println("ma date formatée par un DateFormat.getDateTimeInstance LONG :" + df9.format(d3));

DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.LONG);
System.out.println("ma date formatée par un DateFormat.getDateTimeInstance MEDIUM LONG :" + df2.format(d3));

DateFormat df10 = DateFormat.getDateInstance(DateFormat.LONG, Locale.ENGLISH);
System.out.println("ma date formatée par un DateFormat.getDateTimeInstance LONG, Locale.ENGLISH :" + df10.format(d3));
DateFormat df11 = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
System.out.println("ma date formatée par un DateFormat.getDateTimeInstance LONG, Locale.US :" + df11.format(d3));
System.out.println();

System.out.println("ma date formatée par un DateFormat.getTimeInstance LONG :" +
					DateFormat.getTimeInstance(DateFormat.LONG).format(new Date()));
System.out.println("ma date formatée par un DateFormat.getTimeInstance LONG, Locale.ENGLISH :" +
					DateFormat.getTimeInstance(DateFormat.LONG, Locale.ENGLISH).format(new Date()));
System.out.println("ma date formatée par un DateFormat.getTimeInstance LONG, Locale.US :" +
		DateFormat.getTimeInstance(DateFormat.LONG, Locale.US).format(new Date()));

////////////////////////////////
// PARSING
////////////////////////////////
//Voir le fuseau horaire affiché
Date d9 = sdf1.parse("22-05-2018");
System.out.println("ma date formatée par un DateFormat.getDateTimeInstance MEDIUM LONG :" + df2.format(d9));


System.out.println();

if( df1 instanceof SimpleDateFormat)
	System.out.println("getDateInstance renvoie un objet de type SimpleDateFormat !!!");
else
	System.out.println("classe inattendue");



//////////////////////////////////////////////////
////// AFFICHAGE SUR LA CONSOLE
//////////////////////////////////////////////////
//
}}
