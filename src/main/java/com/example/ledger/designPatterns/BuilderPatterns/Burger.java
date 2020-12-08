/**
 * 
 */
package com.example.ledger.designPatterns.BuilderPatterns;

/**
   Dec 7, 2020
 * @author DGS1Q0
 *
 */
public abstract class Burger implements Item{
	
	@Override
	public Packing packing()
	{
		return new Wrapper();
	}
	
	@Override
	public abstract float price();
}
