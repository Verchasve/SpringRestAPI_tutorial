package demoproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Stream;


import java.lang.Math;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ChoiceFormat;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;




public class sample{
	
 
 
	public void writeFile() throws IOException {
		 Path inputFile = Paths.get("/Users/newuser/Desktop/workspace/SpringRestAPI_tutorial/demoproject/src/demoproject/sample.text");
		 Path outputFile = Paths.get("output.txt");
		 BufferedReader reader = Files.newBufferedReader(inputFile, Charset.defaultCharset());
		  BufferedWriter writer = Files.newBufferedWriter(outputFile, Charset.defaultCharset());
		 String lineFromFile = "";
		 try {                                                  
		     while ((lineFromFile = reader.readLine()) != null)  
		            writer.append(lineFromFile);                     
		} catch(IOException e){}                               
		finally{                                               
		    reader.close();                                      
		    writer.close();                                      
		} 
		 }
	
	
	 static int number2=getValue();
	    static int number1=10;
	    static int getValue()
	    {
	        return number1;
	    }
	    static int doSum(){ return number1+number2;}
	    static int doMinus(){ return number1-number2;}
	
	
	    private String s = "HELLO";
	     public static void main(String args[])throws Exception {
	     sample t = new sample();
	     t.doSomething();
	         Thread.sleep(2000);
	    }
	     public void doSomething(){
	    Object[] objArray =  new Object[2];
	    for(int i=0; i<objArray.length; i++){
	       objArray[i]  = new Object();
	      }
	      }
	
	
	public static int countCounterfeit(List<String> serialNumber) {
	    // Write your code here
	    int TotalMoney = 0;
	    int count = 0;
	   
	    for (String str : serialNumber)
	    {
	    	
	    	
	    	String regex = "^[A-Z0-9]+$";

	    	boolean matches = Pattern.matches(regex, str);
	     
	        if ( str.length() >= 10 && matches && str.length() <= 14)
	        {
	           
	            String firstThree =  str.substring(0 , 3);
	            String nextFour =  str.substring(3 , 7);
	            String currencyChar = str.substring(7 , str.length()-1);
	            String lastDigit  =  str.substring(str.length()-1 , str.length());
	            
//	            
	            
	            
	            if (distinctCheck(firstThree))
	            {
	            
	                if (checkYear(nextFour))
	                {
	                	
	                    if (lastDigit.matches("[A-Z]+"))
	                    {
	                    	
//	                    	System.out.println(firstThree);
//				            System.out.println(nextFour);
//				            System.out.println(currencyChar);
//				            System.out.println(lastDigit);
	                        boolean isNumeric = currencyChar.chars().allMatch(Character::isDigit);
	                        System.out.println(isNumeric);
	                        if (isNumeric)
	                        {
	                            if (currencyCheck(currencyChar))
	                            {
	                               
	                            	
	                               TotalMoney =  TotalMoney + Integer.valueOf(currencyChar); 
	                               count = count+1;
	                               System.out.println("count " + count + " | "+currencyChar + " | TotalMoney " + TotalMoney);
	                          
	                            }
	                        }
	                    }   
	                }   
	            } 
	            
	            else {
	            	  System.out.println("- "+str);
	            }
	        }
 
	    }

	    return TotalMoney;
	    }
	    
	    
	    public static boolean currencyCheck(String text)
	    {
	         String[] lsBills = {"10" , "20" , "50" , "100" ,"200" ,"500" , "1000"};
	         
	         for (String bill : lsBills)
	         {
	             if (text.matches(bill))
	             {
	            	 
	                 return true;
	             }
	         }
	         
	         return false;
	    }
	    
	    public static boolean checkYear(String text)
	    {
	        text = text.replaceAll("[^0-9]", "#");
	        String[] arr =  text.split("#");
	        boolean hasYear = false;
	        StringBuilder values = new StringBuilder();
	        for (String s :  arr)
	        {
	            if (s.matches("^[0-9]{4}$"))
	            {
	                hasYear = true;
	                values.append(s+" ");
	            }
	        }
	        if (hasYear)
	        {
	            if (Integer.valueOf(values.toString().trim()) >= 1900 &&
	                Integer.valueOf(values.toString().trim()) <= 2019)
	                {
	                    return true;
	                }
	        }
	        
	        return false;
	    }
	    
	   
	    
	    public static boolean distinctCheck(String str)
	    {
	    	
	    	
	    	
	    //if (str.matches("[A-Z]+"))
	   // {
	        for (int i = 0; i < str.length() ; i++)
	        {
	            for (int j = i+1 ; j <str.length() ; j++ )
	            {
	                if (str.charAt(i) == str.charAt(j))
	                {
	                    return false;
	                }
	            }
	        }
	   // }
	    
//	    else {
//	    	return false;
//	    }
	        return true;
	    }
	    
	}
	
	


