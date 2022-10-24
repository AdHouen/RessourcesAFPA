package part04_encore_logique;

/* ----------------------------------------------------

EXERCICE 4.5 LE 03/06/04 

------------------------------------------------------*/
/*Les habitants de Zorglub paient l’impôt selon les règles suivantes :
· les hommes de plus de 20 ans paient l’impôt
· les femmes paient l’impôt si elles ont entre 18 et 35 ans
· les autres ne paient pas d’impôt
Le programme demandera donc l’âge et le sexe du Zorglubien, et se prononcera donc ensuite sur le fait que l’habitant est imposable. 
*/
/*SOLUTION pseudo-Code
Variable sex en Caractère
Variable age en Entier
Début
Ecrire “Entrez le sexe (M/F) : ”
Lire sex
Ecrire “Entrez l’âge : ”
Lire age
C1 ← sex = “M” et age > 20
C2 ← sex = “F” et (age > 18 et age < 35)
Si C1 ou C2 Alors
    Ecrire “Imposable”
Sinon
    Ecrire “Non Imposable”
FinSi
Fin*/

public class Exo4_5
{
public static void main(String[] args)
	{
	String sexe;
	int age=0;
	
	System.out.println("Veuillez taper votre sexe en minuscule : h ou f ?");
	sexe=new java.util.Scanner(System.in).nextLine();
	System.out.println("Veuillez entrer votre age: ");
	age=(new java.util.Scanner(System.in)).nextInt();
	
	if (sexe.equals("h"))
		if (age>20)
			System.out.println("Pas de chance tu es imposable");
	else
		System.out.println("Quelle chance tu n'es pas imposable");
	
	if (sexe.equals("f") )
		if (age>18 && age<35)
			System.out.println("Pas de chance tu es imposable");
	else 
		System.out.println("Quelle chance tu n'es pas imposable");

	}
}
