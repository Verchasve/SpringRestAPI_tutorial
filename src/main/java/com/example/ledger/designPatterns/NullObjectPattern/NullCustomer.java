/**
 * 
 */
package com.example.ledger.designPatterns.NullObjectPattern;

/**
   Dec 8, 2020
 * @author DGS1Q0
 *
 */
public class NullCustomer extends AbstractCustomer{

	public NullCustomer(String name) {
	      this.name = name;		
	   }
	
	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		 return name + " is not Available in Customer Database";
	}

}
