package part07_technique_rusee;

import java.util.Scanner;

public class Exo7_5 {

	public static void main(String[] args) {

		String [] dico = {"ecran", "clavier", "souris", "unite", "centrale", "cable", "prise", "logiciel", "touche", "molette"};
		
		//Je trie les valeurs de mon dico par ordre croissant
		for (int i=0; i<dico.length;) {
			for (int j = i+1; j<dico.length;) {
				if (dico[j].compareTo(dico[i])<0) {
					
					String temp = dico[i];
					dico[i] = dico[j];
					dico[j] = temp;
				}
				
				j++;	
			}
			
			i++;
		}
		
		//j'affiche les valeurs de mon dico
		for (int i=0; i<dico.length;) {
			System.out.println("La valeur " + (i+1) + " de mon tableau est : " + dico[i]);
			i++;
		}
		

		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nQuel est le mot recherché ? ");
		String seek = sc.nextLine();
		
		boolean find = false;
		int beg = 0;
		int end = dico.length-1;
		int mid = 0;
		while (find == false & beg <= end )
		{
			mid = (beg+end)/2;
		
/*			if ( dico[mid].equals(seek) ) {
				find = true;
			}*/
			if ( dico[mid].compareTo(seek) == 0 ) {
				find = true;
			}
			else if (dico[mid].compareTo(seek) < 0) {
				beg = mid+1;
			}
			else if (dico[mid].compareTo(seek) > 0) {
				
				end = mid-1;
			}
			else 
			{
				throw new RuntimeException("Cas impossible");
			}
		}
		
		if (find == true) {
			System.out.print("Le mot recherché est à la position " + (mid+1) + " de mon dico");
		}
		else
			System.out.print("Le mot recherché n'existe pas dans mon dico");
		
		sc.close();
	}

}
