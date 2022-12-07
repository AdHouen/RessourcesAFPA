package biblio.exception;

public class BiblioException extends Exception {
	public BiblioException() {
		super("Pb sur l'application bibliothèque");
	}

	public BiblioException(String message) {
		super(message);
	}
}