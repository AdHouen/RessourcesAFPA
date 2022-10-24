package part05_boucle;

/* ----------------------------------------------------
Exercice 5.3
Ecrire un algorithme qui demande un nombre de départ,
et qui ensuite affiche les dix nombres suivants.
Par exemple, si l'utilisateur entre le nombre 17,
le programme affichera les nombres de 18 à 27.

avec boucle while pour le fun
------------------------------------------------------*/
/*SOLUTION pseudo-Code
Variables N, i en Entier
Debut
Ecrire “Entrez un nombre : ”
Lire N
Ecrire “Les 10 nombres suivants sont : ”
Pour i ← N + 1 à N + 10
   Ecrire i
i Suivant
Fin*/

public class Exo5_3
{
public static void main(String[] args)
{
	int nb,top;
	
	System.out.println("Veuillez entrer un nombre");
	nb=(new java.util.Scanner(System.in)).nextInt();
	
	top = nb + 10;
	while ( nb < top )
	{
		nb++;
		System.out.println(nb);
	}

}
}
