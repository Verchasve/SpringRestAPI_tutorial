/**
 * 
 */
package com.example.ledger.designPatterns.PrototypePatterns;

/**
   Dec 8, 2020
 * @author DGS1Q0
 *
 */
public class PrototypeRectangle extends PrototypeShape{

	public PrototypeRectangle() {
		super();
		 type = "Rectangle";
		// TODO Auto-generated constructor stub
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		  System.out.println("Inside Rectangle::draw() method.");
	}
	 
	

}
