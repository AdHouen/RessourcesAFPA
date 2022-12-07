package biblio.item3_enum_datatype_Comparable;

public class TestLivreEquals_hashCode {

public static void main(String[] args) {
	Livre l1=new Livre("BAUDELAIRE","Zadig",200,50.00,EnumStatusLivre.disponible, new TypeDonneesAnnee(2001));
	Livre l2=new Livre("VOLTAIRE","eva",300,100.00,EnumStatusLivre.disponible, new TypeDonneesAnnee(2002));
	
	Livre l3 = new Livre();
	l3.setTitre("Le Bourgeois");
	l3.setAuteur("MOLIERE");
	l3.setNbPages(250);
	//l3.setPrix(30);
	l3.setAnneeParution(new TypeDonneesAnnee(2003));
	l3.setStatus(EnumStatusLivre.disponible);
	
	System.out.print(" livre l1 =" + l1);
	System.out.print(" livre l2 =" + l2);
	System.out.print(" livre l3 =" + l3);


	
	System.out.println();
	System.out.println("\nTest de l'equals/hashCode :");
	System.out.println("========================================");

	System.out.print(" livre l1 =" + l1 + "\n");
	System.out.print(" livre l2 =" + l2+ "\n");

	System.out.print(" nb pages livre l1 =" + l1.getNbPages() + "\n");
	l2.setNbPages(l1.getNbPages());
	System.out.print(" nb pages livre l2 =" + l2.getNbPages() + "\n");
	
	if(l1.equals(l2))
		System.out.println("livres l1 et l2 egaux");
	else
		System.out.println("livres l1 et l2 diférent");
	
	System.out.println("l1 hashCode =" + l1.hashCode());
	System.out.println("l2 hashCode =" + l2.hashCode());


	System.out.println("l1.compareTo(l2) =" + l1.compareTo(l2));

}}