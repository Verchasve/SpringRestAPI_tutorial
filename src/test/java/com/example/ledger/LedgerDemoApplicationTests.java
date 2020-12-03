package com.example.ledger;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.ledger.javafeatures.Java11Feature;

@SpringBootTest
public class LedgerDemoApplicationTests {

	@Test
	public void contextLoads() {
		
		  Result result = JUnitCore.runClasses(Java11Feature.class); 
		  
		  for (Failure failure : result.getFailures()) {
		         System.out.println(failure.toString());
		      }
				
		      System.out.println(result.wasSuccessful());
		      
		      
	}

}
