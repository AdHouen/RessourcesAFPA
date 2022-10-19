/**
*Objectif: Prise en main des outils.<p>
*
*Hello World
*
*@author Afpa
*@version 1.0
*/
package fr.afpa.tests;

import fr.afpa.outils.Console;


public class TestIO
{
		public static void main( String[] arg )
  {
    String chaine;
    System.out.println( "Entrez votre prenom :" );
    chaine = Console.in.readLine();
    System.out.println( "Bonjour " + chaine );
  }
}

