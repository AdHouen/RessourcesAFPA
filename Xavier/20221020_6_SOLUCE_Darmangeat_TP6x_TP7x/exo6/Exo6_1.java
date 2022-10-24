package exo6;

/* ----------------------------------------------------

Exercice 6.1

Ecrire un algorithme qui déclare et remplis un tableau de 7
valeurs numériques en les mettant toutes à zéro. 


------------------------------------------------------*/


public class Exo6_1
{
	private static final int T = 7;					//Constante de nb de valeur du tableau

public static void main(String[] args)
{
	int[] tab = new int[T];  // declaration du tableau a 5 entrees
	
	
	for ( int i=0 ; i< tab.length ; i++ ) //boucle d entrée des valeurs du tableau
	{
		tab[i]=0;
	}
	System.out.println("\nAffichage du tableau :");
	for ( int itab : tab )
		System.out.println("\n" + itab);
}
}
