package exo6;

/* ----------------------------------------------------

Exercice 6.13

Ecrivez un algorithme permettant, toujours sur le m�me principe,
� l�utilisateur de saisir un nombre d�termin� de valeurs. 
Le programme, une fois la saisie termin�e, renvoie la plus grande
valeur en pr�cisant quelle position elle occupe dans le tableau. 
On prendra soin d�effectuer la saisie dans un premier temps, 
et la recherche de la plus grande valeur du tableau dans
un second temps.


------------------------------------------------------*/

public class Exo6_13
{
public static void main(String[] args)
	{
	

	int T;																
	System.out.println("Entrez le nb de valeur que vous souhaitez saisir dans vos tableaux:");

	T=(new java.util.Scanner(System.in)).nextInt();
	

	int[] tab=new int[T];
	
	
	System.out.println("\nSaisie du tableau");
	for ( int i=0 ; i< T ; i++ ) 
			{
			System.out.println("Saisir la valeur n�"+(i+1));
			tab[i]=(new java.util.Scanner(System.in)).nextInt();
			}
	
	
	int max=tab[0];
	int pos=0;
	
	for ( int i=0 ; i < T ; i++ ) 
			{
			if ( max < tab[i] )
				{
				max=tab[i];
				pos=i;
				}
			}
	
System.out.println("\nLe plus grand nombre entr� est: "+max+" a la position: "+(pos+1));
	
			
		
	 }
}
