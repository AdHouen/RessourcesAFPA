package part02_lecture_ecriture;

import java.util.Scanner;

/*
--------------
Exercice 2.3
--------------
Ecrire un programme qui lit le prix HT d’un article, 
le nombre d’articles et le taux de TVA, et qui fournit 
le prix total TTC correspondant. Faire en sorte que des 
libellés apparaissent clairement
*/
public class Exo2_3_ArticlesTaxes
{
	public static void main (String[] args)
	{
	/* Déclaration des variables */
	int prixArtHT ;		// prix d'un article hors taxe
	int nbArt ;    		// nombre d'article(s)
	int prixTotalArtHT ;	// prix des articles hors taxe
	float tauxTVA ;	// taux TVA
 //	int tauxTVA = 19 ;	// taux TVA
	float PrixTotalArtTTC ;	// prix article(s) TTC
	
	Scanner sc = new java.util.Scanner(System.in);

	System.out.println ("Quel est le prix hors taxe d'un article? :");
	prixArtHT = sc.nextInt();

	System.out.println ("Combien y a-t-il d'articles? :");
	nbArt = sc.nextInt();

	System.out.println ("Quel est le taux de la TVA? :");
	tauxTVA = sc.nextFloat();
	
	System.out.println ();
	
	prixTotalArtHT = prixArtHT * nbArt ;
	PrixTotalArtTTC = ((prixTotalArtHT * tauxTVA)/100) + prixTotalArtHT ;
	System.out.printf("Le prix total TTC pour %d articles est %.2f",nbArt,PrixTotalArtTTC);
	
	sc.close();
	}
}