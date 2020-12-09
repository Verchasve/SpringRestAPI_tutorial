/**
 * 
 */
package com.example.ledger.designPatterns.BuilderPatterns;

/**
   Dec 7, 2020
 * @author DGS1Q0
 *
 */
public abstract class ColdDrink implements Item {
	@Override
	public Packing packing() {
       return new Bottle();
	}

	@Override
	public abstract float price();
}
