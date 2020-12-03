/**
 * 
 */
package com.example.ledger.javafeatures;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
   Dec 1, 2020
 * @author DGS1Q0
 *
 */
public class Runner {
	
  public static void main(String[] args)
  {
	   //Lambdafunctions.Runner(); 
	   //LinkedList.LinkedListRunner(); 
	   //MethodReference.MethodReferenceRunner();
	   // Streams.StreamsRunner(); 
	  new Java11Feature().features1();
	  
	  String str = "asdasdas";
	  
	  
	 //str.chars().distinct().forEach(c -> sb.append((char) c));
	  
	  System.out.println(str);
	  
	  
	  StringBuilder sb = new StringBuilder();
	  int idx;
	  for (int i = 0; i < str.length(); i++) {
	      char c = str.charAt(i);
	      idx = str.indexOf(c, i + 1);
	      if (idx == -1) {
	          sb.append(c);
	      }
	  }
  }
}
