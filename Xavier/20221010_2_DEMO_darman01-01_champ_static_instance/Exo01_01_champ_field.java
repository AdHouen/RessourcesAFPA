package darman.part01;

import java.util.Formatter;

public class Exo01_01_champ_field {
	int A=1;
	int B;
	
	static int a=1;
	static int b;
	
	public Exo01_01_champ_field() {//constructeur
		System.out.println("Valeur de a : " + A + "  Valeur de b :" + B);
		
		affiche();

	}
	
	public static void main(String[] args) {
/*A ← 1
B ← A + 3
A ← 3*/
		//new Exo01_01_champs();
		//System.exit(0);
		
		
		System.out.println("Valeur de a : " + a + "  Valeur de b :" + b);
		//System.out.println("Valeur de a : " + a + "  Valeur de b :" + String.format("  Valeur de b : %d", b));

		//String format2 = String.format("  Valeur de b : %d", b);
		
		System.out.printf("Valeur de a : %d  Valeur de b : %d\n",  a , b);
		System.out.println();
		
		b = a+ 3;
		affiche();
		affiche2(a, b);

		a=3;
		System.out.println("Valeur de a : " + a + "  Valeur de b :" + b);
		
		//pour le formattage avec printf
		// voir la classe  java.util.Formatter
		Formatter fmt = new Formatter();
		Formatter format = fmt.format("Hello", null);
		String chaine2Formatee = String.format("Hello %s\n", " World");
		System.out.println("Valeur de format : " + format.toString());
		
		System.out.println("Valeur de chaine2Formatee : " + chaine2Formatee);
	}
	
	
	static void affiche()
	{
		System.out.println("Valeur de a : " + a + "  Valeur de b :" + b);
	}
	
	static void affiche2(int val1, int val2)
	{
		System.out.println("Valeur de a : " + val1 + "  Valeur de b :" + val2);
		//return xxxxxxxxx ;
	}
}
