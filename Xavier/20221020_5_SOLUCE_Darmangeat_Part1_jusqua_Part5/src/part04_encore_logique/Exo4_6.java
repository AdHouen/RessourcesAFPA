package part04_encore_logique;

/* ----------------------------------------------------
Exercice 4.6
Ecrivez un algorithme qui a pr�s avoir demand� un num�ro de jour,
de mois et d'ann�e � l'utilisateur, renvoie s'il s'agit ou non d'une date valide.
 ------------------------------------------------------*/
public class Exo4_6
{
    public static void main(String[] args)
    {
        int annee, mois, jour;
        boolean a = true, m = true, j = true;
        int condition_biss_400, conditions_biss_4, condition_biss_100;


        System.out.println("Entrer l'ann�e \"aaaa\" le mois \"mm\" le jour \"jj\" :  ");

        System.out.println("Ann�e ? ");
        annee = (new java.util.Scanner(System.in)).nextInt();

        System.out.println("Mois ? ");
        mois = (new java.util.Scanner(System.in)).nextInt();

        System.out.println("Jour ? ");
        jour = (new java.util.Scanner(System.in)).nextInt();

        condition_biss_400 = annee % 400;
        conditions_biss_4 = annee % 4;
        condition_biss_100 = annee % 100;

        if ((jour <= 0 || jour > 31) || (jour > 30 && (mois == 4 || mois == 6 || mois == 9 || mois == 11)) || (jour > 29 && mois == 2))
            j = false;

        if (mois <= 0 || mois > 12)
            m = false;

        if (!((condition_biss_400 == 0) || ((conditions_biss_4 == 0) && (condition_biss_100 != 0))) && (jour > 28 && mois == 2))
            a = false;

        if (a == false || m == false || j == false)
            System.out.println("la date n'est pas valide ");
        else
            System.out.println("la date est valide ");


        System.out.println("Appuyez sur la touche Entr�e pour quitter ");

        new java.util.Scanner(System.in).nextLine();
    }
}