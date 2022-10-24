package part05_boucle;
/* ----------------------------------------------------
Exercice 5.5
Ecrire un algorithme qui demande un nombre de départ,
et qui calcule la somme des entiers jusqu’à ce nombre.
Par exemple, si l'’on entre 5, le programme doit calculer :
1 + 2 + 3 + 4 + 5 = 15
-----------------------------------------------------*/

public class Exo5_5
{
public static void main(String[] args)
	{
	int nb,somme=0,i;
	
	System.out.println("Veuillez entrer un nombre");
	nb=(new java.util.Scanner(System.in)).nextInt();
	
	System.out.println("La somme des entiers jusqu'a :" + nb);		
	
	for ( i=1 ; i <= nb ; i++ )
	{
		somme = somme + i;//cumul
		System.out.print( i );
		if( i< nb )
			System.out.print( " + ");
	}
	
	System.out.println( " = " + somme );		

	
	}
}
