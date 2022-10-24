package part06_tableau;
/*-------------------------
 Que produit l’algorithme suivant ?
Tableau Nb(5) en Entier
Variable i en Entier
Début
Pour i ← 0 à 5
    Nb(i) ← i * i
i Suivant
Pour i ← 0 à 5
    Ecrire Nb(i)
i Suivant
Fin
Question:Peut-on simplifier cet algorithme avec le même résultat ? 
*/
/*SOLUTION pseudo-Code
réponse: Cet algorithme remplit un tableau avec six valeurs : 0, 1, 4, 9, 16, 25.
Il les écrit ensuite à l’écran. Simplification :
Tableau Nb(5) en Entier
Variable i en Entier
Début
Pour i ← 0 à 5
     Nb(i) ← i * i
     Ecrire Nb(i)
i Suivant
Fin*/

public class Exo6_4 {

	public static void main(String[] args) {
		final int dim = 6;

		
		System.out.println("\nAffichage du tableau :");
		System.out.print("\t");

		int[] tab = new int[dim];
		for(int i = 0; i< tab.length; i++){
			tab[i] = (int )Math.pow(i, 2);
			System.out.print(" " + tab[i]);

		}
	}
}