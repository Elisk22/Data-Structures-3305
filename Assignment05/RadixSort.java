// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 5
// IDE Name: Eclipse

import java.util.Scanner;

public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        int[] inputs = null; // Initialize the input array
        int choice = 0; 
        
        // Temp string to hold values before radix sort
        String temp = ""; 
        
        while(choice != 5)
        {
        	// Repeating menu
            System.out.print("--------MAIN MENU-------\n" +
                    "1 – Read array size\n" +
                    "2 – Read array values\n" +
                    "3 – Run Radix Sort algorithm (No Printing)\n" +
                    "4 – Print outputs\n" +
                    "5 – Exit program\n" +
                    "\nEnter option number: ");
            
            choice = scanner.nextInt(); 
            System.out.println();
            
            switch (choice)
            {
            	// User enters array size/number of input values
            	case 1: 
            	{
            		System.out.print("Enter the number of input values (array size): ");
                    int size = scanner.nextInt();
                    inputs = new int[size];
                    
                    System.out.println("\n");
                    break;
            	}
            	
            	// User enters values into array
            	case 2: 
            	{
            		if (inputs != null) 
            		{
                        System.out.println("Enter " + inputs.length + " positive integer values:");
                        for (int i = 0; i < inputs.length; i++) 
                        {
                            inputs[i] = scanner.nextInt();
                        }
                    } 
            		
            		// Need to set array size before inputting values
            		else
                        System.out.println("Please choose option 1 to set the array size first.");
                    
            		System.out.println("\n");
                    break;
            	}
            	
            	// Radix Sort
            	case 3: 
            	{
            		// If user set size and values then they can radix sort
            		if (inputs != null) 
            		{
            			
            			// Temp string to hold values to show array before sorting
                		for(int i = 0; i < inputs.length; i++)
                		{
                			String add; 
                			
                			// No comma after last value
                			if(i == (inputs.length -1))
                				add = inputs[i] + ""; 
                			
                			else
                				add = inputs[i] + ", "; 
                			temp += add;  
                		}
                		
                		// radix sort array
                		radixSort(inputs);
            		}
            			
            		else 
                        System.out.println("Please choose option 1 and 2 to set array size and values first.");
            		
            		System.out.println("\n");
            		break; 
            		
            	}
            	
            	// Print out values
            	case 4: 
            	{
            		// Array size has been set and values added
            		if (temp != null)
            		{
            			// Array before being sorted
                        System.out.print("Array Inputs before sorting: " + temp);
                        
                        System.out.println();
                        
                        System.out.print("Array Inputs after sorting:  ");
                        for (int i = 0; i < inputs.length; i++ )
                        {
                        	// No comma after last value
                        	if(i == (inputs.length -1))
                        		System.out.println(inputs[i]);
                        			
                        	else
                        		System.out.print(inputs[i] + ", ");
                        }
                        
                        System.out.println();
                        
                    } 
            		
            		// User entered inputs but hasn't selected radix sort
            		else if(inputs != null)
            			System.out.println("Please select radix sort before printing sorted data");
            		
            		// User needs to set array size and values
            		else
                        System.out.println("Please choose option 1 and 2 to set array size and values first.");
                    
            		System.out.println("\n");
                    break;
            	}
            	
            	// Exit program
            	case 5: 
            	{
            		System.out.println("Exiting program.\n");
            		
            		break; 
            	}
            	
            	// User enters invalid number
                default: 
                {
                    System.out.println("Please choose a valid menu option.");
                    
                    
                    System.out.println("\n");
                    break;
                }
            }
            
        }
      }
     
	 // Method radix sort to sort values in ascending order
	 public static void radixSort(int[] arr)
	 {
	        // Find the maximum number to determine the number of digits in a num
	        int count = 0;
	        
	        for (int value : arr) {
	            if (digitCount(value) > count) {
	                count = value;
	            }
	        }

	        // Perform radix sort using queues for each digit position
	        for (int pos = 1; pos <= count; pos ++) {
	        	
	        	int n = arr.length;
		    	
		        Queue<Integer>[] buckets = new Queue[10];

		        // Initialize queues for each digit 0-9
		        for (int i = 0; i < 10; i++) 
		        {
		            buckets[i] = new Queue<>();
		        }

		        // Distribute elements into buckets based on the current digit position
		        for (int i = 0; i < n; i++) 
		        {
		            int digit = extractDigit(arr[i], pos);
		            buckets[digit].enqueue(arr[i]);
		        }

		        // Reassemble elements from the buckets back into the array
		        int index = 0;
		        for (Queue<Integer> bucket : buckets) 
		        {
		            while (!bucket.isEmpty()) 
		            {
		                arr[index++] = bucket.dequeue();
		            }
		        }
	        }
	    }

	    // Extract a digit from a number at a given position
	    private static int extractDigit(int number, int position) 
	    {
	        return (number / position) % 10;
	    }

	    // Helper method to count the number of digits in a number
	    private static int digitCount(int number) {
	        if (number == 0) {
	            return 1; // 0 has one digit
	        }
	        int count = 0;
	        while (number != 0) {
	            number /= 10;
	            count++;
	        }
	        return count;
	    }

}
