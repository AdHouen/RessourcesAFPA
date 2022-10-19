package demo_principale;
import java.util.Arrays;
/**
 * Test sur le tableau de dimension 2 référençant des objets Integer
 * Ces essais sont liés aux derniers slides sur les tableaux
 * @author afpa
 */
public class Demo06_TableauDim2_12_ObjetInteger {

public static void main(String[] args) {
	///////////////////////////////////////////////////////////
	//Regarder les slides sur les tableaux dim 2
	///////////////////////////////////////////////////////////


	///////////////////////////////////////////////////////////
	//tableau rectangulaire
	//matrice de 3 lignes et 4 colonnes
	///////////////////////////////////////////////////////////
	System.out.println();
	System.out.println("******************************************");
	System.out.println("tableau  rectangulaire   (d'objet)");
	System.out.println("******************************************");
	Integer[][] tab12 = new Integer[3][4];
	
	System.out.println();
	System.out.println("remplissage du tableau avec qq valeurs");
	tab12[1][2] = 67;//auto-boxing
	tab12[2][3] = 12;//auto-boxing
	//tab2[0][0] = tab2[0][1];
	//Itération sur le tableau avec des foreach imbriqués
	
	
	//Que vaut tab2.length? //
	System.out.println("nb de lignes du tableau :" + tab12.length);
	
	//tab2[0] est la référence de la première ligne (qui est objet-tableau dim 1)
	System.out.println("nb de colonne de la première ligne :" + tab12[0].length);
	System.out.println("nb de colonne de la dernière ligne :" + tab12[tab12.length-1].length);

	System.out.println();
	System.out.println();
	System.out.println("On boucle avec Arrays.toString() sur chaque ligne :");
	for( int l=0; l<tab12.length; l++){
		if ( tab12[l] != null )
				System.out.print("ligne :"+ l + "\t\t" + Arrays.toString(tab12[l]));
		else
			System.out.print("ligne :"+ l );
		System.out.println();
	}
	System.out.println();
	System.out.println();
	System.out.println("2x foreach, Voici le contenu du tableau :");

	for( Integer[] L : tab12){
		if ( L != null ){
			for( Integer c : L)
				System.out.print(" " + c);
		}
		System.out.println();
	}
	System.out.println();

	
	System.out.println();
	System.out.println("******************************************");
	System.out.println("tableau non rectangulaire   (d'objet)");
	System.out.println("******************************************");
	///////////////////////////////////////////////////////
	/*tableau de dimension 2 contenant des objets Wrapper*/
	///////////////////////////////////////////////////////

	//Tableau de dimension 2 qui n'est pas une matrice //tableau non rectangulaire
	Integer [][] monTab =
				{ {23, 2, 12} ,
				   {98, 45, 3, 1} ,
				   null ,
				   {5}
				};
	
	//Itération sur le tableau avec des foreach imbriqués
	System.out.println();
	System.out.println("Voici le contenu du tableau :");

	for( Integer[] L : monTab){
		if ( L != null ){
			for( Integer c : L)
				System.out.print(" " + c);
		}
		System.out.println();
	}
	System.out.println();
	
	
	//A l'aide des indices, on itére sur le tableau  avec des for imbriqués
	System.out.println();
	System.out.println("A l'aide des indices, voici le contenu du tableau :");
	for( int l=0; l<monTab.length; l++){
		if ( monTab[l] != null )
			for( int c=0; c<monTab[l].length; c++) {
				System.out.print(" " + monTab[l][c]);
			}
		System.out.println();
	}
	System.out.println();	
	
	System.out.println("Travail à réaliser : essayer les tableaux cubiques et  dim 4!");
}
}
