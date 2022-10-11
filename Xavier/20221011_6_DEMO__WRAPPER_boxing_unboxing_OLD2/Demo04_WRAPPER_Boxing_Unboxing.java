package demo_principale;

/**
 * Test sur les classes wrapper
 * @author afpa
 */
public class Demo04_WRAPPER_Boxing_Unboxing {
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
		
			pour des calculs précis (filles de Number)
			----------------------
		BigInteger  --> long
		BigDecimal  --> double*/

		//////////////////////////////////////////////
		//  METHODES STATIQUES DES CLASSES D'EMBALLAGE INTEGER
		//////////////////////////////////////////////
		
		//méthodes statiques de Integer
		int  j = Integer.parseInt("17");
		
		//remplace constructeur déprécié
		Integer emballage = Integer.valueOf(j);
		System.out.println("toString d'un objet Integer :" + emballage );
		
		System.out.println();
		
		//////////////////////////////////////////////
		//  METHODES STATIQUES DES CLASSES D'EMBALLAGE CHARACTER
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
		Integer o = Integer.valueOf(4);

		System.out.println("o : " + o );
		
		//  AUTOMATIQUE
		//boxing automatique (auto-boxing), à utiliser pour alléger l'écriture
		Integer o2 = 4;
		System.out.println("o2 : " + o2 );

		//////////////////////////////////////////////
		//  unboxing,  déballage
		//////////////////////////////////////////////
		//unboxing : déballage d'un objet wrapper
		int i = o.intValue();
		System.out.println("i : " + i );
		byte b = o.byteValue();
		System.out.println("b : " + b );

		//  AUTOMATIQUE
		//unboxing automatique (auto-unboxing),  à utiliser pour alléger l'écriture
		int i2 = o;
		System.out.println("i2 : " + i2 );
		
		//byte b2 = (Byte )o;
		
		//System.out.println("i2 : " + i2 );
		
	}
}
