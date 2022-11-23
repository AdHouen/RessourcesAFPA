package biblio.test;

import java.text.ParseException;
import java.util.Date;

import biblio.metier_EcritureClasseMetierEntite.BiblioException;
import biblio.metier_EcritureClasseMetierEntite.Livre;


public class TestLivre {

//	public static void main(String[] args) throws ParseException, BiblioException {
	public static void main(String[] args) throws ParseException{

		Livre L1=null;
		Livre L2=null;
		Livre L3=null;
		Livre L4=null;
		try {
			//Test du constructeur
			L1 = new Livre("Asterix", "Uderzo", 56, Livre.sdf.parse("01/02/2016"), true);
			System.out.println("Mon premier livre :" + L1 );
			//Test des filtres utilisé avec les  constructeurs
			Livre L5 = new Livre("tintin", "Ergé",-67, Livre.sdf.parse("01/02/2016"), true);
			//Livre L6 = new Livre(null, "Ergé",78, Livre.sdf.parse("01/02/2016"), true);

			//Test du constructeur 2 paramètres
			L2 = new Livre("tintin", "Ergé");
			System.out.println("Mon deuxième livre :" + L2 );
			
			//Test du constructeur sans paramètre
			L3 = new Livre();
			System.out.println("Mon toisième livre :" + L3 );
			

			//Test du nouveau constructeur avec 3 paramètres
			L4 = new Livre("tintin", "Ergé",100);
			System.out.println("Mon quatrième livre :" + L4 );
			
		} catch (BiblioException e1) {
			System.out.println("levée de l'exception :" + e1);
			e1.printStackTrace();
			//On continue
			//System.exit(1);

		}

		//////////////////////////////////////////////
		//scenario emprunt et de retour d'un livre
		//////////////////////////////////////////////
		System.out.println("emprunt de L1");
		System.out.println("-------------");
		
		L1.setDisponible(false);
		L1.setDateEmprunt(new Date());
		
		System.out.println("Mon premier livre :" + L1 );
		System.out.println("Livre l1 est-il dispo? :" + L1.isDisponible());

		System.out.println("\nl'Utilisateur a retiré 3 pages");
		System.out.println("------------------------------");
		
		/////////////////////
		//l'Utilisateur a retiré 3 pages
		try {
			L1.setNbPages(L1.getNbPages()-3);
		} catch (BiblioException e) {
			System.out.println("levée de l'exception :" + e);
			e.printStackTrace();
			//System.exit(1);
		}
		System.out.println(" L1 :" + L1.toString() );

		
		System.out.println("retour de L1");
		System.out.println("-------------");
		L1.setDisponible(true);
		
		System.out.println("Mon premier livre :" + L1 );
		
		System.out.println("Livre L1 est-il dispo? :" + L1.isDisponible());
		
		
		if( L2.equals((Object)L4))
			System.out.println("livres L2 L4 égaux");
		else 
			System.out.println("livres  L2 L4  différents");

		///////////////////
		// TEST DU HASHCODE
		//////////////////
		System.out.println("hashcode L2 :" + L2.hashCode()+ "   hashcode L4 :" + L4.hashCode() );

		/////////////////////
		// TEST DU FINALIZE
		/////////////////////
		L1=null;
		L2=null;
		L3=null;
		L4=null;
		/*jusqu'ici rien ne s'affiche*/

		/*Livre L = null;
		for(int i=1; i<40000; i++){
			L = new Livre();
			System.out.println("nouveau livre");
		}*/
	}
}
