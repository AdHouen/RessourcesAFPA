/*
 *
 * Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
package exo30_info1_lookandfeel;

import javax.swing.*;

/**
 * 
 * TODO Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
public class Application {
	Application() {
		FenetrePrincipale fen = new FenetrePrincipale();
		fen.setVisible(true);
	}

	public static void main(String[] args) {
		try {
			///////////////////
			// d�finition du L&F
			///////////////////
			
			// Marche pas: UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			
			//L&F metal
			UIManager.setLookAndFeel(UIManager
					.getCrossPlatformLookAndFeelClassName());
			JFrame.setDefaultLookAndFeelDecorated(true);

		} catch (Exception e) {
			e.printStackTrace();
		}

		new Application();

		System.out.println("Je suis passe par la !");
	}
}
