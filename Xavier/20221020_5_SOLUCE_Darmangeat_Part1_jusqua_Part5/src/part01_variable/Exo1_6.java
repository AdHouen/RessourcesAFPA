package part01_variable;

public class Exo1_6
{
	public static void main( String [] args)
	{
		int a, b;

		a = 1;
		b = 2;
		System.out.println("a:"  + a + " b:"+ b );

		int c = a;
		System.out.println("a:"  + a + " b:"+ b + " c:"+ c);
		a = b;
		System.out.println("a:"  + a + " b:"+ b + " c:"+ c);
		b = c;

		System.out.println("a:"  + a + " b:"+ b + " c:"+ c);
	}
}
