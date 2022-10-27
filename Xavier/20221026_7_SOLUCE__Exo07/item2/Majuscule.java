package exo07.item2;

//import fr.afpa.outils.Console;
import java.util.Scanner;
//import specialIO.*;

/**
 * Objectif: Les types standard<p>
 *
 * Affichage en majuscule
 *
 * @author AFPA
 * @version 1.0
 */ 


public class Majuscule {
	public static void main (String arg [])
	{
		char car;
		do {
			//car = Console.in.readChar();
			System.out.print("Entrez un caractère :");
			car = (new Scanner(System.in)).nextLine().charAt(0);
			if (car >= 'a' && car <= 'z')
				//car -= ('a' - 'A');
				car = (char ) (car - ('a' - 'A'));
			System.out.println (car);
		} while (car != 'Q');
	}
}