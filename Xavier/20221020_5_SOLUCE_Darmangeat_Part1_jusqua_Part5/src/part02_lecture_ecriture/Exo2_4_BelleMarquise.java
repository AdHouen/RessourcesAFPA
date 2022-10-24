package part02_lecture_ecriture;

/*
---------------
Exercice 2.4
---------------
Ecrire un algorithme utilisant des variables de type chaîne de caractères, 
et affichant quatre variantes possibles de la célèbre « belle marquise, 
vos beaux yeux me font mourir d’amour ». On ne se soucie pas de la ponctuation, 
ni des majuscules.
*/
public class Exo2_4_BelleMarquise
{
	public static void main (String[] args)
	{
		/* Déclaration des variables */
		String p1 = "belle marquise" ;
		String p2 = "vos beaux yeux";
		String p3 = "me font mourir";
		String p4 = "d'amour";
	
		/* Affiche 4 variantes de la phrase d'origine : */
		System.out.printf ("Voici 4 variantes de la phrase :\n\t%s  %s  %s  %s",p1,p2,p3,p4);
		System.out.printf ("\n\t%s  %s  %s  %s",p4,p1,p2,p3);
		System.out.printf ("\n\t%s  %s  %s  %s",p3,p4,p1,p2);
		System.out.printf ("\n\t%s  %s  %s  %s",p2,p3,p4,p1);
		System.out.println();
		System.out.printf ("\n\t%s  %s  %s  %s",p2,p1,p3,p4);
		System.out.printf ("\n\t%s  %s  %s  %s",p1,p2,p4,p3);
		System.out.println();
		System.out.printf ("\n\t%s  %s  %s  %s",p2,p1,p4,p3);

	}
}