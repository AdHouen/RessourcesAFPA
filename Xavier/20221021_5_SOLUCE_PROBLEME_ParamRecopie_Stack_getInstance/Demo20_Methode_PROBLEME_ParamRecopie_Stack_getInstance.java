package demo_principale;

public class Demo20_Methode_PROBLEME_ParamRecopie_Stack_getInstance {

	/**En java, on passe les arguments d'une méthode par valeur et recopie ds la pile*/
	public static void main(String[] args) {
		
		//classe Object : Concept de l'objet //objet générique
		Object unObjet = null; //variable de pile //variable locale
		
		///////////////////////
		// à tester en premier
		///////////////////////
		//unObjet = new Object();
		  
//		  System.out.println("infos sur l'objet :" + unObjet + "\n\ntoString() :"+
//		  unObjet.toString() + "\nla classe de l'ob :" + unObjet.getClass().getName()
//		  + "\nm. hashCode() :" + Integer.toHexString(unObjet.hashCode()));
//		  System.out.println();
		 
		///////////////////////////////////////////////////////////////////////
		//On souhaite faire le new dans une méthode  (factory) (une fabrique)
		///////////////////////////////////////////////////////////////////////
		//délégation
		
		
		//accrocheUnObjet( unObjet );//Est-ce que cela fonctionne ?
		
		  //accrocheUnObjet( unObjet );
		  //System.out.println( "retour de accrocheUnObjet() :" + unObjet );
		 		
	    unObjet = getInstance();// Est-ce que cela fonctionne ?
		System.out.println("infos sur l'objet :" + unObjet 
				+ "\n\ntoString() :"+ unObjet.toString() 
				+ "\nla classe de l'ob :" + unObjet.getClass().getName()
				+ "\nm. hashCode() :" + Integer.toHexString(unObjet.hashCode()));
		
		//Comment garbage-collecter objet ?
		unObjet = null;
	}
	
	/**
	 * Cette méthode ne fonctionne pas
	 * à cause de la recopie des paramètres
	 * dans la pile
	 * @param reference
	 */
	static void accrocheUnObjet(Object reference){
		reference = new Object();
	}
	
	/**Java Factory Methods  :    valueOf, of  ,  getInstance
	 * Cette méthode  fonctionne avec un retour
	 * de l'objet instancié (c'est une fabrique d'objet)
	 * @return  l'objet instancié
	 */
	private static Object getInstance() {
		Object obj = new Object();
		System.out.println("\ndans getInstance, toString de l'objet :" + obj);
		return obj;
		//return new Object();
	}
}
