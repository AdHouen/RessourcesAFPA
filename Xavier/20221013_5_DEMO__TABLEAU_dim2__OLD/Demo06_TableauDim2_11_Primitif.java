package demo_principale;
import java.util.Arrays;
/**
 * Test sur le tableau de dimension 2 contenant des primitifs
 * Ces essais sont liés aux derniers slides sur les tableaux
 * @author afpa
 */
public class Demo06_TableauDim2_11_Primitif {

public static void main(String[] args) {
	///////////////////////////////////////////////////////////
	//Regarder les slides sur les tableaux dim 2
	///////////////////////////////////////////////////////////
	
	System.out.println("*************************************");
	System.out.println("tableau rectangulaire  (de primitifs)");
	System.out.println("*************************************");
	///////////////////////////////////////////////////////////
	//tableau rectangulaire  (matrice)
	//matrice de 3 lignes et 4 colonnes
	///////////////////////////////////////////////////////////
	int[][] tab2 = new int[3][4];
	System.out.println();
	System.out.println("remplissage du tableau avec qq valeurs");
	tab2[1][2] = 67;
	tab2[2][3] = 12;
	
	//utilisation
	tab2[0][0] = tab2[0][1];
	
	//Que vaut tab2.length? //
	System.out.println("nb de lignes du tableau :" + tab2.length);
	
	//tab2[0] est la référence de la première ligne (qui est objet-tableau dim 1)
	System.out.println("nb de colonne de la première ligne :" + tab2[0].length);
	System.out.println("nb de colonne de la dernière ligne :" + tab2[tab2.length-1].length);

	System.out.println();
	System.out.println("On affiche le contenu du tableau");
	System.out.println("--------------------------------");
	//On cherche à afficher le contenu du tableau
	//sur l'objet tableau dim 2, le toString() fonctionne-t-il?
	System.out.println("NOK toString() sur le tableau dim 2 :" + tab2);
	
	//sur l'objet tableau dim 2, Arrays.toString(tab) fonctionne-t-il?
	System.out.println("NOK Arrays.toString(tab2) sur le tableau dim 2 :" + Arrays.toString(tab2));
	
	System.out.println();
	System.out.println("On boucle avec Arrays.toString() sur chaque ligne :");
	for( int l=0; l<tab2.length; l++){
		if ( tab2[l] != null )
				System.out.print("ligne :"+ l + "\t\t" + Arrays.toString(tab2[l]));
		else
			System.out.print("ligne :"+ l );
		System.out.println();
	}
	System.out.println();
	System.out.println();
	System.out.println("bcp de case à 0 --> le tableau est bien un graphe d'objets");
	
	System.out.println();
	System.out.println("A l'aide des indices, voici le contenu du tableau :");
	//A l'aide des indices // for imbriqués // test que la ligne existe
	for( int l=0; l<tab2.length; l++){
		if ( tab2[l] != null )
			for( int c=0; c<tab2[l].length; c++) {
				System.out.print(" " + tab2[l][c]);
			}
		System.out.println();
	}
	
	System.out.println("2x foreach, Voici le contenu du tableau :");
	for( int[] L : tab2){
		if ( L != null ){
			for( int c : L)
				System.out.print(" " + c);
		}
		System.out.println();
	}
	System.out.println();
	
	//initialisateur équivalent
	int[][] tab15 =
				{	{ 0, 0, 0, 0} ,
					{ 0, 0, 67, 0} ,
					{ 0, 0, 0, 12}
				};
	
	System.out.println("initialisateur, Voici le contenu du tableau :");
	for( int[] L : tab2){
		if ( L != null ){
			for( int c : L)
				System.out.print(" " + c);
		}
		System.out.println();
	}
	System.out.println();

	System.out.println("remplissage complet du tableau avec un compteur k");
	for( int l=0, k=1; l<tab2.length; l++){
		if ( tab2[l] != null )
			for( int c=0; c<tab2[l].length; c++,k++) {
				tab2[l][c] = k;
			}
	}
	//initialisateur équivalent
	/*int[][] tab2 =
				{	{1, 2, 3, 4} ,
					{5, 6, 7, 8} ,
					{9, 10,11, 12}
				};*/

	System.out.println("foreach, voici le contenu du tableau :");
	for( int[] L : tab2){
		if ( L != null ){
			for( int c : L)
				System.out.print(" " + c);
		}
		System.out.println();
	}
	System.out.println();

	//A l'aide des indices, on itére sur les lignes
	System.out.println("A l'aide des indices, voici le contenu du tableau :");
	for( int l=0; l<tab2.length; l++){
		if ( tab2[l] != null )
			for( int c=0; c<tab2[l].length; c++) {
				System.out.print(" " + tab2[l][c]);
			}
		System.out.println();
	}
	System.out.println();
	
	
	
	System.out.println();
	System.out.println("******************************************");
	System.out.println("tableau non rectangulaire   (de primitifs)");
	System.out.println("******************************************");
	//////////////////////////////////////////////////////////////////
	//Un tableau de dimension 2 qui n'est pas une matrice
	//tableau non rectangulaire
	//////////////////////////////////////////////////////////////////

	//initialisateur {}
	int[][] tab =
				{	{23, 2, 12} ,
					{98, 45, 3, 1} ,
					null ,
					{5}
				};
	
	//sur l'objet tableau, le toString() fonctionne-t-il?
	System.out.print("toString sur le tableau dim2 :" + Arrays.toString(tab));

		
	System.out.println();
	System.out.println("Arrays.toString() sur chaque ligne :");
	for( int l=0; l<tab.length; l++){
		if ( tab[l] != null )
				System.out.print("ligne :"+ l + "\t\t" + Arrays.toString(tab[l]));
		else
			System.out.print("ligne :"+ l );
		System.out.println();
	}
	System.out.println();
	
	
	System.out.println("foreach, voici le contenu du tableau :");
	for( int[] L : tab){
		if ( L != null ){
			for( int c : L)
				System.out.print(" " + c);
		}

		System.out.println();
	}
	System.out.println();
	
	
	System.out.println("Travail à réaliser : essayer les tableaux cubiques et  dim 4!");
}
}
