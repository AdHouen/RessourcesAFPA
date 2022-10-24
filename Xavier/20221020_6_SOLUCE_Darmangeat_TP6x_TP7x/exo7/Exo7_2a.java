package part07_technique_rusee;

/* ----------------------------------------------------
Exercice 7.2

Ecrivez un algorithme qui trie un tableau dans l'’ordre décroissant 
Vous écrirez bien entendu deux versions de cet algorithme,
l'une employant le tri par insertion, l'autre le tri à bulles. 
------------------------------------------------------*/

public class Exo7_2a
{
public static void main(String[] args)
	{
	
	// ----------- Déclaration et implémentation du tableau ------
	
	
	int[] tab = {16,18,15,9,11,10,17};

	int dimTab = tab.length;

/*	int T;
	
	System.out.println("Entrez le nb de valeurs que vous souhaitez saisir:");

	T=(new java.util.Scanner(System.in)).nextInt();
	int[] tab=new int[T];
		
	System.out.println("\nSaisie du tableau");
	for ( int i=0 ; i< T ; i++ ) 
			{
			System.out.println("Saisir la valeur n°"+(i+1)+":");
			tab[i]=(new java.util.Scanner(System.in)).nextInt();
			}*/
	
	// ---------------- Tri du tableau par selection ---------
	
	int temp;
	int indexMin; 
	for ( int i=0 ; i < (dimTab-1) ; i++ )
	{
		indexMin = i;
		for ( int j = i+1 ; j < dimTab ; j++ )
		{
			if ( tab[j] < tab[indexMin] )
				indexMin = j;
		}
		temp = tab[i];
		tab[i] = tab[indexMin];
		tab[indexMin] = temp;
	}
		
	//------------------ Affichage du tableau trié --------------
	
	System.out.println("Tableau trié :\n");
	for ( int itab : tab )
		System.out.println(itab);
	
	 }
}
