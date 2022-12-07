
package biblio.metier;

/**
 * Association, méthode d'instance
 * Classe Personne
 * @version 1.0
 */
public class Personne {

	private String nom;
	private String prenom;
	
	/**
	 * Constructeur avec tout les paramètres
	 * @param nom_p nom de la personne
	 * @param prenom_p prenom de la personne
	 */
	public Personne(String nom_p, String prenom_p){
		this.setNom(nom_p);
		this.setPrenom(prenom_p);
	}
	
	/**
	 * Constructeur par défaut sans paramètre qui utilise le
	 * constructeur avec tout les paramètres
	 */
	public Personne(){
		this("","");
	}
	
	/**
	 * Accesseur sur le nom de la Personne
	 * @return le nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Mutateur sur le nom de la personne
	 * @param nom_p le nom à affecter
	 */
	public void setNom(String nom_p) {
		this.nom = nom_p;
	}

	/**
	 * Accesseur sur le prenom de la Personne
	 * @return le prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Mutateur sur le prenom de la personne
	 * @param prenom_p le prenom
	 */
	public void setPrenom(String prenom_p) {
		this.prenom = prenom_p;
	}

	/**
	 * Méthode parle qui affiche le nom et prenom de la Personne
	 */
	public void parle(){
		System.out.printf("%s",this.toString());
	}
	
	/**
	 * Override de la méthode to string
	 */
	@Override
	public String toString(){
		
		return String.format("%s %s",nom, prenom);
	}
}
