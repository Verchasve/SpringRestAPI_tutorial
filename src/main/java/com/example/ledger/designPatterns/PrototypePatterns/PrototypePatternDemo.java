/**
 * 
 */
package com.example.ledger.designPatterns.PrototypePatterns;

/**
   Dec 8, 2020
 * @author DGS1Q0
 *
 */
public class PrototypePatternDemo {
	 public static void main(String[] args) {
	      ShapeCache.loadCache();

	      PrototypeShape clonedShape = (PrototypeShape) ShapeCache.getShape("1");
	      System.out.println("Shape : " + clonedShape.getType());		

	      PrototypeShape clonedShape2 = (PrototypeShape) ShapeCache.getShape("2");
	      System.out.println("Shape : " + clonedShape2.getType());		
 	
	   }
}
