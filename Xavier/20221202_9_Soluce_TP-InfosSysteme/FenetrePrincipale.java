package exo31_1_INFOSYSTEM;
import java.net.*;import javax.swing.*;
import java.awt.*;
/**
 * <p>Titre : </p>
 * @author Afpa
 * @version 1.0
 */
public class FenetrePrincipale extends JFrame {
	private static final long serialVersionUID = 1L;
//Référence du tableau d'objets (composants JTextField)
private JTextField[] txtInfos;

public FenetrePrincipale() {
	super("Propriétés système");
	setResizable(false);
	this.setSize(450, 198);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	// Centrer la fenêtre
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	Dimension frameSize = this.getSize();
	if (frameSize.height > screenSize.height)
		frameSize.height = screenSize.height;
	if (frameSize.width > screenSize.width)
		frameSize.width = screenSize.width;
	this.setLocation((screenSize.width - frameSize.width) / 2,
			(screenSize.height - frameSize.height) / 2);

	initControles();
	setInfos();
}

private void initControles() {
	JPanel zoneClient = (JPanel) this.getContentPane();
	zoneClient.setLayout(null);
	
	String[] labels = { "Nom de la machine", "Adresse IP", "Utilisateur",
			"Nom de l'OS", "Machine Virtuelle" };

	//Dimensionnement du tableau d'objets JTextField
	txtInfos = new JTextField[labels.length];

	//Image à gauche
	JLabel lblIcone = new JLabel(new ImageIcon("javalogo.gif"),
			SwingConstants.LEFT);
	lblIcone.setBounds(5, 10, 80, 100);
	zoneClient.add(lblIcone);

	for (int i = 0; i < labels.length; i++) {
		//instanciation des objets JLabel
		JLabel lblNom = new JLabel(labels[i]);
		lblNom.setBounds(80, 10 + 25 * i, 130, 20);
		zoneClient.add(lblNom);

		//instanciation des objets JTextField
		txtInfos[i] = new JTextField();
		txtInfos[i].setEditable(false);
		txtInfos[i].setBounds(205, 10 + 25 * i, 200, 20);
		zoneClient.add(txtInfos[i]);
	}
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
}}
