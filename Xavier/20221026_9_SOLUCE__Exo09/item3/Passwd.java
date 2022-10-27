package exo09.item3;

/**
 * Objectif: Utilisation des classes de l'API du JDK <p>
 *
 * La classe StringBuffer. Notion de référence. Conversion de type
 * Cryptage et décryptage 
 *
 * @author AFPA
 * @version 1.0
 */ 

public class Passwd 
{
static final int NB_CESAR = 7;

public static void main (String arg [])
{
StringBuffer ch = new StringBuffer( "Hello worldz" );

		//Sauvegarde du contenu
StringBuffer pwd = new StringBuffer( ch.toString() );
		//StringBuffer pwd = ch ;  BUG !!! Copie de référence	

//Cryptage
for( int i=0; i<pwd.length(); i++ ){
	char c = pwd.charAt( i );
	c =	(char)(c + NB_CESAR) ;
	pwd.setCharAt( i , c );
}
//		autre forme
//		for( int i=0; i<pwd.length(); i++ )
//			pwd.setCharAt(i, (char) (pwd.charAt( i ) + NB_CESAR ));

//		pour corser le cryptage
//		for( int i=0; i<pwd.length(); i++ )
//			pwd.setCharAt( i , (char )( pwd.charAt( i ) + NB_CESAR + i ) );

System.out.println("Mot de passe crypté : " + pwd);
System.out.println("Chaîne              : " + ch);

//Décryptage

for( int i=0; i<pwd.length(); i++ )
	pwd.setCharAt(i, (char) (pwd.charAt( i ) - NB_CESAR ));

//pwd.setCharAt(i, (char) (pwd.charAt( i ) - NB_CESAR - i ));

System.out.println( "Mot de passe décrypté : " + pwd );
System.out.println( "Chaîne                : " + ch );
}}

