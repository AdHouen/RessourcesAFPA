package part05_boucle;

/* ----------------------------------------------------
Exercice 5.2
Ecrire un algorithme qui demande un nombre compris entre 10 et 20,
jusquà ce que la réponse convienne. 
En cas de réponse supérieure à 20, on fera apparaître un message : 
« Plus petit ! », et inversement, « Plus grand ! » si le nombre 
est inférieur à 10.
------------------------------------------------------*/
/*SOLUTION pseudo-Code
Variable N en Entier
Debut
N ← 0
Ecrire “Entrez un nombre entre 10 et 20”
TantQue N < 10 ou N > 20
   Lire N
   Si N < 10 Alors
       Ecrire “Plus grand !”
    SinonSi N > 20 Alors
         Ecrire “Plus petit !”
   FinSi
FinTantQue
Fin*/

public class Exo5_2
{
public static void main(String[] args)
{
	int nb;
	
	System.out.println("Veuillez entrer un nombre entre 10 et 20");
	nb = (new java.util.Scanner(System.in)).nextInt();
	
	while (nb<10 || nb>20)
	{
		if (nb<10 ) 
		{
			System.out.println("Plus GRAND !! :");
		}
		else
			System.out.println("Plus petit !! :");
		
		nb=(new java.util.Scanner(System.in)).nextInt();
	}
	System.out.println("Merci et au revoir");

}
}
