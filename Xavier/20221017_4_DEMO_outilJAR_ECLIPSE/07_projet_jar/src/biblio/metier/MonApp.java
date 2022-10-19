package biblio.metier;
import java.util.Date;
import biblio.test.C2;

//import java.util.*;

//import java.lang.String;//inutile

enum feuTricolor{ vert, rouge, orange}

public class MonApp
{
	
	 /**   une variable de classe private pour voir javadoc*/
	private static int maVarClasse2 = 6; //variable de classe

	
	 /**   ma première variable de classe package-access pour voir javadoc*/
	 static int maVarClasse = 2; //variable de classe
	 
	 public static final int MA_CONSTANTE = 2; //constante public

	 int maVarInstance = 2; //variable d'instance
	
	//ma première méthode
	public static void main( String[] args)
	{
		
		byte b1; // entier signé sur 1 byte //-128 ...+127
		
		b1 = -120;
		b1 = (byte)0xA6;
		
		byte b2 = 65;
		
		byte b3 = (byte)(b1 - b2);
		
		short s1 = 12567;// entier signé sur 2 byte //-32xxx ...+32xxx
		//s1 = (short)0xA6E3;// entier signé sur 2 byte //-32xxx ...+32xxx

		int i1 = (int)1278543L;// entier signé sur 4 byte //
		//int i1 = (int)12e3;// entier signé sur 4 byte //

		long l1 = 1215L;// entier signé sur 4 byte //
		
		
		//cast implicite
		//i1 = (int)s1;
		i1 = s1;

		/*System.out.println(" valeur de b1 :" + (b1 + b2));
		kjlkjlkjlkjlk
		*/
		System.out.println("valeur de b1 :" + b1 + "  et valeur de b2 :" + b2);
		System.out.printf("valeur de b1 :%d  et valeur de b2 :%d\n", b1,b2);

		System.out.println("valeur de b3 :" + b3);
		System.out.printf("valeur de b3 :%b" , b3);


		i1 = b1 - b2;
		System.out.println("valeur de i1 :" + i1);
		
		
		char c1 = 'f';
		System.out.println("valeur du caractère c1 :" + c1);
		
		boolean t1 = true;
		System.out.println("valeur du booléen  t1 :" + t1);
		
		//float f1 = 56.789F;
		float f1 = 5.F;

		System.out.println("valeur du float  f1 :" + f1);

		
		double d1 = 56.7896543983e3;
		System.out.println("valeur du double  d1 :" + d1);
		
		int i2 = (int)1278543L;// entier signé sur 4 byte //

		///////////////////////////////////
		//structure de contrôle alternative
		///////////////////////////////////
		if( i1 != i2 )
		{
			System.out.println("les valeurs sont différentes");
		}
		
		if( i1 == i2 )
		{
			System.out.println("les valeurs sont égales");
		}
		else
		{
			System.out.println("les valeurs sont différentes");
		}
				
		if( i1 == i2 )
		{
			System.out.println("les valeurs sont égales");
		}
		else if ( i1 < i2 )
		{
			System.out.println("valeur inférieure ou égales");
		}
		else if ( i1 > i2 )
		{
			System.out.println("valeur supérieure ou égales");
		}
		else
		{
			System.out.println("cas inattendu");
		}
		
		
		switch ( c1 )
		{
			case 'f':
			// traitement
				System.out.println("c1 vaut f");

			break;
			case 'e':
			// traitement
				System.out.println("c1 vaut e");
			break;
			
			default:
				System.out.println("cas non traité");
		}
		
		//switch avec les énumérations
		feuTricolor feu = feuTricolor.orange;
		switch ( feu )
		{
			case vert:
			// traitement
				System.out.println("j'avance");

			break;
			case rouge:
			// traitement
				System.out.println("je m'arrête");
			break;
			
			default:
				System.out.println("cas non prévu");

		}

		//l'opérateur ternaire  ? :
		String chaine = (s1 == 12567)? "egales": "différents";
		System.out.println("op ternaire chaine :" + chaine);
		
		////////////////////////////////////////
		//opérateur pour les expressions logiques
		////////////////////////////////////////
		//!= // différent

/*		if( express1 && express2){
		}
		
		if( express1 || !express2){
		}
		
		if !( express1 || express2){
		}
*/


		///////////////////////////////////
		//structures de contrôle itérative
		///////////////////////////////////
		int i = 1;
		while ( i<5 )
		{
			
			System.out.println("while valeur de i:" + i);
			
			
			i = i + 1;//++i; i++;  i+=1;
		}
		i = 1;
			
		do
		{
			
			System.out.println("do-while valeur de i:" + i);

			
			i = i + 1;
		}while ( i<5 );
		
		i = 1;

		while ( true )
		{
			
			System.out.println("valeur de i:" + i);
			if ( i==6  )
				continue;

			if ( i>=5  )
				break;
			
			i = i + 1;
		}

				
		for( i = 1; i<5 ;i = i + 1 )
		{
		
			System.out.println("for valeur de i:" + i);

		
		}

		
		///////////////////////////////////////////////////////////////////
		//mon premier objet
		String maChaine = new String("coucou");
		//String maChaine = "coucou";
		System.out.println("ma chaine :" + maChaine);
		System.out.printf("ma chaine :%s\n", maChaine);

		int longueur = maChaine.length();
		
		//maChaine <-- chaine  //affectation
		maChaine = chaine;
		System.out.println("maChaine :" + maChaine);

/*		maChaine = null;
		if( maChaine != null)
			System.out.println("ma chaine :" + maChaine);
*/		
		
		System.out.println("chaine :" + chaine);

		//mon deuxième objet
		Date date1 = new Date();
		System.out.println("la date courante :" + date1);
		System.out.printf("la date courante :%s\n",date1);
		
		System.out.println("valeur de s1 :" + s1);

		i1 = additionBizarre( s1 , (short)34);
		System.out.println("le resultat de l'additionBizarre :" + i1);
		System.out.println("valeur de maVar :" + maVarClasse);

		
		//System.out.println("valeur de maVar :" + maVarInstance);

		
		
		
		
		
		
		
		
		
		
		System.out.println("le resultat de l'addition :" + addition( s1 , (short)34));
		
		//if ( maChaine == chaine )//A ne pas utiliser !!!!!!!!
		if ( maChaine.equals(chaine) )
		{
			System.out.println("chaines égales");

		}
		else
		{
			System.out.println("chaines différents");

		}
		

	/*		
		Math.pow(var,2);
		Math.sqrt(var);

		while(true)
		{
			System.out.println("ma chaine :" + compteur + "\t"+ compteur*compteur + ...);

			if (compteur == limite)
				break;
			
			compteur = compteur +1;
			//compteur++;
			//comteur+=1
		}
	*/
	
	//soustraction( s1 , (short)34));

	System.out.println("le resultat de la soustraction :" + C2.soustraction( s1 , (short)34));
	System.out.println();
	
	System.out.println("variable maVarClasse visible?" + maVarClasse);
	System.out.println();

	
	
	
	MonApp app = new MonApp();
	
	System.out.println("valeur de maVarInstance:"+ app.maVarInstance);
	
	app.maVarInstance+= 4; 
	System.out.println("valeur de maVarInstance:"+ app.maVarInstance);

	
	MonApp app2 = new MonApp();
	
	System.out.println("valeur de maVarInstance:"+ app2.maVarInstance);
	
	//MA_CONSTANTE = 7;//impossible
	
	
	String maChaine2 = "coucou";
	
	//maChaine2.parse
	//int retour = Integer.parseInt(maChaine2);
	
	System.out.println("affiche:" + maChaine2.substring(0, 3).toUpperCase().toLowerCase() );
	
	
	
	
	}//en bas du main

	public static int additionBizarre( short s1, short s2)
	{
		int entier; //variable locale
		//int maVar=3; //variable locale

		entier = s1 + s2 + maVarClasse;//affectation
		
		maVarClasse = 7;
		return entier;
		//return s1 + s2;

	}
	//je surcharge la méthode addition
	public static int addition( int i1, int i2)
	{
		int entier; //variable locale
		
		entier = i1 + i2;//affectation
		
		
		return entier;
		//return i1 + i2;

	}
	
}


class C1{
	

	public static int soustraction( short s1, short s2)
	{
		int entier; //variable locale
		
		entier = s1 - s2;//affectation
		
		
		return entier;
		//return s1 + s2;

	}
	
	
}