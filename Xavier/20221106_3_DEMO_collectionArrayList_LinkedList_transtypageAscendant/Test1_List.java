package demo;
import java.util.*;
/**
 * COLLECTION DE TYPE LIST : les ensembles ordonnés
 * (tableaux dynamiques)
 * ArrayList, LinkedList, List
 * @author AFPA
 */
public class Test1_List {

public static void main(String[] args) {

System.out.println("\nCOLLECTION DE TYPE LIST (tableaux dynamiques)");
System.out.println("\tArrayList et LinkedList");
System.out.println("-----------------------------------------------");

ArrayList<Integer> cl = new ArrayList<>();
//cl = new ArrayList<>();
//cl = new ArrayList<Integer>(10)

//LinkedList<Integer> cl = new LinkedList<>();



///////////////////////////////////////
// Transtypage-ascendant  ou up-casting //Barbara LISKOV  //Transtypage-implicite (cast implicite)
///////////////////////////////////////

// up-casting sur une classe mère
//AbstractList<Integer> cl = (AbstractList<Integer>) new ArrayList<Integer>();// cast non nécessaire//Transtypage implicite
//AbstractList<Integer> cl = new ArrayList<Integer>();

// up-casting sur une interface implémentée
//List<Integer> cl = new ArrayList<>();//List interface !
//List<Integer> cl = (List<Integer> )new ArrayList<Integer>();// cast non nécessaire//Transtypage implicite
	
// up-casting sur une interface implémentée
//List<Integer> cl = new LinkedList<>();
//List<Integer> cl = (List<Integer> )new LinkedList<Integer>();// cast non nécessaire//Transtypage implicite

//downCasting
//LinkedList<Integer> cl2 = (LinkedList<Integer>) cl ;//point chaud
//Cast impossible// ClassCastException


cl.add(17);//auto-boxing

cl.add(6);

System.out.println("Deuxième élément, Objet à la position 1 :" + cl.get(0));
System.out.println("Deuxième élément, Objet à la position 2 :" + cl.get(1));

System.out.println("Ma collection d'Integer (toString) :" + cl );//utilisation du toString de la collection
System.out.println("Conclusion: le toString est viable");

cl.clear();//On perd le contenu de la collection

//On ajoute les objets  5 6 7 8 9 10
for(int i=5; i<=10; i++)
	cl.add(i);

System.out.println("\nMa collection d'Integer :" + cl);//utilisation du toString de la collection

System.out.println("\nOn souhaite énumèrer les objets de la collection:");
System.out.println(" ------------------------------------------------- :");
//JAVA 2
//Visite de tous les éléments par l'indice
System.out.println("Ma collection d'Integer JAVA2 :");
for(int i=0;i<cl.size();i++){
	System.out.println( " numero d'ordre :"+ (i + 1) + " valeur :"+ cl.get(i));
}
System.out.println();

//JAVA5 foreach C#
//suivant l'ordre par défaut des tableaux dynamiques
System.out.println("Ma collection d'Integer JAVA5 :");
for( Integer var : cl)
	System.out.print( " " + var);
System.out.println();

////////////////////////////////////////////////////////////////////
// Iterator (curseur) //JAVA 2
////////////////////////////////////////////////////////////////////
System.out.println("\nJ'énumère ma collection avec un iterateur (un curseur)");
System.out.println("-------------------------------------------------------");
//suivant l'ordre par défaut du tableau dynamique//ordre des indices
Iterator<Integer> it = cl.iterator();// Curseur
Integer var;
while(it.hasNext()){
	var = it.next();
	
	System.out.print( " " + var);
}
System.out.println();

//JAVA8  programmation fonctionnelle
// API Stream  appliquée aux collections
// forEach + lambda expression
System.out.println("Ma collection d'Integer JAVA8 :");
//cl.stream().forEach( x->System.out.println(x) );
cl.forEach( x->System.out.println(x) );
//cl.forEach( System.out::println );//avec référence de méthode

System.out.println();

System.out.println("La taille de la collection:" + cl.size());


System.out.println("Objet à l'indice 2 :" + cl.get(2));

//System.out.println("un sizieme element? :" + cl.get(5));

cl.add(77);System.out.println("Ajout de l'objet 77");

System.out.println("Ma collection d'Integer :" + cl +"\n");

System.out.println("La taille de la collection:" + cl.size());

cl.set( 1, 48 );System.out.println("Placement de l'objet 48 à la deuxième case");
System.out.println("Ma collection d'Integer :" + cl +"\n");

//	cl.set( 1, null );System.out.println("Insertion de null à la deuxième case");
//	System.out.println("Ma collection d'Integer :" + cl +"\n");

cl.add(48);
System.out.println("Ajout de l'objet 48 en fin de tableau");
System.out.println("Ma collection d'Integer :" + cl +"\n");


// divers opérations sur les collections
//////////////////////////////////////////////
if(cl.contains((Integer)7))
	System.out.println("Je contiens 7");
else 
	System.out.println("Je ne contiens pas 7");


System.out.println("Une collection extraite de la première:");
List<Integer> a2 =  cl.subList(1, 3);
for(  Integer e2 : a2)
	System.out.print( " " + e2);
System.out.println();

////////////////////////////////////////////////////////////////////
// La classe Collections et ses méthodes statiques
////////////////////////////////////////////////////////////////////
System.out.println("\njava.util.Collections et ses méthodes statiques");
System.out.println("-----------------------------------------------");

Collections.reverse(cl);System.out.println("reverse");
System.out.println("Ma collection d'Integer :" + cl +"\n");

Collections.shuffle(cl);System.out.println("shuffle 1");
System.out.println("Ma collection d'Integer :" + cl +"\n");

Collections.shuffle(cl);System.out.println("shuffle 2");
System.out.println("Ma collection d'Integer :" + cl +"\n");

Collections.sort(cl);//tri sur l'ordre par défaut
System.out.println("sort");
System.out.println("Ma collection d'Integer :" + cl +"\n");

//Collections.sort(list, c); //objet Comparator pour le tri

// RETRAIT D'UN OBJET  -->remove
//////////////////////////////////////////////
// retrait par l'indice
System.out.println();
cl.remove(3);System.out.println("Je retire le 4ème élément");
System.out.println("Ma collection d'Integer :" + cl +"\n");

// retrait en fournissant l'objet "equals"
cl.remove((Integer)48);System.out.println("Je retire le premier objet 48");
System.out.println("Ma collection d'Integer :" + cl +"\n");
System.out.println("La taille de la collection:" + cl.size());

System.out.println("Objet à l'indice 1 :" + cl.get(1));
//System.out.println("Ma collection d'Integer :" + cl +"\n");


// RETRAIT D'OBJETS en parcourant la collection
// utilisation d'un Iterator  (curseur) sur la collection 
//////////////////////////////////////////////////////////
System.out.println("ex: je retire les objets supérieurs à 50");
System.out.println("------------------------------------------------");

System.out.println("Rq: il faut redemander un itérateur ainsi"
		+ " on repositionne le curseur au début");
it = cl.iterator();

while(it.hasNext()){
	var = it.next();
	if( var > 50 )
		it.remove();//on demande à l'itérateur! de retirer l'objet courant
}
System.out.println("Ma collection d'Integer, on garde x <= 50:" + cl );
System.out.println("Conclusion: Avantage du curseur, on peut lui demander"
		+ "\nde retirer l'objet pointé");
System.out.println();
//JAVA8  programmation fonctionnelle
// API Stream
System.out.println("JAVA8 : Sur un flux d'objets , on applique le filtre  x <= 40 :");
cl.stream().filter(x -> x <= 40).forEach( System.out::println );

// Attention !!!! : La collection d'origine est inchangée !!!
System.out.println("Ma collection d'Integer est inchangée :" + cl +"\n");

//pour sauvegarder le flux d'objets dans une collection
List<Integer> targetList = new ArrayList<>();
//cl.stream().filter(x -> x <= 40).forEach(targetList::add);
cl.stream().filter(x -> x <= 40).forEach(x->targetList.add(x));

System.out.println("JAVA8, ma nouvelle collection d'Integer, on garde  x <= 40 :" + targetList +"\n");
   
	///////////////////////////////////
//Méthodes spécifiques à LinkedList
///////////////////////////////////
/*	cl.push((Integer)7);
	
	System.out.println("Je push 7, Ma collection d'Integer :" + cl);

	cl.addFirst(89);
	cl.addLast(12);
	System.out.println("prem 89 dern 12 , Ma collection d'Integer :" + cl);
	
	cl.push((Integer)7);
	
	System.out.println("Je push 7, Ma collection d'Integer :" + cl);
	
	System.out.println("J'énumère ma collection avec le foreach");
	for( Integer f : cl)
		System.out.print( " " + f);*/

	
}
}
