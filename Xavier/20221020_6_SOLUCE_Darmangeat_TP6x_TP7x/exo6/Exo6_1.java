package exo6;

/* ----------------------------------------------------

Exercice 6.1

Ecrire un algorithme qui d�clare et remplis un tableau de 7
valeurs num�riques en les mettant toutes � z�ro. 


------------------------------------------------------*/


public class Exo6_1
{
	private static final int T = 7;					//Constante de nb de valeur du tableau

public static void main(String[] args)
{
	int[] tab = new int[T];  // declaration du tableau a 5 entrees
	
	
	for ( int i=0 ; i< tab.length ; i++ ) //boucle d entr�e des valeurs du tableau
	{
		tab[i]=0;
	}
	System.out.println("\nAffichage du tableau :");
	for ( int itab : tab )
		System.out.println("\n" + itab);
}
}
