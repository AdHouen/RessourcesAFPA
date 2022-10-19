package fr.afpa.demo;

//import java.lang;
import java.util.Date;
import java.util.Scanner;

/**
 * Ma première application
 *
 * @version 	1.82 18 Mar 2017
 * @author 	Firstname Lastname
 */
public class MonApp{
	
	
	public static void main(String[] args){
		String chaine; /* variable locale*/
		
		chaine = " les CDI; nous sommes le ";
		
		String chaine2 = new String(" les CDI; nous sommes le ");
		
		//String chaine = " les CDI; nous sommes le ";
		
		/* des
		commentaires
		multilignes*/
		
		//des
		//commentaires
		//multilignes

		//des  //commentaires
		//multilignes

		/* affichage sur la console*/
		System.out.print( "Hello world :");
		
		System.out.println( "Bonjour" + chaine + new Date());
		
		System.out.println( concatene("Bonjour" ,chaine) + new Date());


		//System.out.println( "Bonjour" + chaine.toUpperCase() + new Date());
		//.substring(1,6)
		
		/*saisie clavier*/
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "Entrez votre pr?nom :");
		String entreeClavier = sc.nextLine();
		
		System.out.println( "Chaine entr?e au clavier :" + entreeClavier);
		
		System.out.print( "Entrez un entier :");
		
		short entier = (short)sc.nextInt();
		System.out.println( "entier entr? au clavier :" + entier);
		*/
		
		//////////////////////////////////
		// Les primitifs
		//////////////////////////////////
		
		/* Les caractères*/
		char c; //2 octets //encoder en UTF-16
		
		c = 'a';
		c = 60;
		//c = 'u\0062'; //lettre b
		//c = '\n'; //lettre b

		
		/*Les booléens*/
		boolean bo; //variable locale ? la m?thode main
		bo = true; //ou false
		System.out.println("valeur de bo :" + bo);

		bo = true;  //false
		bo = (c<2 && ((c%2)==0));
		
		/*Les entiers sign?s*/
		
		byte by = -56;//1 octets
		
		short sh = -250;//2 octets
		
		int ii = 456789;//4 octets

		long l =  657658798986L;//8 octets
		
		ii = (int)657658798986L;

		ii = (int )l;
		
		
		/* Les nombres approxim?*/
		
		float ff = 12.56e-4f;//4 octets
		
		ff = (float)12.5678e-45;
		
		double dd = 12.5678e-45;//8 octets
		
		//////////////////////////////////
		//////////////////////////////////

		
		Math.pow(5,2);
		Math.sqrt(53);
		double pi = Math.PI;
		
		int i=0;
		while( i< 2 ){
			System.out.println("?????????????");
			
			i = i + 1;
			// i += 1; //autre possibilit?
			// i++; //autre possibilit?
			// ++i; //autre possibilit?
		}
		
		/*A<--1
		B=A + 3
		A<--3
		Fin*/
		/* partie 01 exercice 1.1*/
		short A =1;
		short B = (short)(A+3);
		A =3;
		System.out.println( "valeur de A:" + A + "valeur de B:" + B );


	}
	

    /**
     * ...method concatene documentation comment...
     * @param param_form1 description1
     * @param param_form2 description2
     */
	 public static String concatene(String param_form1 ,String param_form2){
		String s = param_form1 + param_form2;
		
		return s;
	}
	
}