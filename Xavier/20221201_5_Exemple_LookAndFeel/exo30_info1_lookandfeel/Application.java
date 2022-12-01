/*
 *
 * Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
package exo30_info1_lookandfeel;

import javax.swing.*;

/**
 * 
 * TODO Pour changer le modèle de ce commentaire de type généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
public class Application {
	Application() {
		FenetrePrincipale fen = new FenetrePrincipale();
		fen.setVisible(true);
	}

	public static void main(String[] args) {
		try {
			///////////////////
			// définition du L&F
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
