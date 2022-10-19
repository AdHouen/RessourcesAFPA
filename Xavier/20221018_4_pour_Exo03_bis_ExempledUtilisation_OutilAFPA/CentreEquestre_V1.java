package equestre.libconsole;
import fr.afpa.outils.*;
/**
 * Objectif: Utilisation d'un JAR
 * Gestion d'un centre equestre (Version 1)
 * @author AFPA
 * @version 1.0
 */ 
class CentreEquestre_V1
{
public static void main (String arg [])
{
String nom, prenom;
char rep;
				// SAISIE
	do {
		System.out.print("\nNom du cavalier     : "); 
		nom = Console.in.readLine();
		System.out.print("Prenom du cavalier  : ");
		prenom = Console.in.readLine();
		
					// PRESENTATION
		System.out.print ("\n\nCavalier :");
		System.out.println ("\t" + prenom + " " + nom);
		
		            // MESSAGE DE FIN
		System.out.print ("\n\nVoulez-vous continuer : ");
		rep = Console.in.readChar();
	} while (rep == 'o');
}}