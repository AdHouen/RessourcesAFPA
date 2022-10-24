package demo_principale;

public class Demo22_classeObject_toString_mPolymorphe implements  Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		@SuppressWarnings("unused")
		Object objet0 = new Object();
		System.out.println("Le toString de objet0 :"+ objet0.toString());
		System.out.println();

		Demo22_classeObject_toString_mPolymorphe o1
			= new Demo22_classeObject_toString_mPolymorphe();
		
		System.out.println("Le toString de o1 :" + o1);//pas viable
		System.out.println("\nle nom de la classe de :" + o1.getClass().getName());
		//voir aussi l'introspection,  API reflection  (package java.lang.reflect)
		System.out.println("le séparateur @");
		
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////");
		System.out.println("// Appel d'une méthode  hashcode dont on hérite  //viable");
		System.out.println("// hashcode est aussi une méthode polymorphe");

		System.out.println("Le hashcode o1 en décimal:" + o1.hashCode());
		System.out.println("Le hashcode o1 en hexa:"+Integer.toHexString(o1.hashCode()));

		
		System.out.println();
		System.out.println("////////////////////////////////////////////");
		System.out.println("// Appel d'une méthode  clone dont on hérite");
		System.out.println("// Vous devez implémenter l'interface  Cloneable");
		System.out.println("// clone est aussi une méthode polymorphe");
		System.out.println("// clonage de l'objet");
		Demo22_classeObject_toString_mPolymorphe clone
			= (Demo22_classeObject_toString_mPolymorphe )o1.clone();
		
		System.out.println();
		System.out.println("Le toString :" + clone.toString());
		System.out.println("Le hashcode du clone en hexa:"
								+ Integer.toHexString(clone.hashCode()));
		
		System.out.println();
		//comparaison de référence // on espère deux objets différents 
		if( o1 == clone )
			System.out.println("NOK: La référence du clone est identique de l'original");
		else
			System.out.println("OK :La référence du clone est différente de l'original");

		
		System.out.println();
		System.out.println("///////////////////////////////////////////////");
		System.out.println("// Appel de la méthode  equals() dont on hérite");
		System.out.println("// equals méthode polymorphe");
		//equals ... de Object (par héritage)
		if( o1.equals(clone))
			System.out.println("Les objets sont égaux (au sens de l'equals)");
		else
			System.out.println("Les objets sont différents (au sens de l'equals)");
		
	}//main
	
	////////////////////////////////////////////////////////////////////////////////////
	// Pour nos futures objets
	// Conclusion : On redéfinira toString  pour afficher des informations intéressantes
	// Conclusion : On redéfinira equals/hashCode avec la logique métier de nos objets
	//  on utilisera   @Override  par sécurité
	////////////////////////////////////////////////////////////////////////////////////
	
	//reféfinition de toString pour afficher des informations intéressantes
	@Override
	public String toString(  ) {
		// TODO Auto-generated method stub
		return super.toString();
	}

	//reféfinition de equals avec la logique métier de nos objets
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	//reféfinition de hashCode en suivant la logique métier du equals
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	//Si nécessaire, reféfinition de clone . Le equals doit donner true
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
