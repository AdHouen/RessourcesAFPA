package biblio.metier_EcritureClasseMetierEntite;

public abstract class Personne {

	private String nom;
	
	private String prenom;
	

	public Personne(String nom, String prenom) {
		//super(); //sous-entendu
		this.nom = nom;
		this.prenom = prenom;
	}


	public Personne() {
		this("Inconnu", null);
	}

	

	public String getNom() {
		return nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}


	/*	public void parle() {
		System.out.println("brrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");		
	}*/
	abstract public void parle();


	public static void main(String[] args) {

/*		Personne p1 = new Personne("MARIE JOSEPH","Carthy");
		Personne p2 = new Personne("RIPAULT","Yamar");
		Personne p3 = new Personne();
		Personne p4 = new Personne("MARIE JOSEPH","Carthy");

		System.out.println("p1 : " + p1);
		System.out.println("p2 : " + p2);
		System.out.println("p3 : " + p3);
		System.out.println("p4 : " + p4);

		
		if( p1.equals(p4)) //if( p1.equals((Object)p4))
			System.out.println("personnes égales");
		else 
			System.out.println("personnes différentes");
		
		System.out.print("La personne " + p1.getNom()+ " dit :"); p1.parle();
		System.out.print("La personne " + p2.getNom()+ " dit :"); p2.parle();
		System.out.print("La personne " + p3.getNom()+ " dit :"); p3.parle();
		System.out.print("La personne " + p4.getNom()+ " dit :"); p4.parle();
*/

	}

}
