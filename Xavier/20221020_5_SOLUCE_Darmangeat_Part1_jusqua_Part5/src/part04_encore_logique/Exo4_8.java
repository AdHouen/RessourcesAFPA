package part04_encore_logique;
import java.util.Scanner;

public class Exo4_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Entrer un numéro pour le jour ");
		int jj = sc.nextInt();
		System.out.print("Entrer un numéro pour le mois ");
		int mm = sc.nextInt();
		System.out.print("Entrer un numéro pour l'année ");
		int aaaa = sc.nextInt();
		
		int [] mois = {1,0,3,0,5,0,7,8,0,10,0,12};

		String [] mmmm = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};
		int ab = aaaa%4;

		if (jj>31) {
			System.out.println("La date n'est pas correcte, un mois compte 31 jours au maximum");
		}
		else if (mm>12) {
			System.out.println("La date n'est pas correcte, une année compte 12 mois au maximum");
		}
		else if (mm==2 & jj>=30){
			System.out.println("La date n'est pas correcte, le mois de févirer compte 29 jours au maximum");
		}
		else if (mm==2) {
			if ((jj==29 & ab==0 & aaaa!=0) | jj<=28) {
				System.out.println("La date entrÈe est correcte");
			}
			else {
				System.out.println("La date entrée n'est pas correcte, " + aaaa + " n'est pas une année bissextile");
			}	
		}
		else if (jj==31) {
			if (mm==mois[mm-1]) {
				System.out.println("La date entrée est correcte");				
			}
			else {
				System.out.println("La date n'est pas correcte, Le mois de " + mmmm [mm-1] + " compte 30 jours au maximum");				
			}
		}
		else {
			System.out.println("La date entrée est correcte");
		}

		sc.close();
	}

}
