package demo;
import java.util.*;
/**
 * COLLECTION DE TYPE SET : les ensembles d'objets uniques
 * HashSet, TreeSet, Set
 * @author AFPA
 */
public class Test2_Set {
public static void main(String[] args) {
	
	HashSet<Integer> cs = new HashSet<>();
	//TreeSet<Integer> cs = new TreeSet<>();
	//Set<Integer> cs = new TreeSet<Integer>(); //Barbara LISKOV  //Up-casting //Transtypage-ascendant

//		for(int i=5; i<=10; i++)
//			hs.add(i);
	cs.add(25);
	cs.add(2);
	
	cs.add(77);
	cs.add(4);


	System.out.println("Ma collection d'Integer :" + cs);//utilisation du toString de la collection

	if(cs.add(2))//Entrée de doublon // effet neutre
		System.out.println("Ajout de l'objet 2");
	else
		System.out.println("Entrée du doublon 2 sans effet");
	
	System.out.println("Ma collection d'Integer :" + cs);

	if(cs.add(77))
		System.out.println("Ajout de l'objet 77");
	else
		System.out.println("Entrée du doublon 77 sans effet");
	
	//JAVA5
	System.out.println("J'énumère ma collection avec le foreach C#");
	for( Integer var : cs)
		System.out.print( " " + var);
	
	System.out.println();
	
	// Iterator (curseur) //JAVA 2
	////////////////////////////////////////////////////////////////////
	System.out.println("J'énumère ma collection avec un iterateur (un curseur)");
	Iterator<Integer> curseur = cs.iterator(); //on demande un curseur
	Integer var;
	while(curseur.hasNext()){
		var = curseur.next();
		System.out.print( " " + var);
	}
	System.out.println();	
	
//		a.set(1, 48);
//		for( Integer e : hs)
//			System.out.print( " " + e);
//		System.out.println();
	
	
	// RETRAIT D'UN OBJET  --> remove    
	//////////////////////////////////////////////
	// Rq: On ne peut pas retirer par l' indice !
	//////////////////////////////////////////////
	// Rq: Du fait de l'unicité, on retire l'UNIQUE élément 25
	System.out.println("Je retire l'objet 25");
	if( cs.remove((Integer)25)){
		System.out.println("objet 25  retiré!");
	}else{
		System.out.println("aucun objet retiré!");
	}
						
	System.out.println("Ma collection d'Integer :" + cs);

	
	//System.out.println("Ca n'a plus de sens, un objet à l'indice 1 :" + a.get(1));
	//Collections.reverse(cs); // ne marche pas
	//Collections.shuffle(a); // ne marche pas
	//Collections.sort(a); // ne marche pas



	
	// RETRAIT D'OBJETS en enumérant le dictionnaire
	// utilisation d'un Iterator  (curseur) sur la collection 
	//////////////////////////////////////////////////////////
	System.out.println("Je retire objets au dessus de 50:");
	curseur = cs.iterator();//Je repositionne le curseur au début
	while(curseur.hasNext()){
		var = curseur.next();
		if( var > 50 )
			curseur.remove();
	}
	// avantage de l'itérateur, on peut lui demander de retirer l'objet courant
	
	System.out.println("Ma collection d'Integer :" + cs);
	System.out.println();		
	
	System.out.println("La taille de la collection:" + cs.size());
	
	if(cs.contains(7))
		System.out.println("La collection contient 7");
	else
		System.out.println("La collection ne contient pas 7");

}
}
