// Name: Kendal Elison
// Class: CS 3305/section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 2

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String input = "";
        int option = 0; 
        
        do
        {
        	System.out.println("---------MAIN MENU---------");
            System.out.println("1. Read input string");
            System.out.println("2. Compute number of vowels");
            System.out.println("3. Exit program");
            System.out.print("\nEnter option number: ");

            option = sc.nextInt();
            sc.nextLine(); 
            
            // Asks user to input a string 
            if(option == 1)
            {
            	System.out.print("Enter input string: ");
                input = sc.nextLine();
            }
            
            else if(option == 2)
            {	if (!input.isEmpty()) 
            	{
            		//				calls method to count vowels
	            	int vowelCount = countVowels(input); 
	            	System.out.println("You entered string: " + input + "\nNumber of vowels:   " + vowelCount);
            	}
            	else	
            	{
            		System.out.println("Please Input A String First");
            	}
            }	
            
            // Exits program
            else if(option == 3)
            {
            	System.out.println("Exiting program");
            	sc.close();
            }
            
            //Only if user enters incorrect number
            else 
            {
            	System.out.println("Please input a vaild number");
            }
         
            System.out.println("\n");
            
        }while(option != 3); 

	}
	
	
	// Recursive method to count number of vowels in given string
	public static int countVowels(String str) 
	{
        if (str.isEmpty())
            return 0;
        
        char firstChar = Character.toLowerCase(str.charAt(0));
        int count = 0;
        
        // Checks for vowel
        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u')
            count++;

        return count + countVowels(str.substring(1));
    }
}
