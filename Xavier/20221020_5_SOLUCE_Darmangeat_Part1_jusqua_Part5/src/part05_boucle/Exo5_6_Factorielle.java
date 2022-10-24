package part05_boucle;

import java.util.Scanner;

/* ----------------------------------------------------
Exercice 5.6
Ecrire un algorithme qui demande un nombre de départ,
et qui calcule sa factorielle.
NB : la factorielle de 8, notée 8 !, vaut  1 x 2 x 3 x 4 x 5 x 6 x 7 x 8
------------------------------------------------------*/
/*SOLUTION pseudo-Code
Variables N, i, F en Entier
Debut
Ecrire “Entrez un nombre : ”
Lire N
F ← 1
Pour i ← 2 à N
    F ← F * i
i Suivant
Ecrire “La factorielle est : ”, F
Fin*/

public class Exo5_6_Factorielle
{
public static void main(String[] args)
{
	int  nb, fact=1, i;
	
	System.out.println("Veuillez entrer un nombre");
	Scanner sc = new java.util.Scanner(System.in);
	nb = sc.nextInt();
	//nb = (new java.util.Scanner(System.in)).nextInt();

	
	for ( i=1 ; i <= nb ; i++ )
	{
		fact = fact * i;
	}

	System.out.println("La factorielle de " + nb + " est:" + fact);		
	sc.close();
}
}
