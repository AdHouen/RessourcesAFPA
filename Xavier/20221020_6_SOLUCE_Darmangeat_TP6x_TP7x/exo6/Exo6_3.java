package exo6;

/* ----------------------------------------------------

Exercice 6.3

Ecrire un algorithme qui déclare un tableau de 9 notes,
dont on fait ensuite saisir les valeurs par l’utilisateur. 

------------------------------------------------------*/

public class Exo6_3
{
public static void main(String[] args)
	{
	

	final int T=3;					//Constante du nb de valeur du tableau
	int[] tab=new int[T];  // 
	
	for ( int i=0 ; i< tab.length ; i++ ) //boucle d entrée des valeurs du tableau
	{
		System.out.println("Saisir la note n°"+(i+1));
		tab[i]=(new java.util.Scanner(System.in)).nextInt();
	}
	

	System.out.println("\nAffichage du tableau :");
	for ( int i : tab )
		System.out.println("\n"+i);
	
 	}
}
