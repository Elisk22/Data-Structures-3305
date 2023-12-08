// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: Eclipse

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Stack<String> wordStack = new Stack<String>(); // Create new string stack
        int option = 0;  // User option
        String forwardString = ""; 

        while (option != 3) 
        {
        	// Prints menu
        	 System.out.println("--------MAIN MENU-------\n" +
                     "1 – Read input string of words\n" +
                     "2 – Reverse and display input string\n" +
                     "3 – Exit program" ); 
             
        	 System.out.print("\nEnter an option number: ");
            
        	 option = scanner.nextInt();
             scanner.nextLine(); //Go from entering num to string
        	
            // Switch case over options
        	switch(option)
        	{
        		// User inputs a string
        		case 1: 
        		{
        			System.out.print("Enter a string: "); // Prompt input
                    forwardString = scanner.nextLine(); // Receive input string
                   
                    System.out.println();
                    break; 
        		}
        		
        		case 2: 
        		{
        			if(forwardString.equals(""))
        			{
        				System.out.println("Please enter a string first\n");
        				break; 
        			}
        				
        			String[] stringArray = forwardString.split(" "); // Split input string into array
                    
                    for (String word : stringArray) 
                    { 
                    	// Push each word into stack
                        wordStack.push(word);
                    }
                    
                    String reversedString = "";  // Initialize new string
                    
                    while (!wordStack.isEmpty()) 
                    { 
                    	// Pop each word into reversed string
                        reversedString = reversedString + wordStack.pop() + " ";
                    }
                    
                    // Print forward and reversed strings
                    System.out.println("Entered String:  " + forwardString + "\nReversed String: " + reversedString);
                    
                    System.out.println();
        			break; 
        		}
        				
        			
        		case 3: 
        		{
        			System.out.println("Exiting Program\n");
        			break; 
        		}
        	}
        }
		
	}

}
