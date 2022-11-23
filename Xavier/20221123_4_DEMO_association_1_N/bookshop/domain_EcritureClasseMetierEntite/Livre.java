package bookshop.domain_EcritureClasseMetierEntite;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Conceptualise le livre de la bibliothèque
 * Classe du domaine métier (domain model Spring)
 * @author Afpa
 */
public class Livre {
	/** titre de l'ouvrage*/
	private String titre = "titre inconnu";
	
	/** Auteur principal de l'ouvrage*/
	String auteur ;//= null;
	
	/** Editeur de l'ouvrage*/
	String editeur ;//= null;

	int nbPages =100;
	
	/** Dernière date d'emprunt de l'ouvrage*/
	Date dateEmprunt = new Date(0);	
	
	private boolean disponible = true;
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static int countNew = 0;
	

	public Livre( String titre ,String auteur , int nbPages , Date dateEmprunt, boolean disponible ){
		this.setTitre(titre);
		
		
		this.auteur = auteur;
		setNbPages(nbPages);
	
		this.dateEmprunt = dateEmprunt;
		this.disponible = disponible;
		countNew++;
	}
	public Livre( String titre ,String auteur , int nbPages ){
		this(titre,auteur,nbPages,new Date(),true);
	
	}
	
	public Livre( String titre ,String auteur ){
		this(titre,auteur,100);
	}
	
	public Livre( ){
		this("titre inconnu",null );
	}
	
	//setter//muttateur
	public void setDateEmprunt(Date d){
		dateEmprunt = d;
	}
	
	public void setDisponible(boolean b){
		disponible = b;
	}
	
	//getter//accesseur
	public boolean isDisponible(){
		return disponible;
	}
		
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

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public void setTitre(String titre) {
		if( titre == null)
			this.titre = "???";
		else
			this.titre = titre;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public void setNbPages(int nbPages) {
		if(nbPages < 0)
			throw new IllegalArgumentException("Nombre de pages doit être positif");
		else
			this.nbPages = nbPages;
	}
	
	public void afficheToi(){
		String chaine = "titre :" + this.titre + " auteur : " + auteur +
				" editeur :" + editeur + " nbPages :" + nbPages +
				" dateEmprunt :" + sdf.format(dateEmprunt)+ " disponible :" + disponible +
				" countNew :" + countNew;
		System.out.println(chaine);
	}
	
	@Override
	public String toString() {
		String chaine = "Livre [titre :" + this.titre + " auteur : " + auteur +
				 " nbPages :" + nbPages +
				" dateEmprunt :" + sdf.format(dateEmprunt)+ " disponible :" + disponible +"]";
		
		return chaine;
	};
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
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
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Arrrrrrrrrrrrrrrrrh je meurs .....");
	}
	public static void main(String[] args) throws ParseException {
		//instanciation de livres
		//Livre l1 = new Livre();
		Livre l1 = new Livre("Asterix", "Uderzo", 56, sdf.parse("01/02/2016"), false);
		
		System.out.println("Mon premier livre :" + l1.toString()); //l1.afficheToi();

		Livre l2 = new Livre(null, "Hergé");
		//Livre l2 = new Livre();
		
		System.out.println("Mon deuxième livre :"); l2.afficheToi();
	
		//Livre l3 = new Livre("Au centre de la terre", "Vernes", -2, sdf.parse("01/02/2016"), false);
		Livre l3 = new Livre();
		l3.setTitre("Au centre de la terre");//l3.titre = "Au centre de la terre";
		l3.setAuteur("Vernes");//l3.auteur = "Vernes";
		l3.setNbPages(17);//l3.nbPages = -17;
		
		System.out.println("Mon troisième livre :"+ l1.toString());
	}
}
