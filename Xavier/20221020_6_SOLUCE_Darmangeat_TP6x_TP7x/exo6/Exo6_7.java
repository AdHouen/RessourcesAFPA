package exo6;

/* ----------------------------------------------------

Exercice 6.7

Ecrivez la fin de l�algorithme 6.3 afin que le calcul de la moyenne
des notes soit effectu� et affich� � l��cran. 


------------------------------------------------------*/


public class Exo6_7
{
public static void main(String[] args)
{

	final int T=3;	//Constante du nb de valeur du tableau
	int[] tab=new int[T];  	 
	int somme=0;
	float moy=0;
	
	for ( int i=0 ; i< tab.length ; i++ ) //boucle d entr�e des valeurs du tableau
	{
		System.out.println("Saisir la note n�"+(i+1));
		tab[i]=(new java.util.Scanner(System.in)).nextInt();
		somme=somme+tab[i]; // Calcul de la somme des notes
	}
	
	
	moy = somme/T;	// Calcul de la moyenne
	
	System.out.println("Moyenne = " + moy);
}
}
