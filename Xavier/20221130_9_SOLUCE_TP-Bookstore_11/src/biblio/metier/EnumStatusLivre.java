
package biblio.metier;

/**
 *  Association, méthode d'instance
 * @version 1.0
 */
public enum EnumStatusLivre {
	prete,
	disponible,
	supprime;
	
	/**
	 * Override de la méthode to string
	 */
	@Override
	public String toString() {
		if(this.equals(EnumStatusLivre.disponible))
			return "disponible";
		else
			if(this.equals(EnumStatusLivre.prete))
					return "prete";
			else return "supprime";
		
	}
	
}
