package part04_encore_logique;


public class Exo4_2_live
{
	public static void main (String[] args)
	{
		int h, m ;

		System.out.println("Entrez les heures :");
		h = (new java.util.Scanner(System.in)).nextInt();
		System.out.println("Entrez les minutes :");		
		m = (new java.util.Scanner(System.in)).nextInt(); 

		m = m + 1;

		if ( m == 60 )
			{
		     m = 0;
		     h = h + 1;
			}
		if (h == 24 ) h = 0;

		System.out.println("Dans une minute il sera" + h + "heure(s) " +  m + "minute(s)");	
		
		 // if ( String.Compare (s1,	s2 ) > 0 ) 	System.out.println("s1 est > à s2");
		 // if ( String.Compare (s1,	s2 ) < 0 ) 	System.out.println("s1 est < à s2");		
		 // if ( String.Compare (s1,	s2 ) == 0 ) System.out.println("s1 est = à s2");		
		
		// if ( String.Compare (s1,	s2 ) > 0 ) 	System.out.println("s1 est > à s2");
		// else if ( String.Compare (s1,	s2 ) < 0 ) 	System.out.println("s1 est < à s2");				
		// else ( String.Compare (s1,	s2 ) == 0 ) System.out.println("s1 est = à s2");			
		
		//System.out.println();
		
	}
}