
/*
 *
 * Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */

package exo30_info1_lookandfeel;

import javax.swing.JFrame;

/**
 * @author afpa
 *
 * TODO Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
public class FenetrePrincipale extends JFrame {
	private static final long serialVersionUID = 6977766864416517034L;

	FenetrePrincipale ()
	{
		super("Application de dessin");
		//this.setVisible(true);
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE );		
	}
}
