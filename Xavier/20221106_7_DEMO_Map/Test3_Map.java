package demo;
import java.util.*;
/**
 * Les Map (les dictionnaires )
 * @author AFPA
 */
public class Test3_Map {

	public static void main(String[] args) {
		
		HashMap<String,Integer> cm = new HashMap<>();
		//TreeMap<String,Integer> cm = new TreeMap<>();
		//Map<String,Integer> cm = new TreeMap<>();//Barbara LISKOV  //Up-casting //Transtypage-ascendant
		//  ~tableaux associatifs ==> Properties
		
		cm.put("prems", 3);
		cm.put("deux", 7);
		cm.put("trois", 11);
		
		//utilisation du toString de la collection
		System.out.println("Ma collection d'Integer :" + cm);
		//AFICHAGE CONSOLE
		//{trois=11, prems=3, deux=7}
		System.out.println("Conclusion: le toString est viable");
		System.out.println();
		
		//////////////////////////////////////////////////////////////////////////////
		System.out.println("L'objet correspondant à la clef 'deux' :" + cm.get("deux"));
		
		///////////////////////////////////////////////
		// Pour énumérer les objets utiles :
		// extraction des clés dans un Set, demande d'un Iterator (curseur)
		// sur cette collection de clés 
		///////////////////////////////////////////////
		System.out.println(" On souhaite énumèrer les objets \"utiles\" de la collection Map");
		System.out.println(" ---------------------------------------------------------------");
	    //JAVA 2
		System.out.println(" JAVA 2 ");
		// récupération des clés dans un Set
		Set<String> keys = cm.keySet();// .keySet() retourne une Set !!!
		
		// Utilisation d'un Iterator (curseur) sur la collection de clés
		Iterator<String> itKeys = keys.iterator(); 
		while( itKeys.hasNext()){
			String k = itKeys.next();
			System.out.println(" clé:"+ k + "   Objet lié :" + cm.get(k) );
		}

		//JAVA5 foreach C#   //source: www.mkyong.com
		// On obtient un Set d'objet ... Entry  (une ligne)
		// .entrySet() : Returns a Set view of the mappings contained in this map
		// .entrySet() : Retourne un ensemble des couples k,v (les lignes) 
		System.out.println(" JAVA 5 ");
		for (Map.Entry<String, Integer> ligne : cm.entrySet()) {
			System.out.println("Item : " + ligne.getKey() + " Count : " + ligne.getValue());
		}

		//JAVA8  programmation fonctionnelle
		// API Stream  appliquée aux dictionnaires
		// forEach + lambda expression   //source: www.mkyong.com
		System.out.println(" JAVA 8 ");
		cm.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		System.out.println();
		
		//////////////////////////////////////////////////////////////////////
		// RETRAIT D'UN OBJET du dictionnaire : remove ... de la clé !!
		//////////////////////////////////////////////
		System.out.println("exemple: je souhaite retirer l'objet 'deux'");
		cm.remove("deux");
		
		System.out.println("Ma collection d'Integer :" + cm);

		// RETRAIT D'OBJETS en parcourant le dictionnaire
		// utilisation d'un Iterator  (curseur) sur la collection de clés
		// si on retire la clé  alors on retire l'objet lié
		/////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("exemple: je souhaite retirer les objets supérieurs à 10");
		
		// !!!!!   On repositionne le curseur à zéro   !!!!
		// !!!!!   On redemande un objet Iterator   !!!!
		System.out.println("On redemande un curseur qui repart du début");
		itKeys = keys.iterator();
		
		while( itKeys.hasNext()){
			String k = itKeys.next();
			
			//le filtre
			if( cm.get(k) >= 10 ) {//Objet utile
				itKeys.remove(); //si on retire la clé  alors on retire l'objet lié
			}
		}
		System.out.println("Ma collection d'Integer :" + cm);
		System.out.println("Conclusion: Avantage du curseur par rapport au foreach, on peut"
				+ " lui demander de retirer l'objet pointé");

		//JAVA5 foreach(     ) C#   
		//??

		//JAVA8 forEach + lambda expression   //source: www.mkyong.com
		//TODO
	}
}
