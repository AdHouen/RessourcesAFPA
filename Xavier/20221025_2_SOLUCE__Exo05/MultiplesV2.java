package version2;
import java.util.Scanner;
/**
 * Objectif: Les structures iteratives while et do...while. Les expressions bool�ennes.<p>
 * Affichage des multiples d'un nombre sur un intervalle (version 2)
 * @author AFPA
 * @version 1.0
 */
public class MultiplesV2{
static final int maxCol = 8;
static final int maxLigne = 10;

public static void main (String arg [])
{
int bInf, bSup, nb, x;
char rep;
Scanner sc = new Scanner(System.in);
System.out.println ("\nAffichage des MULTIPLES");
do {

// ---------------   SAISIR PARAMETRE
System.out.print("\n\tNombres divisibles par : ");
nb = sc.nextInt();

System.out.print("\tLimite inferieure      : ");
bInf = sc.nextInt();

System.out.print("\tLimite superieure      : ");
bSup = sc.nextInt();

System.out.println("\n\nAffichage des multiples de " +
				nb + " entre " + bInf + " et " + bSup + "\n");

// --------------    AFFICHER MULTIPLES
x = bInf;
while ( x <= bSup ) {
	if ( x%nb == 0)
		System.out.print ("\t(" + x++ + ")");
	else
		System.out.print ("\t " + x++);
	if ((x - bInf) % maxCol == 0) System.out.println();	// maxCol caracteres affiches	
	if ((x - bInf) % (maxCol*maxLigne) == 0) {
		System.out.println("\nAppuyer sur ENTREE ...");	   // maxLigne lignes affiches
		sc.nextLine();
	}	
}//while
// -------------   TESTER FIN
do {
	System.out.print("\n\nVoulez-vous continuer (O/N) : ");
	rep = (sc.nextLine()).charAt(0);
} while (rep != 'o' && rep != 'O' && rep != 'n' && rep != 'N');
	
} while (rep == 'o' || rep == 'O' );//fin du bloc do-while
sc.close();
}}