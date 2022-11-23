package biblio.metier_EcritureClasseMetierEntite;

public class Auteur extends Personne{

	@Override
	public String toString() {
		return" Auteur[" +  super.toString()+" ]";

		//return "Auteur [ "+ super.toString() + "]";
	}

	
	@Override
	public void parle() {

		System.out.println("c'est long d'écrire un livre");
		//return super.parle();
	}


	public static void main(String[] args) {
		Auteur a1 = new Auteur();
		System.out.print("L'auteur " + a1.getNom()+ " dit :"); a1.parle();

		System.out.println(" a1 :" + a1);
		//System.out.println(a1.parle());
		
	}

}
