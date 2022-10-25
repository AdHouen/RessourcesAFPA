package exo10.item1;
import java.util.Arrays;
/**
 * Objectif: Les tableaux
 * Copie de tableaux de primitif entier
 * @author AFPA
*/ 
public class CopieTableauEntier 
{
public static void main (String arg [])
{
//int [] tab1 = {1,2,3,4,5,6,7,8,9,10};
int [] tab1 = {10,9,8,7,6,5,4,3,2,1};
int [] tab20Int = new int[20];

//transfert des 10 entiers dans 10 case du tableau cible
for (int i=0; i<tab1.length; i++)
	tab20Int[i+5] = tab1[i];

//Affichage des 2 tableaux tab1 et tab20Int
System.out.println ("\nPetit Tableau");
for (int i=0; i<tab1.length; i++)
	System.out.print (" " + tab1[i]);

System.out.println ("\nGrand Tableau");
for (int i=0; i<tab20Int.length; i++)
	System.out.print (" " + tab20Int[i]);

System.out.println ("\n");


///////////////////////////////////////////////////////////
//Ajoute 10 dans les cases du petit tableau d'entier tab1
///////////////////////////////////////////////////////////
System.out.println ("\n\nAjoute 10 dans les cases du tableau d'entier");
for (int i=0; i<tab1.length; i++)
	tab1[i] += 10;


//Affichage des 2 tableaux tab1 et tab20Int
System.out.println ("\nPetit Tableau");
for (int i=0; i<tab1.length; i++)
	System.out.print (" " + tab1[i]);

System.out.println ("\nGrand Tableau");
for (int i=0; i<tab20Int.length; i++)
	System.out.print (" " + tab20Int[i]);

System.out.println ("\n");


///////////////////////////////////////////////////////////
//On clone le Petit Tableau tab1 vers tab3
///////////////////////////////////////////////////////////
System.out.println ("\n\nOn clone le Tableau tab1 dans tab3");
int [] tab3 = tab1.clone();
System.out.println ("Le Tableau tab3");
for (int i=0; i<tab3.length; i++)
	System.out.print (" " + tab3[i]);

System.out.println ("\n\nOn trie le Tableau tab1");
Arrays.sort( tab1 );


//Affichage des 2 tableaux tab1 et tab3
System.out.println ("\nTableau tab1");
for (int i=0; i<tab1.length; i++)
	System.out.print (" " + tab1[i]);

System.out.println ("\nTableau tab3");
for (int i=0; i<tab3.length; i++)
	System.out.print (" " + tab3[i]);

System.out.println ("\n");

///////////////////////////////////////////////////////////
//recopie case à case dans un tableau tab4
//Création d'un tableau de même dimension
///////////////////////////////////////////////////////////
System.out.println ("\n\nOn copie case par case le tableau tab1 dans tab4");
int[] tab4 = new int [tab1.length];
for (int i=0; i<tab4.length; i++)
	tab4[i] = tab1[i];

//Affichage des 2 tableaux tab1 et tab4
System.out.println ("\n Tableau tab1");
for (int i=0; i<tab1.length; i++)
	System.out.print (" " + tab1[i]);
System.out.println ("\nTableau tab4");
for (int i=0; i<tab4.length; i++)
	System.out.print (" " + tab4[i]);

System.out.println ("\n\n");

System.out.println ("\n\nOn remplit le Tableau tab1 avec des 'a'");
Arrays.fill(tab1,'a');;
//Affichage des 2 tableaux tab1 et tab4
System.out.println ("\nTableau tab1");
for (int i=0; i<tab1.length; i++)
	System.out.print (" " + tab1[i]);
System.out.println ("\nTableau tab4");
for (int i=0; i<tab4.length; i++)
	System.out.print (" " + tab4[i]);

///////////////////////////////////
//Affichage  Console
///////////////////////////////////
//Petit Tableau
//10 9 8 7 6 5 4 3 2 1
//Grand Tableau
//0 0 0 0 0 10 9 8 7 6 5 4 3 2 1 0 0 0 0 0
//
//Ajoute 10 dans les cases du tableau d'entier
//
//Petit Tableau
//20 19 18 17 16 15 14 13 12 11
//Grand Tableau
//0 0 0 0 0 10 9 8 7 6 5 4 3 2 1 0 0 0 0 0
//
//
//On clone le Tableau tab1 dans tab3
//Le Tableau tab3
//20 19 18 17 16 15 14 13 12 11
//
//On trie le Tableau tab1
//
//Tableau tab1
//11 12 13 14 15 16 17 18 19 20
//Tableau tab3
//20 19 18 17 16 15 14 13 12 11
//
//On copie case par case le tableau tab1 dans tab4
//
//Tableau tab1
//11 12 13 14 15 16 17 18 19 20
//Tableau tab4
//11 12 13 14 15 16 17 18 19 20
//
//
//On remplit le Tableau tab1 avec des 'a'
//
//Tableau tab1
//97 97 97 97 97 97 97 97 97 97
//Tableau tab4
//11 12 13 14 15 16 17 18 19 20
}}
