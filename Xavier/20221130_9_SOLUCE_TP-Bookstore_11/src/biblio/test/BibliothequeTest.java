
package biblio.test;

import java.text.ParseException;
import java.util.ArrayList;


import biblio.metier.BiblioException;
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
 * @version 2.0
 */
public class BibliothequeTest {

	
	
	public static void main(String[] args) throws  BiblioException, ParseException {
		   
		//throws ParseException,
		
		Livre [] livre= new Livre[4];
		
			livre[0] = new Livre("Hergé","Tintin",100,9.0, EnumStatusLivre.disponible,1985);

		

			livre[1]= new Livre("Albert Uderzo","Asterix",100,10.0,EnumStatusLivre.disponible,1985);

		
		

			livre[2] = new Livre("Victor Hugo","Le dernier jour d'un condamné",0,8.0,EnumStatusLivre.disponible,1970);

		

			livre[3] = livre[3]= new Livre("Bernard Weber","Les fourmis",300,5.0,EnumStatusLivre.disponible,1990);;

		
		//Test de Add
		Utilisateur toto = new Utilisateur("de la Vega","Don Diego");
		System.out.println(toto);
		

			toto.addLivre(livre[0]);

		System.out.println("Après emprunt d'un livre");
		System.out.println(toto);
		

			toto.addLivre(livre[1]);

		

			toto.addLivre(livre[2]);

		System.out.println();
		System.out.println("Après emprunt de trois livres");
		System.out.println(toto);
		System.out.println();
		
		//tentative d'emprunt d'un quatrième livre
		System.out.println("Test de isConditionPretAcceptes avec le nombre de prêt max");

			try {
				toto.addLivre(livre[3]);
			} catch (BiblioException e) {
				System.out.println("BiblioException :" + e);
				//e.printStackTrace();
			}

		System.out.println();
		System.out.println("Test après avoir vidé la liste de livre");
		toto.clearLivres();
		System.out.println(toto);
		
		System.out.println();
		System.out.println("Test de recherche par un titre avec le titre qui existe dans la liste");
		

			toto.addLivre(livre[0]);

		System.out.println("Après emprunt d'un livre");
		System.out.println(toto);
		

			toto.addLivre(livre[1]);

		

			toto.addLivre(livre[2]);

		//Test de FindLivrebyTitre

			System.out.println(toto.findLivreByTitre("Le dernier jour d'un condamné"));

		
		System.out.println();
		System.out.println("Test de recherche par un titre avec le titre qui n'existe pas dans la liste");
		//Test de FindLivrebyTitre

			System.out.println(toto.findLivreByTitre("Les fourmis"));
	
		
		//Test de FindAllivres
		System.out.println();
		System.out.println(toto.findAllLivres().toString());
		System.out.println(toto);
		ArrayList<Livre> l1=toto.findAllLivres();

			toto.setLivres(l1);

		System.out.println(toto);

			toto.setLivres(null);


		
		//TestContain List
		System.out.println();
		System.out.println("Test de contain livre avec un livre dans la collection");
		
		System.out.println(toto.containsLivre(livre[2]));
		
		System.out.println();
		System.out.println("Test de contains livre avec un livre qui n'est pas dans la collection");
		System.out.println(toto.containsLivre(livre[3]));
		
		
		System.out.println();
		System.out.println("Test de contain livre avec un livre dans la collection");
		
		System.out.println(toto.containsLivre(livre[2]));
		
		//Test de removeLivre
		System.out.println("Livre qui n'est pas dans la collection");

			toto.removeLivre(livre[3]);

		
		System.out.println("Livre qui est dans la collection");

			toto.removeLivre(livre[2]);

		
		System.out.println(toto);
		
		//Test de GetRetard
		System.out.println("nombre de livre en retard");
		System.out.println(toto.getRetard());
		


			toto.addLivre(livre[2]);

		
		livre[2].setDateEmprunt(Livre.sdf.parse("29-08-2011"));
		
		// J'enlève un livre pour plus n'en avoir que deux

			toto.removeLivre(livre[0]);

		
		//Test de GetRetard
		System.out.println("nombre de livre en retard");
		System.out.println(toto.getRetard());
		System.out.println("nombre de livre dans la collection :" + toto.findAllLivres().size());
		// Test de isConditionsPretAcceptees pour un nombre de prêt en retard

			toto.addLivre(livre[0]);

		
		System.out.println();
		// J'enlève un livre pour plus n'en avoir que deux

			toto.removeLivre(livre[2]);

		

			toto.addLivre(livre[0]);

		

			toto.addLivre(livre[2]);

		System.out.println();
		System.out.println("Liste de livre réinitialisé");
		System.out.println(toto);
		System.out.println("nombre de livre dans la collection :" + toto.findAllLivres().size());
		
		livre[2].setDateEmprunt(Livre.sdf.parse("29-08-2011"));
		

			toto.addLivre(livre[3]);

		

			toto.removeLivre(livre[2]);

		System.out.println();
		System.out.println("Utilisateur ne peut emprunter un livre car il n'est pas disponible.");
		
		livre[2].setDisponible(EnumStatusLivre.prete);
		

			toto.addLivre(livre[2]);

		
	}
}
