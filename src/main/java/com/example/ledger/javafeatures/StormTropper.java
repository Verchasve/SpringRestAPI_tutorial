/**
 * 
 */
package com.example.ledger.javafeatures;

/**
   Dec 8, 2020
 * @author DGS1Q0
 *
 */
public class StormTropper implements Cloneable{
	
	    String color = "White";
	    String master = "Darth Vader";

	     StormTropper() {
	        System.out.println("Welcome to the Dark Side");
	    }
	     
	     public Object clone()throws CloneNotSupportedException{  
	         return (StormTropper)super.clone();  
	     }
}
