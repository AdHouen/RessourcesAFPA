package gnu.d06_07_Date_Tableau;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
/**
 *  JAVA8
 *  Dans cet exemple, on crée un tableau mémorisant un ensemble d'instances
 *  correspondant aux jours fériés mobiles français.
 *  Ce tableau est utilisé pour compter le nombre de jours fériés
 *   tombant un samedi ou un dimanche (week-end).
 */
public class NbJoursFeriesDansWeekEnd_Java8 {
public static void main(String[] args) {
	
MonthDay[] joursFeriesMobiles;
joursFeriesMobiles = new MonthDay[8]; 
joursFeriesMobiles[0] = MonthDay.of(1,1);//jour de l'an 
joursFeriesMobiles[1] = MonthDay.of(5,1);//Fête du travail
joursFeriesMobiles[2] = MonthDay.of(5,8);//La victoire
joursFeriesMobiles[3] = MonthDay.of(7,14);//fête nationale
joursFeriesMobiles[4] = MonthDay.of(8,15);//L'Assomption
joursFeriesMobiles[5] = MonthDay.of(11,1);//La Toussaint
joursFeriesMobiles[6] = MonthDay.of(11,11);//L'Armistice
joursFeriesMobiles[7] = MonthDay.of(12,25);//Noël
  
int nbJours = 0;//cumul du nb de jours le samedi et le dimanche
LocalDate dateComplete;
for( int annee=2017; annee<2030; annee++ )
{
	nbJours = 0;
	for(MonthDay jour :joursFeriesMobiles)
	{
		dateComplete = jour.atYear(annee);
			if( dateComplete.getDayOfWeek() == DayOfWeek.SATURDAY
				   || dateComplete.getDayOfWeek() == DayOfWeek.SUNDAY ) {
				nbJours++; 
			}
	}
	System.out.println("en " + annee + " il y a " + nbJours
			+ " jour(s) férié(s)  un samedi ou un dimanche"); 
}//for
}}
