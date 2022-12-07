package biblio.metier;

public class BiblioException extends Exception {

	public BiblioException() {
		super("Pb générique sur la bibliothèque");
		
	}

	public BiblioException(String message, Throwable cause) {
		super(message, cause);
	}

	public BiblioException(String message) {
		super(message);
	}

	public static void main(String[] args) {

	}

}
