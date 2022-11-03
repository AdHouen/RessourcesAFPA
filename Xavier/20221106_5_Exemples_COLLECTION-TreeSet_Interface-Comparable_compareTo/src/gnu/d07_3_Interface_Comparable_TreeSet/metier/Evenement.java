package gnu.d07_3_Interface_Comparable_TreeSet.metier;

import java.util.Date;
import java.text.DateFormat;

/**
 * Classe metier pour l'evenement avec une date et une description.
 */
public class Evenement implements Comparable
{
	
	private Date   date;		//date de l'�v�nement
	private String description;	//Description de l'�v�nement
	
	// Instanciation d'un objet de classe utilise pour la mise en forme de dates
	private static DateFormat format = DateFormat.getDateTimeInstance (	DateFormat.FULL, DateFormat.SHORT);

	public Evenement (Date date, String description)
	{
		this.date        = date;
		this.description = description;
	}

	public Date getDate ()
	{
		return this.date;
	}

	public String getDescription ()
	{
		return this.description;
	}

	// Implementation de la methode compareTo de l'interface java.lang.Comparable
	public int compareTo (Object obj)
	{
		Evenement evenement = (Evenement)obj;
		// Utilisation de la comparaison de Date pour comparer d'abord dans l'ordre chronologique
		int retourCompareToDeDate = this.date.compareTo (evenement.date);
		if (retourCompareToDeDate != 0)
			return retourCompareToDeDate;
		else
			// Si les dates des evenements sont egales, utilisation de comparaison des descriptions
			return this.description.compareToIgnoreCase (evenement.description);
	}

	// Redefinition des methodes de la classe java.lang.Object
	public String toString ()
	{
		// Mise en forme de la date dans la langue de l'utilisateur
		return format.format (this.date) + " : " + this.description;
	}

	public boolean equals (Object obj)
	{
		if (obj instanceof Evenement)
		{
			Evenement evenement = (Evenement)obj;
			return date.equals(evenement.date) && description.equalsIgnoreCase(evenement.description);
		}
		else
			return false;
	}

	public int hashCode ()
	{
		return this.date.hashCode () + this.description.hashCode ();
	}
}
