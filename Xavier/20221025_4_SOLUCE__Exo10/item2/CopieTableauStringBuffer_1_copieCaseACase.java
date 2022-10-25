package exo10.item2;
/**
 * Objectif: Les tableaux
 * Copie de tableaux de chaines mutables
 * Copie case � case (des r�f�rences)
 * @author AFPA
 */ 
public class CopieTableauStringBuffer_1_copieCaseACase 
{
public static void main (String arg [])
{
//tableau d'origine
StringBuffer[] tabOrg = {	new StringBuffer("Hello"),
				new StringBuffer("Salut"),
				new StringBuffer("Bonjour") };
						 
//r�f�rence tableau destination
StringBuffer[] tabDest;

//Cr�ation d'un tableau de m�me dimension
tabDest = new StringBuffer [tabOrg.length];

//recopie case � case
for (int i=0; i<tabDest.length; i++)
	tabDest[i] = tabOrg[i];
		
/*if( tabOrg instanceof Cloneable)
	System.out.println("L'objet est clonable");
else 
	System.out.println("L'objet n'est pas clonable");

tabDest = tabOrg.clone();*/

//Affichage des 2 tableaux avant modification
System.out.println ("\nTableau d'origine");
for (int i=0; i<tabOrg.length; i++)
	System.out.print (" - " + tabOrg[i]);
System.out.println ("\nTableau de destination");
for (int i=0; i<tabDest.length; i++)
	System.out.print (" - " + tabDest[i]);

//Modification du tableau origine:On force le premier caract�re � '*'
System.out.println ("\n\nAjoute une * devant chaque chaine de tabOrg");
for (int i=0; i<tabOrg.length; i++)
	tabOrg[i].setCharAt(0, '*');
//REMARQUE: Le tri avec la m�thode Arrays.sort n'est pas possible 
//car StringBuffer n'impl�mente pas l'interface Comparable
//////////////////////////////////////////////////////////////////
//IMPOSSIBLE ! //Arrays.sort(tabOrg);//IMPOSSIBLE


//Affichage des 2 tableaux apr�s modification
System.out.println ("\nTableau d'origine");
for (int i=0; i<tabOrg.length; i++)
	System.out.print (" - " + tabOrg[i]);
System.out.println ("\nTableau de destination");
for (int i=0; i<tabDest.length; i++)
	System.out.print (" - " + tabDest[i]);

///////////////////////////////////
// Affichage  Console
///////////////////////////////////
//Tableau d'origine
//- Hello - Salut - Bonjour
//Tableau de destination
//- Hello - Salut - Bonjour
//
//Ajoute une * devant chaque chaine de tabOrg
//
//Tableau d'origine
//- *ello - *alut - *onjour
//Tableau de destination
//- *ello - *alut - *onjour
}}

