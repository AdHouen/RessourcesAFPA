package part03_tests;



public class Exo3_6_live
{
	public static void main (String[] args)
	{
		System.out.println("Entrer un age");
		
		int age = ( new java.util.Scanner(System.in)).nextInt();
	
		if ( age < 6 ) age = 0;
	
		switch(age)
        {
            case 0: 
				System.out.println("Cas non traite ( < 6");
				break;		
            case 6:
            case 7: 
				System.out.println("Poussin 6/7");
				break;
            case 8:
            case 9: 
				System.out.println("Pupille 8/9");
				break;
            case 10:
            case 11: 
				System.out.println("Minime 10/11");
				break;				
			default: 
            System.out.println("Cadet 12");
            break; 
        }
		
		System.out.println("------------------------------------------------------");
		
		if 	( age <= 6 ) System.out.println("Cas non traite ( < 6");
		else if ( age >= 6 && age <= 7 ) System.out.println("Poussin 6/7");
		else if 
			( age >= 8 && age <= 9 ) System.out.println("Pupille 8/9");
		else if 
			( age >= 10 && age <= 11 ) System.out.println("Minime 10/11");
		else System.out.println("Cadet 12");
		
		System.out.println("------------------------------------------------------");
		
		if ( age <= 6 ) System.out.println("Cas non traite ( < 6");
	    if ( age >= 6 && age <= 7 ) System.out.println("Poussin 6/7");
		if ( age >= 8 && age <= 9 ) System.out.println("Pupille 8/9");
		if ( age >= 10 && age <= 11 ) System.out.println("Minime 10/11");
		if ( age >=12 ) System.out.println("Cadet 12");

		System.out.println("------------------------------------------------------");
		
		if ( age <= 6 ) System.out.println("Cas non traite ( < 6");
	    if ( age == 6 || age == 7 ) System.out.println("Poussin 6/7");
		if ( age == 8 || age == 9 ) System.out.println("Pupille 8/9");
		if ( age == 10 || age == 11 ) System.out.println("Minime 10/11");
		if ( age >=12 ) System.out.println("Cadet 12");		
		
		 // if ( String.Compare (s1,	s2 ) > 0 ) 	System.out.println("s1 est > à s2");
		 // if ( String.Compare (s1,	s2 ) < 0 ) 	System.out.println("s1 est < à s2");		
		 // if ( String.Compare (s1,	s2 ) == 0 ) System.out.println("s1 est = à s2");		
		
		// if ( String.Compare (s1,	s2 ) > 0 ) 	System.out.println("s1 est > à s2");
		// else if ( String.Compare (s1,	s2 ) < 0 ) 	System.out.println("s1 est < à s2");				
		// else ( String.Compare (s1,	s2 ) == 0 ) System.out.println("s1 est = à s2");			
		
		//System.out.println();
		
	}
}