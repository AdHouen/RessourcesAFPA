/*
 * Fichier org/gnu/test/JoursFeries.java
 *
 */
package gnu.d06_7_Date_Tableau.tests;

import java.text.DateFormat;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

class JoursFeries
{
  public static void main(String[] args)
  {
    // Saisie de l'annee
    String texteAnnee = JOptionPane.showInputDialog("Ann\u00e9e recherch\u00e9e :");
    int annee = Integer.parseInt (texteAnnee);
    // Tableau des jours feries mobiles
    GregorianCalendar joursFeriesMobiles [] =
        {new GregorianCalendar (annee, GregorianCalendar.JANUARY, 1),
         new GregorianCalendar (annee, GregorianCalendar.MAY, 1),
         new GregorianCalendar (annee, GregorianCalendar.MAY, 8),
         new GregorianCalendar (annee, GregorianCalendar.JULY, 14),
         new GregorianCalendar (annee, GregorianCalendar.AUGUST, 15),
         new GregorianCalendar (annee, GregorianCalendar.NOVEMBER, 1),
         new GregorianCalendar (annee, GregorianCalendar.NOVEMBER, 11),
         new GregorianCalendar (annee, GregorianCalendar.DECEMBER, 25)};
    String joursFixes = "Jours f\u00e9ri\u00e9s fixes :"
                        + "\n\u25aa Lundi de p\u00e2ques"
                        + "\n\u25aa Jeudi de l'ascension"
                        + "\n\u25aa Lundi de pentec\u00f4te";
    String joursMobiles = "Jours f\u00e9ri\u00e9s mobiles :";
    DateFormat formatJour = DateFormat.getDateInstance(DateFormat.FULL);
    int nombreJoursFeriesHorsWeekEnd = 3;
    for (int i = 0; i < joursFeriesMobiles.length; i++)
    {
      GregorianCalendar jour = joursFeriesMobiles [i];
      // Ajout du jour mis en forme a la liste des jours feries mobiles
      joursMobiles += "\n\u25aa " + formatJour.format (jour.getTime());
      // Decompte des jours hors week end
      if (   jour.get(GregorianCalendar.DAY_OF_WEEK) != GregorianCalendar.SATURDAY
          && jour.get(GregorianCalendar.DAY_OF_WEEK) != GregorianCalendar.SUNDAY)
        nombreJoursFeriesHorsWeekEnd++;
    }

    String message = "Calendrier fran\u00e7ais des jours f\u00e9ri\u00e9s de " + annee
                   + " (" + nombreJoursFeriesHorsWeekEnd + " jours hors week end) :"
                   + "\n" + joursFixes
                   + "\n" + joursMobiles;
    JOptionPane.showMessageDialog(null, message);
    System.exit(0);
  }
}
