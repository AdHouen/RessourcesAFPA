
package biblio.metier;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * Association, méthode d'instance
 * 
 * Classe Livre
 * @version 1.0
 */
public class Livre implements Comparable <Livre> {
	
	//Variables
	private String titre, auteur;
	private int nbPages;
	private Double prix;
	boolean prixFixe=false;
	private EnumStatusLivre statutLivre;
	private TypeDonneesAnnee anneeParution=new TypeDonneesAnnee();
	private Date dateEmprunt;
	public static SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	static {sdf.setLenient(false);}

	
	/**
	 * Constructeur avec tout les paramètres
	 * @param unAuteur auteur du livre de type string
	 * @param unTitre titre du livre de type String
	 * @param unNbPages nombre de page d'un livre de type int
	 * @param prix Prix du livre de type double
	 * @param statut type enumérée statut du livre
	 * @param annee annee de parution du livre
	 * @param date date d'emprunt du livre
	 * @throws BiblioException 
	 */
	public Livre (String unAuteur, String unTitre, int unNbPages, Double prix, EnumStatusLivre statut, Integer annee, Date date) throws BiblioException{
		setAuteur(unAuteur);
		setTitre(unTitre);
		setNbPages(unNbPages);
		setPrix(prix);
		setDisponible(statut);
		anneeParution.setAnnee(annee);
		setDateEmprunt(date);
		
	}
	
	/**
	 * Constructeur avec tout six paramètres
	 * @param unAuteur auteur du livre de type string
	 * @param unTitre titre du livre de type String
	 * @param unNbPages nombre de page d'un livre de type int
	 * @param prix Prix du livre de type double
	 * @param statut type enumérée statut du livre
	 * @param annee annee de parution du livre
	 * @throws BiblioException 
	 */
	public Livre (String unAuteur, String unTitre, int unNbPages, Double prix, EnumStatusLivre statut, Integer annee) throws BiblioException {
		
		this(unAuteur,unTitre,unNbPages,prix,EnumStatusLivre.disponible,annee,null);
		
	}
	
	/**
	 * Constructeur avec cinq paramètres
	 * @param unAuteur auteur du livre de type string
	 * @param unTitre titre du livre de type String
	 * @param unNbPages nombre de page d'un livre de type int
	 * @param prix Prix du livre de type double
	 * @param statut type enumérée statut du livre
	 * @throws BiblioException 
	 */
	public Livre (String unAuteur, String unTitre, int unNbPages, Double prix, EnumStatusLivre statut) throws BiblioException {
		this(unAuteur,unTitre,unNbPages,prix,EnumStatusLivre.disponible,null);
	}
		
		
	
	
	/**
	 * Constructeur avec quatre les paramètres
	 * @param unAuteur auteur du livre de type string
	 * @param unTitre titre du livre de type String
	 * @param unNbPages nombre de page d'un livre de type int
	 * @param prix Prix du livre de type double
	 * @throws BiblioException 
	 */
	public Livre (String unAuteur, String unTitre, int unNbPages, Double prix) throws BiblioException {
		this(unAuteur,unTitre,unNbPages,prix,EnumStatusLivre.disponible);
	}
	
	/**
	 * Constructeur avec trois paramètres qui utilise le
	 * constructeur avec tout les paramètres
	 * @param unAuteur auteur du livre de type string
	 * @param unTitre titre du livre de type String
	 * @param unNbPages nombre de page d'un livre de type int 
	 * @throws BiblioException 
	 */
	public Livre (String unAuteur, String unTitre, int unNbPages) throws BiblioException{
		this(unAuteur,unTitre,unNbPages,null);
	}
	
	/**
	 * Constructeur avec deux paramètres qui utilise le
	 * constructeur avec trois les paramètres
	 * @param unAuteur auteur du livre de type string
	 * @param unTitre titre du livre de type String
	 * @throws BiblioException 
	 */
	public Livre (String unAuteur, String unTitre) throws BiblioException {
		this (unAuteur, unTitre, 0);
	}
	
	/**
	 * Constructeur par défaut sans paramètre qui utilise le
	 * constructeur avec deux paramètres
	 * @throws BiblioException 
	 */
	public Livre () throws BiblioException {
		this("","");
	}
	
	/**
	 * Accesseur sur le prix
	 * @return prix: le prix du livre
	 */
	public Double getPrix(){
		return prix;
	}
	
	/**
	 * Accesseur sur le titre
	 * @return titre: le titre du livre
	 */
	public String getTitre(){
		return titre;
	}
	
	/**
	 * Accesseur sur le nbPages
	 * @return nbPages: le nombre de page
	 */
	public int getNbPages(){
		return nbPages;
	}
	
	/**
	 * Accesseur sur l'auteur
	 * @return auteur: l'auteur du livre
	 */
	public String getAuteur(){
		return auteur;
	}
	
	/**
	 * Accesseur sur le prixFixe
	 * @return prixFixe: booléen qui spécifie si le prix a déjà été fixé
	 */
	public boolean isPrixFixe(){
		return prixFixe;
	}
	
	/**
	 * Accesseur sur le statutLivre
	 * @return  booléen qui permet de savoir si le livre est dipsonible ou non
	 */
	public boolean isDisponible(){
		return statutLivre.equals(EnumStatusLivre.disponible);		
	}
	
	/**
	 * Accesseur sur la Date d'emprunt
	 * @return Date Emprunt: retourne la date d'emprunt du livre
	 */
	public Date getDateEmprunt(){
		
		return dateEmprunt;
		
	}
	
	/**
	 * Mutateur sur le statutLivre
	 */
	public void setDisponible(EnumStatusLivre dispo){
		statutLivre =dispo;
	}
		
	/**
	 * Mutateur sur le nombre de page
	 * @param nb : nombre de page a affecté à l'objet Livre
	 * @return nbPages: le nombre de page
	 * @throws BiblioException 
	 */
	public void setNbPages(int nb) throws BiblioException{
		if(nb >=0)
			nbPages=nb;
		else
			throw new BiblioException("Le nombre de page doit être positif");
	}
	
	/**
	 * Mutateur sur l'auteur du livre
	 * @param auth: nom de l'auteur a affecté à l'objet Livre
	 * @return auteur: l'auteur du livre
	 */
	public void setAuteur(String auth){
		auteur=auth;
	}
	
	/**
	 * Mutateur sur le titre du livre
	 * @param ti : titre du livre a affecté à l'objet Livre
	 * @return titre: le titre du livre
	 */
	public void setTitre(String ti){
		titre=ti;
	}
	
	/**
	 * Mutateur sur le prix du livre
	 * @param px : le prix du livre qu'il faut affecté à l'objet Livre
	 * @exception IllegalArgumentException quand le livre du prix passé en paramètre
	 * est négatif
	 * @return prix : le prix du livre
	 */
	public void setPrix(Double px){
		//Vérification du prix passé en paramètre null ou non
		if(px!=null)
		{
			if(!this.isPrixFixe())
			{
				if (px >=0)
				{
					prix=px;
					prixFixe=true;
				}
				else
					throw new IllegalArgumentException("Le prix d'un livre ne peut pas être négatif");	
			}
			else
				throw new IllegalArgumentException("Le prix d'un livre a déjà été fixé");
		}
		else
			this.prix=px;	
	}
	
	/**
	 * Mutateur sur la date d'emprunt du livre
	 * @param date : date d'emprunt du livre
	 */
	public void setDateEmprunt(Date date){
		
		//objet Gregorian à la date d'aujourdh'ui pour avoir l'année du
		if (date !=null)
		{	
			dateEmprunt=date;
		}
		
	}
	
	/**
	 * Affichage du livre via une méthode d'instance
	 */
	public void afficheToi(){
		System.out.printf(this.toString());
	}
	
	/**
	 * Override de la méthode to string
	 */
	@Override
	public String toString(){
		
		// Pour avoir le nombre sous forme de décimal à 2 chiffres
		DecimalFormat df = new DecimalFormat("########.00"); 
		
		if (dateEmprunt != null)
		{
		
			if (anneeParution !=null){
				if (prix != null)
					
					return String.format("Auteur du Livre :%s, Titre du livre :%s, Nombre de pages :%d," +
							" Prix du livre :%s, Statut du livre :%s, Annee de parution du livre :%s" +
							" Date emprunt du livre :%s", this.getAuteur(),this.getTitre(),this.getNbPages(),
							df.format(this.getPrix()), statutLivre,anneeParution.getAnnee(), sdf.format(dateEmprunt));
					
				else
					return String.format("Auteur du Livre :%s, Titre du livre :%s, Nombre de pages :%d," +
							"" +" Prix indeterminé, Statut du livre :%s, Annee de parution du livre :%s" +
									" Date emprunt du livre :%s", this.getAuteur(),this.getTitre(),this.getNbPages(),
									statutLivre,anneeParution.getAnnee(),sdf.format(dateEmprunt));
			}
			else
				if (prix != null)
					
					return String.format("Auteur du Livre :%s, Titre du livre :%s, Nombre de pages :%d," +
							" Prix du livre :%s, Statut du livre :%s, Annee de parution du livre :%s" +
							" Date emprunt du livre :%s", this.getAuteur(),this.getTitre(),this.getNbPages(),
							df.format(this.getPrix()), statutLivre,null,sdf.format(dateEmprunt));
					
				else
					return String.format("Auteur du Livre :%s, Titre du livre :%s, Nombre de pages :%d," +
							"" +" Prix indeterminé, Statut du livre :%s, Annee de parution du livre :%s" +
									" Date emprunt du livre :%s", this.getAuteur(),this.getTitre(),this.getNbPages(),
									statutLivre,null,sdf.format(dateEmprunt));
		}
		else
		{
			if (anneeParution !=null){
				if (prix != null)
					
					return String.format("Auteur du Livre :%s, Titre du livre :%s, Nombre de pages :%d," +
							" Prix du livre :%s, Statut du livre :%s, Annee de parution du livre :%s" +
							" Date emprunt du livre :indéterminée", this.getAuteur(),this.getTitre(),this.getNbPages(),
							df.format(this.getPrix()), statutLivre,anneeParution.getAnnee());
					
				else
					return String.format("Auteur du Livre :%s, Titre du livre :%s, Nombre de pages :%d," +
							"" +" Prix indeterminé, Statut du livre :%s, Annee de parution du livre :%s" +
									" Date emprunt du livre :indéterminée", this.getAuteur(),this.getTitre(),this.getNbPages(),
									statutLivre,anneeParution.getAnnee());
			}
			else
				if (prix != null)
					
					return String.format("Auteur du Livre :%s, Titre du livre :%s, Nombre de pages :%d," +
							" Prix du livre :%s, Statut du livre :%s, Annee de parution du livre :%s" +
							" Date emprunt du livre :indéterminée", this.getAuteur(),this.getTitre(),this.getNbPages(),
							df.format(this.getPrix()), statutLivre,null);
					
				else
					return String.format("Auteur du Livre :%s, Titre du livre :%s, Nombre de pages :%d," +
							"" +" Prix indeterminé, Statut du livre :%s, Annee de parution du livre :%s" +
							" Date emprunt du livre :indéterminée", this.getAuteur(),this.getTitre(),this.getNbPages(),
									statutLivre,null);
		}
	}
	
	/**
	 * Méthode d'instance comparaison de deux livre par rapport au nombre de page
	 * @param livre : Le livre dont on veut comparer le nombre de page
	 * avec l'instance de Livre courante
	 * @return retourne 1 si l'instance courante à plus de pages que livre,
	 * 0 si l'instance courante et livre ont le même nombre de page
	 * et -1 si l'instance courante a moins de pages que le livre
	 */
	public int compare(Livre livre){
		
		if (this.getNbPages() > livre.getNbPages())
			return 1;
		else
			if(this.getNbPages() < livre.getNbPages())
				return -1;
			else return 0;
		
	}
	
	/**
	 * Méthode de classe comparaison de deux livre par rapport au nombre de page
	 * @param livre1 : Le premier livre dont on veut comparer le nombre de page
	 * @param livre2 : Le second livre dont on veut comparer le nombre de page
	 * @return retourne 1 si livre1 à plus de pages que livre2,
	 * 0 si livre1 et livre2 ont le même nombre de page
	 * et -1 si livre1 a moins de pages que le livre2
	 */
	public static int compare2(Livre livre1, Livre livre2){
		
		if (livre1.getNbPages() > livre2.getNbPages())
			return 1;
		else
			if(livre1.getNbPages() < livre2.getNbPages())
				return -1;
			else
				return 0;
		
	}

	/**
	 * Méthode de classe compareTo override de la méthode de l'interface Comparable
	 * @param livre1 : Le  livre dont on veut comparer le nombre de page avec celui
	 * avec l'instance de Livre courante
	 * @return retourne 1 si l'instance courante à plus de pages que livre,
	 * 0 si l'instance courante et livre ont le même nombre de page
	 * et -1 si l'instance courante a moins de pages que le livre
	 */
	@Override
	public int compareTo(Livre livre) {
		
		if (this.getNbPages() > livre.getNbPages())
			return 1;
		else
			if(this.getNbPages() < livre.getNbPages())
				return -1;
			else return 0;
		
	}
	
	/**
	 * Méthode de classe equals override de la méthode de l'interface Comparable
	 * @param obj : Le  livre dont on veut vérifier l'égalité via le titre et le nombre de page avec celui
	 * avec l'instance de Livre courante
	 * @return true si l'instance est égal à obj
	 */
	@Override
	public boolean equals(Object obj) {
		
		 //On vérifie si l'objet est bien un livre
		 if(!(obj instanceof Livre))
		   {
		     return false;
		   }
		
		return (this.getTitre().equals(((Livre) obj).getTitre()) && this.getNbPages() == ((Livre) obj).getNbPages());		
		
	}
	
	/**
	 * Méthode de classe hashcode override de hascode de Object
	 * @return Le hashcode du livre basé sur le titre du livre et le nombre de page du livre
	 */
	@Override
	public int hashCode() {
		
		return (this.getTitre().hashCode() + new Integer(this.getNbPages()).hashCode());
	}
	
	
}
