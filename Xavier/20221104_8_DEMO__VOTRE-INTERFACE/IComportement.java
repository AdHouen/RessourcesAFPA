package demo1_votreinterface;
///////////////////////////////////////////
//Le comportement attendu : être comparable
///////////////////////////////////////////
public interface IComportement {
	
	public abstract int compareToi(C1 o);
	//int compareToi(C1 o);//sous-entendu  -->public abstract
	
	//Pas très utilisé : mettre des champs ds une interface
	int MA_CONSTANTE = 9;//sous-entendu  -->public final
}
