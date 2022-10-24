package part05_boucle;
/* ----------------------------------------------------
Exercice 5.8
Réécrire lalgorithme précédent, mais cette fois-ci on ne connaît
pas davance combien lutilisateur souhaite saisir de nombres.
La saisie des nombres sarrête lorsque lutilisateur entre un zéro.
------------------------------------------------------*/
/*SOLUTION pseudo-Code
Variables N, i, PG, IPG en Entier
Debut
N ← 1
i ← 0
PG ← 0
TantQue N <> 0
   Ecrire “Entrez un nombre : ”
   Lire N
    i ← i + 1
   Si i = 1 ou N > PG Alors
         PG ← N
         IPG ← i
   FinSi
FinTantQue
Ecrire “Le nombre le plus grand était : ”, PG
Ecrire “Il a été saisi en position numéro ”, IPG
Fin*/

public class Exo5_8
{
public static void main(String[] args)
{
	int n1=0,n2=1,pos=0,i=0;
	System.out.println("Cette application vous demande la saisie successive de 20 nombres.");
	System.out.println("Comme résultat, elle vous affiche le plus grand nombre.");
	System.out.println("Pour arrêter la saisie, entrez 0 ");
	System.out.println();
	while ( n2 != 0)
	{
		i++;
		System.out.println("Veuillez entrer un nombre:");
		n2=(new java.util.Scanner(System.in)).nextInt();
		if ( n1 < n2 || i==1 ) 
		{
			n1=n2;
			pos=i;
		}	
	}
	
	System.out.println("Le plus grand nombre entré est: " + n1 + " à la position : " + pos );

}
}
