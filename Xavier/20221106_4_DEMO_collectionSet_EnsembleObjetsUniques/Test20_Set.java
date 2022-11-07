package demo;
import java.util.*;
/**
 * COLLECTIONS DE TYPE SET : les ensembles d'objets uniques, clefs (uniques), key
 * HashSet     collection NON-ordonnées
 * TreeSet, interface Set
 * notre exemple: un ensemble d'entiers uniques 
 * chgt vocabulaire: un Set d'entiers
 * @author Afpa
 */
public class Test20_Set {
public static void main(String[] args) {

System.out.println("\nPremiers essais des COLLECTIONS DE TYPE Set");
System.out.println("ensemble d'objets uniques , clefs , key");
System.out.println("un set");
System.out.println("\ton instancie la classe HashSet puis TreeSet");
System.out.println("-----------------------------------------------");

////////////////////////////////////////////////////////////
//notre exemple: un ensemble d'entiers uniques 
//chgt vocabulaire: un set d'entiers
HashSet<Integer> cs = new HashSet<>();//utilisation des generics //template C++
//Set<Integer> cs = new TreeSet<>();//Barbara LISKOV  //Up-casting //Transtypage-ascendant// cast implicite

//TreeSet<Integer> cs = new TreeSet<>();
//Set<Integer> cs = new TreeSet<Integer>(); //Barbara LISKOV  //Up-casting //Transtypage-ascendant

System.out.println("/////////////////////////////");
System.out.println("//Peuplement");
/////////////////////////////
//Peuplement
cs.add(25);//auto-boxing
cs.add(2);
cs.add(77);
cs.add(4);

System.out.println("Mon ensemble d'entiers uniques cs : " + cs);//utilisation du toString
System.out.println("Mon set d'entiers  cs (chgt de vocabulaire) ");
System.out.println("la taille du set : " +cs.size());

System.out.println();

System.out.println("//////////////////////////////////////////////////////////////");
System.out.println("//instanciation/peuplement avec la programmation fonctionnelle");
///////////////////////////////////////
//Peuplement
//programmation fonctionnelle ; appel à une fonction "of"
//Java9 “of” method  //Factory Method
Set<Integer> cs4 = Set.of(5,6,7,8, 9,10);
System.out.println("Mon set d'entiers cs4 : " + cs4 );
//Set<String> cs5 = Set.of("foo", "bar", "baz");
//HashSet<Integer> cs4 = new HashSet<>();
//for(int i=5; i<=10; i++)
//		cs4.add(i);
System.out.println();

////////////////////////////////////
// La récupération d'un élément avec get impossible  cc.get(0)
System.out.println("La récupération d'un objet grâce à un indice n'est pas possible" );
//interrogation sur la présence de l'objet équivalent (equals): CONTAINS
System.out.println("contains(7) ?");
//Rq: Du fait de l'unicité, c'est l'UNIQUE 7
//boolean contains = cs.contains(7);
if(cs.contains(7))
	System.out.println("La collection contient le 7");
else
	System.out.println("La collection ne contient pas le 7");

System.out.println();

///////////////////////////////
//REMOVE  Retrait d'un élément    
//Rq: On ne peut pas retirer par un indice !
//on présente un objet équivalent (equals)
//Rq: Du fait de l'unicité, on retire l'UNIQUE élément 25
System.out.println("Je retire l'objet 25");
if( cs.remove(25)){
	System.out.println("objet 25  retiré!");
}else{
	System.err.println("aucun objet retiré!");
}
System.out.println("Mon set d'entiers  cs : " + cs);

System.out.println();

///////////////////////////////
//Entrée de doublon   //boolean b = cs.add(2);
if(cs.add(2))
	System.out.println("Ajout de l'objet 2");
else
	System.out.println("Entrée du doublon 2 --> sans effet");// effet neutre

System.out.println("Mon set d'entiers : " + cs);

if(cs.add(33))
	System.out.println("Ajout de l'objet 33");
else
	System.out.println("Entrée du doublon 33 -->sans effet");

System.out.println("Mon set d'entiers cs : " + cs);


//Collections.reverse(cs); // ne marche pas
//Collections.shuffle(cs); // ne marche pas
//Collections.sort(cs); // ne marche pas

System.out.println("\n");
System.out.println("////////////////////////////////////////////////");
System.out.println("On souhaite parcourir les objets de la collection:");
System.out.println(" ------------------------------------------------- :");

//////////////////////////////////
//énumèration de la collection
//Rq: On ne peut pas itérer grâce à un indice
//JAVA5   foreach
System.out.println("J'énumère ma collection avec le for (foreach C#)");
for( Integer var : cs)
	System.out.print( " " + var);

System.out.println();

//JAVA2 Iterator (curseur) 
System.out.println("J'énumère ma collection avec un itérateur (un curseur)");
// avantage de l'itérateur, on peut lui demander de retirer l'objet courant
Iterator<Integer> curseur = cs.iterator(); //on demande un curseur
Integer var;
while(curseur.hasNext()){
	var = curseur.next();
	System.out.print( " " + var);
}
System.out.println();	

//énumèration de la collection
//JAVA8  programmation fonctionnelle; appel des fonctions stream(),forEach() + lambda expression
// API Stream  appliquée aux collections
System.out.println("\nJAVA8 J'énumère ma collection; programmation fonctionnelle");
System.out.println(" API Stream + Lambda exression :");
System.out.println("--------------------------------------");
System.out.println("Ma list d'entiers :");
//cs.stream().forEach( (x)->{System.out.println(x);} );//première écriture//inférence de type
//cs.forEach( x->System.out.println(x) );//simplification d'écriture
cs.forEach( x->System.out.print(" " + x) );//simplification d'écriture
System.out.println();
cs.forEach( System.out::println );//avec référence de fonction

//////////////////////////////////////////////////////////
// RETRAIT D'OBJETS en parcourant la collection
// utilisation d'un Iterator  (curseur) sur la collection 
System.out.println();
System.out.println("Iterator; Je retire objets au dessus de 50 strict");
System.out.println("Mon set d'entiers initiale:" + cs );
curseur = cs.iterator();//!!Je repositionne le curseur au début !!
while(curseur.hasNext()){
	var = curseur.next();
	if( var > 50 )
		curseur.remove();
}
System.out.println("Mon set d'entiers :" + cs);
System.out.println("La taille de la collection:" + cs.size());
System.out.println();

//JAVA8  programmation fonctionnelle; appel des fonctions stream(),forEach() + lambda expression
// RETRAIT D'OBJETS en parcourant la collection
System.out.println("///////////////////////////////////////////");
System.out.println("//JAVA8 Avec la programmation fonctionnelle");
System.out.println("JAVA8 : Sur un flux d'objets , on applique le filtre  x < 10 :");
System.out.println("Autrement dit, c'est un filtre où on garde x < 10" );
//public int filtre(int x) { if( x<10) return x; else return -1;}
cs.stream().filter((x) -> {return x < 10;}).forEach( (x) -> {System.out.print( " " + x);} );
System.out.println();
cs.stream().filter(x -> x < 10).forEach( x -> System.out.print( " " + x));
System.out.println();
cs.stream().filter(x -> x < 10).forEach( System.out::println );
// Attention !!!! : La collection d'origine est inchangée !!!
System.out.println("Mais la collection initiale  est inchangée :" + cs +"\n");

//pour sauvegarder le flux d'objets dans une autre collection
Set<Integer> targetSet = new HashSet<>();
//cl.stream().filter(x -> x < 10).forEach(x->targetList.add(x));
cs.stream().filter(x -> x < 10).forEach(targetSet::add);
System.out.println("JAVA8, mon nouveau set d'entiers, on garde  x < 10 :" + targetSet +"\n");
System.out.println();

}}
