package demo_principale;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Demo05_TableauDim1_01_dePrimitif {
/**
 * Test sur le tableau de dimension 1 contenant des primitifs
 * Ces essais sont liés aux slides sur les tableaux
 * @author afpa
 */
//public static void main(String[] args) throws CloneNotSupportedException
public static void main(String ... args) throws CloneNotSupportedException
{

	/////////////////////////////////////////////////
	/*tableau de dimension 1 contenant des primitifs*/
	////////////////////////////////////////////////
	//étape 1
	int[] t1;//déclaration de la référence du tableau
	
	
	//étape 2
	t1 = new int[3];//instanciation de l'objet tableau et affectation à la référence t1
	
	//étape3 : remplissage
	t1[1] = 77;
	t1[0] = 42;

	//t1[3]= 89;//java.lang.ArrayIndexOutOfBoundsException
	
	//étape4 : utilisation
	System.out.println("Affichage des cases de t1 :" );
	System.out.println("contenu case 1 :" + t1[0]);
	System.out.println("contenu case 2 :" + t1[1]);
	System.out.println("contenu case 3 :" + t1[2]);
	
	System.out.println();
	System.out.println();
	
	//autre exemple de traitement : on cumule les valeurs des cases
	int somme = 0;
	int n=0;
	while( n<t1.length )
	{
		somme = somme + t1[n];// somme +=  t1[n]
		n++;
	}
	System.out.println("While, voici la somme des valeurs de t1 :" + somme);
	System.out.println();
	somme = 0;
	for( int k=0; k<t1.length; k++)
	{
		somme = somme + t1[k];
		n++;
	}
	System.out.println("for, voici la somme des valeurs de t1 :" + somme);

	//Pour afficher, on essaye le  toString()
	System.out.println("NOK le toString() de t1 :" + t1.toString()); //non satisfaisant //toString mal développé?
	
	System.out.println("Utilisation de Arrays.toString pour afficher :");
	System.out.println("tableau t1 :" + java.util.Arrays.toString(t1));//OK sur une ligne
	
	////////////////////////////////////////////////////////////
	//bonne idée de mettre l'affichage du tableau sur une ligne	
	System.out.print("\t" + t1[0] +" " + t1[1]+ " " + t1[2]);
	System.out.println();

	System.out.println();
	System.out.print("t1:\t");
	for( int k=0; k<t1.length; k++)
	{
		System.out.print("  "  + t1[k]);
		//System.out.println("indice de l'élément :" + k + "  valeur :" + t1[k]);
	}

	System.out.println();
	//Utiliser les indices, si j'ai besoin du no d'ordre dans une liste ordonnée affichée
	//Liste ordonnée
	System.out.println("Liste des éléments de t1 avec leur no d'ordre:\t" );
	for( int k=0; k<t1.length; k++){
		System.out.println("\t" + (k+1) + "   " + t1[k]);

		//System.out.println("No d'ordre :" + (k+1) + "  valeur :" + t1[k]);
		//System.out.println("indice de l'élément :" + k + "  valeur :" + t1[k]);
	}

	
	//foreach, on parcourt la collection pour utiliser ou traiter les éléments
	//suivant un ordre par défault (compareTo par défaut)
	System.out.println();
	System.out.print("éléments de t1 avec un foreach:\t" );
	/* En C#,  foreach( int f : t1){  } 	*/
	/* En Java, for avec :  */
	for( int f : t1){
		//traitement
		System.out.print(" " + f);
	}
	System.out.println();
	
	//////////////////////////////////////////////////////
	//Aparté: programmation fonctionnelle de Java 8
	// l'API des stream  (flux)
	// java 8   flux + lambda expression  pour les tableaux
	System.out.println("Java 8: affichage des éléments de t1 avec l'API des stream + lambda" );
	System.out.println();
	
	java.util.stream.IntStream.of(t1).forEach( (e) -> System.out.print("  " + e) );// Internal iteration
	//java.util.stream.IntStream.of(t1).forEach( (e) -> System::print("  " + e) );// Internal iteration
	
	System.out.println();
	System.out.println();

	//exemple de traitement : on cumule les valeurs des cases
	somme = 0;
	System.out.println();
	for( int f : t1){
		somme = somme + f;  //somme += f;
	}
	System.out.println("Voici la somme des valeurs de t1 :" + somme);
	System.out.println();
	//////////////////////////////////////////////////////
	//Aparté: programmation fonctionnelle de Java 8
	System.out.println();
	System.out.println("Java 8: cumul des éléments de t1 avec l'API des stream" );
	somme = IntStream.of(t1).sum();
	System.out.println("Voici la somme des valeurs de t1 :" + somme);
	
	System.out.println();
	System.out.println();

	
	////////////////////////////////////////////////
	//initialisateur {}
	////////////////////////////////////////////////
	System.out.print("Utilisation d'un initialisateur pour t2:\t" );
	// Les 3 phases précédentes sont réalisées
	int[] t2 = { 42, 77, 0};
	//int[] t10 = {};//possible 

	//foreach
	System.out.println();
	System.out.print("éléments de t2 avec un foreach:\t" );
	System.out.print("t2:\t");
	for( int j : t2){
		//traitement
		System.out.print("  " + j);
	}
	System.out.println();
	System.out.println();
	System.out.println();
	
	/////////////////////////////////////////////
	//tri     (par défaut et ascendant)
	/////////////////////////////////////////////
	//t2.sort() //ça ne marche pas

	Arrays.sort(t2);
	System.out.println("Arrays.sort");
	System.out.print("t2:\t");
	for( int j : t2){
		System.out.print("  " + j);
	}
	System.out.println();

	int[] t10 = {};//tableau instancié avec length 0   (aucune case)

	System.out.print("t10:\t");
	for( int j : t10){
		System.out.print( "  "  + j);// utilisation
	}
	System.out.println();
	
	//////////////////////////////////////////////
	//clonage
	//////////////////////////////////////////////
	int[] t3 = t1.clone();
	
	if( t1 == t3)
		System.out.println("les références sont égales");
	else
		System.out.println("les références sont différents");

	System.out.println();
	System.out.print("t3:\t");
	for( int j : t3){
		//traitement
		System.out.print("  " + j);
	}
	System.out.println();

	System.out.println("On change t1 en placant 66 ds la 2eme case");
	t1[1] = 66;
	
	System.out.println();
	System.out.print("t3:\t");
	for( int j : t3){
		//traitement
		System.out.print("  " + j);
	}
	System.out.println();
	/* Conclusion : Le clonage fonctionne pour un tableau dim1 de primitifs*/
	
	//////////////////////////////////////////////////////
	//A voir aussi les COPIER/COLLER PARTIEL d'un tableau
	//////////////////////////////////////////////////////
	
	// Etudiez les méthodes static de la classe java.lang.Arrays
	//java.util.Arrays.copyOf(original, newLength);

	// Etudiez la méthodes static arraycopy de la classe System
	//java.lang.System.arraycopy(src, srcPos, dest, destPos, length)
	

	System.out.println();
	System.out.println();


}
}
