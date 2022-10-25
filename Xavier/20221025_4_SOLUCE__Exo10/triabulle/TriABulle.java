package exo10.triabulle;

import fr.afpa.outils.*;

/**
 * Objectif: Les tableaux
 *
 * Trie � bulle
 *
 * @author Afpa
 * @version 1.0
 */ 

public class TriABulle 
{
	
	static String [] tabChaine = new String [10] ;
	static int lastItem = 0;
	
	public static void main (String arg [])
	{
		System.out.println ("\nSaisie des chaines (" + tabChaine.length + " max) terminee par \"*\"\n");
		saisir();
		System.out.println ("\n\nTrie des chaines");			
		trier();
		afficher();
	}
	
	static void saisir ()
	{
		for (int i=0; i<tabChaine.length; i++) {
			System.out.print ("\tChaine " + i + "\t: ");
			tabChaine[i] = Console.in.readLine();
			if (tabChaine[i].equals("*")) break;
			lastItem ++;
		}
	}
	
	static void trier ()
	{
		for (int j=lastItem - 1; j>0; j--) {
			for (int i=lastItem - 1; i>0; i--) {
				if (tabChaine[i].compareTo(tabChaine[i-1]) < 0) {
					String local = tabChaine[i];
					tabChaine[i] = tabChaine[i-1];
					tabChaine[i-1] = local;
				}
			}
		}		
	}
	
	static void afficher ()
	{
		System.out.println ("\nAffichage des chaines triees");
		for (int i=0; i<tabChaine.length +1; i++) 
			System.out.println ("\t" + tabChaine[i]);
	}
}

