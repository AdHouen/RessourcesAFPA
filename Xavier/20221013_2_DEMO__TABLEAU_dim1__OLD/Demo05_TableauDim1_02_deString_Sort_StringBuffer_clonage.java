package demo_principale;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Demo05_TableauDim1_02_deString_Sort_StringBuffer_clonage {
/**
 * Test sur le tableau de dimension 1 contenant des objets String et StringBuffer
 * Ces essais sont liés aux slides sur les tableaux
 * @author afpa
 */
//public static void main(String[] args) throws CloneNotSupportedException
public static void main(String ... args) throws CloneNotSupportedException
{


	System.out.println();
	System.out.println();
	System.out.println("//////////////////////////////////////////////////////");
	System.out.println("/*tableau de dimension 1 contenant des objets String */");
	System.out.println("//////////////////////////////////////////////////////");
	System.out.println();
	
	
	//Curiosité: Tableau anonyme comme paramètre de méthode ???????
	String message = new String( new char[] {'H','e','l','l','o'} );
	
	
	//////////////////////////////////////////////////////
	/*tableau de dimension 1 contenant des objets String */
	/*Les objets String ne sont pas mutable (non-mutables) pour leur contenu*/
	/* On a  un graphe d'objets !!!!*/
	//////////////////////////////////////////////////////
	String[] t4 = { "Bonjour", new String(new char[] {'H','e','l','l','o'}), new String("Gutten-Morgen")};

	//Remarque: si on a "null" dans un l'initialisateur{} => pas d'objet mais la case est prévue
	//String[] t4 = { "Bonjour", "Hello", "Guten-Morgen", null}; 
	//Pour afficher, on essaye le  toString()
	System.out.println("NOK le toString() de t4 :" + t4.toString()); //non satisfaisant //toString mal développé?
	System.out.println();

	System.out.println("OK affichage avec Arrays.toString");
	System.out.println("tableau t4 :" + Arrays.toString(t4));
	//bonne idée de mettre le tableau sur une ligne

	System.out.println();
	System.out.println("OK affichage avec le foreach");
	//foreach
	System.out.print("t4:\t");
	for( String s : t4){
		//traitement
		System.out.print("  " + s);
	}
	System.out.println();
	
	System.out.println();
	//exemple de traitement : on concatène les chaînes
	System.out.println("Voici la concaténation des chaînes de t4 dans une autre chaine");
	String texte = "";
	for( String s : t4){
			texte = texte + " " + s;  //texte += s;
	}
	System.out.println("texte:\t" + texte);

	System.out.println();
	System.out.println();
	/////////////////////////////////////////////////////////////////
	//Le tri  (par défaut  (croissant (ascendant)))
	/////////////////////////////////////////////////////////////////
	//VOIR LES SLIDES SUR LA NOTION DE TRI
	// Dans Darmangeat, vous devez les tris de manière algorithmique
	/////////////////////////////////////////////////////////////////
	//Remarque: Arrays.sort() vérifie si les éléments de la collection
	//sont Comparable (opérateur "instanceof") car alors il est sûr qu'il
	//y a la méthode compareTo()
	Arrays.sort(t4);
	
	System.out.println("Tri avec la méthode Arrays.sort");
	System.out.print("t4:\t");
	//System.out.println("tableau t4 :" + Arrays.toString(t4));
	for( String s : t4){
		System.out.print("  " + s);
	}
	System.out.println();
	
	System.out.println();
	System.out.println();
	System.out.println("//////////////////////////////////////////////////////////");
	System.out.println("//tableau de dimension 1 contenant des objets StringBuffer");
	System.out.println("//////////////////////////////////////////////////////////");
	//////////////////////////////////////////////////////
	/*tableau de dimension 1 contenant des objets StringBuffer */
	/*Les objets StringBuffer sont mutables*/
	//////////////////////////////////////////////////////
/*	StringBuffer[] t11 = { new StringBuffer("Bonjour"),
							new StringBuffer("Hello"),
							new StringBuffer("Guten-Morgen")};*/
	StringBuffer[] t11 = { new StringBuffer("Bonjour"),
			null,
			new StringBuffer("Guten-Morgen")};

	//Pour afficher, on essaye le  toString()
	System.out.println("NOK le toString() de t11 :" + t11.toString()); //non satisfaisant //toString mal développé?
	System.out.println();

	System.out.println("OK affichage avec Arrays.toString");
	System.out.println("tableau t11 :" + Arrays.toString(t11));
	//bonne idée de mettre le tableau sur une ligne

	System.out.println();
	//foreach
	System.out.println();
	System.out.println("OK affichage avec le foreach");
	System.out.print("t11:\t");
	for( StringBuffer s : t11){
		//traitement
		System.out.print("  " + s);
	}
	System.out.println();

	System.out.println();

	//exemple de traitement : on concatène les chaînes
	texte = "";
	System.out.println();
	for( StringBuffer s : t11){
		if ( s == null )
			s =  new StringBuffer("null");
		else
			texte = texte + " " + s;  //texte += s;
	}
	System.out.println("Voici la concaténation des chaînes de t11 dans une autre chaine");
	System.out.println("texte:\t" + texte);

	System.out.println();
	System.out.println();
	/////////////////////////////////////////////
	//tri     (par défaut et ascendant)
	/////////////////////////////////////////////
	System.out.println("Arrays.sort ne fonctionne pas");
	
	
	//Arrays.sort(t11); //ne fonctionne pas au runtime car StringBuffer n'est pas Comparable
	////////////////////////////////////////////////////////////////
	//clonage
	System.out.println("//////////////////////////////////////////////////////");
	System.out.println("//clonage");
	StringBuffer[] t12 = t11.clone();
	//foreach
	System.out.println();
	System.out.println(" Avec t12, fabrication d'un clone de t11");
	System.out.print("t12:\t");
	for( StringBuffer s : t12){
		System.out.print("  " + s);
	}
	System.out.println();
	System.out.println();
	System.out.println(" modification de t11 pour voir si impact sur t12");

	t11[0].append(" les CDI");
	
	System.out.print("t11:\t");
	for( StringBuffer s : t11){
		System.out.print("  " + s);
	}
	System.out.println();
	System.out.print("t12:\t");
	for( StringBuffer s : t12){
		System.out.print("  " + s);
	}
	System.out.println();
	/////////////////////////////////////////////////////////////////////////////
	// Rappel: Le clonage fonctionnait pour un tableau dim1 de primitifs
	// Conclusion: Pour les tableaux d'objets StringBuffer dim1,
	// le clonage n'est qu'un clonage en "surface" (pas en profondeur)
	/////////////////////////////////////////////////////////////////////////////

}
}
