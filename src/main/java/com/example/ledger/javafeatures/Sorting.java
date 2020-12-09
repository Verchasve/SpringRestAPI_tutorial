/**
 * 
 */
package com.example.ledger.javafeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
   Nov 12, 2020
 * @author DGS1Q0
 *
 */
public class Sorting {
	
//	Algo		   Best Case 	Average Case	Worst Case
//	Bubble sort		O(n)		O(n^2)			O(n^2)
//	Insertion sort	O(n)		O(n^2)			O(n^2)
//	Selection sort	O(N^2)		O(N^2)			O(N^2)
//	Heap sort		O(nlogn)	O(nlogn)		O(nlogn)
//	Quick Sort		O(nlogn)	O(nlogn)		O(n^2)
//	Merge sort		O(nlogn)	O(nlogn)		O(nlogn)
//	Shell Sort		O(nlogn)    O(n(logn)^2) 	O(n(logn)^2)
//	Counting Sort	O(n+k)		O(n+k)			O(n+k)
//	Bucket Sort		O(n+k)		O(n+k)			O(n^2)
//	Radix sort		O(nk)		O(nk)			O(nk)


  
	public static int[] array = {10, 2, 10, 3, 1, 2, 5};
	public static int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
	private static void swap(int[] array, int ind1, int ind2) {
	    int tmp = array[ind1];
	    array[ind1] = array[ind2];
	    array[ind2] = tmp;
	}
	
	
	public   void BUBBLESORT(int[] array)
	{  
		System.out.println("Input Array = "+Arrays.toString(array));
		boolean needIteration = true;
		while (needIteration) {
			needIteration = false;
			for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i - 1]) {
					swap(array, i, i-1);
					needIteration = true;
				}
			}
		}
		System.out.println("Sorted Array = " + Arrays.toString(array));
	}
	
	
	public   void SELECTIONSORT(int[] array)
	{ 
		System.out.println("Input Array = "+Arrays.toString(array));
		for (int left = 0; left < array.length; left++) {
			int minInd = left;
			for (int i = left; i < array.length; i++) {
				if (array[i] < array[minInd]) {
					minInd = i;
				}
			}
			swap(array, left, minInd);
		}
		System.out.println("Sorted Array = "+Arrays.toString(array));
		
	}
	
	
	public   void INSERTIONSORT (int[] array)
	{ 
 
		System.out.println("Input Array = "+Arrays.toString(array));
		for (int left = 0; left < array.length; left++) {
			// Get an element
			int value = array[left];
			// Iterate through the elements that are in front of this element
			int i = left - 1;
			for (; i >= 0; i--) {
				// If the current element is smaller, then move the larger element to the right.
				if (value < array[i]) {
					array[i + 1] = array[i];
				} else {
					// If the current element is larger, we stop
					break;
				}
			}
			// Insert the current value in the empty space
			array[i + 1] = value;
		}
		System.out.println("Sorted Array = "+Arrays.toString(array));
		
	}
	
	public   void SHUTTLESORT (int[] array)
	{  
		//  iterate from left to right, swapping elements and checking whether any of the elements remaining in the other direction need to be swapped.
		System.out.println("Input Array = "+Arrays.toString(array));
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				swap(array, i, i - 1);
				for (int z = i - 1; (z - 1) >= 0; z--) {
					if (array[z] < array[z - 1]) {
						swap(array, z, z - 1);
					} else {
						break;
					}
				}
			}
		}
		System.out.println("Sorted Array = "+Arrays.toString(array));
		
	}
	
	
	public   void SHELLSORT (int[] array)
	{  
		/*
		 * Another simple sorting algorithm is shell sort. The gist of it is similar to
		 * bubble sort, but in each iteration we have a different gap between the
		 * compared elements. It is cut in half with each iteration
		 */ 
		System.out.println("Input Array = "+Arrays.toString(array));
	 
		int gap = array.length / 2;
		// As long as there is a gap between the elements
		while (gap >= 1) {
		    for (int right = 0; right < array.length; right++) {
		        // Shift the right index until we find one for which
		        // there is the necessary gap between it and the element before it
		       for (int c = right - gap; c >= 0; c -= gap) {
		           if (array[c] > array[c + gap]) {
		               swap(array, c, c + gap);
		           }
		        }
		    }
		    // Recalculate the gap
		    gap = gap / 2;
		}
		System.out.println("Sorted Array = "+Arrays.toString(array));
		
	}
	
	
	public   void MERGESORT(int[] a, int n) {
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    MERGESORT(l, mid);
	    MERGESORT(r, n - mid); 
	    merge(a, l, r, mid, n - mid);
	    System.out.println("Sorted Array = "+Arrays.toString(arr));
	}
	
	public static void merge(
			  int[] a, int[] l, int[] r, int left, int right) {
			 
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            a[k++] = l[i++];
			        }
			        else {
			            a[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }
	}
	
	
	 public   void HEAPSORT(int arr[]) 
	    { 
	        int n = arr.length; 
	  
	        // Build heap (rearrange array) 
	        for (int i = n / 2 - 1; i >= 0; i--) 
	            heapify(arr, n, i); 
	  
	        // One by one extract an element from heap 
	        for (int i=n-1; i>=0; i--) 
	        { 
	            // Move current root to end 
	            int temp = arr[0]; 
	            arr[0] = arr[i]; 
	            arr[i] = temp; 
	  
	            // call max heapify on the reduced heap 
	            heapify(arr, i, 0); 
	        } 
	    } 
	  
	    // To heapify a subtree rooted with node i which is 
	    // an index in arr[]. n is size of heap 
	 public  void heapify(int arr[], int n, int i) 
	    { 
	        int largest = i;  // Initialize largest as root 
	        int l = 2*i + 1;  // left = 2*i + 1 
	        int r = 2*i + 2;  // right = 2*i + 2 
	  
	        // If left child is larger than root 
	        if (l < n && arr[l] > arr[largest]) 
	            largest = l; 
	  
	        // If right child is larger than largest so far 
	        if (r < n && arr[r] > arr[largest]) 
	            largest = r; 
	  
	        // If largest is not root 
	        if (largest != i) 
	        { 
	            int swap = arr[i]; 
	            arr[i] = arr[largest]; 
	            arr[largest] = swap; 
	  
	            // Recursively heapify the affected sub-tree 
	            heapify(arr, n, largest); 
	        } 
	    } 
        
	
	 
	    
	 public static void main(String args[]) 
	    {  
//		 Sorting sort =  new Sorting();
//		 // MERGESORT(arr , arr.length);
//		 sort.BUBBLESORT(array);
//		 sort.SELECTIONSORT(array);
//		 sort.INSERTIONSORT(array);
//		 sort.SHELLSORT(array);
//		 sort. MERGESORT(array , array.length);
//		 sort. HEAPSORT(array);
		 String str = "RTF20001000Z";
		// System.out.println(uniqueCharacters("ABCD")); 
		// System.out.println(str.substring(3 , 7));
		 String year = "RTF20001000Z";
		 String year1 = "DRV19845000Y";
		 String year2 = "5000";
		// System.out.println(currencyCheck(year2));
		 boolean isNumeric = year2.chars().allMatch( Character::isDigit );
		// System.out.println(year2.toUpperCase().matches("[A-Z]+"));
		 
		// System.out.println("Sorted Array = "+Arrays.toString(array));
		 
		 List<Integer> ls =  new ArrayList<Integer>();
		 ls.add(13);
		 ls.add(10);
		 ls.add(10);
		 ls.add(21);
		 ls.add(20); 
		 ls.add(13);
		 ls.add(10);
		 ls.add(10);
		 ls.add(21);
		 ls.add(20);
 
		 List<Integer> sortedLs =  ls.stream().sorted()
				 .distinct().collect(Collectors.toList());
		 sortedLs.forEach(value -> System.out.println(value));
		 //sortedLs.forEach(System.out::println); 
		
 
	    } 
 

	 
	 public static boolean uniqueCharacters(String str)
	    {
	        // If at any time we encounter 2 same
	        // characters, return false
	        for (int i = 0; i < str.length(); i++)
	            for (int j = i + 1; j < str.length(); j++)
	                if (str.charAt(i) == str.charAt(j))
	                    return false;
	 
	        // If no duplicate characters encountered,
	        // return true
	        return true;
	    }
	
	
	public static boolean checkYear(String text)
	{ 
		    text = text.replaceAll("[^0-9]", "#"); //simple solution for replacing all non digits. 
		    String[] arr = text.split("#"); 
		    boolean hasYear = false; 
		    StringBuilder values = new StringBuilder();

		    for(String s : arr){
		        if(s.matches("^[0-9]{4}$")){
		            hasYear = true; 
		            values.append(s+" ");
		        }
		    }
		
		    System.out.println("hasYear: " + hasYear);
		    System.out.println("values: " + values.toString().trim());
		    if (hasYear)
		    { 
		    	if (Integer.valueOf(values.toString().trim()) >= 1900 && Integer.valueOf(values.toString().trim()) <= 2019)
		    	{
		    		return true;
		    	}
		    }
		
		    return false;   
	}
	
	
	
	public static boolean currencyCheck(String text)
	{ 

		  String[] ls = {"10" , "20" , "50" , "100" , "200" , "500" , "1000"};
		  boolean check = false;
		  
		  for (String s : ls)
		  {
			  String bill =  s;
			  
			  if (text.matches(bill))
			  {
				  return true;
			  }
		  } 
		  
		  return check;
		        
	}
	
	
	public static int moves(int[] a) {
		int left = 0;
		int right = a.length - 1;
		int temp = 0;
		int count = 0;
		while(left < right) {
			if(a[left] % 2 != 0) {
				while(a[right] % 2 != 0 && right > left) {
					right--;
				}
				if(left != right) {
					temp = a[right];
					a[right] = a[left];
					a[left] = temp;
					right--;
					left++;
					count++;
				}
			}else {
				left++;
			}
		}
		 System.out.println("Array " +count);
		return count;
	}
	
	public static int moves(List<Integer> a) {
		var left = 0;
		var right = a.size() - 1;
		var temp = 0;
		var count = 0;
		while(left < right) {
			if(a.get(left) % 2 != 0) {
				while(a.get(right) % 2 != 0 && right > left) {
					right--;
				}
				if(left != right) {
					temp = a.get(right);
					//a.remove(right);
					a.set(right, a.get(left));
					//a.remove(left);
					a.set(left, temp);
					right--;
					left++;
					count++;
				}
			}else {
				left++;
			}
		}
		 System.out.println("List " +count);
		return count;
	}
	 
	 
}
