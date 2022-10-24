package part07_technique_rusee;

import java.util.Scanner;

public class Exo7_4 {

	public static void main(String[] args) {

		int[] tab = {12, 8, 4, 45, 64, 9, 2};
		
		System.out.println("Les valeurs initiales de mon tableau sont ");
		System.out.print("tab:\t");
		for( int j : tab){
			System.out.print( "  "  + j);// utilisation
		}
		System.out.println();
		
		
		Scanner sc = new Scanner (System.in);
		System.out.print("\nQuelle est le numéro d'ordre de la valeur que vous souhaitez supprimer (entre 1 et " + tab.length +") ? ");
		int id = sc.nextInt()-1;
		
		if (id > (tab.length-1) ) {
			System.out.print("\nLa valeur entrée dépasse la taille du tableau");
			System.exit(-1);
		}	
		
		int[] tab2 = new int[tab.length-1];
		
		for (int i=0; i<tab2.length;) {

			if (i >= id) {//une fois, à l'indice, on copie case à case en décaler
				tab2[i] = tab[i+1];
				i++;
			}
			else { //i < id  //au debut on copie case à case
				tab2[i] = tab[i];
				i++;
			}
		}
		
		System.out.println();
		if (id<tab.length) {
			System.out.println("Les valeurs de mon nouveau tableau sont  ");
			System.out.print("tab2:\t");
			for( int j : tab2){
				System.out.print( "  "  + j);// utilisation
			}
			System.out.println();
		}
		
		sc.close();
	}

}
