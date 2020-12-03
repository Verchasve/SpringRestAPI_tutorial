/**
 * 
 */
package com.example.ledger.javafeatures;

/**
   Nov 25, 2020
 * @author DGS1Q0
 *
 */
public interface DefaultMethodsInInterface {
	
	default void print()
	{
		System.out.println("You are here DefaultMethodsInInterface"); 
	}
	
	default int Add(int i , int a)
	{
		int sum = i+a;
		System.out.println("Add " + sum); 
		return sum; 
	}

	static void blowHorn() {
	      System.out.println("Blowing horn!!!");
	   }
}
