package exo10.item3;

import fr.afpa.outils.Console;

/**
 * Objectif: Les tableaux
 *
 * Calculs statistiques
 *
 * @author AFPA
 * @version 1.0
 */ 

public class Statistiques 
{
	static final int MAX_NOTE = 10;
	static float [] tabNotes; // On pourrait l'appeler notes
	static float moyenne;
	static char rep;
	
/**
 * Niveau 1
 * Saisie au clavier des 10 notes maximum
 * La saisie d'une note nulle termine la saisie
 */ 
	public static void saisirNotes ()
	{
		int i = 0;
		tabNotes = new float [MAX_NOTE];

		System.out.println ("\nSaisir les notes et terminer par 0 (" + MAX_NOTE + " max) ");
		do {
			System.out.print ("\tNote #" + (i+1) + "\t\t");
			
			tabNotes[i++] = Console.in.readFloat();
			
		} while (i < MAX_NOTE && tabNotes[i-1] != 0);
			
	}

/**
 * Niveau 1
 * Calcul de la moyenne des N notes significatives
 */ 
	public static void calculerMoyenne ()
	{
		int i = 0;
		float somme = 0;
	
		while (i < MAX_NOTE && tabNotes[i] != 0)
		{
				somme += tabNotes[i++];
		} 
		
		moyenne = somme / i;	
	}


/**
 * Niveau 1
 * Tri � bulle du tableau 
 */ 
	public static void trierTableau ()
	{
		int x = 0;
		
		while (x < MAX_NOTE && tabNotes[x] != 0)
		{
			int i =  1;
			
			while (i < MAX_NOTE && tabNotes[i] != 0)
			{
				if (tabNotes[i-1] > tabNotes[i])
				{
					float local = tabNotes[i];
					tabNotes[i] = tabNotes[i-1];
					tabNotes[i-1]= local;
				}
				
				i++;
			}
			
			x++; 
		}
	}


/**
 * Niveau 1
 * Affiche 	la note case 0 (Valeur mini)
 *				la note de la derni�re case N significative (Valeur maxi)
 *				la note de la case N/2 (M�diane)
 *          la moyenne
 */ 
	public static void afficherResultats ()
	{
		int i=0;
		
		while (i < MAX_NOTE && tabNotes[i] != 0 )
			i++;
		System.out.println ("\nLa moyenne est de " + moyenne);
		System.out.println ("\nLa valeur min est " + (( i == 0) ? Float.NaN : tabNotes[0]));
		System.out.println ("\nLa valeur max est " + (( i == 0) ? Float.NaN : tabNotes[i-1]));
		System.out.println ("\nLa mediane est    " + (( i == 0) ? Float.NaN : tabNotes[(i-1)/2]));
	}
	

/**
 * Niveau 1
 * Affiche sur la sortie standard une question et attend la r�ponse
 * O ou N depuis l'entr�e standard
 */ 
	public static void testerFin ()
	{
		do {
			System.out.print ("\nUne autre saisie (O/N) : ");
			rep = Console.in.readChar();
			rep = Character.toUpperCase (rep);
		} while ( rep != 'O' && rep != 'N');
	}

	public static void main (String arg [])
	{		
		System.out.println ("\nAPPLICATION STATISTIQUE");
		do {
			saisirNotes();
			calculerMoyenne();
			trierTableau();
			afficherResultats ();
			testerFin ();
		} while (rep != 'N');
	}

}
