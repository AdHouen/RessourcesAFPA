package part01_variable;

public class Exo1_7{
	public static void main(String[] args){
		String A = "var1";
		String B = "var2";
		String C = "var3";
		System.out.println("A : "+A+" B : "+B+" C : "+C);
		String D;
		D = C;
		C = B;
		B = A;
		A = D;
		System.out.print("A : "+A+" B : "+B+" C : "+C);
	}
}