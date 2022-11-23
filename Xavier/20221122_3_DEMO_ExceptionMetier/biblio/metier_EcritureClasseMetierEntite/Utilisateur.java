package biblio.metier_EcritureClasseMetierEntite;

public class Utilisateur extends Personne {
	
	/** identifiant des utilisateurs de la bibliothèque*/
	private String idUtilisateur;

	private Livre emprunt;//Association
	
	public Livre getEmprunt() {
		return emprunt;
	}


	public void setEmprunt(Livre emprunt) {
		this.emprunt = emprunt;
	}


	public Utilisateur(String nom, String prenom, String idUtilisateur) {
		super(nom, prenom);
		this.idUtilisateur = idUtilisateur;
	}


	public Utilisateur() {
		super();
		this.idUtilisateur = "Numéro inconnu";

	}

	
	public String getIdUtilisateur() {
		return idUtilisateur;
	}


	public void setIdUtilisateur(String idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	
	
	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + "  " + super.toString() + "titre livre :"+( emprunt==null ?"pas de livre":emprunt.getTitre()) +" ]";
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


	public static void main(String[] args) {

	}

}
