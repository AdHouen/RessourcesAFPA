package bookshop.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Livre {

	/** le titre du livre*/
	String titre = "titre_inconnu";
	
	String auteur;
	
	String editeur;
	
	int nbPages;
	
	LocalDate dateEmprunt;
	
	boolean disponible;
	
	int countNew;
	
	static DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yy");

	
//titre auteur editeur nbPages dateEmprunt disponible countNew
	
	//titre auteur editeur nbPages dateEmprunt disponible countNew

	Livre(String leTitre,String auteur, String editeur, int nbPages, LocalDate dateEmprunt, boolean disponible){
		//règle métier//règle de gestion//business rule
		if(leTitre == null)
			this.titre = "titre_inconnu";
		else
			titre = leTitre;
		
		this.auteur = auteur;
		this.editeur = editeur;
		
		if( nbPages <0)
			throw new IllegalArgumentException("Le nb de pages doit être positif");
		else
			this.nbPages = nbPages;
		
		this.nbPages = nbPages;
		this.dateEmprunt = dateEmprunt;
		this.disponible = disponible;
		countNew++;
	}
	Livre(String leTitre,String auteur, String editeur, int nbPages, LocalDate dateEmprunt){
		this(leTitre, auteur,  editeur,  nbPages,  dateEmprunt, true);
//		//règle métier//règle de gestion//business rule
//		if(leTitre == null)
//			this.titre = "titre_inconnu";
//		else
//			titre = leTitre;
//		
//		this.auteur = auteur;
//		this.editeur = editeur;
//		
//		if( nbPages <0)
//			throw new IllegalArgumentException("Le nb de pages doit être positif");
//		else
//			this.nbPages = nbPages;
//		
//		this.nbPages = nbPages;
//		this.dateEmprunt = dateEmprunt;
//		this.disponible = true;//règle métier
//		countNew++;

	}
	Livre(){
		//super();
		this(null, "auteur_inconnu",  "editeur_inconnu",  0,  LocalDate.now());

	}
	
	void afficheToi() {
		System.out.println("titre :" + this.titre +" auteur :" + auteur + " editeur :" + editeur + " nbPages :" + nbPages  + " dateEmprunt :" + dateEmprunt + " disponible :" + disponible + " countNew :" + countNew);
	}
	
	@Override public String toString() {
		return "titre :" + this.titre +" auteur :" + auteur + " editeur :" + editeur + " nbPages :" + nbPages  + " dateEmprunt :" + (dateEmprunt!=null? dateEmprunt.format(dtf):"pas de date") + " disponible :" + disponible + " countNew :" + countNew;
	}
	
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
			
//			///////////////////////
//			//Scenario d'emprunt
//			System.out.println("\nEmprunt du livre L2");
//			System.out.println("---------------------");	
//			
//			L2.disponible = false;
//			L2.dateEmprunt = LocalDate.now();
//			System.out.println("Mon deuxième livre (toString):" + L2);
//			System.out.println();
//			System.out.println("dégradation du livre");
//			System.out.println("--------------------");
//			L2.nbPages -= 3;
//			System.out.println("Mon deuxième livre (toString):" + L2);
//		
//			//QUESTION
//			System.out.println("L2 est-il dispo? :" + (L2.disponible?"oui":"non"));
//			System.out.println();
//			
//			
//			//Scenario de retour
//			System.out.println("\nretour du livre L2");
//			System.out.println("---------------------");
//			L2.disponible = true;
//			System.out.println("Mon deuxième livre (toString):" + L2);
//
//			//QUESTION
//			System.out.println("L2 est-il dispo? :" + (L2.disponible?"oui":"non"));
//			System.out.println();
//			
//			Livre L3 = new Livre(null,"Uderzoo", "Dargoo", 67, LocalDate.now(), true);
//
//			System.out.println("Mon trois livre (toString):" + L3);
//			System.out.println();
//
//			Livre L4 = new Livre("Quatre","Uderzaa", "Dargaa", 98, LocalDate.now());
//
//			System.out.println("Mon quatre livre (toString):" + L4);
//			System.out.println();
//
//			
	}
}
