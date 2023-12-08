// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: Eclipse

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Stack<Character> letterStack = new Stack<Character>(); // Create new character stack
        
		int option = 0;
		String input = " "; 

        while (option != 3) 
        {
        	// Prints menu
        	 System.out.println("--------MAIN MENU-------\n" +
                     "1 – Read input string\n" +
                     "2 – Check if palindrome\n" +
                     "3 – Exit program" ); 
             
        	 System.out.print("\nEnter an option number: ");
            
        	 option = scanner.nextInt();
             scanner.nextLine(); //Go from entering num to string
        	
            // Switch case over options
             switch(option)
             {
             	case 1: 
             	{
             		//User enters string
             		System.out.print("Enter String: ");
             		input = scanner.nextLine(); 
             		
             		System.out.println();
             		break; 
             		
             	}
             	
             	case 2: 
             	{
             		if(input.equals(" "))
        			{
        				System.out.println("Please enter a string first\n");
        				break; 
        			}
             		
             		char[] stringArray = input.toCharArray(); // Split input string into array
                    
             		for (char letter : stringArray) 
                    { 
                    	// Push each letter into stack
                        letterStack.push(letter);
                    }
                    
             		String reversedWord = ""; // Initialize new string
                    
             		while (!letterStack.isEmpty()) 
             		{
                        reversedWord += letterStack.pop(); // Pop each word into reversed string
                    }
             		
                    // Print result
                    System.out.print("Entered String: " + input + "\nJudgment:\t");
                   
                    // If strings match, print "Palindrome"
                    if (input.equalsIgnoreCase(reversedWord)) 
                        System.out.print("Palindrome\n");
                    
                    else 
                        System.out.print("Not Palindrome\n"); // Else print "Not Palindrome"
                 
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
