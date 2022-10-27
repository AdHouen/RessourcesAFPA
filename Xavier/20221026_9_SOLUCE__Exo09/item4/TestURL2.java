package exo09.item4;
import java.net.MalformedURLException;
import java.net.URL;
public class TestURL2 {
/**
 * @param args
 * @throws MalformedURLException 
 */
public static void main(String[] args) throws MalformedURLException   {
	
URL url = new java.net.URL("ftp://paris/partage/JeuDeLaVie.htm");
//question : est-ce une exception contrôlée ou non-contrôlée ?

System.out.println("protocol :"+ url.getProtocol());
System.out.println("serveur :"+ url.getHost());
System.out.println("fichier :"+ url.getFile());
}}
