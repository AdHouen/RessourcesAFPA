package biblio.item3_enum_datatype_Comparable;
import java.util.Arrays;
import java.util.List;
public class TestLivre_Tri {

public static void main(String[] args) {
	Livre l1=new Livre("BAUDELAIRE","Zadig",200,50.00,EnumStatusLivre.disponible, new TypeDonneesAnnee(2001));
	//Livre l1=new Livre("BAUDELAIRE","Zadig",200,50.00,EnumStatusLivre.disponible, new TypeDonneesAnnee(-17));
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

	if (l1.compareTo(l2)==0){
		System.out.println("Les livres l1 et l2 sont égaux");
	}
	else if (l1.compareTo(l2)>0){
		System.out.println("Le plus gros livre est l1, titre :" + l1.getTitre());
	}
	else{
		System.out.println("Le plus gros livre est l2, titre :" + l2.getTitre());
	}

	l1.setPrix(100.00);
	System.out.println(" livre l2, isDisponible() :"+ l2.isDisponible());
	System.out.println(" livre l2, getStatus() :"+ l2.getStatus());
	l1.setStatus(EnumStatusLivre.disponible);
	
	try {
		l1.setAnneeParution(new TypeDonneesAnnee(-3));
	} catch (IllegalArgumentException e) {
	//} catch (RuntimeException e) {
		System.out.println(e);

	}
	System.out.println(" on continue le programme");

	System.out.println(" livre l1, isDisponible() :"+ l1.isDisponible());
	System.out.println("L'annee de parution de l1 est : " + l1.getAnneeParution());
	
	System.out.println("\n========================================");
	Livre [] livres = { l1,l2,l3};
	System.out.println("\nContenu du tableau avant tri:");
	for(Livre l: livres)
		System.out.println("\t" + l);

	//méthode static sort :   void java.util.Arrays.sort(Object[] a)
	Arrays.sort(livres);
	System.out.println("\nContenu du tableau après tri:");
	for(Livre l: livres)
		System.out.println("\t" + l);
	
	
	System.out.println("\nContenu du tableau avec Java8 :");
	//On travaille avec une collection List
	//List<Livre> livres2 = Arrays.asList(livres);
	//Java8  API streams
	//livres2.stream().forEach(System.out::println);
	
	Arrays.asList(livres).forEach(System.out::println);
	
	//l1.equals(l2);
	//new TypeDonneesAnnee(1999).equals(new TypeDonneesAnnee(1998));
	
	// test de equals
	


}}