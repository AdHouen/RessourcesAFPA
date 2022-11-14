package bookshop.tools;

import java.time.LocalDate;

import bookshop.domain.Livre;

public class ScenarioEmprunt {
	public static void main(String[] args) {
		Livre L1 = new Livre();
		System.out.println("Mon premier livre (toString):" + L1);
		System.out.println();
		L1.afficheToi();
		System.out.println();

		Livre L2 = new Livre("Astérix","Uderzo", "Dargo", 64, null, true);

		System.out.println("Mon deuxième livre (toString):" + L2);
		System.out.println();
		//L2.afficheToi();
		
		///////////////////////
		//Scenario d'emprunt
		System.out.println("\nEmprunt du livre L2");
		System.out.println("---------------------");	
		
		//L2.disponible = false;
		L2.setDisponible(false);
		//L2.dateEmprunt = LocalDate.now();
		L2.setDateEmprunt(LocalDate.now());
		System.out.println("Mon deuxième livre (toString):" + L2);
		System.out.println();
		System.out.println("dégradation du livre");
		System.out.println("--------------------");
		//L2.nbPages = L2.nbPages - 3;
		L2.setNbPages(L2.getNbPages() - 3);

		System.out.println("Mon deuxième livre (toString):" + L2);
	
		//QUESTION
		System.out.println("L2 est-il dispo? :" + (L2.isDisponible()?"oui":"non"));
		System.out.println();
		
		
		//Scenario de retour
		System.out.println("\nretour du livre L2");
		System.out.println("---------------------");
		L2.setDisponible(true);
		System.out.println("Mon deuxième livre (toString):" + L2);

		//QUESTION
		System.out.println("L2 est-il dispo? :" + (L2.isDisponible()?"oui":"non"));
		System.out.println();
		
		///////////////////////////////
		//test des constructeurs
		Livre L3 = new Livre(null,"Uderzoo", "Dargoo", 67, LocalDate.now(), true);

		System.out.println("Mon trois livre (toString):" + L3);
		System.out.println();

		Livre L4 = new Livre("Quatre","Uderzaa", "Dargaa", 98, LocalDate.now());

		System.out.println("Mon quatre livre (toString):" + L4);
		System.out.println();

		//L2.nbPages = -15;
		L2.setNbPages(154);
		System.out.println("Mon deuxième livre (toString):" + L2);
		System.out.println("\n");
		/////////////////////////////
		//TEST DU equals()
		
		Livre L5 = new Livre("Astérix","Uderzo", "Dargo", 64, null, true);

		System.out.println("Mon cinquième livre (toString):" + L5);
		System.out.println();
		Livre L6 = new Livre("Astérix","bbbbb", "bbbbb", 64, null, true);

		System.out.println("Mon six livre (toString):" + L6);
		System.out.println();
		
		if(L5.equals(L6))
			System.out.println("Les 2 livres sont égaux");
		else 
			System.out.println("Les 2 livres sont différents");

//		Livre L7 = L5;
//		//		if(L7.equals(L5))
//		if(L5.equals(L7))
//			System.out.println("Les 2 livres sont égaux");
//		else 
//			System.out.println("Les 2 livres sont différents");
//		
		//TEST DU hashCode()
		System.out.println("valeur du hashCode de L5 :0x" + Integer.toHexString(L5.hashCode()));
		//557041912//0x2133c8f8
		System.out.println("valeur du hashCode de L6 :0x" + Integer.toHexString(L6.hashCode()));
		//557041912//0x2133c8f8

		L5=null;
		//L5.finalize();
		
//		Livre L = null;
//		for(int i=1; i<100000; i++){
//			L = new Livre();
//			//System.out.println("nouveau livre");
//		}
//		System.out.println("nouveau livre :" + L);

}
}
