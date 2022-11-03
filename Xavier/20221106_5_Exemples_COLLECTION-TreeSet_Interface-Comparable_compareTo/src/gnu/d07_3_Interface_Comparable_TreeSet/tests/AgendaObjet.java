package gnu.d07_3_Interface_Comparable_TreeSet.tests;

import gnu.d07_3_Interface_Comparable_TreeSet.metier.Evenement;

import java.util.*;

class AgendaObjet {
	
	private TreeSet<Evenement> evenements = new TreeSet<Evenement>();

	public void add( Evenement e){
		evenements.add(e);
	}
	
	@Override
	public String toString() {
		String sortie="" ;
		// Enumeration des evenements en utilisant un iterateur
		Iterator<Evenement> it = evenements.iterator();
		while (it.hasNext())
			sortie += "\t" + it.next() + "\n"; // L'evenement est converti en texte
											// avec toString
		return sortie;
	}

	public static void main(String[] args) {
		// Creation d'un agenda trie avec trois evenements
		AgendaObjet agenda = new AgendaObjet();
		
		agenda.add(new Evenement(	new GregorianCalendar(
									2004,
									GregorianCalendar.OCTOBER, 19).getTime(),
									"Anniversaire Claire"));
		agenda.add(new Evenement(new GregorianCalendar(
									2004,
									GregorianCalendar.SEPTEMBER, 1, 8, 30).getTime(),
									"Rentr\u00e9e section"));
		agenda.add(new Evenement(new GregorianCalendar(
									2004,
									GregorianCalendar.SEPTEMBER, 1, 8, 30).getTime(),
									"Cours Java"));

		System.out.println("AgendaObjet :");
		System.out.println( agenda);
		
		javax.swing.JOptionPane.showMessageDialog(null, agenda);
		System.exit(0);
	}
	
	
	
	
	
}
