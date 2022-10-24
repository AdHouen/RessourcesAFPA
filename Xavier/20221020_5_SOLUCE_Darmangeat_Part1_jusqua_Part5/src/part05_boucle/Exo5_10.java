package part05_boucle;

/* ----------------------------------------------------

Ecrire un algorithme qui permette de conna�tre ses chances
de gagner au tierc�, quart�, quint� et autres imp�ts volontaires.

On demande � l�utilisateur le nombre de chevaux partants, 
et le nombre de chevaux jou�s. Les deux messages affich�s devront �tre :

Dans l�ordre : une chance sur X de gagner
Dans le d�sordre : une chance sur Y de gagner

X et Y nous sont donn�s par la formule suivante, si n est le nombre
de chevaux partants et p le nombre de chevaux jou�s :

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
	System.out.println("Entrez le nombre de chevaux jou�s :");
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
