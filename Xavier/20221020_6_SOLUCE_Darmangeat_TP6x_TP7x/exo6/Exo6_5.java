package part06_tableau;
/*Que produit l’algorithme suivant ?

Tableau N(6) en Entier
Variables i, k en Entier

Début
N(0) ← 1
Pour k ← 1 à 6
     N(k) ← N(k-1) + 2
k Suivant
Pour i ← 0 à 6
     Ecrire N(i)
i Suivant
Fin*/

/*SOLUTION pseudo-Code
Cet algorithme remplit un tableau avec les sept valeurs : 1, 3, 5, 7, 9, 11, 13.
Il les écrit ensuite à l’écran. Simplification :
Tableau N(6) en Entier
Variables i, k en Entier
Début
N(0) ← 1
Ecrire N(0)
Pour k ← 1 à 6
     N(k) ← N(k-1) + 2
     Ecrire N(k)
k Suivant
Fin*/

public class Exo6_5 {

	public static void main(String[] args) {
		int[] N=new int[7];
		N[0]=1;
		for(int k=1;k<N.length;k++){
			N[k]=N[k-1]+2;	
		}
		for(int i=0;i<N.length;i++){
			System.out.println(N[i]);
		}
	}
}
