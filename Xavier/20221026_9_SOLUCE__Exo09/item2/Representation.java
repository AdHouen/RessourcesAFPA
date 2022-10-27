package exo09.item2;

import fr.afpa.outils.*;
/**
 * Objectif: Utilisation des classes de l'API du JDK <p>
 *
 * La classe String
 * Représentation des chaines avec caract�res nationaux. 
 * Affichage de l'UNICODE  de chaque caract�res
 *
 * @author AFPA
 * @version 1.0
 */ 
public class Representation 
{
public static void main (String arg [])
{
String ch = "L'élève paranoïaque" ;		
System.out.println(ch);

for( int i=0; i<ch.length(); i++ )
	System.out.print( " " + (int )ch.charAt( i ) );
System.out.println( "\n" );

for (int i=0; i<ch.length(); i++)
	System.out.print( " " + ch.codePointAt( i ) );

do
{
	Console.out.print( "\n\nEntrez une chaîne caractères : " );
	ch  = Console.in.readLine();
	
	//Affichage de la chaine
	System.out.println(ch);
	
	//Affichage des valeurs Unicode en décimal
	for (int i=0; i<ch.length(); i++)
		System.out.printf( " \\u00%x" , (int )ch.charAt( i ) );
		
	System.out.println( "" );
} while( !ch.toLowerCase().equals( "fin" ) );

System.out.println( "Bye bye !!!" );
}}
