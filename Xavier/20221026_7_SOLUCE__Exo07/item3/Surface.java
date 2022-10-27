package exo07.item3;

import java.util.Scanner;

import fr.afpa.outils.*;

/**
 * Objectif: Les types standard<p>
 *
 * Calcul de la surface d'un cercle
 *
 * @author AFPA
 * @version 1.0
 */ 


public class Surface
{
	static final float PI = 3.14f;
	
	public static void main (String arg [])
	{
		float diam;
		
		System.out.print("Donnez le diametre du cercle :");
		diam = (new Scanner(System.in)).nextFloat();
		//diam = Console.in.readFloat();
		System.out.println ("La surface du cercle de diametre " + 
		                    diam + " vaut " + (PI * diam * diam )/4 );
		System.out.println ("La surface du cercle de diametre " + 
                diam + " vaut " + (PI * (diam) * diam )/4 );

	}
}