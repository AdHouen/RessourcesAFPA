
package fr.afpa.demo;

//import java.blah.blahdy.BlahBlah;

/**
 * Class description goes here.
 *
 * @version 	1.82 18 Mar 2017
 * @author 	Firstname Lastname
 */
public class Blah  {
    /* A class implementation comment can go here. */

    /** classVar1 documentation comment */
    public static int classVar1;

    /** 
     * classVar2 documentation comment that happens to be
     * more than one line long
     */
    private static Object classVar2;

    /** instanceVar1 documentation comment */
    public Object instanceVar1;

    /** instanceVar2 documentation comment */
    protected int instanceVar2;

    /** instanceVar3 documentation comment */
    private Object[] instanceVar3;

    /** 
     * ...constructor Blah documentation comment...
     */
    public Blah() {
        // ...implementation goes here...
				System.out.println(" moi, le fil d'exécution, je passe par le constructeur sans paramètre de la classe Blah");

    }

    /**
     * ...method doSomething documentation comment...
     */
    public void doSomething() {
        // ...implementation goes here... 
		System.out.println("je passe dans la méthode doSomething()");

    }

    /**
     * ...method doSomethingElse documentation comment...
     * @param someParam description
     */
    public void doSomethingElse(Object someParam) {
        // ...implementation goes here... 
		System.out.println("je passe dans la méthode doSomethingElse()");
		
		
    }
	
    /**
     * ...method doIt documentation comment...
     * aaaaaaaaaaaaaaaaaaa
	 * bbbbbbbbbbbbbbbbbbbb
     */
	public static void doIt() {
        // ...implementation goes here... 
		System.out.println("je passe dans la méthode statique do de la classe Blah");
    }
	/**point de démarrage du fil d'exécution
	 * @param args
	 */
	public static void main(String[] args){
		new Blah();
	}
}
