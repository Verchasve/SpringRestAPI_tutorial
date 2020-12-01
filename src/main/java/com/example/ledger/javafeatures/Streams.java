 /**
 * 
 */
package com.example.ledger.javafeatures;

  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
   Nov 25, 2020
 * @author DGS1Q0
 *
 */
public class Streams {
	
	/*
	 * Stream represents a sequence of objects from a source, which supports
	 * aggregate operations. characteristics of a Stream −
	   
	 * Sequence of elements − A stream provides a set of elements of specific
	 * type in a sequential manner. A stream gets/computes elements on demand. It
	 * never stores the elements.
	 * 
	/* Source − Stream takes Collections, Arrays, or I/O resources as input source.
	  
	/* Aggregate operations − Stream supports aggregate operations like filter, map, limit, reduce, find, match, and so on.
	  
	/* Pipelining − Most of the stream operations return stream itself so that
	 * their result can be pipelined. These operations are called intermediate
	 * operations and their function is to take input, process them, and return
	 * output to the target. collect() method is a terminal operation which is
	 * normally present at the end of the pipelining operation to mark the end of
	 * the stream.
	  
	 * Automatic iterations − Stream operations do the iterations internally over
	 * the source elements provided, in contrast to Collections where explicit
	 * iteration is required.
	 */
	
	private static List<Integer> numbers = Arrays.asList(4 ,3, 2, 2, 3, 7, 3, 5);
	private static List<String>  stringList = Arrays.asList("Abhishek", " ", "Up", "Bash", "Java", "Singh","", "Anchor" , "Down" , "Up");
	private static List<String> createList()
	{ 
		List<String>  names = new ArrayList<>();
		  names.add("abc");
	      names.add("B");
	      names.add("A");
	      names.add("");
	      names.add("R"); 
		return names;
	}
	
	private static void printmt(List<?> la)
	{
		la.stream().forEach(System.out::print);
	}
	
	// parallelStream is the alternative of stream for parallel processing.
	
	private static void parallelStream()
	{
	   //Collectors
		long count = stringList.stream()
					.filter(String -> !String.isBlank())
					.filter(str -> str.contains("bc"))
					.count();
		
		
		List<String> unStr = stringList.stream()
				//.sorted() 
				.distinct()
				.filter(String -> !String.isBlank())
				//.filter(str -> str.contains("bc"))
				.collect(Collectors.toList());
		
		
		String mergedString = stringList.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		
		 printmt(unStr);
		
		//Statistics
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
		 
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
				
				
				
		//System.out.println(mergedString);
	}
	
	
	public static void StreamsRunner()
	{
		
		List<String> filtered = createList().stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		
		//Limit
		//filtered.stream().limit(2).forEach(System.out::println);
		
		//filtered.in.forEach(System.out::println);
		 
		//random.ints().limit(10).forEach(System.out::println); 
		// The ‘map’ method  
		List<Integer> squaresList =  numbers.stream().map( i -> i*i ).distinct()
						.collect(Collectors.toList());
		 
		//printmt(squaresList);
	 
		//The ‘filter’ method
		long count =  stringList.stream().filter(string -> string.isBlank()).count();
		 
		List<Integer> non3number = numbers.stream()
				.map(num -> (num*5))
				.filter(num -> (num >=10 && num <70))
				.distinct()
				.sorted() 
				//.limit(2)
				.collect(Collectors.toList());
	 
		//printmt(non3number);  
		//parallelStream();
		StreamsWithMaps();
		
		
	}
	
	private static void StreamsWithMaps()
	{
		Map<String, Integer> someMap = new HashMap<>();
		
		Set<Map.Entry<String, Integer>> entries = someMap.entrySet();
		
		Set<String> keySet = someMap.keySet();
		Collection<Integer> values = someMap.values();
		
		Stream<Map.Entry<String, Integer>> entriesStream = entries.stream();
		
		Stream<Integer> valuesStream = values.stream(); 
		Stream<String> keysStream = keySet.stream();
		
		Map<String, String> books = new HashMap<>();
		books.put( "978-0201633610", "Design patterns : elements of reusable object-oriented software");
		books.put( "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
		books.put("978-0134685991", "Effective Java");
		books.put("978-0321356680", "Effective Java: Second Edition");
		books.put("978-0321356680", "Effective Java: Second Edition");
	
		Vector<String>  ve = new Vector<String>();
		Stack<String> stack = new Stack<String>(); 
	 
	 
		Optional<String> optionalIsbn = books.entrySet()
							.stream()
							.filter(e -> "Effective Java".contains(e.getValue()))
							.map(Map.Entry::getKey)
							.findFirst();
		
		
		List<String> ks =  books.entrySet().stream()
							.filter(val -> val.getValue().startsWith("Effective Java"))
							 .map(Map.Entry::getKey)
							.collect(Collectors.toList());
		
		List<String> ls =  books.keySet().stream().sorted()
							.filter(bal -> bal.contains("978"))
							.collect(Collectors.toList());
		
		ls.stream()
		.sorted(Comparator.reverseOrder())
		.filter(val -> val.contains("7"))
		.map(val -> val.replace("-", ""))
		.forEach(ve::add);
	 
	 
		ve.stream().forEach(System.out::println);
	 
	}
	
	  
	
}
