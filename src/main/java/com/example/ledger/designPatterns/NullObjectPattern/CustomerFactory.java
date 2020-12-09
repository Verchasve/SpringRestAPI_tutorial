/**
 * 
 */
package com.example.ledger.designPatterns.NullObjectPattern;

/**
   Dec 8, 2020
 * @author DGS1Q0
 *
 */
public class CustomerFactory {
	
	protected static final String[] names = {"Rob", "Joe", "Julie"};
	
	protected static AbstractCustomer getCustomer(String name)
	{
		for (String str :  names)
		{
			if (str.equalsIgnoreCase(name))
			{
				return new RealCustomer(name);
			}
		}
		
		return new NullCustomer(name); 
	}

}
