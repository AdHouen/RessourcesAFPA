package part03_tests;

/*
-------------
EXERCICE 3.4
-------------
Demande à l'utilisateur de saisir un nombre et dit 
s'il est positif ou négatif (tient compte du cas où nombre = 0) 
*/


public class Exo3_4_NombrePosNeg
{
public static void main(String[] args)
	{
	

	int in1=0;
		
	System.out.println("Entrez un nombre: ");
	in1 = (new java.util.Scanner(System.in)).nextInt();
	
	if ( in1 < 0 )
		System.out.println("Le nombre est negatif");
	else if ( in1 == 0 )
		System.out.println("Le nombre est nul");
	else
		System.out.println("Le nombre est positif");
	}
}
