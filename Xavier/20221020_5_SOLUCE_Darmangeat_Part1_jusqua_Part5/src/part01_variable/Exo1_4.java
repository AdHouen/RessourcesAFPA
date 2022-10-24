package part01_variable;

public class Exo1_4{
	public static void main(String[] args){
		int A = 3;
		int B = 10;
		int C = A + B;
		B = A + B;
		A = C;
		System.out.print("A : "+A+" B : "+B+" C : "+C);
	}
}