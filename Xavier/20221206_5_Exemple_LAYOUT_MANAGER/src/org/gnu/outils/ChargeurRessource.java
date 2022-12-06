/*
 * Fichier org/gnu/outils/ChargeurRessource.java
 *
 */
package org.gnu.outils;

import javax.swing.ImageIcon;

/**
 * Chargeur de ressources relatives au classpath.
 * Exemple d'utilisation :
 * <pre>  ChargeurRessource chargeur = new ChargeurRessource ("/org/gnu/images/");
 *  // Creation d'une icone avec l'image de la ressource org/gnu/images/test.jpg
 *  ImageIcon icone = chargeur.getIcon ("test.jpg");</pre>
 */
public class ChargeurRessource
{
  private String base;

  /**
   * Initialise un chargeur de ressources avec base comme chemin relatif des ressources.
   * @param base  un chemin d'acces.
   */
  public ChargeurRessource (String base)
  {
    this.base = base;
  }

  public ChargeurRessource ()
  {
    this ("");
  }

  /**
   * Renvoie l'icone du fichier icon relatif a la base.
   */
  public ImageIcon getIcon (String icon)
  {
    Class classe = getClass();
    return new ImageIcon (classe.getResource(this.base + icon));
  }
}
