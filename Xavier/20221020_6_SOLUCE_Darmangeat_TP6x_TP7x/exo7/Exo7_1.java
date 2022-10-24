package part07_technique_rusee;

/* ----------------------------------------------------
Exercice 7.1
Ecrivez un algorithme qui permette de saisir un nombre
quelconque de valeurs, et qui les range au fur et � mesure
dans un tableau. Le programme, une fois la saisie termin�e, 
doit dire si les �l�ments du tableau sont tous cons�cutifs ou non.

Par exemple, si le tableau est : 12 - 13 - 14 - 15 - 16 - 17 - 18, 
ses �l�ments sont tous cons�cutifs. Si le tableau est :
9 - 10 - 11 - 15 - 16 - 17, ses �l�ments ne sont pas tous cons�cutifs.
------------------------------------------------------*/

public class Exo7_1
{
public static void main(String[] args)
	{
	

	int T = 0;																

	//int[] tab = {16,18,15,9,11,10,17};
	
	int[] tab = {9,10,11,12,13,14,15};

	
	/*System.out.println("Entrez le nb de notes que vous souhaitez saisir:");

	T = (new java.util.Scanner(System.in)).nextInt();
	int[] tab=new int[T];
		
	System.out.println("\nSaisie du tableau");
	for ( int i=0 ; i< T ; i++ ) 
	{
			System.out.println("Saisir la valeur n�"+(i+1)+":");
			tab[i]=(new java.util.Scanner(System.in)).nextInt();
	}*/
	
	// ---------------- Verification de l'ordre du tableau ---------
	
	
	boolean flag=true;
	//
	for ( int i=0; (i < (tab.length-1))&& flag == true  ; i++ )
	{
		
		//if( tab[i] == (tab[i+1]-1) )//alors cons�cutif
		if( tab[i] != (tab[i+1]-1) )
			flag = false;

	}

	if ( flag == true )
		System.out.println("nombres consecutifs");
	else
		System.out.println("nombres non consecutifs");
	
	 }
}
