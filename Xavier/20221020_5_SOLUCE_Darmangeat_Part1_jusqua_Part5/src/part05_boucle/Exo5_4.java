package part05_boucle;

/* ----------------------------------------------------
Exercice 5.4
Ecrire un algorithme qui demande un nombre de départ,
et qui ensuite écrit la table de multiplication de ce nombre,
présentée comme suit (cas où l'utilisateur entre le nombre 7) :

Table de 7 :
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
…
7 x 10 = 70
------------------------------------------------------*/
public class Exo5_4
{
public static void main(String[] args)
{
	int nb,i;
	
	System.out.println("Veuillez entrer un nombre");
	nb = (new java.util.Scanner(System.in)).nextInt();
	System.out.println("La table des " + nb + " est:");
	
	for ( i=1 ; i <= 10 ; i++ )
	{
		System.out.println( nb + " x " + i + " = " + nb*i );
	}
}
}
