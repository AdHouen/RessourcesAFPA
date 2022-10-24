package demo_principale;
import demo_principale.Demo08_ensemble_valeur_fini_enum.MaClassInterne;


/**
 * Cette classe sert pour la démonstration
 * @author Afpa
 *
 */
class C2{
	
	//static int addition(int op1,int op2); //signature de la méthode //prototype

	/**
	 * Méthode pour additionner deux opérandes
	 * @param op1 première opérande
	 * @param op2 deuxième opérande
	 * @return le résultat de l'addition
	 * @author xher
	 */
	static int addition( int op1 , int op2 )
	{
		
		int resultat;
		resultat = op1 + op2;
		
		return resultat;
		//return op1 + op2;
	}
	
	//surcharge  de méthode //overload
	/**
	 * @param op1
	 * @param op2
	 * @return
	 */
	static long addition( long op1 , long op2 )
	{
		long resultat;
		resultat = op1 + op2;
	
		return resultat;
		//return op1 + op2;
	}
}
/**
 * Classe servant à une démonstration
 * @author Afpa
 */
public class Demo16_METHODE_encore_membreDansLaCLASSE_DInstance_new_MethodePolymorphe_toString {
	
	//////////////////////////////////////////////////////////
	////////////////////////////////
	//Membres static  (de classe)
	////////////////////////////////
	//////////////////////////////////////////////////////////
	
	//attributs static 
	
	/** ma première constante */
	public static final int MA_CONSTANTE = 9;
	
	//Variable de classe //Variable de portée globale pour les méthodes statics de la classe courante
	static int d = 9;  
	
	private static int cpt = 0;//variable static

	//méthodes static
	private static String hello() //méthode statique // méthode de classe
	{
		return "Bonjour les CDA, d vaut :" + d;
	}

	//méthodes static
	static void m1() {
		//La portée d'une variable
		//cpt "globale" dans la classe, il est visible dans m1
		
		int cpt = 6; // on peut masquer le cpt "globale"
		
		System.out.println("\tje passe dans m1, valeur du cpt incrémenté:" + ++cpt);
		
	}
	/**
	 * Méthode pour additionner deux opérandes
	 * @param op1 première opérande
	 * @param op2 deuxième opérande
	 * @return le résultat de l'addition
	 * @author Afpa
	 */
	static int addition( int op1 , int op2 )
	{
		int resultat;
		resultat = op1 + op2;
		
		return resultat;
		//return op1 + op2;
	}
		
	//APARTE :le bloc static
	static
	{
		int c = 67;
		
		d = 12;
		int e = 10; //??
		//MA_CONSTANTE = 12;
	}
	
	//////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////
	//membre d'instance    //A NE PAS UTILISER POUR L'INSTANT
	//////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////
	
	//variable d'instance// variable opérationnelle dans l'objet !
	private int e = 9; 
	
	//méthode d'instance//Méthode dans l'objet !//packageAccess
	void parle(){ 
		System.out.println("je parle, voici la valeur de e :" + e);
	}
	
	 /*	Il y a un constructeur implicite en Java
	 public Demo00_membre_CLASSE_methode(){
		 super();
	 }*/

	////////////////////////////////
	//APARTE :class, enum interne
	////////////////////////////////
	 class MaClassInterne{
		 /*	constructeur implicite
 		 public MaClassInterne(){
			 super();
		 }*/
		 
	 }
	 
	//variable d'instance  //Composition en UML
	 MaClassInterne ref = new MaClassInterne();
	 //Rq : Un seul objet instancié
	 
	// enumération interne
	enum CouleurFeu{ ROUGE, ORANGE, VERT }
	 


	public static void main(String[] args) throws Exception
	{
		System.out.println();

		System.out.println("///////////////////////////////////////////////////////////");
		System.out.println("// utilisation de variable locale ");

		d = d + 1;  //var statique // la portée des variables ...
		System.out.println("valeur de d incrementé :" + d);
		System.out.println();
		
		//e=e+1; 	//impossible d'utiliser une var d'instance// Voir plus bas comment utiliser
		//parle();	//impossible d'utiliser une méthode d'instance// Voir plus bas comment utiliser
		//La classe cad en static vous ne pouvez pas utiliser les membres d'instances
		// Plus bas, on verra si un objet peut utiliser une m. statique
		
		int a,b, c; //variables locales à main  //variables de piles
		a=2;	b=5; c= 4;
		System.out.println("variables locales a :" + a + "   b:" + b);
		System.out.println();

		
		int r = Math.max(a, b);
		System.out.println("Le maximum entre a et b  est :" + r);
		System.out.println();

		System.out.println("resultat a puissance b:" + Math.pow(a, b));
		System.out.println();
		System.out.println("\t println  a :" + a + "  b :" + b + "  static d :" + d );
		System.out.println();
		
		System.out.println("////////////////////////////");
		System.out.println("//affichage \"printf style\"");
		System.out.printf("\t printf   a :%d   b :%d   c :%d  static d :%d\n" ,a , b , c, d );
		System.out.println();
		
	

		//Attention,  Rappel: java.util.Scanner.nextFloat() est localisé, il attend une virgule
		// faire parfois un nextLine() pour revenir à la saisie de chaine de caractere
		
		///////////////////////////////////
		//  
		//  les méthodes  - Les sous-programmes
		//
		///////////////////////////////////
		System.out.println();
		System.out.println("///////////////////////////////////////////////////////////");
		System.out.println("// utilisation des membres de classe (static) ");
		//  Appel d'une méthode static Hello (Méthode de classe)
		///////////////////////////////////
		System.out.println("Appel de la méthode hello :" + 	Demo16_METHODE_encore_membreDansLaCLASSE_DInstance_new_MethodePolymorphe_toString.hello());
		System.out.println("Appel de la méthode hello :" + hello());

		 
		System.out.println("avant m1(), valeur du cpt :" + cpt);
		
		m1();
		System.out.println("après m1(), valeur du cpt :" + cpt);
		System.out.println();

		System.out.println("Résultat de la méthode addition :" + addition(a,b));
		
  
		System.out.println("///////////////////////////////////////////////////////////");
		System.out.println("//  Appel d'une méthode static addition (Méthode de classe)");

		//on  appelle une méthode statique de la classe C2
		System.out.println("Résultat de la méthode C2.addition :" + C2.addition(a,b));
		System.out.println();
		System.out.println("Résultat de la méthode C2.addition :" + C2.addition(5, 6));
		System.out.println();

		// d'une autre classe C3 dans un autre package
		//
		//  VOIR la DEMO dans le package plus bas  fr.afpa.C3
		///////////////////////////////////

		System.out.println();
		System.out.println();

		System.out.println("///////////////////////////////////////////////////////////");
		System.out.println("// utilisation des membres d'instance");
		////////////////////////////////
		//  Est-ce possible? une instanciation de ma classe (pour obtenir un objet ???
		//	On a un constructeur implicite, et méthode toString() héritée d'Object
		///////////////////////////////////
		
		//Rappel sur l'opérateur new
		Object o1 = new Object();
		System.out.println("  toString()  de o1 :" + o1);//toString()
		// est-ce que cette info est utilisable?
		//Voir plus bas, les explications sur le ToString
		
		System.out.println();
		Demo16_METHODE_encore_membreDansLaCLASSE_DInstance_new_MethodePolymorphe_toString   monObjet
			= new   Demo16_METHODE_encore_membreDansLaCLASSE_DInstance_new_MethodePolymorphe_toString();
		
		//On peut manipuler le champ e 
		monObjet.e = 12;
		System.out.println("  monObjet valeur du champ  e :" + monObjet.e);
		
		//On parle aux objets, en leur envoyant des messages (méthodes)
		System.out.println( "monObjet parle() :");
		monObjet.parle();
		
		System.out.println("\n");
		
		Demo16_METHODE_encore_membreDansLaCLASSE_DInstance_new_MethodePolymorphe_toString   unAutreObjet
			= new Demo16_METHODE_encore_membreDansLaCLASSE_DInstance_new_MethodePolymorphe_toString();
		unAutreObjet.e = 7;
		System.out.println("  unAutreObjet valeur de e :" + unAutreObjet.e);
		unAutreObjet.parle();
		
		System.out.println();
		System.out.println("////////////////////////////////////////////////////////////////////////////");
		System.out.println("//Est-ce qu'avec l'objet, on peut appeler une méthode statique de sa classe?");
		System.out.println();
		System.out.println("un objet qui utilise m. static, résultat de l'addition :"
								+ monObjet.addition(5, 6));
		System.out.println();
//		C2 monObjet = new C2();
//		System.out.println("résultat de l'addition :" + monObjet.addition(5, 6));


		System.out.println();
	
		System.out.println();
		System.out.println("/////////////////////////////////////////");
		System.out.println("// Appel d'une méthode  toString() dont on hérite");
		System.out.println("// toString première méthode polymorphe");
		System.out.println();

		// la méthode toString() héritée de Object
		/////////////////////////////////////////
		System.out.println(	"\tNature du toString dont on hérite" );
		System.out.println(	"\tmonObjet :" );
		System.out.println(	"\t-------------------" );
		System.out.println(	"\tLe toString() :" + monObjet.toString() +
							"\n\tLe toString() :" + monObjet +
							"\n\tLe nom de la classe  :" + monObjet.getClass().getName()  +
							"\n\tLe hashCode() :" + Integer.toHexString(monObjet.hashCode())
							);
		
		System.out.println();
		System.out.println();

		
		System.out.println(	"\t monTroisiemeObjet :" );
		System.out.println(	"\t-------------------" );
		Demo16_METHODE_encore_membreDansLaCLASSE_DInstance_new_MethodePolymorphe_toString monTroisiemeObjet = new Demo16_METHODE_encore_membreDansLaCLASSE_DInstance_new_MethodePolymorphe_toString();
		System.out.println(	"\tLe toString() :" + monTroisiemeObjet );
		
		
		/////////////////////////////////////////
		// CONCLUSION sur la méthode toString() héritée d' Object
		//
		// affichage pas très intéressant,
		// il faudra redéfinir (@Override) toString dans nos futures classes
		/////////////////////////////////////////

	}//main fini
}

