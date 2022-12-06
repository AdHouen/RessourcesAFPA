package demo3_layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class FenetrePrincipaleLayout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetrePrincipaleLayout window = new FenetrePrincipaleLayout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FenetrePrincipaleLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnWest = new JButton("WEST");
		frame.getContentPane().add(btnWest, BorderLayout.WEST);
		
		JButton btnEast = new JButton("EAST");
		frame.getContentPane().add(btnEast, BorderLayout.EAST);
		
		JButton btnSouth = new JButton("SOUTH");
		frame.getContentPane().add(btnSouth, BorderLayout.SOUTH);
		
		JPanel panNorth = new JPanel();
		FlowLayout fl_panNorth = (FlowLayout) panNorth.getLayout();
		fl_panNorth.setAlignment(FlowLayout.LEFT);
		frame.getContentPane().add(panNorth, BorderLayout.NORTH);
		
		JButton btnOutil = new JButton("outil1");
		btnOutil.setHorizontalAlignment(SwingConstants.LEFT);
		panNorth.add(btnOutil);
		
		JButton btnOutil_1 = new JButton("outil2");
		btnOutil_1.setHorizontalAlignment(SwingConstants.LEFT);
		panNorth.add(btnOutil_1);
		
		JPanel panCenter = new JPanel();
		frame.getContentPane().add(panCenter, BorderLayout.CENTER);
		panCenter.setLayout(new GridLayout(2, 2, 2, 2));
		
		JButton btnCompos_2 = new JButton("compos3");
		panCenter.add(btnCompos_2);
		
		JButton btnCompos_1 = new JButton("compos2");
		panCenter.add(btnCompos_1);
		
		JButton btnCompos = new JButton("compos1");
		panCenter.add(btnCompos);
	}

}
