package part07_technique_rusee;

public class Exo7_3 {

	public static void main(String[] args) {
		
		int[] tab = {16,18,15,9,11,10,17,25};
		
		//int[] tab = {16,18,15,9,11,17,25};

		/*System.out.println("Mon tableau initial est :");
		for (int i=0; i<tab.length;) {
			System.out.println("La valeur " + (i+1) + " : " + tab[i]);
			i++;
		}*/
		//System.out.printf("Les valeurs initiales de mon tableau sont : \n");
		System.out.print("tab:\t");
		for( int j : tab){
			System.out.print( "  "  + j);// utilisation
		}
		System.out.println();

		
		int der = tab.length-1;
		
		for (int i=0; i<tab.length/2;) {
			
			int temp = tab[i];
			tab[i] = tab[der];
			tab[der] = temp;
			
			i++;
			der--;
		}

		System.out.printf("\nLes valeurs inversées de mon tableau sont : \n");
		System.out.print("tab:\t");
		for( int j : tab){
			System.out.print( "  "  + j);// utilisation
		}
		System.out.println();
		
		/*System.out.println("\nMon tableau inversé est :\n");
		for (int i=0; i<tab.length;) {
			System.out.println("La valeur " + (i+1) + " : " + tab[i]);
			i++;
		}*/

	}

}
