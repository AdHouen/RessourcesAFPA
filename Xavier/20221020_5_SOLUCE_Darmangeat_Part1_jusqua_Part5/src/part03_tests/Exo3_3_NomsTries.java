package part03_tests;

/* 
---------------
Exercice 3.3
---------------
Demande 3 noms � l'utilisateur et dit s'ils sont tri�s par ordre alphab�tique.
*/

public class Exo3_3_NomsTries
{
public static void main(String[] args)
	{
	

	String snom1;//a
	String snom2;//b
	String snom3;//c
	
	System.out.println("Entrez un nom: ");
	snom1=new java.util.Scanner(System.in).nextLine();
	System.out.println("Entrez un 2e nom: ");
	snom2=new java.util.Scanner(System.in).nextLine();
	System.out.println("Entrez un 3e nom: ");
	snom3=new java.util.Scanner(System.in).nextLine();

	if ( snom2.compareTo(snom1) >= 0 && snom3.compareTo(snom2) >= 0 )
		System.out.println("Vous avez entr� les noms dans l ordre alphab�tique");
	else
		System.out.println("Vous n'avez pas entr� les noms ds l'ordre alphab�tique");

	}
}
