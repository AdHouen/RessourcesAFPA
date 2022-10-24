package exo6;
/* ----------------------------------------------------

Exercice 6.8

Ecrivez un algorithme permettant à l’utilisateur de saisir
un nombre quelconque de valeurs, qui devront être stockées
dans un tableau. L’utilisateur doit donc commencer par entrer
le nombre de valeurs qu’il compte saisir. Il effectuera
ensuite cette saisie. Enfin, une fois la saisie terminée,
le programme affichera le nombre de valeurs négatives et 
le nombre de valeurs positives. 
 
------------------------------------------------------*/


public class Exo6_8
{
public static void main(String[] args)
{
	int T;																//Constante du nb de valeur du tableau
	System.out.println("Entrez le nb de valeur que vous souhaitez saisir:");
	
	T = (new java.util.Scanner(System.in)).nextInt();
	
	
	int[] tab=new int[T];  								 
	
	for ( int i=0 ; i< tab.length ; i++ ) //boucle d entrée des valeurs du tableau
	{
		System.out.println("Saisir la valeur n°"+(i+1));
		tab[i]=(new java.util.Scanner(System.in)).nextInt();
	}
	
	
	int pos=0,neg=0;
	
	for ( int i=0 ; i< tab.length ; i++ ) //boucle de comptage des nb neg(atif) et pos(itif)
	{
		if (tab[i]>0)
			pos++;
		else
			neg++;
	}
	
	
	System.out.println("\nIl ya :\n"+pos+" nombre(s) positif(s)\n"+neg+" nombre(s) negatif(s)");
	
}
}
