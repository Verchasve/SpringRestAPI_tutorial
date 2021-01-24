package demoproject;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AmerisaveTest {
	
	
	public static String sampleStr = "abhishek";
	
	public static void main(String[] args)
	{
		
		System.gc();
		long start=new GregorianCalendar().getTimeInMillis();
		long startMemory=Runtime.getRuntime().freeMemory();
		//StringBuffer sb = new StringBuffer();
	    StringBuilder sb = new StringBuilder();
		for(int i = 0; i<10000000; i++){
			sb.append(":").append(i);
		}
		long end=new GregorianCalendar().getTimeInMillis();
		long endMemory=Runtime.getRuntime().freeMemory();
		System.out.println("Time Taken:"+(end-start));
		System.out.println("Memory used:"+(startMemory-endMemory));
		
		// StringCheck();		
		
	}
	 
	public static void reversorder(String str)
	{ 
		
		for(int i = 0 ; i < str.length() ; i++)
		{  
				char c =  str.charAt(str.length()-i-1); 
				if (i%2 == 0)
				{
					System.out.println(c);
				}
				else { 
					System.out.println(String.valueOf(c).toUpperCase()); 
				}  
		} 
	}
	
	
	public static void createArray()
	{
		List<String>  arr =  new ArrayList<String>();
		
		// Adding data
		arr.add("Abhishek");
		arr.add("Singh");
		arr.add("Kevin");
		arr.add("Gunner");
		 
		// Printing all data
		
		arr.stream().forEach(System.out::println);  
	}
	
	
	public static void createHashMap()
	{
		 Map<Integer, String> map =  new HashMap<Integer, String>();
		 
		 map.put(1, "Abhishek");
		 map.put(2, "Singh");
		 map.put(3, "Gunner");
		 map.put(4, "Boat");
		 map.put(5, "Lion");
		 
		 
		Iterator<Integer> key =  map.keySet().iterator();
		Iterator<String> val =  map.values().iterator();
		
		
		// Displaying key and values 
		
		while(key.hasNext())
		{
			System.out.println(key.next() + " | " + val.next());
		}  
	}
	
	
	public static void  StringCheck() { 
		
			String s1 = "AmeriSave";
			String s2 = "AmeriSave";

			s1.toUpperCase();

			if (s1 == s2) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		} 
	
	
	public static void maxNoofOverallpingCalls()
	{
		List<phoneClass>  phcalss = new ArrayList<phoneClass>();
		
		List<phoneClass>  phcalss1 = new ArrayList<phoneClass>();
		
		long start_date = 123123123;
		long end_date = 123123213;
		
		for (phoneClass data : phcalss)
		{
			// Alls class between given time
			
			if (start_date >= data.DateStart && data.DateStart < end_date)
			{
				if (start_date >= data.DateEnd && data.DateEnd < end_date)
				{
					// All calls fall between given time 
					
					phcalss1.add(data); 
					
				} 
				
			} 
		}
		
		List<phoneClass> uniquePhoneCalls = phcalss1.stream().distinct().collect(Collectors.toList());
		
		// Now we can remove all those calls which are unique from the phcalss1 list.
		
		for (phoneClass data1 : phcalss1)
		{
			
			for (phoneClass data2 : uniquePhoneCalls)
			{
				data1.CallId = data2.CallId;
				phcalss1.remove(phcalss1.indexOf(data1));
			}
			 
		}
		
		
		// We have phcalss1 list with max no overallappig calls.
		 int maxnoOfOverallapingCalls =  phcalss1.size();
	  
	}
	
	protected class phoneClass 
	{
		int CallId	;
		String PhoneNumber	;
		long DateStart	;
		long DateEnd;
		
		// getter and setter
	}
	
	
	
	
}
