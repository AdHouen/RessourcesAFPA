package demo2_plrsinterfaces;

import java.io.Serializable;


//interface de l'API : Marker interface pattern : Serializable,Cloneable,...
//interface de l'API : Comparable<T>
public class C1 implements IComportement,Serializable,Cloneable,Comparable<C1>{

	private static final long serialVersionUID = 7628004060212525336L;

	static int champ0;//var de classe
	
	int champ1;//var d'instance
	
	/*@Override
	public int compareTo(Object o) {
		return 0;
	}
	*/
	@Override
	public int compareTo(C1 autre) {
		if( this.champ1 == autre.champ1 )
			return 0;
		else if (this.champ1 > autre.champ1 )
			return 1;
		else
			return -1;
	}

	@Override
	public int compareToi(C1 autre) {
		if( this.champ1 == autre.champ1 )
			return 0;
		else if (this.champ1 > autre.champ1 )
			return 1;
		else
			return -1;
	}
	
	//Mon test
	public static void main(String[] args) {

		C1 o1  = new C1();
		o1.champ1 = 5;
		
		C1 o2  = new C1();
		o2.champ1 = 8;

		
		System.out.println("Valeur de champ1 de o1:" + o1.champ1);
		System.out.println("Valeur de champ1 de o2 :" + o2.champ1);

		System.out.println("o1.compareToi(o2) :" +o1.compareToi(o2));
		
		System.out.println("o1.compareTo(o2) :" +o1.compareTo(o2));
		
		System.out.println("MA_CONSTANTE :" + MA_CONSTANTE);
		
	}
}
