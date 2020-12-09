/**
 * 
 */
package com.example.ledger.designPatterns.NullObjectPattern;

/**
   Dec 8, 2020
 * @author DGS1Q0
 *
 */
public class RealCustomer extends AbstractCustomer{
	
	
	public RealCustomer(String name) {
	      this.name = name;		
	   }
	

	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
