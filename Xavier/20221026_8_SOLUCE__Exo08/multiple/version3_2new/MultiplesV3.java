package multiple.version3_2new;
import fr.afpa.outils.*;
/**
 * Objectif: Découpage d'une application en fonctions.<p>
 * Affichage des multiples d'un nombre sur un intervalle.
 * @author AFPA
 */ 
public class MultiplesV3{
	
static final int maxCol = 8;
static final int maxLigne = 10;
static char rep;
static int bInf, bSup,  nb;

/*Niveau 0*/
public static void main (String arg []) 
{
Console.out.println ("\nAffichage des MULTIPLES");
do {
	saisirParam();
		Console.out.println("\n\nAffichage des multiples de "
	+ nb + " entre " + bInf + " et " + bSup + "\n");
	afficherMultiples ();
	obtenirOuiNon ();
} while (rep == 'O' );
}//main
/**
 * Niveau 1
 * Affiche sur la sortie standard une question et attend la réponse
 * O ou N depuis l'entrée standard*/ 
public static void obtenirOuiNon ()
{
//char rep;
//MultiplesV3.rep = 'Y';
do {
	Console.out.print("\n\nVoulez-vous continuer (O/N) : ");
	rep = Character.toUpperCase(Console.in.readChar());
} while (rep != 'O' && rep != 'N');
}//obtenirOuiNon()
/**
 * Niveau 1
 * Saisie des paramètres utilisateur (bInf, bSup et nb)*/ 
public static void saisirParam()
{	
for (;;) {	
	Console.out.print("\n\tNombres divisibles par : ");
	nb = Console.in.readInt();
	Console.out.print("\tLimite inferieure      : ");
	bInf = Console.in.readInt();
	Console.out.print("\tLimite superieure      : ");
	bSup = Console.in.readInt();
   if (bSup > bInf && nb > 0 ) break ;  // Boucle de Djikstra
	Console.out.println("Erreur de saisie !!!\n");
}  
}//saisirParam()
/**
 * Niveau 1
 * Visualise, entre bInf à bSup, les multiples de nb*/ 
public static void afficherMultiples ()
{
int x = bInf;
while ( x <= bSup ) {
	if ( x % nb == 0) 
		System.out.print("\t(" + x++ + ")");
	else
		System.out.print ("\t " + x++);
	if ((x - bInf) % maxCol == 0)
		System.out.println();	// maxCol caracteres affiches
	if ((x - bInf) % (maxCol*maxLigne) == 0)
		attendreEntree();
}
}//afficherMultiples ()
/**
 * Niveau 2
 * Attend l'appuie sur la touche ENTREE*/ 
public static void attendreEntree ()
{
// maxLigne lignes affiches
System.out.println("\nAppuyer sur ENTREE ...");	
Console.in.readChar();
}
}

