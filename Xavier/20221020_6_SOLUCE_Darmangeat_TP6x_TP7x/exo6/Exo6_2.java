package exo6;

/* ----------------------------------------------------

Exercice 6.2

Ecrire un algorithme qui déclare et remplis un tableau
contenant les six voyelles de l’alphabet latin. 

------------------------------------------------------*/


public class Exo6_2
{
public static void main(String[] args)
{
//final int T=6;					//Constante du nb de valeur du tableau
String[] tab= {"a","e","i","o","u","y"}; 

System.out.println("\nAffichage du tableau :");
for ( String istring : tab )
	System.out.println("\n"+istring);

}
}
