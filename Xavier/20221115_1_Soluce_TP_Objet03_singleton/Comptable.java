package biblio3.item4_comptable_singleton;
/** Comptable avec le design pattern GOF singleton*/
public class Comptable {
	private double totalPrix = 0.0;
	
	private static Comptable singleton;

	private Comptable() {
		//super();sous-entendu
	}
	public double getTotalPrix() {
		return totalPrix;
	}
	public void comptabilise(Livre livre) {
		totalPrix += livre.getPrix();
	}
	public static Comptable getInstance(){
		if( singleton == null) {
			singleton = new Comptable();
		}
		return singleton;
	}
}