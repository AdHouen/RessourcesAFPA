package part07_technique_rusee;

public class Exo7_6 {



	public static void main(String[] args) {

		String temp;
		String ch = "";
		
		String [] tab1 = {"ecran", "clavier", "souris", "unite", "centrale", "tour"};
		bulles(tab1); //J'appelle la méthode bulles pour effectuer un tri à bulles de mon tableau 1

		//j'affiche les valeurs de mon tableau 1
		for (int i=0; i<tab1.length;) {
			ch = ch + tab1[i] + " | ";
			i++;
		}
		System.out.println("Les valeurs de mon tableau 1 sont : | " + ch);

		///////////////////////////////////////////////////////////////////
	
		String [] tab2 = {"cable", "prise", "logiciel", "touche", "molette","lecteur"};
		bulles(tab2); //J'appelle la méthode bulles pour effectuer un tri à bulles de mon tableau 2

		//j'affiche les valeurs de mon tableau 2
		System.out.println();
		ch = "";
		for (int i=0; i<tab2.length;) {
			ch = ch + tab2[i] + " | ";
			i++;
		}
		System.out.println("Les valeurs de mon tableau 2 sont : | " + ch);

		///////////////////////////////////////////////////////////////////
				
		//Je crée et rempli mon tableau 3
		String[] tab3 = new String[tab1.length+tab2.length];
		
		int j=0;
		for (int i=0; i<tab1.length;i++) {
			//System.out.println("i =  " + i);
			if (tab2[i].compareTo(tab1[i])>0) {
				temp = tab1[i];
				tab3[j+1] = tab2[i];
				tab3[j] = temp;
			}
			else {
				temp = tab2[i];
				tab3[j+1] = tab1[i];
				tab3[j] = temp;
			}
			j=j+2;
		}
		
		//j'affiche les valeurs de mon tableau 3 avant tri à bulle
		System.out.println();
		ch = "";
		for (int i=0; i<tab3.length;) {
			ch = ch + tab3[i] + " | ";
			i++;
		}
		System.out.println("Les valeurs de mon tableau 3 avant tri à bulle sont : | " + ch);		
		
		
		
		bulles(tab3); //J'appelle la méthode bulles pour effectuer un tri à bulles de mon tableau 3

		//j'affiche les valeurs de mon tableau 3
		System.out.println();
		ch = "";
		for (int i=0; i<tab3.length;) {
			ch = ch + tab3[i] + " | ";
			i++;
		}
		System.out.println("Les valeurs de mon tableau 3 sont : | " + ch);
	}
	
	// Je crée 
	// A la fin de mon code, j'ai écris une méthode pour le tri par selection mais je ne l'utilise pas donc elles est en commentaire
	/**
	 * une méthode pour effectuer un tri à bulle sur mes tableaux
	 * A la fin de mon code, j'ai écris une méthode pour le tri par selection mais
	 * 	 je ne l'utilise pas donc elles est en commentaire
	 * @param tab
	 * @return
	 */
	static String [] bulles (String[] tab) {
		boolean bb = true;
		while (bb==true) {
			bb = false;
			for (int i=0; i<tab.length-1;) {
				if (tab[i].compareTo(tab[i+1])>0) {
					String temp = tab[i];
					tab[i] = tab[i+1];
					tab[i+1] = temp;
					bb = true;
				}
			i++;
			}
		}
		return tab;
	}
	/*
	// Je crée une méthode pour effectuer un tri par selection sur mes tableaux
	static String [] selec (String [] tab) {
		for (int i=0; i<tab.length;) {
			for (int j = i+1; j<tab.length;) {
				if (tab[j].compareTo(tab[i])<0) {
					String temp = tab[i];
					tab[i] = tab[j];
					tab[j] = temp;
				}
				j++;	
			}
			i++;
		}
		return tab;
	}
	*/	
	
}
