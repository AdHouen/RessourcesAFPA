package bookshop.domain_EcritureClasseMetierEntite;

public class Utilisateur extends Personne {
	
	/** Identifiant des utilisateurs de la bibliothèque*/
	private String idUtilisateur;

	/////////////////////////////////////////////////////
	// DCC prévue : ASSOCIATION 1 à 1, unidirectionnelle (voir UML au tableau)
	// JPA @OneToOne
	/**le livre emprunté par l'utilisateur*/
	private Livre emprunt; //association 1 à 1
	
	public Utilisateur(String nom, String prenom, String idUtilisateur) {
		super(nom, prenom);
		this.idUtilisateur = idUtilisateur;
	}

	public Utilisateur() {
		super();
		this.idUtilisateur = "Numéro inconnu";
	}
	public Livre getEmprunt() {
		return emprunt;
	}
	public void setEmprunt(Livre emprunt) {
		this.emprunt = emprunt;
	}



	public String getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(String idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + "  "+ " titre_livre="+( emprunt == null ?"pas de livre":emprunt.getTitre())+ " " + super.toString()  +" ]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((idUtilisateur == null) ? 0 : idUtilisateur.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utilisateur other = (Utilisateur) obj;
		if (idUtilisateur == null) {
			if (other.idUtilisateur != null)
				return false;
		} else if (!idUtilisateur.equals(other.idUtilisateur))
			return false;
		return true;
	}

	@Override
	public void parle() {
		System.out.println("La cotisation est trop chère");;
	}
	public String findTitreLivreCourant() {
		String retour=null;
		
		if( getEmprunt()!= null)
			retour =  getEmprunt().getTitre();
		else
			retour =  "Pas de livre emprunté";
		return retour;
	}

	public static void main(String[] args) {
		Utilisateur u1 = new Utilisateur("MARIE JOSEPH", "Carthy", "34890");
		System.out.println("toString() de utilisateur u1 :" + u1);
	}
}
