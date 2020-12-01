/**
 * 
 */
package com.example.ledger.javafeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
   Nov 24, 2020
 * @author DGS1Q0
 *
 */
public class MethodReference implements DefaultMethodsInInterface , DafultMethodsInterface2{
	
	
//	A method reference can be used to point the following types of methods −
//	Static methods
//	Instance methods
//	Constructors using new operator (TreeSet::new)
 
	public static List<String> createList()
	{ 
		List<String>  names = new ArrayList<>();
		  names.add("A");
	      names.add("B");
	      names.add("W");
	      names.add("Q");
	      names.add("R"); 
		return names;
	}
	 
	public static void eval(List<String> list, Predicate<String> predicate) {

	      for(String A: list) { 
	         if(predicate.test(A)) {
	            System.out.println(A + " ");
	         }
	      }
	   }
	
	public static void MethodReferenceRunner()
	{ 
		//createList().forEach(System.out::println); 
		//eval(createList() , a->true); 
		  FourWheeler vehicle = new Car();
	      vehicle.print();
	      
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		DefaultMethodsInInterface.super.print();
	} 
	
}
interface Vehicle {

	   default void print() {
	      System.out.println("I am a vehicle!");
	   }
		
	   static void blowHorn() {
	      System.out.println("Blowing horn!!!");
	   }
	}

interface FourWheeler {

	   default void print() {
	      System.out.println("I am a four wheeler!");
	   }
	}

class Car  implements Vehicle, FourWheeler , DefaultMethodsInInterface{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		FourWheeler.super.print();
		Vehicle.super.print();
		Vehicle.blowHorn();
		DefaultMethodsInInterface.super.Add(1, 2);
	}
	
	
}

