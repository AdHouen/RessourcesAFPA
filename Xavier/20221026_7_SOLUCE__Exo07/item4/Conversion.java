package exo07.item4;



/**
 * Objectif: Conversion explicite de type<p>
 * 
 * Un exemple qui sert à rien
 *
 * @author AFPA
 * @version 1.0
 */ 


public class Conversion
{
	public static void main (String arg [])
	{
		double val = 456789.7890123456789;
		//double val = 128;

		float lefloat = (float) val;
		
		int   lint    = (int)   val;
		long  lelong  = (long)  val;
		short leshort = (short) val;
		byte  lebyte  = (byte)  val;
		
		char  lechar  = (char)  val;

		System.out.println("Le double " + val);
		System.out.println("Le float  " + lefloat);
		System.out.println("L'int     " + lint);
		System.out.println("Le long   " + lelong);
		System.out.println("Le short  " + leshort);
		System.out.println("Le byte   " + lebyte);
		System.out.println("Le char   " + lechar);
	}
}