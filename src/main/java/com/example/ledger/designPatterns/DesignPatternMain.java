/**
 * 
 */
package com.example.ledger.designPatterns;

/**
   Dec 7, 2020
 * @author DGS1Q0
 *
 */
public class DesignPatternMain {
	
	public static void SingletonPatternDemo ()
	{
	     //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();

	      //show the message
	      object.showMessage();
	}
	
	
	 public static void main(String[] args) {
		 SingletonPatternDemo();
	 
	   }
	

}
