package biblio3.item4_comptable_singleton;

public class Livre {
  // Variables
  private String titre, auteur;
  private int nbPages;
  private double prix;
  
  // C'est plus lisible que de laisser l'initialisation par d�faut
  private boolean prixFixe = false;
  
  public static int countNew;
  
  // Le m�me comptable pour tous les livres (static)
  private static Comptable comptable = Comptable.getInstance();

  public void setPrix(double unPrix) {
 	if (unPrix >= 0.0) {
 		prixFixe = true;
 		// Le comptable devra enlever l'ancien prix et ajouter
 		//   le nouveau  ==> c.a.d. ajouter le delta (la différence)
 		// Il y a plusieurs solutions mais aucune n'est vraiment satisfaisante
 		// La solution suivante a le m�rite de ne pas modifier la classe Comptable
 		  
 		//On place temporairement le delta dans la variable d'instance prix
 		this.prix = unPrix - this.prix;
 		
 		comptable.comptabilise(this);
 		// il ne faut pas oublier de mettre le nouveau prix
 		this.prix = unPrix;
 	}
 	else {
 		System.err.println("Erreur : prix n�gatif !");
 	}
 }

 public static double getTotalPrix() {
 	return comptable.getTotalPrix();
 }
 
 
  // Constructeurs
  public Livre(String unAuteur, String unTitre) {
    auteur = unAuteur;
    titre = unTitre;
    
    countNew++;
  }

  public Livre(String unAuteur, String unTitre, int nbPages) {
    auteur = unAuteur;
    titre = unTitre;
    // l'appel au mutateur est plus sûr
    setNbPages(nbPages);
    countNew++;
  }

  public Livre(String unAuteur, String unTitre, int nbPages, double prix) {
    auteur = unAuteur;
    titre = unTitre;
    // l'appel au mutateur est plus sûr
    setNbPages(nbPages);
    setPrix(prix);
    countNew++;
  }

  // Accesseur
  public String getAuteur() {
    return auteur;
  }

  public String getTitre() {
    return titre;
  }

  public int getNbPages() {
    return nbPages;
  }

  public double getPrix() {
    return prix;
  }

  // mutateur
  public void setAuteur(String unAuteur) {
    auteur = unAuteur;
  }

  public void setTitre(String unTitre) {
    titre = unTitre;
  }

  public void setNbPages(int n) {
    if (n > 0) {
      nbPages = n;
    }
    else {
      System.err.println("Erreur : nombre de pages n�gatif !");
  }
}

public void afficheToi() {
	System.out.print(toString());
}

public String toString() {
	String description = "Livre de titre " + titre
	  + ",\n  d'auteur " + auteur
	  + ",\n  de " + nbPages + " pages";
	if (prix == -1) {
		description += "\n  (prix pas encore attribué)";
	}
	else {
		description += ", \n  de prix " + prix + "F";
	}
	return description;
}

public int compare(Livre l) {
  // On a accès aux variables des autres livres
  // (protection d'accès par classe et pas par objet en Java)
    if (nbPages == l.nbPages) {
      return 0;
    }
    else if (nbPages > l.nbPages) {
      return +1;
    }
    else {
      return -1;
    }
 }

public static int compare2(Livre l1, Livre l2) {
	// On a accès aux variables des autres livres
	// (protection d'accès par classe et pas par objet en Java)
    if (l1.nbPages == l2.nbPages) {
      return 0;
    }
    else if (l1.nbPages > l2.nbPages) {
      return +1;
    }
    else {
      return -1;
    }
}}

