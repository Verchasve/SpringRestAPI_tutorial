/**
 * 
 */
package com.example.ledger.designPatterns.PrototypePatterns;

/**
   Dec 8, 2020
 * @author DGS1Q0
 *
 */
public class PrototypeSquare extends PrototypeShape{

	public PrototypeSquare(){
	     type = "Square";
	   }
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Square::draw() method.");
	}

}
