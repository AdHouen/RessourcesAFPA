package part04_encore_logique;

/* ----------------------------------------------------

EXERCICE 4.5 LE 03/06/04 

------------------------------------------------------*/


public class Exo4_5b
{
public static void main(String[] args)
	{
	String sexe;
	int age=0;
	
	System.out.println("Veuillez taper votre sexe en minuscule : h ou f ?");
	sexe=(new java.util.Scanner(System.in)).nextLine();
	System.out.println("Veuillez entrer votre age: ");
	age=(new java.util.Scanner(System.in)).nextInt();
	
	if ((sexe.equals("h") && age>20) || (sexe.equals("f") && (age>18 && age<35)))
		System.out.println("Pas de chance tu es imposable");
	else
		System.out.println("Quelle chance tu n'es pas imposable");
	
	
	}
}
