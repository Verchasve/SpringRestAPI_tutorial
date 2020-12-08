/**
 * 
 */
package com.example.ledger.designPatterns;

/**
   Dec 7, 2020
 * @author DGS1Q0
 *
 */
public class FactoryProducer {
	
	public static AbstractFactory getFactory(boolean rounded)
	{
		 if(rounded){
	         return new RoundedShapeFactory();         
	      }else{
	         return new ShapeFactory();
	      }
	}

}
