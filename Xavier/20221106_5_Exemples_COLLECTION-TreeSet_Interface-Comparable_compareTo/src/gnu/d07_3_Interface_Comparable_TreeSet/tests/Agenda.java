package gnu.d07_3_Interface_Comparable_TreeSet.tests;

import gnu.d07_3_Interface_Comparable_TreeSet.metier.Evenement;

import java.util.*;

class Agenda {
	public static void main(String[] args) {
		
		// Creation d'un agenda trie avec trois evenements
		TreeSet agenda = new TreeSet();

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


		String evenements = "";
		
		// Enumeration des evenements en utilisant un iterateur
		Iterator it = agenda.iterator();
		while (it.hasNext())
			evenements += it.next() + "\n"; // L'evenement est converti en texte
											// avec toString

		javax.swing.JOptionPane.showMessageDialog(null, evenements);
		System.exit(0);
	}
}
