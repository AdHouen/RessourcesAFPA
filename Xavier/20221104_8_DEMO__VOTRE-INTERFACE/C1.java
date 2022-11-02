package demo1_votreinterface;


public class C1 implements IComportement{

	int champ1;//var d'instance

	@Override  //contrôle la signature
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

		C1 o1  = new C1();//un premier objet
		
		o1.champ1 = 5;
		
		C1 o2  = new C1();//un deuxieme objet issu de la même classe
		
		o2.champ1 = 8;

		
		System.out.println("Valeur de champ1 de o1:" + o1.champ1);
		System.out.println("Valeur de champ1 de o2 :" + o2.champ1);

		System.out.println("résultat de o1.compareToi(o2) :" +o1.compareToi(o2));
		
		System.out.println("MA_CONSTANTE :" + MA_CONSTANTE);

		
	}

}
