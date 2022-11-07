package demo;
import java.util.*;
/**
 * COLLECTION DE TYPE LIST : les ensembles ordonnés
 * (tableaux dynamiques)
 * ArrayList, LinkedList, List
 * @author Afpa
 */
public class Test10_List {

public static void main(String[] args) {

System.out.println("\nCOLLECTION DE TYPE LIST (tableaux dynamiques)");
//ensemble ordonné //par l'indice
System.out.println("\tArrayList et LinkedList");
System.out.println("-----------------------------------------------");
System.out.println("Ma collection d'Integer");
System.out.println("Ma list d'entiers  (chgt de vocabulaire)");
System.out.println();
System.out.println("///////////////////////////////////////////////");
System.out.println("On instancie la classe ArrayList puis LinkedList");
System.out.println("-------------------------------------------------");
//instanciation
//ArrayList<Integer> cl = new ArrayList<>();//utilisation des generics//template C++//inférence de type
//new ArrayList<>(10);//pour réservation mémoire
//System.out.println("Ma list d'entiers (toString) cl :" + cl );//utilisation du toString de la collection

List<Integer> cl =  new ArrayList<>();//Transtypage implicite
//List<Integer> cl = (List<Integer>) new ArrayList<Integer>();// cast non nécessaire

//LinkedList<Integer> cl = new LinkedList<>();
//List<Integer> cl = new LinkedList<>();//Transtypage implicite

System.out.println("/////////////////////////////");
System.out.println("//Peuplement");
/////////////////////////////
//Peuplement   (to populate)
cl.add(17);//auto-boxing
cl.add(6);
cl.add(55);

System.out.println("Ma list d'entiers (toString) cl :" + cl );//utilisation du toString de la collection
System.out.println("Conclusion: le toString est viable");
System.out.println("la taille de la collection :" +cl.size());
System.out.println();

System.out.println("//////////////////////////////////////////////////////////////");
System.out.println("//instanciation/peuplement avec la programmation fonctionnelle");
///////////////////////////////////////
//Peuplement  
//JAVA8 programmation plus fonctionnelle: appel à la fonction asList
List<Integer> cl3 = Arrays.asList(17,6,55);
System.out.println("Ma list d'entiers cl3 :" + cl3 );
//List<Float> cl6 = Arrays.asList(17F,6F,55F);

///////////////////////////////////////
//programmation fonctionnelle; appel à une fonction of
//Peuplement  
//Java9 “of” method  //Factory Method
//programmation fonctionnelle : appel à une fonction of
List<Integer> cl4 = List.of(5, 6, 7, 8, 9, 10);
System.out.println("Ma list d'entiers cl4 :" + cl4 );
//List<String> cl5 = List.of("foo", "bar", "baz");
//Set<String> set = Set.of("foo", "bar", "baz");
//Map<String, String> map = Map.of("foo", "a", "bar", "b", "chair", "c");

//ArrayList<Integer> cl2 = new ArrayList<>();
//for(int i=5; i<=10; i++)
//	cl2.add(i);
System.out.println();


System.out.println("Ma list d'entiers cl :" + cl );

/////////////////////////////////////////////////
//La récupération d'un élément avec get  cl.get(0)
System.out.println("Premier élément, Objet à la position 1 :" + cl.get(0));
System.out.println("Deuxième élément, Objet à la position 2 :" + cl.get(1));
//System.out.println("troisième élément, Objet à la position 3 :" + cl.get(3));

System.out.println();

System.out.println("-----------------------------------");
System.out.println("On force le premier objet (indice 0) à 15");
cl.set(0, 15);
System.out.println("Ma list d'entiers :" + cl );
System.out.println();

System.out.println("-----------------------------------");
System.out.println("On retire le premier objet indice 0");
cl.remove(0);
System.out.println("Ma list d'entiers :" + cl );
System.out.println("la taille de la collection :" +cl.size());
System.out.println("Premier élément, Objet à la position 1 :" + cl.get(0));

System.out.println();
//cl.clear();//On vide le contenu de la collection
//System.out.println("On vide la collection, sa taille  :" +cl.size());



System.out.println();System.out.println();

System.out.println("////////////////////////////////////////////////");
System.out.println("On souhaite énumèrer les objets de la collection:");
System.out.println(" ------------------------------------------------- :");
//JAVA 2
//Visite de tous les éléments par l'ordre croissant des indices
System.out.println("JAVA2 Ma list d'entiers :");
for(int i=0;i<cl.size();i++){
	System.out.println( " numero d'ordre :"+ (i + 1) + " valeur :"+ cl.get(i));
}
System.out.println();

//JAVA5 for  (foreach C#)
//suivant l'ordre par défaut des tableaux dynamiques --> l'ordre des indices
System.out.println("JAVA5 Ma list d'entiers :");
for( Integer var : cl)
	System.out.print( " " + var);
System.out.println();
System.out.println();

////////////////////////////////////////////////////////////////////
// Iterator (curseur) //JAVA 2
////////////////////////////////////////////////////////////////////
System.out.println("\nJ'énumère ma collection avec un iterateur (un curseur)");
System.out.println("-------------------------------------------------------");
//vous utilisez le "Design Pattern GOF" Iterator
//Iterator est une interface
//suivant l'ordre par défaut du tableau dynamique --> ordre des indices
//avantage: Voir plus bas:On peut retirer un élément de la collection //it.remove();
Iterator<Integer> it = cl.iterator();// Curseur
Integer var; 
while(it.hasNext()){
	var = it.next();
	//traitement éventuel
	System.out.print( " " + var);
}
System.out.println("\n");

//JAVA8  programmation fonctionnelle
// API Stream  appliquée aux collections
// forEach + lambda expression
System.out.println("\nJAVA8 J'énumère ma collection programmation fonctionnelle");
System.out.println("Ma list d'entiers :");
System.out.println("-------------------------------");
//cl.stream().forEach( (x)->{System.out.println(x);} );//OK
//cl.stream().forEach( x->System.out.println(x) );//OK
//cl.forEach( x->System.out.println(x) );
cl.forEach( x->System.out.print(" " + x) );
System.out.println();
cl.forEach( System.out::println );//OK//avec référence de méthode

System.out.println();
System.out.println();System.out.println();


System.out.println("////////////////////////////////////");
System.out.println("Divers opération sur  la collection:");
System.out.println(" --------------------------------- :");
System.out.println("La taille de la collection:" + cl.size());
System.out.println("Objet à l'indice 1 :" + cl.get(1));

//System.out.println("un sizieme element? :" + cl.get(5));

cl.add(77);System.out.println("Ajout de l'objet 77");

System.out.println("Ma list d'entiers :" + cl +"\n");

System.out.println("La taille de la collection:" + cl.size());

cl.set( 1, 48 );System.out.println("Placement de l'objet 48 à la deuxième case");
System.out.println("Ma list d'entiers :" + cl +"\n");

//	cl.set( 1, null );System.out.println("Insertion de null à la deuxième case");
//	System.out.println("Ma list d'entiers :" + cl +"\n");
System.out.println();System.out.println();
System.out.println("Ajout de l'objet 48 en fin de tableau");
System.out.println("Ajout de l'objet 33 en fin de tableau");
System.out.println("Ajout de l'objet 48 en fin de tableau");
System.out.println("Ajout de l'objet 9 en fin de tableau");
cl.add(48);
cl.add(33);
cl.add(48);
cl.add(9);

System.out.println("Ma list d'entiers :" + cl +"\n");


// divers opérations sur les collections
//////////////////////////////////////////////
if(cl.contains(7))
	
	System.out.println("Je contiens 7");
else 
	System.out.println("Je ne contiens pas 7");

System.out.println();
System.out.println("Une collection extraite de la première:");
List<Integer> a2 =  cl.subList(1, 3);
for(  Integer e2 : a2)
	System.out.print( " " + e2);
System.out.println();
System.out.println();System.out.println();

////////////////////////////////////////////////////////////////////
// La classe Collections et ses méthodes statiques
////////////////////////////////////////////////////////////////////
System.out.println("///////////////////////////////////////////////");
System.out.println("java.util.Collections et ses méthodes statiques");
System.out.println("-----------------------------------------------");

Collections.reverse(cl);System.out.println("reverse");
System.out.println("Ma list d'entiers :" + cl +"\n");

Collections.shuffle(cl);System.out.println("shuffle");
System.out.println("Ma list d'entiers :" + cl +"\n");

Collections.shuffle(cl);System.out.println("shuffle 2");
System.out.println("Ma list d'entiers :" + cl +"\n");

//Collections.sort(cl);//tri sur l'ordre par défaut des objets Integer
//System.out.println("sort");
//System.out.println("Ma list d'entiers :" + cl +"\n");

//Collections.sort(list, c); //objet Comparator pour le tri

// RETRAIT D'UN OBJET  -->remove
//////////////////////////////////////////////
// retrait par l'indice
System.out.println();
cl.remove(2);System.out.println("Je retire le 3ème élément");
System.out.println("Ma list d'entiers :" + cl +"\n");

System.out.println("Je retire le premier objet 48");
// retrait en fournissant l'objet égale à celui retiré  "equals"
cl.remove((Integer)48);
//cl.remove(Integer.valueOf("48"));

System.out.println("Ma list d'entiers :" + cl +"\n");
System.out.println("La taille de la collection:" + cl.size());

System.out.println("Objet à l'indice 1 :" + cl.get(1));
//System.out.println("Ma list d'entiers :" + cl +"\n");

System.out.println();System.out.println();

// RETRAIT D'OBJETS en parcourant la collection
// utilisation d'un Iterator  (curseur) sur la collection 
//Conclusion: Avantage du curseur, on peut lui demander de retirer l'objet pointé
//////////////////////////////////////////////////////////
System.out.println("////////////////////////////////////////");
System.out.println("ex: je retire les objets supérieurs à 50");
System.out.println("----------------------------------------");
System.out.println("Ma list d'entiers initiale:" + cl );

//Important: il faut redemander un itérateur ainsi on repositionne le curseur au début");
it = cl.iterator();
while(it.hasNext()){
	var = it.next();
	if( var > 50 )
		it.remove();//on demande à l'itérateur! de retirer l'objet courant
}
System.out.println("Ma list d'entiers, on a retire x > 50:" + cl );
System.out.println("Autrement dit, c'est filter où on garde x <= 50" );

System.out.println();



System.out.println("///////////////////////////////////////////");
System.out.println("//JAVA8 Avec la programmation fonctionnelle");
//JAVA8  programmation fonctionnelle; appel aux fonctions stream, filter, forEach
//JAVA8  API Stream + Lambda expression
System.out.println("JAVA8 : Sur un flux d'objets , on applique le filtre  x < 10 :");
System.out.println("Autrement dit, c'est un filtre où on garde x < 10" );
//public int filtre(int x) { if( x<10) return x; else return -1;}
cl.stream().filter((x) -> {return x < 10;}).forEach( (x) -> {System.out.print( " " + x);} );
System.out.println();
cl.stream().filter(x -> x < 10).forEach( x -> System.out.print( " " + x));
System.out.println();
cl.stream().filter(x -> x < 10).forEach( System.out::println );
// Attention !!!! : La collection d'origine est inchangée !!!
System.out.println("Mais la collection initiale  est inchangée :" + cl +"\n");

//pour sauvegarder le flux d'objets dans une autre collection
List<Integer> targetList = new ArrayList<>();
//cl.stream().filter(x -> x < 10).forEach(x->targetList.add(x));
cl.stream().filter(x -> x < 10).forEach(targetList::add);
System.out.println("JAVA8, ma nouvelle list d'entiers, on garde  x < 10 :" + targetList +"\n");
System.out.println();
System.out.println("///////////////////////////////////");
System.out.println("//Méthodes spécifiques à LinkedList");

///////////////////////////////////
//Méthodes spécifiques à LinkedList
///////////////////////////////////
/*
 * System.out.println(); cl.push((Integer)7);
 * 
 * System.out.println("Je push 7, Ma list d'entiers :" + cl);
 * 
 * cl.addFirst(89); cl.addLast(12);
 * System.out.println("prem 89 dern 12 , Ma list d'entiers :" + cl);
 * 
 * cl.push((Integer)7);
 * 
 * System.out.println("Je push 7, Ma list d'entiers :" + cl);
 * 
 * System.out.println("J'énumère ma collection avec le foreach");
 * for( Integer f: cl) System.out.print( " " + f);
 * System.out.println();
 */
  
}//main
public int filtre(int x) {
	if( x<10) return x;
	else return -1;
}
}
