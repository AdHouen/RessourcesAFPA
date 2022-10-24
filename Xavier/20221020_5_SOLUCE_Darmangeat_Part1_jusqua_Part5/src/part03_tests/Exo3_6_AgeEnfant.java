package part03_tests;


/* 
-------------
EXERCICE 3.6
-------------
Ecrire un algorithme qui demande l'��ge d'�un enfant � l�'utilisateur.
Ensuite, il l�'informe de sa cat�gorie : 
- � Poussin � de 6 � 7 ans
- � Pupille � de 8 � 9 ans
- � Minime � de 10 � 11 ans
- � Cadet � apr�s 12 ans
*/


public class Exo3_6_AgeEnfant
{
	public static void main (String[] args)
	{
/* D�claration de variAgeble : */
		int iAge = 0;
		
		System.out.println ("Quel �ge a l'enfant :");
		iAge = (new java.util.Scanner(System.in)).nextInt();
		
/* Test sur l'�ge : */
		if (iAge >= 12){
			System.out.println ("C'est un cadet.");
			}
		else if (iAge > 9){
			System.out.println ("C'est un minime.");
			}
		else if (iAge > 7){
			System.out.println ("C'est un pupille.");
			}
		else if (iAge >= 6){
			System.out.println ("C'est un poussin.");
			}
		else
			System.out.println ("trop jeune pour �tre dans une cat�gorie");

	

/* Autre solution*/
	int age = iAge;

		if (age == 6 || age == 7){
			System.out.println ("C'est un poussin.");
		}
		else if (age == 8 || age == 9){
			System.out.println ("C'est un pupille.");
		}
		else if (age == 10 || age == 11){
			System.out.println ("C'est un minime.");
		}
		else if (age >= 12){
			System.out.println ("C'est un cadet.");
		}
		else
			System.out.println ("trop jeune pour �tre dans une cat�gorie");
}}