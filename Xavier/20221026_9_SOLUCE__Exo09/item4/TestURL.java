package exo09.item4;
import fr.afpa.outils.*;
/**
 * Objectif: Utilisation des classes de l'API du JDK <p>
 *
 * La classe String
 * Extraction d'informations dans une URL (Uniform Resource Locator)
 * Format Protocole://site/fichier.htm
 *
 * @author AFPA
 * @version 1.0
 */ 

public class TestURL 
{
public static void main (String arg [])
{
String url = "ftp://paris/partage/aaaaaaaaaaaaa/bbbbbbbbbbb/JeuDeLaVie.htm";

//System.out.print( "\nDonner une URL : " );
//url  = Console.in.readLine();

//Affichage du protocole
System.out.print( "\tLe protocole est : " );
int pos1 = url.indexOf( "://" );
if( pos1 != -1 )
	System.out.println( url.substring( 0, pos1 ).toUpperCase() );
else
	System.out.println( "inconnu" );

//Affichage du site	
System.out.print ("\tLe site est      : ");
int pos2 = url.indexOf( "/" , pos1 + 3 );
if( pos2 != -1 && pos1 != -1 ) 
	System.out.println( url.substring( pos1 + 3, pos2 ) );
else
	System.out.println( "inconnu" );

//Affichage de la page HTML	
System.out.print( "\tLa page html est : " );
pos2 = url.lastIndexOf( ".htm" );
if( pos2 != -1 ) {
	pos1 = url.lastIndexOf( "/", pos2 );
	System.out.println( url.substring( pos1 + 1 ) );
}
else
		System.out.println( "inconnu" );
}}
