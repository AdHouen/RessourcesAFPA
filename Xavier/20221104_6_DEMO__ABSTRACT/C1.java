package demo0_abstract;


//public abstract class C1 {//modificateur abstract
public class C1 {
	
	//var de classe
	static int champ0;
	
	//méthode de classe
	public static  int addition( int x , int y ){
		int z = x + y;
		
		System.out.println("\tappel addition de deux int");
		return z;
	}
	//méthode de classe
	//public static  int compare( C1 o1, C1 o2);

	//var d'instance
	int champ1;

	//public abstract int compareToi(C1 autre);
	
	//modificateur abstract sur une méthode = il n'y a que la signature de la méthode
	//alors compareToi() est un comportement attendu à implémenter dans des classes dérivées de C1

	//méthode d'instance
/*	public int compareToi(C1 autre) {
		if( this.champ1 == autre.champ1 )
			return 0;
		else if (this.champ1 > autre.champ1 )
			return 1;
		else
			return -1;
	}*/
	
	//Mon test
	public static void main(String[] args) {
		champ0 = 78;//pas besoin d'instancier
		System.out.println("Valeur de champ0:" + champ0);
		

		C1 o1  = new C1();//un premier objet
		
		o1.champ1 = 5;
		
		C1 o2  = new C1();//un deuxieme objet issu de la même classe
		
		o2.champ1 = 8;

		
		System.out.println("Valeur de champ1 de o1:" + o1.champ1);
		
		System.out.println("Valeur de champ1 de o2 :" + o2.champ1);
		
		//System.out.println("résultat de o1.compareToi(o2) :" +o1.compareToi(o2));


	}
}
