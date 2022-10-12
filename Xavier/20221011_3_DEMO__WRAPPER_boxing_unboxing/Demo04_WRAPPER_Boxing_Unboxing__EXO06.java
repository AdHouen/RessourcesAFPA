package demo_principale;
/**
 * Test sur les classes wrapper
 * @author Afpa*/
public class Demo04_WRAPPER_Boxing_Unboxing__EXO06 {
public static void main(String[] args)
{

/*		Rappel sur la Liste des classes Wrapper
		=======================================
		Character	<--> char
		
		Boolean		<--> boolean
		
			Les classes filles de Number
			----------------------
		Long		<--> long
		Integer		<--> int
		Short		<--> short
		Byte		<--> byte
		
		Float		<--> float
		Double		<--> double
		
			pour des calculs précis ou sur les grands nombres (filles de Number)
			----------------------
		BigInteger  --> long
		BigDecimal  --> double
		*/

	////////////////////////////////////////////////////////
	//  METHODES STATIQUES DE LA CLASSE D'EMBALLAGE Integer
	////////////////////////////////////////////////////////
	// Integer.
	int  j = Integer.parseInt("17");
	System.out.println("127 vaut en hexadécimal :" + Integer.toHexString(127));
	Integer j2 = Integer.valueOf(j);//on verra aussi l'auto-boxing --> Integer j3 = j;
	
	//////////////////////////////////////////////////////////
	//  METHODES STATIQUES DE LA CLASSE D'EMBALLAGE Character
	//////////////////////////////////////////////////////////
	//Character.
	System.out.println("Character.isDigit('?') :" + Character.isDigit('?'));
	System.out.println("Character.isDigit('9') :" + Character.isDigit('9'));
	System.out.println("Character.isLowerCase('A') :" + Character.isLowerCase('A') );
	
	System.out.println("Character.isWhitespace(' ') :" + Character.isWhitespace(' '));
	
	if(Character.isJavaIdentifierPart('?'))
		System.out.println("Lettre pouvant être présente dans un identificateur Java");
	else
		System.out.println("Lettre ne pouvant pas être présente dans un identificateur Java");
	//Character.isJavaIdentifierPart(codePoint)
	
	System.out.println();
	System.out.println();		

	//////////////////////////////////////////////////////
	//  Boxing,  EMBALLAGE
	//////////////////////////////////////////////////////
	//boxing : emballage du primitif dans un objet wrapper
	
	//Le constructeur du wrapper est déprécié
	//Integer emballage = new Integer(j);
	//Integer o = new Integer(4);
	
	//boxing automatique (auto-boxing), à utiliser pour alléger l'écriture
	Integer emballage6 = 23;
	Integer o2 = 4;
	System.out.println("o2 : " + o2 );
	
	//autre possibilité que l'auto-boxing, le boxing grâce
	//à une Java Factory Methods de type   of , valueOf , getInstance
	Integer emballage = Integer.valueOf(j);//On nous éloigne de l'implémentation
	Integer objInteger = Integer.valueOf(4);
	System.out.println("o : " + objInteger );
	
	System.out.println("le toString() d'un objet ... Integer :" + emballage);
	//emballage.toString()
	
	//Integer emballage2  ="17";  //l'auto-boxing sur une chaine ne marche pas
	Integer emballage2  = Integer.valueOf("17");
	
	System.out.println();
	System.out.println();		
	//////////////////////////////////////////////
	//  Unboxing,  DEBALLAGE
	//////////////////////////////////////////////
	//unboxing : déballage d'un objet wrapper
	
	//unboxing automatique : auto-unboxing ,  à utiliser pour alléger l'écriture
	int i2 = objInteger;
	System.out.println("auto-unboxing i2 : " + i2 );
	
	//byte b = objInteger;// auto-unboxing vers un byte  NOK// erreur:type mismatch
	//byte b2 = (byte )objInteger; //avec un cast en plus  NOK//erreur:cannot cast
	
	//en JAVA 4
	int i = objInteger.intValue();
	System.out.println("i : " + i );
	//intéressant
	byte b = objInteger.byteValue();
	System.out.println("b : " + b );

	System.out.println();
	System.out.println();		
	///////////////////////////////////////////////////
	/////  RAPPEL sur les chaines de caractères
	///////////////////////////////////////////////////
	////////////////////////////////////////////////////////
	//  METHODES STATIQUES DE LA CLASSE String
	//String.
	
	String chaine5 = String.valueOf(19);
	System.out.println("valeur de chaine5 :" + chaine5);
	
	// sans intérêts
	//chaine5 = String.valueOf("19");
	//System.out.println("valeur de chaine5 :" + chaine5);
	//chaine5 = String.valueOf("coucou");
	//System.out.println("valeur de chaine5 :" + chaine5);
	
	String chaine3 = String.format("%d", 16);
	System.out.println("valeur de chaine3 :" + chaine3);
	//String chaine4 = "" + 18;

	///////////////////////////////////////////////////
	//  TRAVAIL A REALISER
	///////////////////////////////////////////////////
	//Faites un schéma illustrant les passages d'un primitif
	//à une chaine puis à un objet wrapper
}
}
