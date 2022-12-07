
package biblio.test;

import biblio.metier.TypeDonneesAnnee;

/**
 *  Association, méthode d'instance
 * @version 1.0
 */
public class TypeDonneesAnneeTest {

	
	public static void main(String[] args) {
		
		TypeDonneesAnnee annee1 = new TypeDonneesAnnee();
		TypeDonneesAnnee annee2 = new TypeDonneesAnnee();
		
		annee1.setAnnee(1982);
		annee2.setAnnee(1975);
		
		if(annee1.equals(annee2))
			System.out.printf("les deux annees, %d et %d sont égales \n", annee1.getAnnee(),annee2.getAnnee());
		else
			System.out.printf("les deux annees, %d et %d ne sont pas égales \n", annee1.getAnnee(),annee2.getAnnee());
		
		annee2.setAnnee(1982);
		
		if(annee1.equals(annee2))
			System.out.printf("les deux annees, %d et %d sont égales \n", annee1.getAnnee(),annee2.getAnnee());
		else
			System.out.printf("les deux annees, %d et %d ne sont pas égales \n", annee1.getAnnee(),annee2.getAnnee());
		
		
		System.out.println(annee1.hashCode());
		System.out.println(annee2.hashCode());
	}

}
