/*
 */
package exo33_2;

import java.io.*;
import java.util.*;


public class BDFichier {
	/**
	 * Commentaire pour <code>leFichier</code>
	 * 		nom complet du fichier
	 */
	private File leFichier;

	public BDFichier(String f) {
		leFichier = new File( f );
	}
	
	public String getNom() {
		return leFichier.getName();
	}
	
	public String getNomComplet() {
		return leFichier.getAbsolutePath();
	}

	public String getContenu() throws IOException {
		StringBuffer contenu = new StringBuffer();
		
		BufferedReader f = new BufferedReader(new FileReader(leFichier));
		String separateur = System.getProperty("line.separator");
		while( f.ready()){
			String ligne = f.readLine();
			contenu.append(ligne + separateur);
		}
		
		return contenu.toString();
	}
	public Vector  <String> getMots() throws IOException {
		Vector <String> lesMots = new Vector <String>();
		
		BufferedReader f = new BufferedReader(new FileReader(leFichier));
		while( f.ready()){
			String ligne = f.readLine();
			String [] tabS = ligne.split(" ");
			for (int i=0; i<tabS.length;i++) {
			String unMot = tabS[i].replaceAll("[:?\",.;]", "");
			if( !lesMots.contains( unMot))
				lesMots.add(0, unMot);
			}
		}
		Collections.sort(lesMots);
		return lesMots;
	}
	
	public Vector <String> getLignes() throws IOException {
		Vector<String> lignes = new Vector<String>();
		
		BufferedReader f = new BufferedReader(new FileReader(leFichier));
		while (true) {
			String lg = f.readLine();
			if (lg == null)
				break;
			if (lg.length() > 0)
				lignes.addElement(lg);
		}
		f.close();
		
		return lignes;		
	}
}
