/**
 * 
 */
package com.example.ledger.designPatterns;

/**
   Dec 7, 2020
 * @author DGS1Q0
 *
 *Singleton pattern
 *This pattern involves a single class which is responsible to create an object while making sure that only single object gets create.
 *This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
 *SingleObject class have its constructor as private and have a static instance of itself.

	SingleObject class provides a static method to get its static instance to outside world.	
 *
 */
public class SingleObject {
	
	//create an object of SingleObject
	private volatile  static SingleObject instance ;
	
	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleObject(){}
	   
	 //Get the only object available
	   public static SingleObject getInstance(){
	      return instance;
	   }
	   
	   public void showMessage(){
		      System.out.println("Hello World!");
		   }

}
