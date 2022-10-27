package exo09.item4;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Objectif: Utilisation des classes de l'API du JDK <p>
 *
 * La classe java.net.URL
 * Extraction d'informations dans une URL (Uniform Resource Locator)
 * Format Protocole://site/fichier.htm
 *
 * @author AFPA
 * @version 1.0
 */ 

public class TestURL_autre 
{
	public static void main (String arg []) throws MalformedURLException
	{
		//String url = "ftp://paris/partage/JeuDeLaVie.htm";		
		//System.out.print( "\nDonner une URL : " );
		//url  = Console.in.readLine();
		
		URL url = new java.net.URL("ftp://paris/partage/JeuDeLaVie.htm");
		System.out.println("protocol:"+url.getProtocol() + "  host:"+url.getHost() + "  fichier :" + url.getFile());
		
		//Affichage du protocole
		//Affichage du site
		//Affichage de la page HTML	
		
	}
}
