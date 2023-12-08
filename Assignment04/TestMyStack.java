// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: Eclipse

import java.util.Scanner;

public class TestMyStack {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Testing Stack with integer values
        Stack<Integer> myStack = new Stack<Integer>();
        
        int option = 0;
        while (option != 7) 
        {
            // Repeating menu
            System.out.print("--------MAIN MENU-------\n" +
                    "1 – Push element\n" +
                    "2 – Pop element\n" +
                    "3 – Top element\n" +
                    "4 – Size of stack\n" +
                    "5 – Is Empty stack?\n" +
                    "6 - Print stack content\n" +
                    "7 - Exit program\n" +
                    "\nEnter option number: ");
            
            option = scanner.nextInt();
            
            System.out.println();
            
            // Switch case depending on why option user selects
            switch (option) 
            {
            	// Method push to add element to stack
                case 1: 
                {
                    System.out.println("Testing method push()");
                    
                    System.out.print("What would you like to push to the stack? ");
                    int val = scanner.nextInt();
                    

                    System.out.print("Stack content before push is: ");
                    myStack.printList();
                    
                    myStack.push(val);
                    
                    System.out.print("Stack content after push is: ");
                    myStack.printList();
                    
                    System.out.println("\n");
                    break;
                }
                
                // Pop top method off the stack
                case 2: 
                {
                    System.out.println("Testing method pop()");
                    
                    // If stack is empty, no pop can be executed
                    if (myStack.isEmpty())
                        System.out.print("Stack is empty.");
                    
                    else 
                    {
                        System.out.print("Stack content before pop is: ");
                        myStack.printList();
                        
                        myStack.pop();
                        
                        System.out.print("Stack content after pop is: ");
                        myStack.printList();
                    }
                    
                    System.out.println("\n");
                    break;
                }
                
                // Top element of the stack
                case 3: 
                {
                    System.out.println("Testing method top()");
                   
                    if (myStack.isEmpty())
                        System.out.print("Stack is empty.");
                    
                    else 
                    {
                    	System.out.print("Stack content is: ");
                    	myStack.printList();
                    
                        System.out.print("Top of stack is: " + myStack.top() + "\n");
                    }
                    
                    System.out.println("\n");
                    break;
                }
                
                // Size of stack 
                case 4: 
                {
                	System.out.println("Testing stack size");
                	
                	System.out.print("Stack content is: ");
                    myStack.printList();
                    
                    
                    System.out.print("Stack size is: " + myStack.Size() + "\n");
                    
                    System.out.println("\n");
                    break;

                }
                
                // Testing if stack in empty
                case 5: 
                {
                    System.out.println("Testing method isEmpty()");
                    
                    // If mystack.isEmpty returns
                    if (myStack.isEmpty())
                        System.out.print("Stack is empty.");
                    
                    else 
                    {
                        System.out.println("Stack is not empty.");
                        System.out.print("Stack content is: ");
                        myStack.printList();
                    }
                    
                    System.out.println("\n");
                    break;
                }
                
                // Prints the stack
                case 6: 
                {
                    System.out.println("Testing method print()");
                    
                    if (myStack.isEmpty())
                        System.out.print("Stack is empty.");
                    else
                    {
                    	System.out.print("Stack content is: ");
                        myStack.printList();
                    }
                    
                    
                    System.out.println("\n");
                    break;
                }
                
                case 7: 
                {
                	System.out.println("Exiting Program");
                    
                	 System.out.println("\n");
                	break;
                }
               
                default: 
                {
                    System.out.println("Please choose a valid menu option 1-7.");
                    
                    
                    System.out.println("\n");
                    break;
                }
            }
        }
    }

}
