package exo6;

/* ----------------------------------------------------

Exercice 6.12

Ecrivez un algorithme qui permette la saisie d’un nombre
quelconque de valeurs, sur le principe de l’ex 6.8. 
Toutes les valeurs doivent être ensuite augmentées de 1,
et le nouveau tableau sera affiché à l’écran. 

------------------------------------------------------*/

public class Exo6_12
{
public static void main(String[] args)
	{
	

	int T;																
	System.out.println("Entrez le nb de valeur que vous souhaitez saisir dans vos tableaux:");

	T=(new java.util.Scanner(System.in)).nextInt();
	

	int[] tab=new int[T];
	
	
	System.out.println("\nSaisie du tableau");
	for ( int i=0 ; i< T ; i++ ) 
			{
			System.out.println("Saisir la valeur n°"+(i+1));
			tab[i]=(new java.util.Scanner(System.in)).nextInt();
			}
	
	for ( int i=0 ; i< T ; i++ ) //boucle d'ajout
			{
			tab[i]=tab[i]+1;				//de 1 a chaque valeur entrée
			}
	
	for( int itab : tab ) System.out.println("\n"+itab);
	
			
		
	 }
}
