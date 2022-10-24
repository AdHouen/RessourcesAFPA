package part03_tests;

/*
-------------
EXERCICE 3.1
-------------
Demande à l'utilisateur de saisir un nombre et on dit s'il est 
positif ou négatif (ne tient pas compte du cas où nombre = 0) 
*/
public class Exo3_1_NombrePosNeg
{
	
	
	private enum CouleurFeuTricolor{
		VERT,
		ROUGE,
		ORANGE
	}
	public static void main (String[] args)
	{
		/* Déclaration de variable */
		int nb = 0;

		System.out.println ("Entrez un nombre :");
		nb = (new java.util.Scanner(System.in)).nextInt();

		/* Test si nombre est positif ou négatif : */
		if (nb > 0)
		{
			System.out.printf ("%d est un nombre positif\n",nb);
		}
		else if (nb < 0)
		{
			System.out.printf ("%d est un nombre négatif\n",nb);
		}
		else if (nb == 0)
		{
			System.out.println ("Le zero est ni positif ni négatif");
		}
		else
		{
			//throw new RuntimeException("pb: résultat inattendu");
			System.out.println ("pb: résultat inattendu");

		}
		
		System.out.println();
		System.out.println("\n\n\n");

		
		
		char character= 'v';//couleur verte au feu tricolor
		
		switch (character)
		{

//			System.out.println("je m'arrête");
//			break;
		case 'o':
		case 'r':
			System.out.println("je m'arrête");

			break;
		case 'v':
			System.out.println("j'avance");
			break;
		default:
			System.out.println("pb: résultat inattendu");	
		
		}
		
		CouleurFeuTricolor feu = CouleurFeuTricolor.ROUGE;
		switch (feu)
		{
		case ROUGE:
			System.out.println("je m'arrête");
			break;
		}
		
		String chaine = "valeur1";
		switch (chaine)
		{
		case "valeur1":
			System.out.println("je m'arrête");
			break;
		}
		
	}
}
