package exo6;

/* ----------------------------------------------------

Exercice 6.11

Toujours à partir de deux tableaux précédemment saisis,
écrivez un algorithme qui calcule le schtroumpf des deux tableaux.
Pour calculer le schtroumpf, il faut multiplier chaque élément du
tableau 1 par chaque élément du tableau 2, et additionner le tout. 

Exemple : 

Tableau 1 :                     4 – 8 – 7  - 12
Tableau 2 :                     3 – 6 
Le Schtroumpf :
3*4 + 3*8 + 3*7 + 3*12 + 6*4 + 6*8 + 6*7 + 6*12 = 279


------------------------------------------------------*/

public class Exo6_11
{
public static void main(String[] args)
	{
	

	int T1,T2;	//Constantes du nb de valeur des tableau
	

	System.out.println("Entrez le nb de valeur que vous souhaitez saisir dans le tableau 1:");

	T1=(new java.util.Scanner(System.in)).nextInt();
	
	System.out.println("Entrez le nb de valeur que vous souhaitez saisir dans le tableau 2:");
	T2=(new java.util.Scanner(System.in)).nextInt();
	

	int[] tab1=new int[T1];
	int[] tab2=new int[T2];
	
	//boucle d entrée des valeurs du tableau1
	System.out.println("\nSaisie du tableau n°1\n");
	for ( int i=0 ; i< T1 ; i++ ) 
			{
			System.out.println("Saisir la valeur n°"+(i+1));
			tab1[i]=(new java.util.Scanner(System.in)).nextInt();
			}
	

	//boucle d entrée des valeurs du tableau2 

	System.out.println("\nSaisie du tableau n°2\n");
	for ( int i=0 ; i< T2 ; i++ ) 			
			{
			System.out.println("Saisir la valeur n°"+(i+1));
			tab2[i]=(new java.util.Scanner(System.in)).nextInt();
			}



int schtroumpf=0;

for (int i=0 ; i < T1 ; i++ ) 	
		{
		for (int j=0 ; j < T2 ; j++ )
				{
				schtroumpf=schtroumpf+tab1[i]*tab2[j];
				}
		}

System.out.println("\nLe Schtroumpf est :"+schtroumpf);

	 }
}
