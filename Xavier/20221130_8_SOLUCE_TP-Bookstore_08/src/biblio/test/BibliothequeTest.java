
package biblio.test;

import java.text.ParseException;


import biblio.metier.BiblioException;
import biblio.metier.EnumStatusLivre;
import biblio.metier.Livre;
import biblio.metier.Utilisateur;

/**
 * 
 *  Association, méthode d'instance
 * 
 * Classe Bibliotheque de Test
 * 
 * 
 * @version 1.0
 */
public class BibliothequeTest {

	
	
	public static void main(String[] args) throws ParseException {
		
		
		
	    
	  
		
		Livre [] livre= new Livre[3];
		
		try {
			livre[0] = new Livre("Hergé","Tintin",100,9.0, EnumStatusLivre.prete,1985);
		}
		catch (BiblioException be)
		{
			System.out.println(be);
		}
		
		try
		{
			livre[1]= new Livre("Albert Uderzo","Asterix",100,10.0,EnumStatusLivre.disponible,1985);
		}
		catch (BiblioException be)
		{
			System.out.println(be);
		}
		
		try
		{
			livre[2] = new Livre("Victor Hugo","Le dernier jour d'un condamné",-1,8.0,EnumStatusLivre.disponible,1970);
		}
		catch (BiblioException be)
		{
			System.out.println(be);
		}
		
		try
		{
		livre[2] = new Livre("Victor Hugo","Le dernier jour d'un condamné",0,8.0,EnumStatusLivre.disponible,1970);
		}
		catch (BiblioException be)
		{
			System.out.println(be);
		}
		
		System.out.println();
	
		Utilisateur toto = new Utilisateur("toto","titi");
		Utilisateur zorro = new Utilisateur ("Zorro","Diego");
		
		System.out.println(toto);
		System.out.println(zorro);
		
		// Prêt pas en retard
		System.out.println("Emprunt pas en retard");
		try {
			toto.setEmprunt(livre[1]);
		}
		catch (BiblioException be)
		{
			System.out.println(be);
		}
		System.out.println(toto.getEmprunt());
		System.out.println(toto.isPretEnRetard());
		System.out.println();
		System.out.println(toto);
		System.out.println(zorro);
		
		// Prêt en retard, on force la date du prêt
		try {
			zorro.setEmprunt(livre[0]);
		}
		catch (BiblioException be)
		{
			System.out.println(be);
		}
		System.out.println("Emprunt en retard");
		System.out.println(zorro.getEmprunt());
		livre[0].setDateEmprunt(Livre.sdf.parse("29-08-2011"));
		System.out.println(zorro.isPretEnRetard());
		System.out.println();
		System.out.println(toto);
		System.out.println(zorro);
		
		// Pas d'emprunt
		try
		{
			toto.setEmprunt(null);
		}
		catch (BiblioException be) 
		{
			System.out.println(be);
		}
		
		try
		{
			zorro.setEmprunt(null);
		}
		catch (BiblioException be)
		{
			System.out.println(be);
		}
		System.out.println(toto.isPretEnRetard());
		System.out.println("Pas d'emprunt");
		System.out.println(toto);
		System.out.println(zorro);
		System.out.println();
		
		try {
			toto.setEmprunt(livre[0]);
		}
		catch (BiblioException be)
		{
			System.out.println(be);
		}
		System.out.println(toto.getEmprunt());
		System.out.println(toto.isPretEnRetard());
		System.out.println(toto);
		System.out.println(zorro);
		
		System.out.println();
		//prêt d'un livre déjà emprunté
		try
		{
			zorro.setEmprunt(livre[0]);
		}
		catch (BiblioException be)
		{
			System.out.println(be);
		}
		
		try {
			toto.setEmprunt(null);
		} catch (BiblioException be)
		{
			System.out.println(be);
		}
		try {
			zorro.setEmprunt(livre[1]);
		}
		catch (BiblioException be)
		{
			System.out.println(be);
		}
		
		livre[1].setDateEmprunt(Livre.sdf.parse("29-08-2011"));
		
		try
		{
		zorro.setEmprunt(livre[0]);
		}
		catch (BiblioException be)
		{
			System.out.println(be);
		}
	}
}
