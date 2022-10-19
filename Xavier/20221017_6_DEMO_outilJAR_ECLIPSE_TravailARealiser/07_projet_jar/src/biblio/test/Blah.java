package biblio.test;

/*
 * @(#)Blah.java        1.82 99/03/18
 *
 * Copyright (c) 1994-1999 Sun Microsystems, Inc.
 * 901 San Antonio Road, Palo Alto, California, 94303, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of Sun
 * Microsystems, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 */


//package java.blah;
//import java.blah.blahdy.BlahBlah;

/**
 *  
         Class description goes here.
 *
 * @version      
         1.82 18 Mar 1999
*
   @author          
         Firstname Lastname
*/	 
/**
 * @author xher
 *
 */
public class Blah  {
  
    /* A class implementation comment can go here. */ 
	
    /**  classVar1 documentation comment */
    public static int classVar1;
	
    /**  MA_CONSTANTE documentation comment */
    public final static int MA_CONSTANTE = 7;
    

    /** 
	*classVar2 documentation comment that happens to be  
    *    more than one line long
	*/
    private static Object classVar2; //association avec un objet Object

    /**   instanceVar1 documentation comment */
    public Object instanceVar1;

    /**   instanceVar2 documentation comment */
    protected int instanceVar2;

    /**   instanceVar3 documentation comment */
    private Object [] instanceVar3;

    /** 
     * constructor Blah documentation comment...
	 */
    public Blah() {
  
               // ...implementation goes here...
	}

	 /**
     * ...method de classe doSomething documentation comment...
	 */
    public static void doSomething() {
  
                // ...implementation goes here...
	}

    /**
     * ...method d'instance doSomething documentation comment...
	 */
    public void doSomethingElseElse() {
  
                // ...implementation goes here...
	}

    /**
     * ...method doSomethingElse  
         documentation comment...
	 * @param someParam  
         description      */
    public void doSomethingElse(Object someParam) {
  
                // ...implementation goes here...
	}
    
    /**
     * 
     * 
     * @param someParam
     * 
     */
    public void doSomethingElseElse(Object someParam) {
    	  
        // ...implementation goes here...
}

	
	   /**
     * ...method doSomethingElse  
         documentation comment... 
	 * @param someParam  
         description
     *@return
     *    retourne un entier
     */
    public int doSomethingReturnInt(Object someParam) {
  
                // ...implementation goes here...
				return 5;
	}
    
    

	
}