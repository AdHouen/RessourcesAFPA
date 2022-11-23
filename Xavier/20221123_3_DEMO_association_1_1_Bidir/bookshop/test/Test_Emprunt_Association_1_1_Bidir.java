package bookshop.test;
import java.text.ParseException;
import java.util.Date;

import bookshop.domain_EcritureClasseMetierEntite.Livre;
import bookshop.domain_EcritureClasseMetierEntite.Utilisateur;


public class Test_Emprunt_Association_1_1_Bidir {

	public static void main(String[] args) throws ParseException {
		
		/////////////////////////////////////////////////////
		//Conception prévue : ASSOCIATION 1 à 1, unidirectionnelle, au sens UML
		//////////////////////////////////
		//////////////////////////////////
		//SCENARIO DE TEST POUR ASSOC 1-1
		// 1) EMPRUNT DE LIVRE
		//	affichage du titre de livre emprunté
		// 2) RETOUR DE LIVRE par convention: ref de livre à null
		// 3) EMPRUNT d'un autre LIVRE
		//	affichage du titre de livre emprunté
		//	Attention: test la ref de livre null pour éviter NullPointerException
		//////////////////////////////////
		//////////////////////////////////
		System.out.println();
		System.out.println();
		System.out.println("**********************************");
		System.out.println("*****     ASSOC 1-1 bidir  ******");
		System.out.println("**********************************");
		System.out.println("*****     EMPRUNT DE LIVRE *******");
		System.out.println("**********************************");

/*		Livre l1=null;
		Livre l2=null;*/
		
		Livre l1 = new Livre("Asterix", "Uderzo", 56, Livre.sdf.parse("01/02/2016"), true);
		Livre l2 = new Livre("tintin", "Hergé");

		Utilisateur u1 = new Utilisateur("MARIE JOSEPH", "Carthy", "34890");
		System.out.println("toString() de utilisateur u1 :" + u1);

		///////////////////////////////////////////////////
		//EMPRUNT DE LIVRE
		System.out.println("u1 emprunte un livre l1");
		System.out.println("-----------------------");
		u1.setEmprunt(l1);
//		l1.setDisponible(false);
//		l1.setDateEmprunt(new Date());
		u1.getEmprunt().setDisponible(false);//On navigue l'association
		u1.getEmprunt().setDateEmprunt(new Date());
		System.out.println("toString() de utilisateur u1 :" + u1);
		
		///////////////////////////////////////////
		//afficher le titre du livre emprunté
		// "On navigue l'association"
		//Quel est le titre du livre emprunté par u1? --> u1.getEmprunt().getTitre())

		if( u1.getEmprunt()!= null)
			System.out.println("Le livre emprunté par u1 est :" + u1.getEmprunt().getTitre());
		else
			System.out.println("Pas de livre emprunté par u1");
		
		
		
		System.out.println();
		System.out.println("**********************************");
		System.out.println("*****      RETOUR DE LIVRE *****");
		System.out.println("**********************************");
		//On rend le livre
		System.out.println("u1 rend son livre");
		System.out.println("-----------------");
		u1.getEmprunt().setDisponible(true);
		u1.setEmprunt(null); //Désormais, attention au NullPointerException
		System.out.println("tostring() de utilisateur u1 " + u1);

		//affichage du titre du livre emprunté
		if( u1.getEmprunt()!= null)
			System.out.println("Le livre emprunté est :" + u1.getEmprunt().getTitre());
		else
			System.out.println("Pas de livre emprunté");
		
		
		
		//On emprunte un autre livre
		System.out.println();
		System.out.println("*****************************************");
		System.out.println("*****   EMPRUNT D'UN AUTRE LIVRE    *****");
		System.out.println("*****************************************");
		u1.setEmprunt(l2);
		u1.getEmprunt().setDisponible(false);
		u1.getEmprunt().setDateEmprunt(new Date());
		System.out.println("toString() de utilisateur u1 :" + u1);

		//affichage du titre du livre emprunté
		if( u1.getEmprunt()!= null)
			System.out.println("Le livre emprunté :" + u1.getEmprunt().getTitre());
		else
			System.out.println("Pas de livre emprunté");
		
		//////////////////////////////////
		// Evolution possible (si nécessaire)
		// assoc 1_1 bidirectionnelle 
		
		//Méthode d'instance pouvant être développée
		//public String findTitreLivreCourant()
		
		System.out.println("Livre courant de u1 :" + u1.findTitreLivreCourant() );
	}

}
