/**
 * 
 */
package com.example.ledger.javafeatures;
 
/**
   Dec 1, 2020
 * @author DGS1Q0
 *
 */
public class Runner extends Lambdafunctions {
	
  public static void main(String[] args)
  {
	   //Lambdafunctions.Runner(); 
	   //LinkedList.LinkedListRunner(); 
	   //MethodReference.MethodReferenceRunner();
	   // Streams.StreamsRunner(); 
	  //new Java11Feature().features1();
	  
	 String str = "asdasdas"; 
	 //str.chars().distinct().forEach(c -> sb.append((char) c));
	  
	//  System.out.println(str); 
	  
	  StringBuilder sb = new StringBuilder();
	  int idx;
	  for (int i = 0; i < str.length(); i++) {
	      char c = str.charAt(i);
	      idx = str.indexOf(c, i + 1);
	      if (idx == -1) {
	          sb.append(c);
	      }
	  }
	  

	    try {
	    StormTropper stormTrooper1 = new StormTropper();
	    StormTropper stormTrooper2 = stormTrooper1;
	    StormTropper stormTrooper3 =  (StormTropper) stormTrooper1.clone();
	    
	    
	    System.out.println("StormTrooper 1 : " + stormTrooper1.master + " | " + stormTrooper1.color);
	    System.out.println("StormTrooper 2 : " + stormTrooper2.master+ " | " + stormTrooper2.color);
	    System.out.println("StormTrooper 3 : " + stormTrooper3.master+ " | " + stormTrooper3.color);
	    
	    System.out.println("-----------------------------------------------------------------------");
	    stormTrooper2.master = "Skywalker";
   	    stormTrooper2.color = "Black";
	    
	    System.out.println("StormTrooper 1 : " + stormTrooper1.master + " | " + stormTrooper1.color);
	    System.out.println("StormTrooper 2 : " + stormTrooper2.master+ " | " + stormTrooper2.color);
	    System.out.println("StormTrooper 3 : " + stormTrooper3.master+ " | " + stormTrooper3.color);
	    System.out.println("-----------------------------------------------------------------------");
	    StormTropper stormTrooper4 =  (StormTropper) stormTrooper1.clone(); 
	    System.out.println("stormTrooper4  : " + stormTrooper4.master+ " | " + stormTrooper4.color);
	    }
	    catch(CloneNotSupportedException e)
	    {
	    	
	    }
	  
	  
	  
  }
}
