package part03_tests;


/*
Exercice 3.2

Ecrire un algorithme qui demande deux nombres à l’'utilisateur et 
l’'informe ensuite si leur produit est négatif ou positif 
(on laisse de côté le cas où le produit est nul). 
Attention toutefois : on ne doit pas calculer le produit des deux nombres.
*/

public class Exo3_2_ProduitPosNeg
{
public static void main(String[] args)
	{
	int in1=0;int in2=0;
	
	System.out.println("Entrez un nombre: ");
	in1=(new java.util.Scanner(System.in)).nextInt();
	System.out.println("Entrez un 2e nombre: ");
	in2=(new java.util.Scanner(System.in)).nextInt();
	
	if ( (in1>0 && in2>0) || (in1<0 && in2<0 ) ) 
		System.out.println("Le produit des 2 nombres est positif");
	else
		System.out.println("Le produit des 2 nombres est negatif");
	}
}
