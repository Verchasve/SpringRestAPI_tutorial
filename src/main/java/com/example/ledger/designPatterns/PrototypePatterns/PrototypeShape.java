/**
 * 
 */
package com.example.ledger.designPatterns.PrototypePatterns;

import lombok.Data;

/**
   Dec 8, 2020
 * @author DGS1Q0
 *
 */
@Data
public abstract  class PrototypeShape implements  Cloneable {


	   private String id;
	   protected String type;
	   
	   abstract void draw();
	
	public Object clone()
	{ 
	      Object clone = null;
	      
	      try {
	         clone = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	}
}
