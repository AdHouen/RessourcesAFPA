package part04_encore_logique;

import java.util.Scanner;

/*Formulez un algorithme équivalent à l’algorithme suivant :
Si Tutu > Toto + 4  OU Tata = “OK“ Alors
    Tutu ← Tutu + 1
Sinon
    Tutu ← Tutu – 1
Finsi*/
public class Exo4_1
{
	public static void main(String[] args)	
	{
		int toto, tutu;
		String tata;
		Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println(" entrer la chaine  \"ok\" ou \"non\"  ");
		tata = sc.nextLine();		
		System.out.println(" entrer la valeur entière de toto  ");		
		toto = sc.nextInt();		
		System.out.println(" entrer la valeur entière de tutu (sup à toto +4)  ");				
		tutu = sc.nextInt();
				
		// NON! : if((toto +4)< tutu || (tata == "ok"))  
		if((toto +4)< tutu || (tata.equals("ok")))
		{			
			tutu++;// tutu = tutu + 1 ; tutu += 1
		}
		else
		{
			tutu--;
		}

		System.out.printf(" tutu (incrementé ou décrémenté) à la valeur %d ", tutu);
		
		System.out.println();
		
		//System.out.println("Appuyer sur une la touche Entrée pour quitter ");		
		//sc.nextLine();
		sc.close();
	}
}