package biblio.item3_enum_datatype_Comparable;
public class TypeDonneesAnnee {
	
private int annee;

public TypeDonneesAnnee(int annee) {setAnnee(annee);}

public TypeDonneesAnnee() {this(1);}

public int getAnnee() {return annee;}

public void setAnnee(int annee) {
	if (annee < 0)
		throw new IllegalArgumentException("Une année n'est pas négative");
	else
		this.annee = annee;	
}
@Override
public String toString() {
	return String.valueOf(annee);
}
public static void main(String[] args) {
	TypeDonneesAnnee annee1 = new TypeDonneesAnnee(1993);
	System.out.println( "annee1 :" + annee1);
	//TypeDonneesAnnee annee2 = new TypeDonneesAnnee(-19);

	TypeDonneesAnnee annee2 = new TypeDonneesAnnee();
	//annee2.setAnnee(-6);
	System.out.println( "annee2 :" + annee2);
}}
