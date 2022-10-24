package part05_boucle;

/* ----------------------------------------------------
Exercice 5.7
Première version
----------------
Ecrire un algorithme qui demande successivement 20 nombres à l'utilisateur,
et qui lui dit ensuite quel était le plus grand parmi ces 20 nombres.
Exemple d'affichage:

Cette application vous demande la saisie successive de 20 nombres.
Comme résultat, elle vous affiche le plus grand nombre.
Entrez le nombre numéro 1 : 12
Entrez le nombre numéro 2 : 14
...
Entrez le nombre numéro 20 : 6

Résultat : Le plus grand nombre est 14

Deuxième version
----------------
Modifiez ensuite l'algorithme pour que le programme affiche
de surcroît en quelle position avait été saisie ce nombre :
exemple:
C'était le nombre numéro 2

------------------------------------------------------*/
/*SOLUTION pseudo-Code
Variables N, i, PG en Entier
Debut
PG ← 0
Pour i ← 1 à 20
   Ecrire “Entrez un nombre : ”
   Lire N
   Si i = 1 ou N > PG Alors
         PG ← N
   FinSi
i Suivant
Ecrire “Le nombre le plus grand était : ”, PG
Fin

En ligne 3, on peut mettre n’importe quoi dans PG, il suffit que
 cette variable soit affectée pour que le premier passage
 en ligne 7 ne provoque pas d'erreur.

Pour la version améliorée, cela donne :
Variables N, i, PG, IPG en Entier
Debut
PG ← 0
Pour i ← 1 à 20
   Ecrire “Entrez un nombre : ”
   Lire N
   Si i = 1 ou N > PG Alors
         PG ← N
         IPG ← i
   FinSi
i Suivant
Ecrire “Le nombre le plus grand était : ”, PG
Ecrire “Il a été saisi en position numéro ”, IPG
Fin*/

public class Exo5_7
{
public static void main(String[] args)
{
	int n1=0,n2,pos=0;
	System.out.println("Cette application vous demande la saisie successive de 20 nombres.");
	System.out.println("Comme résultat, elle vous affiche le plus grand nombre.");

	for ( int i=1 ; i <= 3 ; i++ )
	{
		//System.out.println("Veuillez entrer un nombre:");
		//n2 = (new java.util.Scanner(System.in)).nextInt();
		n2 = i;//pour les tests
		
		if ( n1 < n2 || i == 1 ) 
		{
			n1 = n2;
			pos = i;
		}
	}
	
	System.out.println( "Résultat : Le plus grand nombre est " + n1 + " à la position :" + pos );

}
}
