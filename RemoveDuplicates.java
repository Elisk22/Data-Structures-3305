// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 6
// IDE Name: Eclipse

import java.util.Scanner;

public class RemoveDuplicates {
	
	public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int option = -1;
        String inputStr = null;

        // Menu loop until user exits
        while (option != 3) 
        {

        	System.out.println("\n-----------------MAIN MENU---------------");
            System.out.println("1. Read input string");
            System.out.println("2. Remove duplicates and display outputs");
            System.out.println("3. Exit program");

            System.out.print("\nEnter option number: ");
            
            // User option choice
            option = input.nextInt();
            
            System.out.println();

            switch (option) {
            
            	// User inputs string
                case 1: 
                {
                    System.out.print("Enter the input String: ");
                    input.nextLine();
                    
                    inputStr = input.nextLine();
                    
                    System.out.println();
                    break; 
                }
                
                // Removes duplicates 
                case 2: 
                {
                	// User must enter input string before being processed
                	if (inputStr == null)
                	{
                		System.out.println("Please enter input string first!");
                		break; 
                	}
                   
                    // Splits user string into array of strings
                    String[] elements = inputStr.split(" ");
                    BST<String> bst = new BST<>(elements);
                    
                    // Prints original user input
                    System.out.println("Original Text:");
                    System.out.println(inputStr);
                    
                    // Processed without duplicates 
                    System.out.println("\nProcessed Text:");
                    // In order sort 
                    bst.inorder();
                    
                    System.out.println();
                    
                    break; 
                }
                
                // Exits program
                case 3: 
                {
                	System.out.println("Exiting Program");
                	break; 
                }
                
                // User doesn't select menu option
                default: 
                {
                    System.out.println("Please choose a valid menu option.");
                    
                    
                    System.out.println();
                    break;
                }
                
                   
            }
        }
    } 

}
