package part04_encore_logique;
/*
Cet algorithme est destiné à prédire l'avenir, et il doit être infaillible !
Il lira au clavier l’heure et les minutes,  et il affichera l’heure qu’il sera une minute plus tard.
Par exemple, si l'utilisateur tape 21 puis 32, l'algorithme doit répondre : "Dans une minute, il sera 21 heure(s) 33".
NB : on suppose que l'utilisateur entre une heure valide. Pas besoin donc de la vérifier
*/
/*SOLUTION pseudo-Code
 Variables h, m en Entier
Début
Ecrire “Entrez les heures, puis les minutes : ”
Lire h, m
m ← m + 1
Si m = 60 Alors
     m ← 0
     h ← h + 1
FinSi
Si h = 24 Alors
     h ← 0
FinSi
Ecrire “Dans une minute il sera ”, h, “heure(s) ”, m, “minute(s)”
Fin */
public class Exo4_2
{
	
	public static void main(String[] args)	
	{
		
		int heure, minute;
		
		System.out.println("veillez entrer l'heure svp ");
		heure = (new java.util.Scanner(System.in)).nextInt();
		
		System.out.println("veillez entrer les minutes svp ");				
		minute = (new java.util.Scanner(System.in)).nextInt();
		
		if(minute < 59) 
		{			
			minute++;
			System.out.printf(" Dans une minute, il sera %d heure(s) %d ", heure,minute);			
		}
		else
		{
			minute = 0;			
			if(heure<23)
			{
				heure++;				
				System.out.printf(" Dans une minute, il sera %d heure(s) %d minute", heure,minute);
			}
			else
			{
				heure = 0;				
				System.out.printf(" Dans une minute, il sera %d heure(s) %d minute", heure,minute);
			}
		}
		
		System.out.println(" ");		
		System.out.println("Appuyez sur une la touche Entrée pour quitter svp ");		
		new java.util.Scanner(System.in).nextLine();
	}
}