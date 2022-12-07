package biblio.metier;

public class TypeDonneesAnnee {
	private int annee;
	
	/**
	 * Constructeur avec en paramètre l'année
	 * @param annee_p annee entier
	 * @exception  IllegalArgumentException lève une exception si annee_p 
	 * n'est pas strictement supérieure à 0
	 */
	public TypeDonneesAnnee(int annee_p){
		setAnnee(annee_p);
	}

	public TypeDonneesAnnee(){
			this(1);
	}
	
	public int getAnnee(){ return annee;}
	
	public void setAnnee(int annee_p){
			if (annee_p > 0)
				this.annee=annee_p;
			else
				throw new IllegalArgumentException(
				"L'année de parution doit être un entier strictement supérieur à 0");
	}

	@Override
	public String toString() {
			return "TypeDonneesAnnee[ Annee :" +this.getAnnee()+"]";
	}
	
	/**
	 * Méthode de classe equals override de la méthode de l'interface Comparable
	 * @param autre : Le TypeDonnees annee dont on veut vérifier l'égalité avec l'instance
	 * de TypeDonneeAnnee courante
	 * @return true si l'instance courante est égal à autre
	 */
	@Override
	public boolean equals(Object autre) {

		 //On vérifie si l'objet est bien un livre
		 if(!(autre instanceof TypeDonneesAnnee))
		   {
		     return false;
		   }
		return (this.annee==((TypeDonneesAnnee) autre).getAnnee());		
	}
	
	/**
	 * Méthode de classe hashcode override de hascode de Object
	 * @return Le hashcode du TypeDonneeAnnee via son Integer
	 */
	@Override
	public int hashCode() {
		
		return (new Integer(this.getAnnee()).hashCode());
	}
}
