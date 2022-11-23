package bookshop.domain_EcritureClasseMetierEntite;

import java.util.ArrayList;

//import biblio.metier.heritage_association.Livre;

public class Utilisateur extends Personne {
	
	/** Identifiant des utilisateurs de la bibliothèque*/
	private String idUtilisateur;

	//private Livre emprunt;//Association 1_1
	
	/////////////////////////////////////////////////////
	//ASSOCIATION 1 à n, , unidirectionnelle
	// JPA @OneToMany
	
	/** Les livres empruntés par l'utilisateur */
	private ArrayList<Livre> livres = new ArrayList<>();

	public ArrayList<Livre> getLivres() {
		return livres;
	}
	public void setLivres(ArrayList<Livre> livres) {
		this.livres = livres;
	}
	
	public boolean addLivre(Livre livre){
		return livres.add(livre);
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
		return "Utilisateur [idUtilisateur=" + idUtilisateur + " nb_dEmprunts="+livres.size()+ "  " + super.toString()  +" ]";
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
		Utilisateur u1 = new Utilisateur("MARIE JOSEPH", "Carthy", "34890");
		System.out.println("toString() de utilisateur u1 :" + u1);
	}

}
