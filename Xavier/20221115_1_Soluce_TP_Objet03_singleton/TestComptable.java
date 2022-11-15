package biblio3.item4_comptable_singleton;

public class TestComptable {
  public static void main(String[] args) {
    Livre l1 = new Livre("Victor Hugo", "Notre Dame de Paris", 150, 250.90);
    l1.setPrix(240.0); // on change le prix
    System.out.println(l1);
    System.out.println("---------------------------\n");

    Livre l2 = new Livre("Emile Zola", "La bête humaine");
    l2.setNbPages(170);
    l2.setPrix(300.0); // on change le prix
    
    l2.afficheToi();
    System.out.println();
    System.out.println("---------------------------\n");


   System.out.println("Le Total :" + Livre.getTotalPrix());
   //System.out.println("Le Total :" + l2.getTotalPrix());//warning
   
   System.out.println("Nb de new :" + Livre.countNew);
  }
}