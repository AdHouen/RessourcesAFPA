package bookshop.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Livre {

	/** le titre du livre*/
	private String titre = "titre_inconnu";
	
	private String auteur;
	
	private String editeur;
	
	private int nbPages;
	
	private LocalDate dateEmprunt;
	
	private boolean disponible;
	
	private int countNew;
	static DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yy");



	//titre auteur editeur nbPages dateEmprunt disponible countNew

	public Livre(String leTitre,String auteur, String editeur, int nbPages, LocalDate dateEmprunt, boolean disponible){
		//règle métier//règle de gestion//business rule
//		if(leTitre == null)
//			this.titre = "titre_inconnu";
//		else
//			titre = leTitre;
		setTitre(leTitre);
		
		this.auteur = auteur;
		this.editeur = editeur;
		
//		if( nbPages <0)
//			throw new IllegalArgumentException("Le nb de pages doit être positif");
//		else
//			this.nbPages = nbPages;
		setNbPages(nbPages);
		
		this.nbPages = nbPages;
		this.dateEmprunt = dateEmprunt;
		this.disponible = disponible;
		countNew++;
	}
	public Livre(String leTitre,String auteur, String editeur, int nbPages, LocalDate dateEmprunt){
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
	public Livre(){
		//super();
		this(null, "auteur_inconnu",  "editeur_inconnu",  0,  LocalDate.now());
	}
	//////////////////////////////////////////
	//ACCESSEURS  //getters
	public String getTitre() {
		return titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public String getEditeur() {
		return editeur;
	}
	public int getNbPages() {
		return nbPages;
	}
	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public int getCountNew() {
		return countNew;
	}
	//////////////////////////////////////////
	//MUTATEURS  //setters
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public void setCountNew(int countNew) {
		this.countNew = countNew;
	}	
	//setters//modificateurs
	public void setTitre(String leTitre) {
		if(leTitre == null)
			this.titre = "titre_inconnu";
		else
			titre = leTitre;
	}
	
	public void setNbPages(int nbPages) {
		if( nbPages <0)
			throw new IllegalArgumentException("Le nb de pages doit être positif");
		else
			this.nbPages = nbPages;
	}
	public void afficheToi() {
		System.out.println("titre :" + this.titre +" auteur :" + auteur + " editeur :" + editeur + " nbPages :" + nbPages  + " dateEmprunt :" + dateEmprunt + " disponible :" + disponible + " countNew :" + countNew);
	}
	
	//Méthodes polymorphes
	@Override public String toString() {
		return "titre :" + this.titre +" auteur :" + auteur + " editeur :" + editeur + " nbPages :" + nbPages  + " dateEmprunt :" + (dateEmprunt!=null? dateEmprunt.format(dtf):"pas de date") + " disponible :" + disponible + " countNew :" + countNew;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		if (nbPages != other.nbPages)
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nbPages;
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
		return result;
	}

//	@Override public boolean equals( Livre autre) {
//	return true;
//}
	@Override
	protected void finalize() throws Throwable {
		//super.finalize();//deprecated
		System.out.println("Arrrrrrrrrrrrrrrrrh je meurs .....");
	}

	
	public static void main(String[] args) throws Throwable {
			Livre L1 = new Livre();
			System.out.println("Mon premier livre (toString):" + L1);
			System.out.println();
			L1.afficheToi();
			System.out.println();

			///////////////////////
			//Scenario d'emprunt
			// VOIR LA CLASSE ScenarioEmprunt
			
			///////////////////////////////////////////////////////
			//test des constructeurs; ils s'appuient sur les setters
			///////////////////////////////////////////////////////
			Livre L2 = new Livre("Astérix","Uderzo", "Dargo", 64, null, true);

			System.out.println("Mon deuxième livre (toString):" + L2);
			System.out.println();
			
			Livre L3 = new Livre(null,"Uderzoo", "Dargoo", 67, LocalDate.now(), true);

			System.out.println("Mon trois livre (toString):" + L3);
			System.out.println();

			Livre L4 = new Livre("Quatre","Uderzaa", "Dargaa", -1, LocalDate.now());

			System.out.println("Mon quatre livre (toString):" + L4);
			System.out.println();
			
			//L4 = null;
			//L4.finalize();
			
			//L2.afficheToi();
			
	}
}
