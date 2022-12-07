
package biblio.metier;

import java.util.Calendar;
import java.util.Date;

/**
 * Association, méthode d'instance
 * Classe Utilisateur
 * @version 1.0
 */
public class Utilisateur extends Personne {

	private Integer idUtilisateur;
	private static int compteur=0;
	private Livre emprunt;
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
	 * @throws BiblioException 
	 */
	public void setEmprunt(Livre emprunt_p) throws BiblioException {
		
			// On vérifie si l'emprunt que l'on passe est nulle
			// Et qu'il veut simplement rendre un livre
			if (emprunt_p !=null)
			{
				// Si le prêt n'est pas en retard
				if (!this.isPretEnRetard())
				{
				
					// SI le livre est disponible
					if (emprunt_p.isDisponible())
					{
						// Si il a déjà un livre il y a échange
						if (this.emprunt != null)
						{
							this.emprunt.setDisponible(EnumStatusLivre.disponible);
							this.emprunt.setEmprunteur(null);
							this.emprunt.setDateEmprunt(null);
						}
						//On met le nouveau livre emprunté
						this.emprunt = emprunt_p;
						this.emprunt.setDateEmprunt(new Date());
						this.emprunt.setDisponible(EnumStatusLivre.prete);
						this.emprunt.setEmprunteur(this);
					}
					// Sinon on dit que le livre n'est pas disponible
					else
						throw new BiblioException ("Un livre non disponible ne peut être emprunté");
				}
				// Sinon le prêt est en retard il ne peut emprunté le livre
				else
					throw new BiblioException ("l'utilisateur ne peut pas emprunté un livre car il a un prêt en retard");
			}
			//Sinon il ne veut pas emprunté de nouveaux livre mais
			// Il veut rendre son livre
			else
			{
				this.emprunt.setDisponible(EnumStatusLivre.disponible);
				this.emprunt.setEmprunteur(null);
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
			return String.format("%s id: %d  a emprunté le livre %s.", super.toString(),this.getIdUtilisateur(),this.emprunt.toString());
		else
			return String.format("%s id: %d n'a emprunté aucun livre.", super.toString(),this.getIdUtilisateur());
	}
	
	
	/**
	 * Methode qui vérifie que la
	 * @return retourne un booleen qui précise si la date d'emprunt est en retard ou non
	 */
	public  boolean isPretEnRetard()
	{

		// Création de la date minimum sans retard avec la date du jour et la duree
		// maximum du prêt
		Calendar dateMinSansRetard = Calendar.getInstance();
		dateMinSansRetard.add(Calendar.DATE, -(this.dureeMaxPret));
		
		// On vérifie que la date d'emprunt du prêt se situe après la date minimum
		// sans retard
		if(this.emprunt !=null)
				return this.emprunt.getDateEmprunt().before(dateMinSansRetard.getTime());
		else
			return false;
		
		
	}
	

	
}
