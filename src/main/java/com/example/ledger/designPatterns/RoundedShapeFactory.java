/**
 * 
 */
package com.example.ledger.designPatterns;

/**
   Dec 7, 2020
 * @author DGS1Q0
 *
 */
public class RoundedShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapType) {
		// TODO Auto-generated method stub
		
		if (shapType.equalsIgnoreCase("RECTANGLE"))
		{
			return new RoundedRectangle();
		}
		else if(shapType.equalsIgnoreCase("SQUARE")){
	         return new RoundedSquare();
	      }
		
		return null;
	}

}
