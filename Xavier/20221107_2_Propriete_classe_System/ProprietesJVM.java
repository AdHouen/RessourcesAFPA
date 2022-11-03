/*
 * Fichier org/gnu/test/ProprietesJVM.java
 *
 */
package gnu.d06_03_System;

class ProprietesJVM
{
  public static void main(String[] args)
  {
	  
    // Construction d'un texte avec les proprietes de la JVM
    // Nota : les caracteres \u25cf et \u25aa affichent un rond plein et un carre plein
    String texte = "Bonjour " + System.getProperty ("user.name");
    texte = texte + "\n\u25cf Votre code pays/langue est " + System.getProperty ("user.country")
                                              + "/" + System.getProperty ("user.language");
    texte += "\n\u25cf Votre dossier personnel est " + System.getProperty ("user.home");
    texte += "\n\u25cf Votre dossier de travail est " + System.getProperty ("user.dir");
    texte += "\n\u25cf Votre syst\u00e8me (" + System.getProperty ("os.name")
                                    + " " + System.getProperty ("os.version") + ") :";
    texte += "\n  \u25aa Utilise le caract\u00e8re "
             + System.getProperty("file.separator") + " comme s\u00e9parateur de dossiers";
    texte += "\n  \u25aa Utilise le caract\u00e8re "
             + System.getProperty("path.separator") + " comme s\u00e9parateur de chemins";
    String separateurLigne = System.getProperty ("line.separator");
    // Construction d'un texte en fonction du nombre de caracteres de separateurLigne
    if (separateurLigne.length () > 1)
      texte += "\n  \u25aa Utilise les caract\u00e8res de code ";
    else
      texte += "\n  \u25aa Utilise le caract\u00e8re de code ";
    // Transformation des caracteres en leur code Java correspondant
    for (int i = 0; i < separateurLigne.length(); i++)
      switch (separateurLigne.charAt(i))
      {
        case '\r' : texte += "\\r ";
                    break;
        case '\n' : texte += "\\n ";
                    break;
      }
    texte += "pour le retour \u00e0 la ligne";

    texte += "\n\u25cf Votre JVM de version " + System.getProperty("java.version")
                                + " : ";
    texte += "\n  \u25aa Est install\u00e9e dans le dossier "
                                + System.getProperty("java.home");
    texte += "\n  \u25aa Utilise le classpath "
                                + System.getProperty ("java.class.path");
    texte += "\n  \u25aa Est d\u00e9velopp\u00e9e par "
                                + System.getProperty("java.vendor");
    texte += " et disponible \u00e0 " + System.getProperty ("java.vendor.url");

    // Affichage dans la fenetre de commande et dans une boite de dialogue
    System.out.println (texte);
    javax.swing.JOptionPane.showMessageDialog (null, texte);

    System.exit (0); // Arret de la JVM
  }
}
