/**
 * 
 */
package biblio.test;

import java.text.ParseException;

import biblio.metier.EnumStatusLivre;
import biblio.metier.Livre;
import biblio.metier.Utilisateur;

/**
 * 
 *  Association, méthode d'instance
 * 
 * Classe Bibliotheque de Test
 * 
 * 
 * @version 1.0
 */
public class BibliothequeTest {

	
	public static void main(String[] args) throws ParseException {
		
		//Livre [] livre= new Livre[2];
		
		Livre tintin = new Livre("Hergé","Objectif lune",100,9.0, EnumStatusLivre.prete,1985);
		Livre astérix= new Livre("Goscinny-Uderzo","Astérix et les Vikings",100,10.0,EnumStatusLivre.disponible,1985);
		
		Utilisateur toto = new Utilisateur("Lariflette","toto");
		Utilisateur zorro = new Utilisateur ("de la Vega","don Diego");
		
		System.out.println();
		System.out.println("Les utilisateurs :");
		System.out.println("-----------------");

		System.out.println(toto);
		System.out.println(zorro);
		
		System.out.println();
		System.out.println("Les livres :");
		System.out.println("------------");

		System.out.println(tintin);
		System.out.println(astérix);

		System.out.println();
		// Prêt pas en retard
		System.out.println("Emprunt pas en retard, toto emprunte astérix");
		toto.setEmprunt(astérix);
		//System.out.println(toto.getEmprunt());
		System.out.println("Resultat de isPretEnRetard : " + toto.isPretEnRetard());
		System.out.println();
		System.out.println(toto);
		System.out.println(zorro);
		
		System.out.println();
		// Prêt en retard, on force la date du prêt
		System.out.println("Emprunt en retard, zorro emprunte tintin");
		zorro.setEmprunt(tintin);
		//System.out.println(zorro.getEmprunt());
		tintin.setDateEmprunt(Livre.sdatef.parse("29-08-2011"));
		System.out.println("Resultat de isPretEnRetard : " + zorro.isPretEnRetard());
		System.out.println();
		System.out.println(toto);
		System.out.println(zorro);
		
		// Pas d'emprunt
		toto.setEmprunt(null);
		zorro.setEmprunt(null);
		System.out.println("Resultat de isPretEnRetard : " + toto.isPretEnRetard());
		System.out.println("Pas d'emprunt");
		System.out.println(toto);
		System.out.println(zorro);
		System.out.println();
		
		// Livre indisponible
		toto.setEmprunt(tintin);
		System.out.println(toto.getEmprunt());
		System.out.println("Resultat de isPretEnRetard : " + toto.isPretEnRetard());
		System.out.println(toto);
		System.out.println(zorro);

		
	}

}
