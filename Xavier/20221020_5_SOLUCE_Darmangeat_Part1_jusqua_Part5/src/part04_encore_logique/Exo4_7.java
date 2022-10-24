package part04_encore_logique;

/* ----------------------------------------------------
EXERCICE 4.7 LE 04/06/04 
------------------------------------------------------*/
/*Les élections législatives, en Guignolerie Septentrionale, obéissent à la règle suivante :
- lorsque l'un des candidats obtient plus de 50% des suffrages, il est élu dès le premier tour.
- en cas de deuxième tour, peuvent participer uniquement les candidats ayant obtenu au moins 12,5% des voix au premier tour.

Vous devez écrire un algorithme qui permette la saisie des scores de quatre candidats au premier tour.
Cet algorithme traitera ensuite le candidat numéro 1 (et uniquement lui) : il dira s'il est élu,
battu, s'il se trouve en ballottage favorable (il participe au second tour en étant arrivé en tête à l'issue du premier tour)
 ou défavorable (il participe au second tour sans avoir été en tête au premier tour).*/

/*SOLUTION pseudo-Code
Cet exercice, du pur point de vue algorithmique, n'est pas très méchant.
En revanche, il représente dignement la catégorie des enonces piégés.
En effet, rien de plus facile que d'écrire  : si le candidat a plus de 50%, il est élu,
sinon s'il a plus de 12,5 %, il est au deuxième tour, sinon il est éliminé.
Hé hé hé... mais il ne faut pas oublier que le candidat peut très bien avoir eu 20 % 
mais être tout de même éliminé, tout simplement parce que l'un des autres a fait plus de 50 % et
 donc qu'il n'y a pas de deuxième tour !... Moralité : ne jamais se jeter sur la programmation
  avant d'avoir soigneusement mené l'analyse du problème à traiter.

Variables A, B, C, D en Caractère
Début
Ecrire “Entrez les scores des quatre prétendants :”
Lire A, B, C, D
C1 ← A > 50
C2 ← B > 50 ou C > 50 ou D > 50
C3 ← A >= B et A >= B et A >= D
C4 ← A >= 12,5
Si C1 Alors
    Ecrire “Elu au premier tour"
Sinonsi C2 ou Non(C4) Alors
    Ecrire “Battu, éliminé, sorti !!!”
SinonSi C3 Alors
    Ecrire "Ballotage favorable"
Sinon
    Ecrire "Ballotage défavorable"
FinSi
Fin*/
public class Exo4_7
{
public static void main(String[] args)
{
	double s1,s2,s3,s4; //score des candidats

	System.out.println("Veuillez entrer le score du 1er candidat:"); // SAISIE DE SCORES
	s1=(new java.util.Scanner(System.in)).nextDouble();
	System.out.println("Veuillez entrer le score du 2e candidat:"); // DES CANDIDATS
	s2=(new java.util.Scanner(System.in)).nextDouble();
	System.out.println("Veuillez entrer le score du 3e candidat:"); // AUX ELECTIONS
	s3=(new java.util.Scanner(System.in)).nextDouble();
	System.out.println("Veuillez entrer le score du 4e candidat:"); // DE ZORGLUB
	s4=(new java.util.Scanner(System.in)).nextDouble();

	if (s1>50)
		System.out.println("Le Candidat1 est elu !");
	else if (s1>s2 && s1>s3 && s1>s4 )
		System.out.println("Le Candidat1 est en ballottage favorable");
	else if (s1>12.5)
		System.out.println("Le Candidat1 est en ballottage defavorable");
	else
		System.out.println("Le candidat est battu");
}
}
