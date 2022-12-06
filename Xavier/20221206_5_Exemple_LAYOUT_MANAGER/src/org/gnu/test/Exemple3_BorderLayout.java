
package org.gnu.test;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Exemple3_BorderLayout extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JButton centre = null;

	private JButton ouest = null;

	private JButton nord = null;

	private JButton estjButton = null;

	private JButton sud = null;

	/**
	 * This method initializes centre	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getCentre() {
		if (centre == null) {
			centre = new JButton();
			centre.setText("centre");
		}
		return centre;
	}

	/**
	 * This method initializes ouest	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getOuest() {
		if (ouest == null) {
			ouest = new JButton();
			ouest.setText("ouest");
		}
		return ouest;
	}

	/**
	 * This method initializes nord	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getNord() {
		if (nord == null) {
			nord = new JButton();
			nord.setText("nord");
		}
		return nord;
	}

	/**
	 * This method initializes estjButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getEstjButton() {
		if (estjButton == null) {
			estjButton = new JButton();
			estjButton.setText("est");
		}
		return estjButton;
	}

	/**
	 * This method initializes sud	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getSud() {
		if (sud == null) {
			sud = new JButton();
			sud.setText("sud");
		}
		return sud;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Raccord de méthode auto-généré
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Exemple3_BorderLayout thisClass = new Exemple3_BorderLayout();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public Exemple3_BorderLayout() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getCentre(), BorderLayout.CENTER);
			jContentPane.add(getOuest(), BorderLayout.WEST);
			jContentPane.add(getNord(), BorderLayout.NORTH);
			jContentPane.add(getEstjButton(), BorderLayout.EAST);
			jContentPane.add(getSud(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}

}  //  @jve:decl-index=0:visual-constraint="70,28"
