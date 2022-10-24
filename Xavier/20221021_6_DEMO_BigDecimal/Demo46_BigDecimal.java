package demo_principale;
import java.math.BigDecimal;
import java.math.RoundingMode;
/**Test sur les wrapper BigDecimal
 * @author Afpa*/
public class Demo46_BigDecimal {
public static void main(String [] args) {	
/*
 * Pour réaliser le TP sur BigDecimal et ses méthodes, je vous fournis le code
 * suivant. Il comporte divers essais, des rappels, la CONSTRUCTION d'objets
 * BigDecimal avec valueOf et surtout new, les CALCULS avec des objets
 * BigDecimal, le chaînage de méthodes
 */
//.....RAPPEL sur le TP191 précédent
System.out.println(20.1 + 16.8);
// affichage: 36.900000000000006 ... imprécision ... 

System.out.println( (float )(20.1 + 16.8) );
//affichage: 36.9
// Explications ? ..................
//autre test
System.out.println(20.1f + 16.8f);
//affichage: 36.9

//RAPPEL sur l'auto-boxing
Character C1 = 'a';
Double D6 = 20.1;
//RAPPEL sur l'auto-unboxing
char c2 = C1;
double ddd = D6;//D6.doubleValue()
System.out.printf("Valeurs du char :%c , valeur du double :%f valeur"
		+ " du Double :%f\n\n"
		, c2, ddd, D6);

///////////////////////////////////////////////
// La CONSTRUCTION d'objets BigDecimal
///////////////////////////////////////////////

//Pas d'auto-boxing pour BigDecimal!!!!!!
//BigDecimal bd4 = 20.123;  //NE MARCHE PAS!!!!

////////////////////////////////////
// les m. valueof static sont là
// (un new est fait par cette méthode)
long long1 = 77;
//BigDecimal bd25 = BigDecimal.valueOf("20.123"); //ne marche pas ??
BigDecimal bd9 = BigDecimal.valueOf(ddd);
BigDecimal bd11 = BigDecimal.valueOf(long1);
BigDecimal bd10 = BigDecimal.valueOf(D6);//passage d'un Double à BigDecimal

/////////////////////////////////////
// l'opérateur new, l'instanciation
BigDecimal bd12 = new BigDecimal(20.123);

//une chaîne en paramètre,
//  c'est mieux, c'est pour avoir le maximum de précision !!!
BigDecimal bd1 = new BigDecimal("20.123");

BigDecimal bd2 = new BigDecimal("16");
BigDecimal bd3 = null;
//bd3.abs();

System.out.printf("Valeurs initiales de mes BigDecimaux bd1 :%f ,"
		+ " bd2 :%f , bd3 :%f \n\n"
		, bd1, bd2, bd3);//appel à bd1.toString()
 
//On souhaite repasser au primitif double
//Pas d'auto-unboxing pour BigDecimal!!!!!!
//double dd =  bd3; //NE MARCHE PAS!!!!
double dd = bd1.doubleValue();
//dd = bd1.floatValue();

System.out.println("contenu du double déballé :"+ dd);

///////////////////////////////////////////////
//Les CALCULS avec des objets BigDecimal
///////////////////////////////////////////////
//20.123 + 16
bd3 = bd1.add(bd2);
//les méthodes font un new et renvoient le nouveau BigDecimal contenant le résultat
//add() fait un new et retourne un nouveau BigDecimal qui est le résultat
//Rq: BigDecimal est inmutable=immuable=non_mutable  (in english immutable)
System.out.println("contenu de mon BigDecimal bd3 :" + bd3);

//bd1 = bd1 + bd2
bd1 = bd1.add(bd2); //On réutilise la référence bd1 mais l'objet est bien changé
System.out.println("contenu de mon BigDecimal bd1 :" + bd1);

// si on ne veut plus utiliser des variables locales
//20.123 + 16
bd1 = new BigDecimal("20.123").add( new BigDecimal("16"));
System.out.println("20.123 + 16 ; contenu de bd1 :" + bd1);

//parenthèses pour palier à la préséance des opérateurs (operator precedence)?
double resultat = ((20.123 + 16) - 3.2) * 5.6 ;
System.out.println("valeur du resultat :" + resultat);
//valeur du resultat :184.3688

//les méthodes font un new et renvoient le nouveau BigDecimal
//  contenant le résultat, d'où on peut chainer les méthodes
bd1 = ((new BigDecimal("20.123").add( new BigDecimal("16"))).subtract(new BigDecimal("3.2"))).multiply(new BigDecimal("5.6"));

//en fait, on peut se passer de bcp de parenthèses
bd1 = new BigDecimal("20.123").add(new BigDecimal("16")).subtract(new BigDecimal("3.2"))
		.multiply(new BigDecimal("5.6"));
System.out.println("((20.123 + 16) - 3.2) * 5.6 ; contenu de bd1 :" + bd1);

//la même chose, en formatant le code différemment + arrondi
bd1 = new BigDecimal("20.123")
	  //.setScale(2,BigDecimal.ROUND_HALF_UP)//deprecated
	  .setScale(2,RoundingMode.HALF_UP)
	  .add( new BigDecimal("16"))
	  .subtract(new BigDecimal("3.2"))
	  .multiply(new BigDecimal("5.6"));
System.out.println(
		"((20.12 + 16) - 3.2) * 5.6 ;contenu de bd1 + arrondi:"
		+ bd1);

bd1 = new BigDecimal("20.123")
	  .setScale(2,RoundingMode.HALF_UP)
	  .add( new BigDecimal("16"))
	  .subtract(new BigDecimal("3.2"))
	  .multiply(new BigDecimal("5.6"))
	  .setScale(2,RoundingMode.HALF_UP);
System.out.println(
		"((20.12 + 16) - 3.2) * 5.6 ;contenu de bd1 + 2x arrondis:"
		+ bd1);

//la division avec un arrondi
bd1 = new BigDecimal("20.123")
	  .setScale(2,RoundingMode.HALF_UP)
	  .add( new BigDecimal("16"))
	  .subtract(new BigDecimal("3.2"))
	  .multiply(new BigDecimal("5.6"))
	  .divide(new BigDecimal("6"), 2, RoundingMode.HALF_UP );

System.out.println("(((20.12 + 16) - 3.2) * 5.6) / 6 ; contenu de bd1 :"
	  + bd1);

//RAPPEL sur les String et le chainage des appels
System.err.println("Hello".toUpperCase().substring(1, 4)) ;
//voir aussi  JQuery en JavaScript

///////////////////////////////////////
//Affichage sur la console
//
//36.900000000000006
//36.9
//36.9
//Valeurs du char :a , valeur du double :20,100000 valeur du Double :20,100000
//
//Valeurs initiales de mes BigDecimaux bd1 :20,123000 , bd2 :16,000000 , bd3 :null 
//
//contenu du double déballé :20.123
//contenu de mon BigDecimal bd3 :36.123
//contenu de mon BigDecimal bd1 :36.123
//20.123 + 16 ; contenu de bd1 :36.123
//valeur du resultat :184.3688
//((20.123 + 16) - 3.2) * 5.6 ; contenu de bd1 :184.3688
//((20.12 + 16) - 3.2) * 5.6 ;contenu de bd1 + arrondi:184.352
//((20.12 + 16) - 3.2) * 5.6 ;contenu de bd1 + 2x arrondis:184.35
//(((20.12 + 16) - 3.2) * 5.6) / 6 ; contenu de bd1 :30.73
//ELL
}}