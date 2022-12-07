package biblio.metier;
public enum EnumStatusLivre {
	prete,
	disponible,
	supprime;
	
	@Override
	public String toString() {
		if(this.equals(EnumStatusLivre.disponible))
			return "disponible";
		else
			if(this.equals(EnumStatusLivre.prete))
					return "prété";
			else return "supprimé";
		
	}
}
