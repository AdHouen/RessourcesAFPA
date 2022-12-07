package biblio.item3_enum_datatype_Comparable;
import java.text.DecimalFormat;

public class Livre implements Comparable <Livre>{
private String titre, auteur;
private int nbPages;
private double prix = -1.0;
private boolean prixFixe = false;

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + nbPages;
	return result;
}

@Override
public boolean equals(Object autre) {
	if (this == autre)
		return true;
	if (autre == null)
		return false;
	if (getClass() != autre.getClass())
		return false;
	Livre other = (Livre) autre;
	if (nbPages != other.nbPages)
		return false;
	
	return true;
}
private TypeDonneesAnnee anneeParution;

private EnumStatusLivre status = EnumStatusLivre.disponible;

private static DecimalFormat dprix = new DecimalFormat("#0.00");

///////////////////////////////////////////////////
//constructeur
public Livre(String unAuteur, String unTitre, int nbPages, double prix, EnumStatusLivre status,TypeDonneesAnnee an) {
	auteur = unAuteur;
	titre = unTitre;
	setNbPages(nbPages);//this.nbPages = nbPages;
	this.prix = prix;
	setAnneeParution(an);//anneeParution = an ;
	this.status =  status;
}

public Livre(String unAuteur, String unTitre) {
	this(unAuteur, unTitre, 300, -1, EnumStatusLivre.disponible , new TypeDonneesAnnee(1999));
}

public Livre() {
	this("Auteur inconnu", "Titre inconnu");
}
///////////////////////////////////////////////////
//getter-setter
public double getPrix() {return prix;}

public boolean isPrixFixe() {return prixFixe;}

public void setPrix(double unPrix) {
	if (prixFixe) {
		System.err.println("Prix déjà fixé !");
	} else if (unPrix >= 0.0) {
		prix = unPrix;
		prixFixe = true;
	} else {
		System.err.println("Erreur : prix négatif !");
	}
}

public String getAuteur() {return auteur;}

public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public int getNbPages() {return nbPages;}

public void setNbPages(int nb) {
	if (nb > 0)
		nbPages = nb;
	else
		throw new IllegalArgumentException("le nombre de pages n'est pas négatif");
		//System.out.println("le nombre de pages n'est pas négatif");
}

public String getTitre() {return titre;}

public void setTitre(String titre) {
	this.titre = titre;
}

public TypeDonneesAnnee getAnneeParution() {return anneeParution;}

public void setAnneeParution(TypeDonneesAnnee anneeParution) {
	this.anneeParution = anneeParution;
}
public EnumStatusLivre getStatus() {return status;}

public void setStatus(EnumStatusLivre s) {
	this.status = s;
}
///////////////////////////////////////////////////
//méthodes d'instance
public String toString() {
	return "  titre :" + titre + "  auteur :" + auteur
			+ "  nbPages :" + nbPages
			+ "  prix :" + ((prix == -1)?"\"Prix indéterminé\"":dprix.format(prix))
			+ "  anneeParution :" + anneeParution
			+ "  status :" + status;
}
public void afficheToi() {
	System.out.println(toString());
}

public boolean isDisponible() {
	if (status == EnumStatusLivre.disponible)
		return true;
	else
		return false;
}
@Override
public int compareTo(Livre livre) {
	 if (nbPages==livre.nbPages){ return 0; }
	 else if(this.nbPages>livre.nbPages){ return +1; }
	 else { return -1; }
}
///////////////////////////////////////////////////
public static void main(String[] args) {
	Livre l1=new Livre("BAUDELAIRE","Zadig",200,50.00,EnumStatusLivre.disponible, new TypeDonneesAnnee(2001));
	Livre l2=new Livre("VOLTAIRE","eva");
	
	Livre l3 = new Livre();
		l3.setTitre("Le Bourgeois");
		l3.setAuteur("MOLIERE");
		l3.setNbPages(250);
		//l3.setPrix(30);
		l3.setAnneeParution(new TypeDonneesAnnee(2003));
		l3.setStatus(EnumStatusLivre.disponible);
	
	System.out.println(" livre l1 ="+ l1);
	System.out.println(" livre l2 =" + l2);
	System.out.println(" livre l3 =" + l3);
}}