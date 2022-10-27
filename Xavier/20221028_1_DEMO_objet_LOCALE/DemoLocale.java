package test;
import java.util.Locale;
import java.text.NumberFormat;

class DemoLocale {
/**
 * sur une ligne, affiche les infos d'une Locale
 * @param chaine  chaîne affichée au début de la ligne
 * @param locale la locale à afficher
 */
static void afficheLaLocale(String chaine, Locale locale) {
	System.out.print(chaine);
	//en commentaire, on écrit le résultat pour la locale fr_FR
    System.out.print(" " + locale.getDisplayName() + "< ");//français (France)
    System.out.print(" " + locale.getDisplayLanguage() + "< ");//français
    System.out.print(" " + locale.getLanguage() + "< ");//fr
    System.out.print(" " + locale.getISO3Language() + "< ");//fra
    System.out.print(" " + locale.getDisplayCountry() + "< ");//France
    System.out.print(" " + locale.getCountry() + "< ");//FR
    System.out.print(" " + locale.getDisplayVariant() + "< ");
    System.out.print(" " + locale.getVariant() + "< ");

    System.out.println("  toString():" + locale.toString());//fr_FR
}

public static void main(String[] args) {
    //Locale.setDefault(Locale.ITALIAN);
    
    Locale locale = Locale.getDefault();
    afficheLaLocale("Pour un applicatif lancé sur mon poste de travail, "
    		+ "voici les informations sur la Locale par défaut :\n\t", locale);
    
    
    System.out.println("\nA retenir : pour la localisation “french (France)” le toString vaut: fr_FR");

    
    
    /////////////////////////////////////////////////////
    //qq objets "constantes" pour des locales prédéfinies
    /////////////////////////////////////////////////////
    /*The Locale class provides a number of convenient constants that you
    can use to create Locale objects for commonly used locales. */
    System.out.println("\n En java, affichage pour des Locales prédéfinies:");
    System.out.println("---------------------------------------------");
    afficheLaLocale("locale CANADA :\t", Locale.CANADA);
    afficheLaLocale("locale CANADA_FRENCH :\t", Locale.CANADA_FRENCH); //Locale "french (Canada)" (fr_CA)
    afficheLaLocale("locale CHINA :\t", Locale.CHINA);
    afficheLaLocale("locale CHINESE :\t", Locale.CHINESE);
    afficheLaLocale("locale ENGLISH :\t", Locale.ENGLISH);
    afficheLaLocale("locale FRANCE :\t", Locale.FRANCE); //Locale "french (France)" (fr_FR)
    afficheLaLocale("locale FRENCH :\t", Locale.FRENCH);
    afficheLaLocale("locale GERMAN :\t", Locale.GERMAN);
    afficheLaLocale("locale GERMANY :\t", Locale.GERMANY);
    afficheLaLocale("locale ITALIAN :\t", Locale.ITALIAN);
    afficheLaLocale("locale ITALY :\t", Locale.ITALY);
    afficheLaLocale("locale JAPAN :\t", Locale.JAPAN);
    afficheLaLocale("locale JAPANESE :\t", Locale.JAPANESE);
    afficheLaLocale("locale KOREA :\t", Locale.KOREA);
    afficheLaLocale("locale KOREAN :\t", Locale.KOREAN);
    afficheLaLocale("locale RPC :\t", Locale.PRC);
    afficheLaLocale("locale SIMPLIFIED_CHINESE :\t", Locale.SIMPLIFIED_CHINESE);
    afficheLaLocale("locale TAIWAN :\t", Locale.TAIWAN);
    afficheLaLocale("locale TRADITIONAL_CHINESE :\t", Locale.TRADITIONAL_CHINESE);
    afficheLaLocale("locale UK :\t", Locale.UK);
    afficheLaLocale("locale US :\t", Locale.US);

    System.out.println(" A retenir : la Locale “french (France)” (fr_FR))");

  //Autre Rappel: java.util.Scanner.nextFloat() est localisé, il attend une virgule
  //  System.out.printf( "%1$te %1$tb %1$ty \n" , new Date() );//localisé
  //

    ///////////////////////////////////////////////////
    //toutes les locales possibles pour mon application
    ///////////////////////////////////////////////////
    System.out.println("\n\nNumberFormat.getAvailableLocales():");
    System.out.println("--------------------------------------");
   Locale[] locales = NumberFormat.getAvailableLocales();
    for (int i=0; i<locales.length; i++) {
        afficheLaLocale("", locales[i]);
    }
}
}