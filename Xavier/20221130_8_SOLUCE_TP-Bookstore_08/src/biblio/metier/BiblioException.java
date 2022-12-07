
package biblio.metier;
/**
 * Thème Exception métier, règles métier, LOG4J
 * Classe BibliothequeException pour gérer les exception Métier
 * @version 1.0 
 */

public class BiblioException extends Exception{

	
	private static final long serialVersionUID = 6427267433147160738L;
	
	/** Construit une exception BiblioException avec le message détaillé d'erreur
	 * et a cause de l'erreur. <p> Note que le message détaillé  associé avec
	 * <code>cause</code> n'est <i>pas</i> automatiquement incorporé dans
	 *  le message d'erreur détaillé de l'exception
	 *
	 * @param  message message détaillé (qui est  sauvegardé pour qu'on puisse
	 * 		   le retrouver plus tard par la méthode {@link #getMessage()}.
     * @param  cause la cause d'exception (qui est  sauvegardé pour qu'on puisse
	 * 		   la retrouver plus tard par la méthode {@link #getMessage()}. 
	 *  	(la valeur <tt>null</tt> est permise et indique que la cause n'existe pas ou
     *         est inconnue.)
     */
	public BiblioException(String message, Throwable cause) {
		super(message, cause);
	}


	  /** Construit une nouvelle BiblioException avec la cause spécifié et un
     * message détaillé de <tt>(cause==null ? null : cause.toString())</tt>
     * (aui typiquement contient la class et le message détaillé de
     * <tt>cause</tt>).  Ce constructeur est utile pour des BiblioException
     * qui sont un peu plus que des wrappers pour d'autre throwables.
     *
     * @param  cause la cause d'exception (qui est  sauvegardé pour qu'on puisse
	 * 		   la retrouver plus tard par la méthode {@link #getMessage()}. 
	 *  	(la valeur <tt>null</tt> est permise et indique que la cause n'existe pas ou
     *         est inconnue.)
     */
	public BiblioException(Throwable cause) {
		super(cause);
	}
	
	/** Constructeur d'une nouvelle Biblioexception avec <code>null</code> 
	 * avec un message détaillé.
     * @param  message   le message d'erreur détaillé. Le message détaillé est
     *  sauvegardé pour être réutilisé par la méthode {@link #getMessage()}.
     */
	public BiblioException(String message){
		super(message);
	}
	

	/** Constructeur d'une nouvelle Biblioexception avec <code>null</code>
	 * comme message détaillé. La cause n'est initialisé, et peut être initialisé
     * plus tard par un appel à {@link #initCause}.
     */
	public BiblioException(){
		super("Pb sur l'application bibliothèque");
		
	}

}
