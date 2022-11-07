package demo;
import java.util.*;

/**
 * La map (le dictionnaire )
 * @author AFPA
 */
public class Test30_Map {

	public static void main(String[] args) {
		System.out.println("\nPremiers essais des dictionnaire DE TYPE Map");
		System.out.println("couple d'objets  clés , valeur   (key, value)");
		System.out.println("une map");
		System.out.println("\ton instancie la classe HashMap puis TreeMap");
		System.out.println("-----------------------------------------------");

		//HashMap<String,Integer> map = new HashMap<>();
		Map<String,Integer> map = new HashMap<>();//Barbara LISKOV  //Up-casting //Transtypage-ascendant
		//TreeMap<String,Integer> map = new TreeMap<>();
		//Map<String,Integer> map = new TreeMap<>();//Barbara LISKOV  //Up-casting //Transtypage-ascendant
		//  La map Properties  ~tableaux associatifs
		

		System.out.println("/////////////////////////////");
		System.out.println("//Peuplement");
		/////////////////////////////
		//Peuplement
		map.put("prems", 3);
		map.put("deux", 7);
		map.put("trois", 11);
				//utilisation du toString de la map
		System.out.println("Ma map :" + map);
		//AFICHAGE CONSOLE   //{trois=11, prems=3, deux=7}
		System.out.println("Conclusion: le toString est viable");
		System.out.println();
		
		System.out.println("//////////////////////////");
		System.out.println("//instanciation/peuplement");
		System.out.println(" avec la programmation fonctionnelle :appel de la fonction of");
		System.out.println("JAVA8: API Stream pour les collections :");
		System.out.println("--------------------------------------");
		//JAVA8  programmation fonctionnelle; appel des fonctions stream(),forEach() + lambda expression
		// API Stream  appliquée aux collections
		//programmation fonctionnelle ; appel à une fonction "of"
		//Java9 “of” method  //Factory Method
		//Map<String, String> map = Map.of("foo", "a", "bar", "b", "chair", "c");
		Map<String, Integer> map2 = Map.of("prems", 3, "deux", 7, "trois", 11);
		//Map<String, Integer> map2 = Map.of("foo", 10, "bar", 14, "c", 78);
		System.out.println("Ma map2 :" + map2);
		
		System.out.println();
		//////////////////////////////////////////////////////////////////////////////
		System.out.println("La récupération d'un objet grâce à un indice n'est pas possible" );
		//récupération d'une valeur si on connait sa clé; get de la clé
		System.out.println("L'objet correspondant à la clef 'deux' :" + map.get("deux"));
		System.out.println();
		////////////////////////////////////////////////////////////////
		// RETRAIT D'UN OBJET du dictionnaire : remove ... de la clé !!
		System.out.println("Ma map initiale :" + map);
		System.out.println("je  retire l'objet 'deux'");
		map.remove("deux");

		System.out.println("Ma map :" + map);
		System.out.println();
		System.out.println("j'ajoute 'quatre' 4");
		map.put("quatre", 4);

		
		///////////////////////////////////////////////
		// Pour énumérer les objets utiles :
		// ciblage des clés dans un Set, demande d'un Iterator (curseur)
		// sur cette collection de clés 
		///////////////////////////////////////////////
		System.out.println("///////////////////////////////////////////////");
		System.out.println(" On souhaite énumèrer les objets \"utiles\" de la collection Map");
		System.out.println(" ---------------------------------------------------------------");
		System.out.println();
	    //JAVA 2
		System.out.println(" JAVA 2: un itérateur sur les clés ");
		// récupération des clés dans un Set
		Set<String> keys = map.keySet();// .keySet() retourne une Set !!!
		// Utilisation d'un Iterator (curseur) sur ce set  de clés
		Iterator<String> itKey = keys.iterator(); 
		while( itKey.hasNext()){
			String k = itKey.next();
			System.out.println(" clé:"+ k + "   Objet lié :" + map.get(k) );
		}
		System.out.println("\n");
		
		System.out.println(" JAVA 5;  version1 par les clés");
		//JAVA5 foreach V1 
		for ( String key : map.keySet() ) {
			System.out.println(" clé:"+ key + "   Objet lié :" + map.get(key) );
			if(map.get(key) == 7)
				map.remove(key);
			//System.out.println(map.get(key)+2); 

		}	
		System.out.println("\n");
					
		//map.entrySet()//ramène les lignes dans un Set
		System.out.println(" JAVA 5;  version2 ");
		//JAVA5 foreach  V2 //source: www.mkyong.com
		// On obtient un Set d'un objet l' Entry qui correspond à la  ligne
		// map.entrySet() : Returns a Set view of the mappings contained in this map
		// map.entrySet() : Retourne un ensemble des couples k,v (les lignes) 
		for (Map.Entry<String, Integer> ligne : map.entrySet()) {
			System.out.println("clé: " + ligne.getKey() + "   Objet lié :" + ligne.getValue());
		}
		
		System.out.println("\n");
		
		System.out.println(" JAVA 8  ");
		//énumèration de la collection

		//JAVA8  programmation fonctionnelle; appel à la fonction forEach
		// API Stream  appliquée aux dictionnaires
		// forEach + lambda expression   //source: www.mkyong.com
		map.forEach((k,v)->System.out.println("clé: " + k + "   Objet lié :" + v));
		System.out.println();
		

		// RETRAIT D'OBJETS en parcourant le dictionnaire
		// utilisation d'un Iterator  (curseur) sur la collection de clés
		// si on retire la clé  alors on retire l'objet lié
		/////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("exemple: je souhaite retirer les objets supérieurs à 10");
		
		// !!!!!   On repositionne le curseur à zéro   !!!!
		// !!!!!   On redemande un objet Iterator   !!!!
		System.out.println("On redemande un curseur qui repart du début");
		itKey = keys.iterator();
		
		while( itKey.hasNext()){
			String k = itKey.next();
			
			//le filtre
			if( map.get(k) >= 10 ) {//Objet utile
				itKey.remove(); //si on retire la clé  alors on retire l'objet utile lié
			}
		}
		System.out.println("Ma collection d'Integer :" + map);
		System.out.println("Conclusion: Avantage du curseur par rapport au foreach, on peut"
				+ " lui demander de retirer l'objet pointé");

		//JAVA5 foreach(     ) C#   
		//??
		
		//JAVA8 forEach + lambda expression   //source: www.mkyong.com
		//TODO
		
	
	}
}
