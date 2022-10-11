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

	//////////////////////////////////////////////
	//  METHODES STATIQUES DE LA CLASSE D'EMBALLAGE Integer
	//////////////////////////////////////////////
	
	//méthodes statiques de Integer
	int  j = Integer.parseInt("17");
	
	//remplace constructeur déprécié
	//Integer emballage = new Integer(j);
	Integer emballage = Integer.valueOf(j);
	System.out.println("toString d'un objet Integer :" + emballage );
	
	//Integer emballage2  ="17";  //auto-boxing sur une chaine ne marche pas
	Integer emballage2  = Integer.valueOf("17");
	
	System.out.println();
	
	//////////////////////////////////////////////
	//  METHODES STATIQUES DE LA CLASSE D'EMBALLAGE Character
	//////////////////////////////////////////////
	//méthodes statiques de Character
	System.out.println("Character.isDigit('?') :" + Character.isDigit('?'));
	System.out.println("Character.isDigit('9') :" + Character.isDigit('9'));
	System.out.println("Character.isLowerCase('A') :" + Character.isLowerCase('A') );
	
	System.out.println("Character.isWhitespace(' ') :" + Character.isWhitespace(' '));
	
	if(Character.isJavaIdentifierPart('?'))
		System.out.println("Lettre pouvant être présente dans un identificateur Java");
	else
		System.out.println("Lettre ne pouvant pas être présente dans un identificateur Java");
	//Character.isJavaIdentifierPart(codePoint)


	//////////////////////////////////////////////
	//  Boxing,  EMBALLAGE
	//////////////////////////////////////////////
	//boxing : emballage dans un objet wrapper
	
	//Integer o = new Integer(4);//déprécié
	Integer objInteger = Integer.valueOf(4);

	System.out.println("o : " + objInteger );
	
	//  AUTOMATIQUE
	//boxing automatique (auto-boxing), à utiliser pour alléger l'écriture
	Integer o2 = 4;
	System.out.println("o2 : " + o2 );

	//////////////////////////////////////////////
	//  unboxing,  déballage
	//////////////////////////////////////////////
	//unboxing : déballage d'un objet wrapper
	int i = objInteger.intValue();
	System.out.println("i : " + i );
	
	byte b = objInteger.byteValue();
	System.out.println("b : " + b );

	//  à choisir : l'AUTOMATIQUE ;)
	//unboxing automatique (auto-unboxing),  à utiliser pour alléger l'écriture
	int i2 = objInteger;
	System.out.println("i2 : " + i2 );
	
	//byte b2 = (Byte )o;
	
	//System.out.println("i2 : " + i2 );
	
	String chaine3 = String.format("%d", 16);
	System.out.println("valeur de chaine3 :" + chaine3);
	String chaine4 = "" + 18;
	
	String chaine5 = String.valueOf(19);
	System.out.println("valeur de chaine5 :" + chaine5);

	
}
}
