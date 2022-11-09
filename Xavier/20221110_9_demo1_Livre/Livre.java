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
	
	static int countNew;
	
	static DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yy");

	
//titre auteur editeur nbPages dateEmprunt disponible countNew
	
	//titre auteur editeur nbPages dateEmprunt disponible countNew

	Livre(String titre,String auteur, String editeur, int nbPages, LocalDate dateEmprunt, boolean disponible){
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.nbPages = nbPages;
		this.dateEmprunt = dateEmprunt;
		this.disponible = disponible;
	}
	
	Livre(){
		//super();
	}
	
	void afficheToi() {
		System.out.println("titre :" + this.titre +" auteur :" + auteur + " editeur :" + editeur + " nbPages :" + nbPages  + " dateEmprunt :" + dateEmprunt + " disponible :" + disponible + " countNew :" + countNew);
	}
	
	@Override public String toString() {
		return "titre :" + this.titre +" auteur :" + auteur + " editeur :" + editeur + " nbPages :" + nbPages  + " dateEmprunt :" + dateEmprunt + " disponible :" + disponible + " countNew :" + countNew;
	}
	
	public static void main(String[] args) {
//			Livre L1 = new Livre();
//			System.out.println("Mon premier livre (toString):" + L1);
//			System.out.println();
//			L1.afficheToi();
//			System.out.println();

			Livre L2 = new Livre("Astérix","Uderzo", "Dargo", 64, LocalDate.now(), true);

			System.out.println("Mon deuxième livre (toString):" + L2);
			System.out.println();
			//L2.afficheToi();
			
			///////////////////////
			//Scenario d'emprunt
			System.out.println("\nEmprunt du livre L2");
			System.out.println("---------------------");	
			
			L2.disponible = false;
			L2.dateEmprunt = LocalDate.now();
			System.out.println("Mon deuxième livre (toString):" + L2);
			System.out.println();
			System.out.println("dégradation du livre");
			System.out.println("--------------------");
			L2.nbPages -= 3;
			System.out.println("Mon deuxième livre (toString):" + L2);
		
			//QUESTION
			System.out.println("L2 est-il dispo? :" + (L2.disponible?"oui":"non"));
			System.out.println();
			
			
			//Scenario de retour
			System.out.println("\nretour du livre L2");
			System.out.println("---------------------");
			L2.disponible = true;
			System.out.println("Mon deuxième livre (toString):" + L2);

			//QUESTION
			System.out.println("L2 est-il dispo? :" + (L2.disponible?"oui":"non"));
			System.out.println();
	}
}
