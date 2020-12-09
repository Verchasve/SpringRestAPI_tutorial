/**
 * 
 */
package com.example.ledger.designPatterns.facade;

/**
   Dec 9, 2020
 * @author DGS1Q0
 *
 */
public class FacadePatternDemo {
	 public static void main(String[] args) {
	      ShapeMaker shapeMaker = new ShapeMaker();
 
	      shapeMaker.drawRec();
	      shapeMaker.drawSquare();		
	   }
	

}
