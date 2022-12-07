
package biblio.metier;

/**
 * 
 *  Association, méthode d'instance
 * 
 * 
 * 
 * @version 1.0
 */
public class TypeDonneesAnnee {
	private Integer annee;
	
	/**
	 * Constructeur avec en paramètre l'année
	 * @param annee_p annee entier
	 * @exception  IllegalArgumentException lève une exception si annee_p 
	 * n'est pas strictement supérieure à 0
	 */
	public TypeDonneesAnnee(Integer annee_p){
		setAnnee(annee_p);
	}
	
	/**
	 * Constructeur sans paramètre
	 */
	public TypeDonneesAnnee(){
			this(null);
	}
	
	/**
	 * Acesseur sur l'année
	 * @return prix: l'année de parution
	 */
	public Integer getAnnee(){
		return annee;
	}
	
	/**
	 * Mutateur sur l'année
	 * @return prix: l'année de parution
	 */
	public void setAnnee(Integer annee_p){
		if (annee_p !=null)
		{
			if (annee_p > 0)
				this.annee=annee_p;
			else
				throw new IllegalArgumentException("L'année de parution doit être un entier strictement supérieur à 0");
		}
	}
	
	/**
	 * Override de la méthode to string
	 */
	@Override
	public String toString() {
		if(annee!=null)
			return this.getAnnee().toString();
		else
			return null;
	}
	
	/**
	 * Méthode de classe equals override de la méthode de l'interface Comparable
	 * @param obj : Le TypeDonnees annee dont on veut vérifier l'égalité avec l'instance
	 * de TypeDonneeAnnee courante
	 * @return true si l'instance est égal à obj
	 */
	@Override
	public boolean equals(Object obj) {
		
		 //On vérifie si l'objet est bien un livre
		 if(!(obj instanceof TypeDonneesAnnee))
		   {
		     return false;
		   }
		
		return (this.getAnnee().equals(((TypeDonneesAnnee) obj).getAnnee()));		
		
	}
	
	/**
	 * Méthode de classe hashcode override de hascode de Object
	 * @return Le hashcode du TypeDonneeAnnee via son Integer
	 */
	@Override
	public int hashCode() {
		
		return (this.getAnnee().hashCode());
	}
}
