package exo09.item1;
import fr.afpa.outils.Console;
/**
 * Objectif: Utilisation des classes de l'API du JDK <p>
 *
 * La classe String
 * Comparaison de chaines
 *
 * @author AFPA
 * @version 1.0
 */ 

public class CompareChaine 
{
public static void main (String arg [])
{
String ch1, ch2;		
do
{
	
	System.out.print ("Donner une 1ere chaine : ");
	ch1  = Console.in.readLine();
	
	System.out.print ("Donner une 2eme chaine : ");
	ch2  = Console.in.readLine();
	
	System.out.println ("Les chaines sont " + (ch1.equals(ch2) ? "identiques" : "differentes"));
	// (ch1 == ch2);  //NON !! comparaison de références // en fait, parfois oui ?


} while (!( ch1.toLowerCase().equals("fin") || ch2.toLowerCase().equals("fin") ) );
// avec l'algèbre de boole et le Théorème de De Morgan, on peut écrire :

//} while (!ch1.toLowerCase().equals("fin") && !ch2.toLowerCase().equals("fin"));

System.out.println ("astalavista !!!");
}}

