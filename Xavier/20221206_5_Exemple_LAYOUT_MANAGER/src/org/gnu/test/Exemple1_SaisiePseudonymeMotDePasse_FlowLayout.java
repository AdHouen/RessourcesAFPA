/*
 * Fichier org/gnu/test/SaisiePseudonymeMotDePasse_FlowLayout.java
 *
 */
package org.gnu.test;

import javax.swing.*;
import java.awt.*;

class Exemple1_SaisiePseudonymeMotDePasse_FlowLayout
{
  public static void main(String[] args)
  {
    JFrame fenetre = new JFrame ("Identification");
    Container panneau = fenetre.getContentPane();
    // Utilisation d'un gestionnaire de layout FlowLayout avec un ecart
    // de 5 pixels entre les composants alignes sur la gauche
    panneau.setLayout (new FlowLayout (FlowLayout.LEFT, 5, 5));

    // Ajout de 4 composants
    panneau.add (new JLabel ("Pseudonyme :"));
    panneau.add (new JTextField (10));
    panneau.add (new JLabel ("Mot de passe :"));
    panneau.add (new JPasswordField (10));

    // Calcul de la taille preferee de la fenetre en fonction de son contenu
    fenetre.pack();
    
    fenetre.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    fenetre.setVisible(true);
  }
}
