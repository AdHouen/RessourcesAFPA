package part05_boucle;

/* ----------------------------------------------------
Exercice 5.3
Ecrire un algorithme qui demande un nombre de départ,
et qui ensuite affiche les dix nombres suivants.
Par exemple, si l'utilisateur entre le nombre 17,
le programme affichera les nombres de 18 à 27.
------------------------------------------------------*/
public class Exo5_3bis
{
public static void main(String[] args)
{
	int nb,i;
	
	System.out.println("Veuillez entrer un nombre");
	nb=(new java.util.Scanner(System.in)).nextInt();
	
	System.out.println("Les 10 nombres suivants sont :");
	for ( i=nb+1 ; i <= nb+10 ; i++ )
	{
		System.out.println(i);
	}
}
}
