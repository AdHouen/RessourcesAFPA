package exo6;

/* ----------------------------------------------------

Exercice 6.14

Toujours et encore sur le même principe, écrivez un algorithme
permettant, à l’utilisateur de saisir les notes d'une classe. 
Le programme, une fois la saisie terminée, renvoie le nombre
de ces notes supérieures à la moyenne de la classe.


------------------------------------------------------*/

public class Exo6_14
{
public static void main(String[] args)
	{
	

	int T;																
	System.out.println("Entrez le nb de notes que vous souhaitez saisir:");

	T=(new java.util.Scanner(System.in).nextInt());
	

	int[] tab=new int[T];
	int somme=0;
	
	System.out.println("\nSaisie du tableau");
	for ( int i=0 ; i< T ; i++ ) 
			{
			System.out.println("Saisir la note n°"+(i+1));
			tab[i]=(new java.util.Scanner(System.in)).nextInt();
			somme=somme+tab[i];
			}
	
	//--------------------- Calcul Moy et verif des notes Sup a Moy ------------

	

	int moy=0,compt=0;
	
	moy=somme/T;
	System.out.println("\nLa moyenne de la classe est: "+moy);
	
	for ( int i=0 ; i<T ; i++ )
			{
			if (tab[i]>moy ) compt++;
			}
	
	System.out.println("\nil ya "+compt+" notes superieure(s) a la moyenne de la classe."); 		
		
	 }
}
