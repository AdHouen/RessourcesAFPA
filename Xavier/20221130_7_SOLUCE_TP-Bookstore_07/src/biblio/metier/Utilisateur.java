
package biblio.metier;

import java.util.Calendar;
import java.util.Date;

public class Utilisateur extends Personne {

	private Integer idUtilisateur;
	private static int compteur=0;
	private Livre emprunt;//association 1 à 1
	private Integer dureeMaxPret = 15;
	
	/**
	 * Constructeur avec tout les paramètres
	 * qui se base sur le constructeur de Personne
	 * @param nom_p nom de la personne
	 * @param prenom_p prenom de la personne
	 */
	public Utilisateur(String nom_p, String prenom_p){
		super(nom_p,prenom_p);
		compteur=compteur+1;
		idUtilisateur=compteur;
		
	}
	
	/**
	 * Constructeur par défaut sans paramètre qui est basé
	 *  sur le constructeur sans paramètre de personne
	 */
	public Utilisateur(){
		super();
		compteur=compteur+1;
		idUtilisateur=compteur;
	}
	

	/**
	 * Accesseur sur l'id utilisateur
	 * @return l'id utilisateur
	 */
	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}
	
	
	/**
	 * Mutateur sur le livre emprunté
	 *  Cela affecte le livre emprunté à utilisateur
	 *  Fixe une date d'emprunt au livre
	 *  et change le statut du livre
	 * @param emprunt_p livre a emprunté
	 */
	public void setEmprunt(Livre emprunt_p) {
		if (emprunt_p !=null)
		{
			this.emprunt = emprunt_p;
			this.emprunt.setDateEmprunt(new Date());
			this.emprunt.setDisponible(EnumStatusLivre.prete);
		}
		else
		{
			this.emprunt.setDisponible(EnumStatusLivre.disponible);
			this.emprunt = null;
		}
	}
	
	/**
	 * Accesseur sur le livre emprunté
	 * @return Le livre emprunté par l'utilisateur si il en emprunte un
	 */
	public Livre getEmprunt() {
		return emprunt;
	}
	
	/**
	 * Override de la méthode to string
	 */
	@Override
	public String toString(){
		if (this.emprunt != null)
			return String.format("%s id:%d  a emprunté le livre %s.", super.toString(),this.getIdUtilisateur(),this.emprunt.toString());
		else
			return String.format("%s id:%d n'a emprunté aucun livre.", super.toString(),this.getIdUtilisateur());
	}
	
	
	/**
	 * Methode qui vérifie si le pret du livre est en retard
	 * @return retourne true si l'emprunt est en retard

	 */
	public  boolean isPretEnRetard()
	{

		// Création de la date minimum sans retard avec la date du jour et la duree
		// maximum du prêt
		Calendar aujourdhui = Calendar.getInstance();
				aujourdhui.add(Calendar.DATE, -(this.dureeMaxPret));
		Calendar dateMinSansRetard = aujourdhui;
			
				
				
		
		// On vérifie que la date d'emprunt du prêt se situe après la date minimum
		// sans retard
		if(this.emprunt != null)
				return this.emprunt.getDateEmprunt().before(dateMinSansRetard.getTime());
		else
			return false;

	}

}
