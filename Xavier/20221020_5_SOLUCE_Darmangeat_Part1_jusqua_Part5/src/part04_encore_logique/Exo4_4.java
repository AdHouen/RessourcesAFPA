package part04_encore_logique;

//EXERCICE 4.4 LE 03/06/04 
//------------------------------------------------------
/*Un magasin de reprographie facture 0,10 E les dix premières photocopies,
 0,09 E les vingt suivantes et 0,08 E au-delà.
Ecrivez un algorithme qui demande à l’utilisateur le nombre de photocopies effectuées et
 qui affiche la facture correspondante.
*/
/*SOLUTION pseudo-Code
Variable n en Entier
Variable p en Réel
Début
Ecrire “Nombre de photocopies : ”
Lire n
Si n <= 10 Alors
    p ← n * 0,1
SinonSi n <= 30
    p ← 10 * 0,1 + (n – 10) * 0,09
Sinon
    p ← 10 * 0,1 + 20 * 0,09 + (n – 30) * 0,08
FinSi
Ecrire “Le prix total est : ”, p
Fin*/
public class Exo4_4
{
public static void main(String[] args)
{
	int nb=0;
	float prix=0;
	
	System.out.println("Entrez le nombre de vos photocopies :");
	nb = (new java.util.Scanner(System.in)).nextInt();
	
	if (nb <= 10)
		prix = nb * 0.10F;
	else if (nb <= 30)
		prix = 10*0.10F +0.09F*(nb-10);
	else
		prix = 10*0.10F + 20*0.09F + 0.08F*(nb-30);
	
	System.out.println("Voici le montant: " + prix +" E");	
}
}
