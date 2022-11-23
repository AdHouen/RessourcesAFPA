package bookshop.test;

import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;

import bookshop.domain_EcritureClasseMetierEntite.Livre;
import bookshop.domain_EcritureClasseMetierEntite.Utilisateur;


public class Test_Emprunt_Association_1_N {

	public static void main(String[] args) throws ParseException {
		
	
		//////////////////////////////////
		//////////////////////////////////
		//SCENARIO DE TEST POUR ASSOC 1-N
		// 1) EMPRUNT D'UN premier LIVRE
		// 2) EMPRUNT D'UN deuxième LIVRE
		//
		//	affichage du nombre d'emprunts
		//vous pourriez mettre à jour le toString de l'utilisateur pour qu'il affiche le nb d'emprunts
		//	affichage de tous les  titres de livre empruntés
		

		Livre L1 = new Livre("Asterix", "Uderzo", 56, Livre.sdf.parse("01/02/2016"), true);

		Livre L2 = new Livre("tintin", "Ergé");
		L2.setNbPages(87);
		
		Utilisateur u1 = new Utilisateur("MARIE JOSEPH", "Carthy", "34890");


		System.out.println();
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("*****     ASSOC 1-N unidir  *****************");
		System.out.println("*********************************************");
		System.out.println("*****     EMPRUNT DE PLUSIEURS LIVRES *******");
		System.out.println("*********************************************");
		
		L1.setDisponible(false);
		L1.setDateEmprunt(new Date());
		u1.addLivre(L1);//emprunt

		L2.setDisponible(false);
		L2.setDateEmprunt(new Date());
		u1.addLivre(L2);//emprunt
		
		
		System.out.println("toString() de l'utilisateur u1 :" + u1);
		
		System.out.println("nb d'emprunts de l'utilisateur u1 : " + u1.getLivres().size());

		
		int index = u1.getLivres().indexOf(new Livre("tintin", "Uderzo", 87));
		System.out.println( " voici l'index de  tintin :" + index);
		System.out.println( " voici un livre tintin emprunté :" + u1.getLivres().get(index).getTitre());

		System.out.println();
		System.out.println("Voici la liste des livres empruntés par u1 :");
		System.out.println("------------------------------------------ :");

		if(u1.getLivres().size() >=1 )
		{
			Iterator<Livre> it = u1.getLivres().iterator();
			Livre l;
			while( it.hasNext()){
				l = it.next();
				System.out.println("\t" + l.getTitre());
			}
		}
		else
			System.out.println("Pas de livre emprunté");
		System.out.println();
		
		//////////////////////////////////
		// Méthodes à développer dans l'Utilisateur
		
		//public boolean isEmprunte( Livre livre);
		//u1.isEmprunte( new Livre("Asterix", "Uderzo", 56));
		
		//////////////////////////////////
		// suite du SCENARIO DE TEST
		System.out.println("LE RETOUR DU premier livre emprunté :" + u1.getLivres().get(0).getTitre());
		System.out.println();
		u1.getLivres().get(0).setDisponible(true);
		
		u1.getLivres().remove(0);
		
		System.out.println();
		System.out.println("Voici la liste des livres empruntés par u1 :");
		System.out.println("------------------------------------------ :");
		if(u1.getLivres().size() >=1 )
		{
			Iterator<Livre> it = u1.getLivres().iterator();
			Livre l;
			while( it.hasNext()){
				l = it.next();
				System.out.println("\t" + l.getTitre());
			}
		}
		else
			System.out.println("Pas de livre emprunté");
		System.out.println();

		System.out.println("LE RETOUR DU deuxième livre emprunté :" + u1.getLivres().get(0).getTitre());
		System.out.println();
		u1.getLivres().get(0).setDisponible(true);
		
		u1.getLivres().remove(0);
		
		System.out.println();
		System.out.println("Voici la liste des livres empruntés par u1 :");
		System.out.println("------------------------------------------ :");
		if(u1.getLivres().size() >=1 )
		{
			Iterator<Livre> it = u1.getLivres().iterator();
			Livre l;
			while( it.hasNext()){
				l = it.next();
				System.out.println("\t" + l.getTitre());
			}
		}
		else
			System.out.println("Pas de livre emprunté");
		System.out.println();
		
		//////////////////////////////////
		// A CONTINUER AVEC LE RETOUR DE certains LIVRES empruntés
		//public boolean retourLivre( Livre livre );
		//u1.retourLivre( new Livre("Asterix", "Uderzo", 56));

	}

}
