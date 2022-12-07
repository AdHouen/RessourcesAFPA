
package biblio.metier;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * Association, méthode d'instance
 * 
 * Classe Utilisateur
 * 
 * 
 * @version 2.0
 */
public class Utilisateur extends Personne {

	private Integer idUtilisateur;
	private static int compteur=0;
	private static int nbMaxPrets=3;
	private ArrayList<Livre> livres=new ArrayList<Livre>();
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
	 *Acesseur qui retourne la collection
	 * de livre
	 * @return la collection de livre
	 */
	public ArrayList<Livre> findAllLivres(){
		return this.livres;
	}
	
	/**
	 * Mutateur de la collection de livre
	 * de livre
	 * @param livre_p collection de livre à insérer
	 * @throws BiblioException 
	 */
	public void setLivres(ArrayList<Livre> livre_p) throws BiblioException{
			if (livre_p != null)
				this.livres=livre_p;
			else
				throw new BiblioException("On ne peut pas affecter null à la collection de livre");
	}
	
	/**
	 * Methode aui permet d'ajouter un livre
	 * à la collection de livres
	 * @param livre livre à ajouter à la collection
	 * @throws BiblioException 
	 */
	public void addLivre(Livre livre) throws BiblioException
	{
		if(this.isConditionsPretAcceptees() && livre.isDisponible())
		{
			this.livres.add(livre);
			livre.setDisponible(EnumStatusLivre.prete);
			livre.setDateEmprunt(new Date());
		}	
		else 
			if (this.livres.size() > 2 && this.getRetard() > 0)
				throw new BiblioException("L'Utilisateur ne peut plus emprunter de livre, il a déjà emprunté le nombre maximum de livre et a en plus un ou plusieurs prêts en retard.");
			else 
				if(this.livres.size() > 2)
					throw new BiblioException("L'Utilisateur ne peut plus emprunter de livre, il a déjà emprunté le nombre maximum de livre.");
				else
					if (this.getRetard() > 0)
						throw new BiblioException("L'Utilisateur ne peut plus emprunter de livre, il a déjà un ou des prêts en retard");
					else
						throw new BiblioException("L'Utilisateur ne peut plus emprunter ce livre, il a déjà été emprunté");
	}
	
	/**
	 * Methode qui permet de vider la liste des livres
	 * emprunté à la collection de livres
	 */
	public void clearLivres()
	{
		for(Livre livre : this.livres)
		{
			livre.setDisponible(EnumStatusLivre.disponible);
			livre.setDateEmprunt(null);
		}
		
		this.livres.clear();
	}
	
	/**
	 * Methode qui permet de retrouver un livre par
	 * son titre dans la collection de livres
	 * @param titre titre du livre
	 * @return livre
	 */
	public Livre findLivreByTitre(String titre) throws BiblioException{
		for (Livre livre : this.livres)
		{
			if (livre.getTitre().equals(titre))
				return livre;
		}
		return null;
		//throw new BiblioException("Le titre du bouquin donnée n'est pas dans la liste des livre");
		
	}
	
	/**
	 * Methode qui permet de savoir si un livre
	 *  passé en paramètre fait partie de la
	 *  collection de livre emprunté par l'utilisateur
	 * @param livre livre dont on veut vérifier l'appartenance à la
	 * collection de livre
	 * @return booléen permettant de savoir si le livre est dans
	 * la collection ou non
	 */
	public boolean containsLivre(Livre livre){
		if (livre !=null)
			return this.livres.contains(livre);
		else
			return false;	
	}
	
	/**
	 * Methode qui permet de retirer un livre de la
	 * collection de livre
	 * @throws BiblioException 
	 */
	public void removeLivre(Livre livre) throws BiblioException{
		if (this.containsLivre(livre))
		{
			this.livres.remove(livre);
			livre.setDisponible(EnumStatusLivre.disponible);
		}
		else
			throw new BiblioException("Vous essayez de retirer un livre qui ne fait pas partie de la collection.");
	}
	
	/**
	 * Methode qui vérifie qu'un prêt d'un livre est en retard ou non
	 * @return retourne un booleen qui précise si la date d'emprunt est en retard ou non
	 */
	private  boolean isPretEnRetard(Livre livre)
	{
		//TODO
		//Il faut porter cette méthode dans le livre
		// TODO
		
		
		// Création de la date minimum sans retard avec la date du jour et la duree
		// maximum du prêt
		Calendar dateMinSansRetard = Calendar.getInstance();
		dateMinSansRetard.add(Calendar.DATE, -(this.dureeMaxPret));
		
		// On vérifie que la date d'emprunt du prêt se situe après la date minimum
		// sans retard
		return livre.getDateEmprunt().before(dateMinSansRetard.getTime());
		
		
		
	}
	
	/**
	 * Methode qui comptabilise le nombre de retard
	 */
	public int getRetard(){
		
		int nbLivreEnretard=0;
	
	   if (this.livres.size() > 0)
	   {
		   for (Livre livre: this.livres)
		   {
			   if (this.isPretEnRetard(livre))
				   nbLivreEnretard++;
		   }
	   }
		
		return nbLivreEnretard;	
	}

	/**
	 * Methode qui  verifie qu'un livre peut être prété
	 * @return booléen permettant de savoir si on peut prêter un livre ou nono
	 */
	public boolean isConditionsPretAcceptees(){
		return (this.livres.size() < nbMaxPrets && this.getRetard() == 0);
	}
	

	
	/**
	 * Override de la méthode to string
	 */
	@Override
	public String toString(){
		if (this.livres.size() > 0)	
			return String.format("%s id: %d et à emprunté %s.", super.toString(),this.getIdUtilisateur(),this.livres.toString());
		else
			return String.format("%s id: %d n'a emprunté aucun livre.", super.toString(),this.getIdUtilisateur());
	}	
}
