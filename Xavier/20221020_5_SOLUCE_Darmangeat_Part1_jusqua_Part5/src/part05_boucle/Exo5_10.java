package part05_boucle;

/* ----------------------------------------------------

Ecrire un algorithme qui permette de connaître ses chances
de gagner au tiercé, quarté, quinté et autres impôts volontaires.

On demande à l’utilisateur le nombre de chevaux partants, 
et le nombre de chevaux joués. Les deux messages affichés devront être :

Dans l’ordre : une chance sur X de gagner
Dans le désordre : une chance sur Y de gagner

X et Y nous sont donnés par la formule suivante, si n est le nombre
de chevaux partants et p le nombre de chevaux joués :

X = n ! / (n - p) !
Y = n ! / (p ! * (n - p) !)


------------------------------------------------------*/

public class Exo5_10
{
public static void main(String[] args)
{
	int n,p,X,Y;
	
	System.out.println("Entrez le nombre de chevaux partants :");
	n=(new java.util.Scanner(System.in)).nextInt();
	System.out.println("Entrez le nombre de chevaux joués :");
	p=(new java.util.Scanner(System.in)).nextInt();
	
	X=Factorielle(n)/Factorielle((n-p));
	Y=Factorielle(n)/(Factorielle(p)*Factorielle((n-p)));
	
	System.out.println("Vous avez:\nDans l'ordre : une chance sur "+X+" de gagner");
	System.out.println("Dans le desordre : une chance sur "+Y+" de gagner");

}

// METHODE FACTORIELLE
private static int Factorielle ( int i )
{
	int fact=1;
	for ( int f=2 ; f <= i ; f++ ) fact=fact*f;
	return fact;
}

}
