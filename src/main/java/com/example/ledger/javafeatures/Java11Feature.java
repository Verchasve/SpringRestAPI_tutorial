package com.example.ledger.javafeatures;

 

import static org.junit.Assert.assertEquals;

import java.util.stream.Collectors;

import org.junit.Test;

public class Java11Feature {
	
	
	@Test
	public void features1()
	{ 
		//New String methods:  
		// isBlank() 
		String str1 = ""; 
        System.out.println(str1.isBlank()); 
  
        String str2 = " GeeksForGeeks"; 
        System.out.println(str2.isBlank()); 
        
         // lines():  
        String str3 = "Geeks\nFor\nGeeks"; 
        System.out.println(str3.lines().collect(Collectors.toList())); 
        
         // repeat(n)
        String str4 = "GeeksForGeeks"; 
        System.out.println(str4.repeat(4)); 
        
        // stripLeading()
        String str5 = " GeeksForGeeks"; 
        System.out.println(str5.stripLeading());
        
        // stripTrailing()
        
        String str6 = "GeeksForGeeks "; 
        System.out.println(str6.stripTrailing()); 
        
        // strip(): It is used to remove the white-spaces which are in-front and back of the string
        String str7 = " GeeksForGeeks "; 
        System.out.println(str7.strip()); 
        
	}
	

}
