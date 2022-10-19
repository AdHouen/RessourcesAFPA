package demo_principale;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Demo05_TableauDim1_03_dInteger {
/**
 * Test sur le tableau de dimension 1 contenant des objets Integer
 * Ces essais sont liés aux slides sur les tableaux
 * @author afpa
 */
public static void main(String[] args) throws CloneNotSupportedException
{

	System.out.println();

	///////////////////////////////////////////
	/*tableau d'objet Wrapper de dimension 1*/
	/*Les objets Wrapper sont non-mutables pour leur contenu*/
	///////////////////////////////////////////
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("//////////////////////////////////////////////////////");
	System.out.println("/*tableau d'objet Wrapper de dimension 1 */");
	System.out.println("//////////////////////////////////////////////////////");
	//Integer[] t5 = { new Integer(43), null, 77 };//auto-Boxing
	Integer[] t5 = { new Integer(43), 12, 77 };//auto-Boxing

	System.out.println();
	System.out.println("t5 :" + t5); //mauvais affichage du toString()

	System.out.println("Utilisation de Arrays.toString pour afficher :");
	System.out.println("tableau t5 :" + Arrays.toString(t5));//OK sur une ligne

	System.out.println();
	System.out.print("t5:\t");
	for( Integer s : t5){
		System.out.print("  " + s);
		//traitement
	}
	System.out.println();
	System.out.println();
	
	//exemple de traitement : on cumule les valeurs des cases
	int somme = 0;
	System.out.println();
	for( int f : t5){//auto-unboxing
		somme = somme + f;  //somme += f;
	}
	System.out.println("Voici la somme des valeurs de t5 :" + somme);
	
	System.out.println();
	System.out.println();
	//////////////////////////////////////////////////////
	//Aparté: programmation fonctionnelle de Java 8
/*	System.out.println();
	System.out.println("Java 8: cumul des éléments de t5 avec l'API des stream" );
	//java.util.stream.Stream<Integer>java.
	//somme = java.util.stream.Stream<Integer>(t5).length;
	//(t5).sum();
	//System.out.println("Voici la somme des valeurs de t5 :" + somme);
	
	System.out.println();
	System.out.println();
*/	
	/////////////////////////////////////////////
	//tri     (par défaut et ascendant)
	/////////////////////////////////////////////
	System.out.println("Arrays.sort");
	Arrays.sort(t5);
	
	//Remarque: Arrays.sort() vérifie si les éléments de la collection
	//sont Comparable (opérateur "instanceof") car alors il est sûr qu'il
	//y a la méthode compareTo()
	System.out.print("t5:\t");
	for( Integer s : t5){
		System.out.print("  " + s);
		//traitement
	}
	System.out.println();
	System.out.println();
	System.out.println();
	///////////////////////////////////////////////////////////////
	//clonage
	System.out.println("//////////////////////////////////////////////////////");
	System.out.println("//clonage");
	Integer[] t6 = t5.clone();
	//foreach
	System.out.println();
	System.out.println(" Avec t6, fabrication d'un clone de t5");
	System.out.print("t6:\t");
	for( Integer I : t6){
		System.out.print("  " + I);
	}
	System.out.println();
	System.out.println(" modification de t5 pour voir si impact sur t6");
	/*Rappel: Les objets Wrapper sont non-mutables pour leur contenu*/
	t5[0] = 66;

	System.out.print("t5:\t");
	for( Integer s : t5){
		System.out.print("  " + s);
		//traitement
	}
	System.out.println();
	System.out.print("t6:\t");
	for( Integer I : t6){
		System.out.print("  " + I);
	}
	System.out.println();
	
	///////////////////////////////////////////////////////
	//
	// Conclusion: On ne peut pas conclure entre un clonage
	//    en surface ou un clonage en profondeur
	//
	//////////////////////////////////////////////////////

	///////////////////////////////////////////////////////////////
	//copie de référence (demandé par l'auditoire)
	///////////////////////////////////////////////////////////////
	System.out.println();
	System.out.println();
	System.out.println("//////////////////////////////////////////////////////");
	System.out.println("//copie de référence");

	System.out.println(" A priori, je copie t5 dans t7");
	Integer[] t7 = t5;//copie de référence
	System.out.println();
	System.out.print("t7:\t");
	for( Integer I : t7){
		System.out.print("  " + I);
	}
	System.out.println();

	System.out.println(" Je modifie t5");
	t5[1] = 99;
	
	System.out.println();
	System.out.print("t5:\t");
	for( Integer s : t5){
		System.out.print("  " + s);
	}
	System.out.println();
	System.out.println();
	System.out.print("t7:\t");
	for( Integer I : t7){
		System.out.print("  " + I);
	}
	System.out.println();
}
}
