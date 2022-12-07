/**
 * 
 */
package biblio.test;

import java.text.ParseException;
import java.util.Arrays;

import biblio.metier.EnumStatusLivre;
import biblio.metier.Livre;

/**
 * 
 *  Association, méthode d'instance
 * 
 * Classe LivreTest
 * 
 * 
 * @version 1.0
 */
public class LivreTest {

	public static void main(String[] args) throws ParseException {
		
		Livre [] livre= new Livre[8];
		
		livre[0] = new Livre("Victor Hugo","Les Misérables",345,9.0, EnumStatusLivre.prete,1985,Livre.sdatef.parse("05-09-2011"));
		livre[1]= new Livre("James Elroy","Le Dahlia Noir",500,10.0,EnumStatusLivre.disponible);
		livre[2] = new Livre("Victor Hugo","Le dernier jour d'un condamné",250,8.0,EnumStatusLivre.disponible,1970);
		livre[3]= new Livre("Bernard Weber","Les fourmis",300,5.0,EnumStatusLivre.disponible,1990);
		livre[4]= new Livre("Bernard Weber","Le jour des fourmis",300,5.0,EnumStatusLivre.disponible,2001);
		livre[5] = new Livre("Bernard Weber","La revolution des fourmis",345,10.12,EnumStatusLivre.disponible);
		livre[6]= new Livre("Bernard Weber","Les fourmis",300,8.0,EnumStatusLivre.disponible,1995);
		livre[7]= new Livre("Bernard Weber","Les fourmis",600,7.0,EnumStatusLivre.disponible,1995);

		
		String auteurPlusGrosLivre;
		
	
		System.out.print("L'auteur du plus gros livre est : ");
		if (livre[1].compareTo(livre[5]) == 1)
			auteurPlusGrosLivre=livre[1].getAuteur();
		else 
		if (livre[1].compareTo(livre[5]) == -1)
			auteurPlusGrosLivre=livre[5].getAuteur();
		else
			auteurPlusGrosLivre=livre[1].getAuteur();
	
		System.out.println(auteurPlusGrosLivre);
		
		System.out.println();
		System.out.println("Affichage du tableau animal avant le sort");
		System.out.println();
		for (int i=0; i < livre.length;i++)
		{
			System.out.println(livre[i]);
		}
		
		Arrays.sort(livre);
		
		System.out.println();
		System.out.println("Affichage du tableau animal après le sort");
		System.out.println();
		for (int i=0; i < livre.length;i++)
		{
			System.out.println(livre[i]);
		}
		
		livre[5].setDisponible(EnumStatusLivre.prete);
		
		System.out.println();
		System.out.println("Affichage du tableau après modification de l'enum");
		System.out.println();
		for (int i=0; i < livre.length;i++)
		{
			System.out.println(livre[i]);
		}
		
		System.out.println();
		
		for (int i=0; i < livre.length;i++)
		{
			if(livre[i].isDisponible())
				System.out.println(livre[i].getAuteur() +" "+ livre[i].getTitre() + " disponible");
			else
				System.out.println(livre[i].getAuteur() +" " +livre[i].getTitre() + " non disponible");
		}
		
		System.out.println();
		
		//Vérification du equals
		if(livre[1].equals(livre[2]))
		{
			System.out.println("Ces deux livres sont égaux: ");
			System.out.println(livre[1]);
			System.out.println(livre[2]);
		}
		else
		{
			System.out.println("Ces deux livres ne sont pas égaux: ");
			System.out.println(livre[1]);
			System.out.println(livre[2]);
		}
		
		System.out.println();
		
		//Vérification du equals
		if(livre[1].equals(livre[4]))
		{
			System.out.println("Ces deux livres sont égaux: ");
			System.out.println(livre[1]);
			System.out.println(livre[4]);
		}
		else
		{
			System.out.println("Ces deux livres ne sont pas égaux: ");
			System.out.println(livre[1]);
			System.out.println(livre[4]);
		}
		
		System.out.println();
		
		//Vérification du equals
		if(livre[1].equals(livre[3]))
		{
			System.out.println("Ces deux livres sont égaux: ");
			System.out.println(livre[1]);
			System.out.println(livre[3]);
		}
		else
		{
			System.out.println("Ces deux livres ne sont pas égaux: ");
			System.out.println(livre[1]);
			System.out.println(livre[3]);
		}
		
		System.out.println();
		
		//Vérification du equals
		if(livre[1].equals(livre[7]))
		{
			System.out.println("Ces deux livres sont égaux: ");
			System.out.println(livre[1]);
			System.out.println(livre[7]);
		}
		else
		{
			System.out.println("Ces deux livres ne sont pas égaux: ");
			System.out.println(livre[1]);
			System.out.println(livre[7]);
		}
		
		Object obj = new Object();
		
		// Test du InstanceOf
		System.out.println();
		System.out.println("Test du InstanceOf");		
		System.out.println(livre[1].equals(obj));
		
	}

}
