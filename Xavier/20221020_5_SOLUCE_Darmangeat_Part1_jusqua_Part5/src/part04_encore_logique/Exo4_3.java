package part04_encore_logique;
/* ----------------------------------------------------

EXERCICE 4.3 LE 03/06/04 

------------------------------------------------------*/
/*De même que le précédent, cet algorithme doit demander une heure et en afficher une autre.
 * Mais cette fois, il doit gérer également les secondes, et afficher l'heure qu'il sera
 *  une seconde plus tard.
Par exemple, si l'utilisateur tape 21, puis 32, puis 8, l'algorithme doit répondre :
"Dans une seconde, il sera 21 heure(s), 32 minute(s) et 9 seconde(s)".
NB : là encore, on suppose que l'utilisateur entre une date valide.*/

/*SOLUTION pseudo-Code
 Variables h, m, s en Entier
Début
Ecrire “Entrez les heures, puis les minutes, puis les secondes : ”
Lire h, m, s
s ← s + 1
Si s = 60 Alors
     s ← 0
     m ← m + 1
FinSi
Si m = 60 Alors
     m ← 0
     h ← h + 1
FinSi
Si h = 24 Alors
     h ← 0
FinSi
Ecrire “Dans une seconde il sera ”, h, “heure(s)”, m, “minute(s) et ”, s, “seconde(s)”
Fin*/

public class Exo4_3
{
public static void main(String[] args)
	{
	

	int iheure=0;
	int imin=0;
	int isec=0;
	
	System.out.println("Entrez la seconde precise :");
	isec=(new java.util.Scanner(System.in)).nextInt();
	System.out.println("Entrez la minute precise :");
	imin=(new java.util.Scanner(System.in)).nextInt();
	System.out.println("Entrez l'heure precise :");
	iheure=(new java.util.Scanner(System.in)).nextInt();
	
	isec++;
	if (isec==60)
	{
		isec=0;
		imin++;
		if (imin==60)
		{
			imin=0;
			iheure++;
			if (iheure==24)
				iheure=0;
		}
	}
	
	System.out.println("Dans 1 seconde il sera exactemment :" +
					iheure + "h  " + imin + "'  " + isec + "\"");
	}
}
