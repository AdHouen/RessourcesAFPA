package part02_lecture_ecriture;
import java.util.Scanner;
/*
-------------
Exercice 2.2
-------------
Ecrire un programme qui demande un nombre � l�'utilisateur, 
puis qui calcule et  affiche le carr� de ce nombre.
*/
public class Exo2_2_Nombre0Carre
{
	public static void main (String[] args)
	{
	/*D�claration des variables */
	int nombre ;
	int nbOCarre ;
	
	System.out.print ("Bonjour! Donnez-moi un nombre entier s'il vous pla�t :");
	//Scanner scanner = new  Scanner(System.in);
	//nombre = scanner.nextInt();
	nombre = new  Scanner(System.in).nextInt();
	
	nbOCarre = nombre * nombre ;
	System.out.printf ("Le carr� de %d est %d\n", nombre, nbOCarre);
	
	}
}
 	