package exo6;

//Toujours et encore sur le même principe, écrivez un algorithme permettant, 
//à l’utilisateur de saisir les notes d'une classe. Le programme, une fois la saisie 
//terminée, renvoie le nombre de ces notes supérieures à la moyenne de la classe.



public class Exo6_14_live
{
    public static void main(String[] args)
    {
        System.out.println("Entrer le nombre de notes");
        int nbNotes = (new java.util.Scanner(System.in).nextInt());
        int[] aNotes = new int[nbNotes];
        int total = 0;
        for (int i = 0; i < nbNotes; i++)
        {
            System.out.printf("Entrer la note N° %d" , i);
            aNotes[i] =  (new java.util.Scanner(System.in)).nextInt();
            total += aNotes[i];
        }

        float moyenne = (float)total / (float)nbNotes;
        System.out.printf("La moyenne est  %f", moyenne);

        for (int i = 0; i < nbNotes; i++)
        {
            if (aNotes[i] > moyenne)
                System.out.printf("Entrer la note N° %d : %d est sup. à la moyenne ", i, aNotes[i]);
        }

    }
}
