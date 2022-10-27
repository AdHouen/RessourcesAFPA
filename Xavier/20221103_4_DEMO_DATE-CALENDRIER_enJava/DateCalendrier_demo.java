package demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * JAVA 7
 * Utilisation de la date-calendrier GregorianCalendar
 * FORMATTAGES des dates-calendrier avec les objets format (repasser par Date)
 * Construire une date-calendrier à partir d'une Date : setTime
 * SAISIE DES VALEURS d'un formulaire
 * retrouver le nb de ms
 * DIVERS POSSIBILITES  set, add, get
 * La Date-Calendrier est tolérante par défaut
 * Utilisation de la classe  abstraite Calendar ?
 * @author Afpa
 */
public class DateCalendrier_demo {

public static void main(String[] args) {
	
////////////////////////////////////
//des Format pour l'affichage des ... dates
SimpleDateFormat sdf1= new java.text.SimpleDateFormat("dd/MM/yyyy");
DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.LONG);

////////////////////////////////////////////////////////////////////////////////
//LES DATES-CALENDRIERS
////////////////////////////////////////////////////////////////////////////////

System.out.println("\n\nUtilisation de la date-calendrier GregorianCalendar");
System.out.println("-------------------------------------------------------");

GregorianCalendar dc1 = new java.util.GregorianCalendar();
System.out.println("new java.util.GregorianCalendar().toString() :" + dc1);
System.out.println("CONCLUSION le toString() est NON VIABLE");

////////////////////////////
//AFFICHAGE (avec les objets format)
////////////////////////////

System.out.println("\nFORMATTAGES des dates-calendrier avec les objets format");
System.out.println("---------------------------------------------------------");
//System.out.println("la date calendrier :" + sdf1.format(dgc1));//Ne fonctionne pas au runtime (Exception!!!)
System.out.println("la date calendrier :" + sdf1.format(dc1.getTime()));
System.out.println("la date calendrier :" + df2.format(dc1.getTime()));
System.out.println("CONCLUSION : il faut repasser par les dates");


System.out.println("\nConstruire une date-calendrier à partir d'une Date : setTime");
System.out.println("--------------------------------------------------------------");
dc1.setTime(new Date(0));
System.out.println("la date calendrier à partir de new Date(0) :" + sdf1.format(dc1.getTime()));

//////////////////////////////////////////////////////////////////
//SAISIE DE VALEURS dans un formulaire, date-calendrier à choisir
//////////////////////////////////////////////////////////////////
System.out.println("\nSAISIE DES VALEURS d'un formulaire");
System.out.println("-------------------------------------");

//Après le parsing
dc1 = new java.util.GregorianCalendar(2017,Calendar.FEBRUARY,16);
dc1 = new java.util.GregorianCalendar(2017,1,16);
System.out.println("\nla date calendrier jour-mois-annee:" +  df2.format(dc1.getTime()));

dc1 = new java.util.GregorianCalendar(2017,3,16,13,15,30);
dc1 = new java.util.GregorianCalendar(2018,Calendar.APRIL,16,13,15,30);

System.out.println("\nla date calendrier jour-mois-annee heure:minute:seconde :" +  df2.format(dc1.getTime()));



System.out.println("\nretrouver le nb de ms");
System.out.println("----------------------");
System.out.println("Le nb ms à partir d'une date-Calendrier :" + dc1.getTime().getTime());
System.out.println("Le nb ms à partir d'une date-Calendrier :" + dc1.getTimeInMillis());
System.out.println("valeur de System.currentTimeMillis() :" + System.currentTimeMillis());

///////////////////////////////////
//DIVERS POSSIBILITES set, add, get
///////////////////////////////////
System.out.println("\nDIVERS POSSIBILITES set, add, get");
System.out.println("-----------------------------------");

//On force le mois d'aout
dc1.set(Calendar.MONTH,Calendar.AUGUST );
System.out.println("On force le mois aout :" + sdf1.format(dc1.getTime()));

//On force le 23 du mois courant
dc1.set(Calendar.DAY_OF_MONTH, 23);
System.out.println("On fixe le jour au 23 (dans le mois courant) :" + sdf1.format(dc1.getTime()));

//On ajoute 3 jours
dc1.add(Calendar.DAY_OF_YEAR,3);
System.out.println("On ajoute 3 jours :" + sdf1.format(dc1.getTime()));


System.out.println("\nOn extrait des infos de la date-calendrier:");
System.out.println("--------__----------------------------------");

//extraction du mois de la date-calendrier
System.out.println("DAY_OF_MONTH :" + dc1.get(Calendar.DAY_OF_MONTH));
System.out.println("DAY_OF_WEEK :" + dc1.get(Calendar.DAY_OF_WEEK));
System.out.println("DAY_OF_YEAR :" + dc1.get(Calendar.DAY_OF_YEAR));

dc1.get(Calendar.MONTH);
System.out.println("MONTH :" + dc1.get(Calendar.MONTH));

dc1.get(Calendar.YEAR);
System.out.println("YEAR :" + dc1.get(Calendar.YEAR));

////////////////////////////////////////////////////////////
//LES DATES-CALENDRIERS tolérantes par défaut ... "lenient" 
////////////////////////////////////////////////////////////
System.out.println("\n\nDate Calendrier est tolérante par défaut:");
System.out.println("---------------------------------------------:");

GregorianCalendar dc2 = new java.util.GregorianCalendar(2015,Calendar.FEBRUARY,31);
System.out.println("Ma date calendrier lenient 31/02/2015 :" + sdf1.format(dc2.getTime()));

//Date d4 = new java.util.GregorianCalendar(2015,Calendar.FEBRUARY,31).getTime();

//long l1 = new java.util.GregorianCalendar(2015,Calendar.FEBRUARY,31).getTime().getTime();

GregorianCalendar dgc3 = new java.util.GregorianCalendar(2015,Calendar.FEBRUARY,24);

System.out.println("\nOn arrête la tolérance:");
System.out.println("------------------------");
dgc3.setLenient(false);
dgc3.set(Calendar.DAY_OF_MONTH, 31);
//System.out.println("Ma GregorianCalendar :" + sdf1.format(dgc3.getTime()));
//   java.lang.IllegalArgumentException: MONTH: 1 -> 2

////////////////////////////////////////////////////////////////////////////////////////////////
//Utilisation de la classe abstraite Calendar pour obtenir une date-calendrier
//Ecriture à privilégier en JAVA : On s'éloigne de la classe d'implémentation GregorianCalendar
//Autrement dit:  On élève le niveau d'abstraction du code
/////////////////////////////////////////////////////////////////////////////////////////////////
System.out.println("\n\nUtilisation de la classe  abstraite Calendar pour les dates-calendrier:");
System.out.println("--------------------------------------------------------------------------:");

Calendar dc = Calendar.getInstance();
System.out.println("Aujourd'hui,  Calendar.getInstance() :" + df2.format(dc.getTime()));

System.out.println();
if( dc instanceof GregorianCalendar)
System.out.println("getInstance renvoie un objet de type GregorianCalendar !!!");
else
System.out.println("classe inattendue");

dc.set(2015,Calendar.FEBRUARY,16);
System.out.println("On force la date au 16 avril 2015  :" + df2.format(dc.getTime()));
dc.add(Calendar.DAY_OF_YEAR, -18);
System.out.println("On retire 18 jours  :" + df2.format(dc.getTime()));

dc.set(2015,Calendar.MAY,23,13,15,30);
System.out.println("On force la date au 23 mai 2015 13:15:30 :" + df2.format(dc.getTime()));

//System.out.println("Ma date Calendar :" + sdf1.format(dc.getTime()));

System.out.println("DAY_OF_YEAR :" + dc.get(Calendar.DAY_OF_YEAR));

System.out.println("Est-ce une année bissextile?");
//System.out.println("Est-ce une année bissextile? :" + dc.isLeapYear());
System.out.println("méthode isLeapYear indisponible, expliquez pourquoi : .......");


//////////////////////////////////////////////////
//////AFFICHAGE SUR LA CONSOLE DU CODE PLUS HAUT
//////////////////////////////////////////////////
/*
Utilisation de la date-calendrier GregorianCalendar
-------------------------------------------------------
new java.util.GregorianCalendar().toString() :java.util.GregorianCalendar[time=1517323666778,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Europe/Paris",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=184,lastRule=java.util.SimpleTimeZone[id=Europe/Paris,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2018,MONTH=0,WEEK_OF_YEAR=5,WEEK_OF_MONTH=5,DAY_OF_MONTH=30,DAY_OF_YEAR=30,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=47,SECOND=46,MILLISECOND=778,ZONE_OFFSET=3600000,DST_OFFSET=0]
CONCLUSION le toString() est NON VIABLE

FORMATTAGES des dates-calendrier avec les objets format
---------------------------------------------------------
la date calendrier :30/01/2018
la date calendrier :30 janv. 2018 15:47:46 CET
CONCLUSION : il faut repasser par les dates

Construire une date-calendrier à partir d'une Date : setTime
--------------------------------------------------------------
la date calendrier à partir de new Date(0) :01/01/1970

SAISIE DES VALEURS d'un formulaire
-------------------------------------

la date calendrier jour-mois-annee:16 févr. 2017 00:00:00 CET

la date calendrier jour-mois-annee heure:minute:seconde :16 avr. 2017 13:15:30 CEST

retrouver le nb de ms
----------------------
Le nb ms à partir d'une date-Calendrier :1492341330000
Le nb ms à partir d'une date-Calendrier :1492341330000
valeur de System.currentTimeMillis() :1517323666778

DIVERS POSSIBILITES set, add, get
-----------------------------------
On force le mois aout :16/08/2017
On fixe le jour au 23 (dans le mois courant) :23/08/2017
On ajoute 3 jours :26/08/2017

On extrait des infos de la date-calendrier:
--------__----------------------------------
DAY_OF_MONTH :26
DAY_OF_WEEK :7
DAY_OF_YEAR :238
MONTH :7
YEAR :2017


Date Calendrier est tolérante par défaut:
---------------------------------------------:
Ma date calendrier lenient 31/02/2015 :03/03/2015

On arrête la tolérance:
------------------------


Utilisation de la classe  abstraite Calendar pour les dates-calendrier:
--------------------------------------------------------------------------:
Aujourd'hui,  Calendar.getInstance() :30 janv. 2018 15:47:46 CET

getInstance renvoie un objet de type GregorianCalendar !!!
On force la date au 16 avril 2015  :16 févr. 2015 15:47:46 CET
On retire 18 jours  :29 janv. 2015 15:47:46 CET
On force la date au 23 mai 2015 13:15:30 :23 mai 2015 13:15:30 CEST
DAY_OF_YEAR :143
Est-ce une année bissextile?
méthode isLeapYear indisponible, expliquez pourquoi : .......
 */
}}
