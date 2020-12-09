/**
 * 
 */
package com.example.ledger.designPatterns.PrototypePatterns;

import java.util.Hashtable;

/**
   Dec 8, 2020
 * @author DGS1Q0
 *
 */
public class ShapeCache {
	
	
	   private static Hashtable<String, PrototypeShape> shapeMap  = new Hashtable<String, PrototypeShape>();
	   
	   
	   public static PrototypeShape getShape(String shapeId) {
		   PrototypeShape cachedShape  = shapeMap.get(shapeId); 
		   return (PrototypeShape) cachedShape.clone(); 
	   }
	   // for each shape run database query and create shape
	   // shapeMap.put(shapeKey, shape);
	   // for example, we are adding 2 shapes
	   
	   public static void loadCache()
	   {
		   PrototypeRectangle prec =  new PrototypeRectangle(); 
		   prec.setId("1"); 
		   shapeMap.put(prec.getId(), prec);
		   
		   PrototypeSquare psquare =  new PrototypeSquare(); 
		   psquare.setId("2");
		   shapeMap.put(psquare.getId(), psquare);
		     
	   }
}

	   