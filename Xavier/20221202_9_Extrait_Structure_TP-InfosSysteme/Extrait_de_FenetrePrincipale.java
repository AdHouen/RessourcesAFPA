package exo31_1_INFOSYSTEM;

import java.net.*;
import javax.swing.*;
import java.awt.*;

/**
 * <p>Titre : </p>
 * <p>Description : </p>
 * <p>Copyright : Copyright (c) 2005</p>
 * <p>Société : </p>
 * @author non attribuable
 * @version 1.0
 */

public class FenetrePrincipale extends JFrame {

	//Référence du tableau d'objets JTextField
	private JTextField[] txtInfos;

	public FenetrePrincipale() {
		...

		initControles();
		setInfos();
	}

	private void initControles() {
		...
	}

	private void setInfos() {
		try {
			InetAddress adr = InetAddress.getLocalHost();
			txtInfos[0].setText(adr.getHostName());
			txtInfos[1].setText(adr.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		txtInfos[2].setText(System.getProperty("user.name"));
		txtInfos[3].setText(System.getProperty("os.name"));
		txtInfos[4].setText(System.getProperty("java.vm.vendor")
				+ System.getProperty("java.vm.version"));
	}
}
