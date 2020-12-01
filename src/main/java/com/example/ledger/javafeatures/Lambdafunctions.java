/**
 * 
 */
package com.example.ledger.javafeatures;

/**
   Nov 24, 2020
 * @author DGS1Q0
 *
 */
public class Lambdafunctions {
	
	/*
	 * A lambda expression is characterized by the following syntax.
	 * 
	 * parameter -> expression body
	 * 
	 * Following are the important characteristics of a lambda expression.

		Optional type declaration − No need to declare the type of a parameter. The compiler can inference the same from the value of the parameter.

		Optional parenthesis around parameter − No need to declare a single parameter in parenthesis. For multiple parameters, parentheses are required.

		Optional curly braces − No need to use curly braces in expression body if the body contains a single statement.

		Optional return keyword − The compiler automatically returns the value if the body has a single expression to return the value. Curly braces are required to indicate that expression returns a value.
	 */

	interface MathOperation {
	      int operation(int a, int b);
	   }
		
	interface GreetingService {
	      void sayMessage(String message);
	   }
	
	interface AddingString{
		String addString(String a , String b);
	}
	
	interface  StringLent{
		int  StringSize(String a , String b);
	}
		
	   private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
	 
	
	public static void Runner()
	{ 
		  Lambdafunctions tester = new Lambdafunctions();
		  
			
	      //with type declaration
	      MathOperation addition = (int a, int b) -> a + b;
	      
	    //with out type declaration
	      MathOperation subtraction = (a, b) -> a - b;
	      
	    //with return statement along with curly braces
	      MathOperation multiplication = (int a, int b) -> { return a * b; };
	      
	      //without return statement and without curly braces
	      MathOperation division = (int a, int b) -> a / b;
	     
	      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
	      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
	      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
	      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
	      
	     //without parenthesis
	      GreetingService greetService1 = message -> System.out.println("Hello " + message);
		  
	      //with parenthesis
	      GreetingService greetService2 = (message) -> System.out.println("Hello " + message);
	       
	      greetService1.sayMessage("Abhishek");
	      greetService2.sayMessage("Singh");
	      
	      //with type declaration
	      AddingString addStr = (String a , String b) ->  a.concat(b) ;
	      System.out.println("Adding Hand/Bag = " +   addStr.addString("Hand", "Bag"));
	      
	      //with out type declaration
	      AddingString addStrin1 = (a , b) -> (a.concat(b)  );
	      System.out.println("Adding1 Hand/Bag = " +   addStrin1.addString("Hand", "Bag"));
	      
	      
	      StringLent Strinlenght = (a , b ) -> {return (a.length() + b.length());};
	      System.out.println("Size Hand/Bag = " +   Strinlenght.StringSize("Hand", "Bag"));
	      
	      StringLent Strinlenght1 = (a , b ) ->  a.length() + b.length() ;
	      System.out.println("Size1 Hand/Bag = " +   Strinlenght1.StringSize("Hand", "Bag"));
	      
	}
	    
 

}
 