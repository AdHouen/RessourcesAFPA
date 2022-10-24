package exo6;

/* ----------------------------------------------------

Exercice 6.11

Toujours à partir de deux tableaux précédemment saisis,
écrivez un algorithme qui calcule le schtroumpf des deux tableaux.
Pour calculer le schtroumpf, il faut multiplier chaque élément du
tableau 1 par chaque élément du tableau 2, et additionner le tout. 

Exemple : 

Tableau 1 :                     4 – 8 – 7  - 12
Tableau 2 :                     3 – 6 
Le Schtroumpf :
3*4 + 3*8 + 3*7 + 3*12 + 6*4 + 6*8 + 6*7 + 6*12 = 279

------------------------------------------------------*/

public class Exo6_10
{
public static void main(String[] args)
{
	final int T;	//Constante du nb de valeur du tableau
	System.out.println("Entrez le nb de valeur que vous souhaitez saisir dans vos tableaux:");

	T = (new java.util.Scanner(System.in)).nextInt();
	

	int[] tab1=new int[T];
	int[] tab2=new int[T];
	int[] tab3=new int[T];
	
	System.out.println("\nSaisie du tableau n°1");
	for ( int i=0 ; i< T ; i++ ) //boucle d entrée des valeurs du tableau1
	{
		System.out.println("Saisir la valeur n°"+(i+1));
		tab1[i] = (new java.util.Scanner(System.in)).nextInt();
	}
	

	System.out.println("\nSaisie du tableau n°2");
	for ( int i=0 ; i< T ; i++ ) //boucle d entrée des valeurs du tableau2 + calcul de la somme
	{
		System.out.println("Saisir la valeur n°"+(i+1));
		tab2[i]=(new java.util.Scanner(System.in)).nextInt();
		tab3[i]=tab1[i]+tab2[i]; // calcul des elements du tableau 3
	}
	System.out.println("\nSaisie du tableau n°2");
	
	for ( int itab : tab3 )
		System.out.println("\n"+itab);
	
}
}
