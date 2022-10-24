package part05_boucle;

/* ----------------------------------------------------
Exercice 5.9
Lire la suite des prix (en euros entiers et terminée par zéro) des
achats d'un client. Calculer la somme qu'il doit, lire la somme
qu'il paye, et simuler la remise de la monnaie en affichant les
textes « 10 E », « 5 E » et « 1 E » autant de fois qu'il y a de
coupures de chaque sorte à rendre.
------------------------------------------------------*/
/*SOLUTION pseudo-Code
Variables FF, somdue, M, IPG, Reste, Nb10F, Nb5F En Entier
Debut
FF ← 1
somdue ← 0
TantQue FF <> 0
   Ecrire “Entrez le montant : ”
   Lire FF
    somdue ← somdue + FF
FinTantQue
Ecrire “Vous devez :”, FF, “ francs”
Ecrire ”Montant versé :”
Lire M
Reste ← M - FF
Nb10F ← 0
TantQue Reste >= 10
    Nb10F ← Nb10F + 1
    Reste ← Reste – 10
FinTantQue
Nb5F ← 0
Si Reste >= 5
    Nb5F ← 1
    Reste ← Reste – 5
FinSi
Ecrire “Rendu de la monnaie :”
Ecrire “Pièces de 10 F : ”, Nb10F
Ecrire “Pièces de  5 F : ”, Nb5F
Ecrire “Pièces de  1 F : ”, reste
Fin*/

public class Exo5_9
{
public static void main(String[] args)
{
	int somme=0,prix=0,paye,reste;
	
	int dix=0;
	int cinq=0;
	int un=0;
	
	do
	{
		System.out.println("Veuillez entrer le prix de l'article :");
		//prix = (new java.util.Scanner(System.in)).nextInt();
		prix = 63;
		somme = somme + prix;
	}
	while ( prix == 0 );
	
	System.out.println("Payez le montant de " + somme + " euros, SVP.\n\nQuelle somme donnez vous ??:\n");
	//paye = (new java.util.Scanner(System.in)).nextInt(); //somme donnée par le client
	paye = 100;
	somme = paye - somme;			//somme devient le rendu
	
	
	if ( somme >= 10 )
	{
		reste = somme % 10;
		dix = (somme-reste)/10;		// nombre de billet de dix a rendre
		
		somme = reste;
	}

	if ( somme >= 5 )
	{
		reste = somme % 5;
		cinq = (somme-reste)/5;		// nombre de billet de cinq a rendre
		
		un = reste;					// nombre de billet de un a rendre
	}
	else
		un = somme;

	System.out.println("A rendre: \n\n"+dix+" billet(s)de 10E \n"+cinq+" billet(s) de 5E\n"+un+" billet(s) de 1E");
}
}
