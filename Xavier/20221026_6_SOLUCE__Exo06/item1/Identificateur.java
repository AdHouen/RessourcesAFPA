
package item1;
//import specialIO.*;
import java.util.Scanner;
/**
 * Objectif: La structure iterative for et le type char.<p>
 *
 * Affichage des caractères pouvant etre utilisés dans un identificateur Java.
 * Les caractères de contrôle sont mis sous la forme \nnn
 *
 * @author AFPA
 * @version 1.0 
 */ 
public class Identificateur{

static final int maxCol = 4;
static final int maxLigne = 20;

public static void main (String[] args)
{
	
int nbChar = 0;
System.out.println ("\nAffichage des caracteres légaux dans les identificateurs Java\n");
for ( char c =  '\0' ; c <= '\u00FF' ; c++){
	if (Character.isJavaIdentifierPart(c)){
		System.out.print("\t  "
				+ ( Character.isISOControl(c) ? "' '  " : "'" + c + "'  " )
				+ Integer.toHexString(c) + "  " + (int) c);
		nbChar ++;
		if (nbChar % maxCol == 0) System.out.println();
	}
	if (nbChar % (maxCol*maxLigne) == 0) {
		System.out.println("\nPage suivante appuyer sur ENTREE ...");
		(new Scanner(System.in)).nextLine();
		//Console.in.readChar();
	}
}//for

}}