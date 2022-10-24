package demo_principale;

/**
 * Classe qui a comme responsabilité ....
 * @author xav
 *
 */
public class Demo14_METHODE_Portee_Surcharge {
	
//Variable de classe //Variable de portée globale pour les méthodes statics de la classe courante
//Faire un commentaire javadoc pour les champs (field) les  attributs   -->   /**  variable ....*/
static int d = 9;

private static void hello() //méthode statique // méthode de classe
{
	System.out.println("Bonjour les CDA"); 
}

private static String hellos() //méthode statique // méthode de classe
{
	return "Bonjour les CDA";
}


//méthodes static
private static String hellod() //méthode statique // méthode de classe
{
												//int d = 6;  // masque la variable globale
	return "Bonjour les CDA, d vaut :" + d;
}

/**
 * méthode de test
 * @param param valeur à afficher
 * @return la chaîne à afficher
 */
private static String hellop(int param) //méthode statique // méthode de classe
{
	return "Bonjour les CDA, param vaut :" + param;
}

public static void main(String[] args) {
	//int d = 70; //Cette var locale,  Quelle est la portée de cette variable ???
	///on la sort des méthodes -->portée globale
	
	d = d + 1;  //var statique // Quelle est la portée de cette variable ???
	System.out.println("valeur de d incrementé :" + d);
	System.out.println();
	
	System.out.println("////////////////////////////////////////////////////////");
	System.out.println("//  Appel de méthodes static Hellox (Méthode de classe)");
	hello();
	System.out.println("Appel de la méthode hellos :" + hellos());
	//System.out.println("Appel de la méthode hellod :" + 	Demo00_MethodeSurcharge_soustraction2020.hellod());
	System.out.println("Appel de la méthode hellod :" + hellod());

	System.out.println("Appel de la méthode hellop :" + hellop(17));
	System.out.println();

	
	int a,b, c; //variables locales à main  //variables de piles
	a=2; b=5; c= 4;
	System.out.println("variables locales a :" + a + "   b:" + b);
	System.out.println();
	
	System.out.println("résultat de la méthode addition :" + addition( a, b));
	System.out.println();
	
	System.out.println("///////////////////////////////////////////////////");
	System.out.println("//surcharge de la méthode soustraction  //overload");
	System.out.println("résultat de la méthode soustraction :" + soustraction( a, b));
	System.out.println();
	System.out.println("résultat de la méthode soustraction :" + soustraction( 17L, 5L));
	System.out.println();
	System.out.println("résultat de la méthode soustraction :" + soustraction( a, b , c));

	System.out.println();
	System.out.println("\t a :" + a + "   b :" + b + "   c :" + c + "  static d :" + d );
	System.out.println("///////////////////////////////////////////");
	System.out.println("//affichage \"printf style\"");
	System.out.printf("\t a :%d   b :%d   c :%d  static d :%d\n" ,a , b , c, d );

	System.out.println();
	
	int r = Math.max(a, b);
	System.out.println("Le maximum entre a et b  est :" + r);
	System.out.println();
	System.out.println("resultat a puissance b:" + Math.pow(a, b));
	System.out.println();

}//main
private static long addition(int a, int b) {
	
	return a + b;
}
/**
 * une méthode qui soustrait le premier opérande par le deuxième
 * @param param1 première opérande
 * @param param2 deuxième opérande
 * @return le résultat de la soustraction
 * @author xav
 * @version 1.0
 */
static long soustraction( int param1, int param2){
	long resultat;
	
	System.out.println("je passe dans soustraction de 2 int ");
	
	resultat = param1 - param2;

	return resultat;
	//return param1 - param2;
}

static long soustraction( long param1, long param2){
	long resultat;
	System.out.println("je passe dans soustraction de 2 long ");

	
	resultat = param1 - param2;

	return resultat;
	//return param1 - param2;
}
static long soustraction( int param1, int param2, int param3){
	System.out.println("je passe dans soustraction de 3 int ");
	/*
	 * long resultat;
	 * 
	 * resultat = param1 - param2 - param3;
	 * 
	 * return resultat;
	 */
	return param1 - param2 - param3;
}}
