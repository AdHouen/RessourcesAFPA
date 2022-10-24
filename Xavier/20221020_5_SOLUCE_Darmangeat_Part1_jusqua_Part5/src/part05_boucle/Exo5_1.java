package part05_boucle;

import java.util.Scanner;
import javax.swing.JOptionPane;
/* ----------------------------------------------------

Exercice 5.1
Ecrire un algorithme qui demande à l’utilisateur un nombre compris entre 1 et 3
 jusqu’à ce que la réponse convienne.
------------------------------------------------------*/
/*SOLUTION pseudo-Code
Variable N en Entier
Debut
N ← 0
Ecrire “Entrez un nombre entre 1 et 3”
TantQue N < 1 ou N > 3
   Lire N
   Si N < 1 ou N > 3 Alors
       Ecrire “Saisie erronée. Recommencez”
   FinSi
FinTantQue
Fin*/

public class Exo5_1
{
public static void main(String[] args)
{
	int nb=0;
	Scanner sc = new java.util.Scanner(System.in);
	while ( nb<1 || nb>3 )
	{
		System.out.print("Veuillez entrer un nombre entre 1 et 3:");
		nb=sc.nextInt();
		System.out.println("valeur entrée :");

	}
	System.out.println("Merci et au revoir");
	
	
	int i=0 ;	

	
	boolean drapeau = true;//flag
	while (i <4 && drapeau)
	{
		System.out.println("valeur de i :"+ i);
		
		if( i==2) {
			drapeau = false;
		}
			//continue;
			//break;
		
		i = i +1;
	}
	
	
	//JOptionPane fenetre;
	String chaine = JOptionPane.showInputDialog("Entrez un entier");
	
	if(chaine != null) {
		int entier = Integer.parseInt(chaine);
		System.out.println("valeur de l'entier :" + entier);
	}
	else
		System.out.println("je sors du programme");
/*	while (i <4 )
	{
		System.out.println("valeur de i :"+ i);
		
		if( i==2)
			break;
		
		i = i +1;
	}*/
	


/*	do
	{
		System.out.println("valeur de i :"+ i);
		
		
		i = i +1;
	}while (i <4);*/
	//int j ;	

/*	for(i = 0, j=2 ; i <4  ;i = i +1, j = j -4)
	{
		System.out.println("valeur de i :"+ i);

	}*/
	
	}
	
	
	

}
