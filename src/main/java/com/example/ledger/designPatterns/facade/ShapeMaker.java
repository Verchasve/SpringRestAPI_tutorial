/**
 * 
 */
package com.example.ledger.designPatterns.facade;

/**
   Dec 9, 2020
 * @author DGS1Q0
 *
 */
public class ShapeMaker {
	
	private  FacadeShape square;
	private  FacadeShape rectangle;

	 public void drawRec()
	 {
		 rectangle = new FacadeRectangle();
		 rectangle.draw();
	 }
	
	 public void drawSquare()
	 {
		 square = new FacadeSquare();
		 square.draw();
	 }
	
	
}
