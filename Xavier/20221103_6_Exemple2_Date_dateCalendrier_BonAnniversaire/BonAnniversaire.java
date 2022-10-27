/*
 * Fichier org/gnu/test/BonAnniversaire.java
 *
 */
package gnu.d06_6_Date.tests;

import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.Date;
import javax.swing.JOptionPane;

class BonAnniversaire
{
	public static void main(String[] args)
	{
		String date = JOptionPane.showInputDialog( "Date d'anniversaire (jj/mm) :"	);
		// Extraction du jour et du mois
		int indiceSlash = date.indexOf(	'/' );
		String jourDate = date.substring( 0, indiceSlash );
		String moisDate = date.substring( indiceSlash + 1 );
		// Creation d'un objet java.util.GregorianCalendar a la date d'aujourd'hui
		GregorianCalendar aujourdhui = new GregorianCalendar ();
		// Creation d'un objet java.util.GregorianCalendar a la date d'anniversaire
		// Attention ! l'indice du mois debute a 0 (0 pour janvier, 1 pour fevrier,...)
		GregorianCalendar anniversaire;
		anniversaire = new GregorianCalendar(	aujourdhui.get(GregorianCalendar.YEAR),
												Integer.parseInt(moisDate) - 1,
												Integer.parseInt(jourDate)	);
		String message;

		// Calcul de la différence de jours entre les deux dates
		long joursRestant =	anniversaire.get( GregorianCalendar.DAY_OF_YEAR ) -
		aujourdhui.get( GregorianCalendar.DAY_OF_YEAR );
		if( joursRestant == 0 )
			message = "Bon anniversaire !";
		else
		{
			// Si l'anniversaire est deja passé, la date passe a l'année prochaine
			if( anniversaire.before( aujourdhui ) )
			{
				anniversaire.set( GregorianCalendar.YEAR, aujourdhui.get(GregorianCalendar.YEAR)+1 );
				GregorianCalendar prochain31Decembre = new GregorianCalendar(	aujourdhui.get(GregorianCalendar.YEAR),
																				GregorianCalendar.DECEMBER,
																				31 );
				joursRestant =	anniversaire.get(GregorianCalendar.DAY_OF_YEAR) +
									( prochain31Decembre.get(GregorianCalendar.DAY_OF_YEAR) -
											aujourdhui.get(GregorianCalendar.DAY_OF_YEAR) );
			}
			// Mise en forme de la date au format complet (par exemple lundi 12 mai 2003)
			DateFormat formatJour = DateFormat.getDateInstance(DateFormat.FULL);
			
			Date dateAnniversaire = anniversaire.getTime();
			String texteDateAnniversaire = formatJour.format( dateAnniversaire );
			message =	"Votre anniversaire est dans " + joursRestant + " jours" +
						"\nle " + texteDateAnniversaire;
		}
		JOptionPane.showMessageDialog(null, message);
		System.exit (0);
	}
}
