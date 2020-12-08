/**
 * 
 */
package com.example.ledger.designPatterns;

/**
   Dec 7, 2020
 * @author DGS1Q0
 *
 */
// Factory Pattern
public class ShapeFactory extends AbstractFactory {
	
	public Shape getShape(String shapeType)
	{ 
		 if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	         
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      
	      return null; 
	}

}
