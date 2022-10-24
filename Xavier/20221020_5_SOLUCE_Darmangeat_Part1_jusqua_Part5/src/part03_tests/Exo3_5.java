package part03_tests;

/* ----------------------------------------------------

EXERCICE 3.5

------------------------------------------------------*/
/*Ecrire un algorithme qui demande deux nombres à l’utilisateur et
l’informe ensuite si le produit est négatif ou positif
(on inclut cette fois le traitement du cas où le produit peut être nul).
Attention toutefois, on ne doit pas calculer le produit !*/

public class Exo3_5
{
public static void main(String[] args)
	{
	int in1=0;	int in2=0;
	
	System.out.println("Entrez un nombre: ");
	in1=(new java.util.Scanner(System.in)).nextInt();
	System.out.println("Entrez un 2e nombre: ");
	in2=(new java.util.Scanner(System.in)).nextInt();
	
	if ((in1>0 && in2>0) || (in1<0 && in2<0 )) {
		System.out.println("Le produit des 2 nombres est positif");
	}
	else if (in1==0 || in2==0)
		System.out.println("Le produit des 2 nombres est nul");
	else
		System.out.println("Le produit des 2 nombres est negatif");
	}
}
