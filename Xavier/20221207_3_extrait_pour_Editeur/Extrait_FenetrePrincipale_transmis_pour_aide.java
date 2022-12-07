package exo33_2;
//import java.awt.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 * @author Afpa
 *
 */
public class Extrait_FenetrePrincipale_transmis_pour_aide extends JFrame {

	private JList lstMots = new JList();
	private JTextArea txtContenu = new JTextArea();
	private JButton cmdChercher = new JButton( "Chercher");
	private JLabel lblFichier = new JLabel();
	
	private BDFichier bdFichier = new BDFichier("shadock.txt");
	
	...
	
	private void initControles() {
		...		
		
		//Abonnement des listeners
		cmdChercher.addActionListener( new MonActionListener());
		lstMots.addListSelectionListener(new MonListSelectionListener());
		lstMots.addMouseListener( new MonMouseListener());
		
		...	
		
	}
	
	//Les classes Listeners
	class MonListSelectionListener implements ListSelectionListener {
		public void valueChanged( ListSelectionEvent e) {
			if( e.getSource() == lstMots )
					lstMots_click();
		}
	}
	
	class MonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if( e.getSource() == cmdChercher )
				cmdChercher_click();
		}
	}
	class MonMouseListener implements MouseListener {
		public void mouseClicked( MouseEvent e){
			if( e.getClickCount() >= 2 && e.getSource() == lstMots)
				cmdChercher_click();
		}
		public void mouseEntered( MouseEvent e){}
		public void mouseExited( MouseEvent e){}
		public void mousePressed( MouseEvent e){}
		public void mouseReleased( MouseEvent e){}
	}
	
	//Les traitements de l'IHM suite aux �venements
	void lstMots_click(){
		System.out.println("Traitement sur clic du mot");
		cmdChercher.setEnabled(true);
	}
	void cmdChercher_click(){
		System.out.println("Traitement sur btChercher ou double-clic");
		String texte = txtContenu.getText();
		String mot = (String )lstMots.getSelectedValue();
		int pos = texte.indexOf( mot, txtContenu.getCaretPosition());
		if( pos != -1) {
			txtContenu.setSelectionStart( pos );
			txtContenu.setSelectionEnd( pos + mot.length());
			txtContenu.requestFocus();
		}
	}
}
