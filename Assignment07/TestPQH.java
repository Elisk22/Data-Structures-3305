// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 7
// IDE Name: Eclipse

import java.util.Scanner;

public class TestPQH {
	
	public static void main(String[] args) {
       
		Scanner scanner = new Scanner(System.in);
        
		PQ_Heap myPQ = new PQ_Heap<>(); // Type will be set with option 0
        String type = "";
        int menu = -1;
        
        // Initial loop forces usage of option 0
        while (menu != 0) 
        {
            // Repeating menu
            System.out.print("----------------MAIN MENU---------------\n" +
                    "0. Enter Queue Type (integer or string)\n" +
                    "1. Enqueue Element\n" +
                    "2. Dequeue Element\n" +
                    "3. Check is_Full\n" +
                    "4. Check is_Empty\n" +
                    "5. Print PQueue Size\n" +
                    "6. Display Front Element\n" +
                    "7. Print PQueue Elements\n" +
                    "8. Exit program\n" +
                    "\nEnter option number: ");
           
            menu = scanner.nextInt();
            
            // Must select type of queue before anything else
            switch (menu) 
            {
                // Create new heap each time this option is chosen
                case 0: 
                {
                    System.out.print("Enter Queue Type (integer or string) ");
                    type = scanner.next();
                    
                    if (type.equalsIgnoreCase("string")) 
                    {
                        type = "string";
                        myPQ = new PQ_Heap<String>();
                        System.out.println("String Priority Queue created.");
                    }
                    
                    else if (type.equalsIgnoreCase("integer")) 
                    {
                        type = "integer";
                        myPQ = new PQ_Heap<Integer>();
                        System.out.println("Integer Priority Queue created.");
                    }
                    
                    else 
                    {
                        System.out.println("Invalid Type.");
                        menu = -999; // Set to nonzero number to keep from progressing
                    }
                    
                    break;
                }
                
                default: 
                {
                    System.out.println("You must enter a Queue Type before proceeding.");
                    break;
                }
            }
            System.out.println();
        }
        

        // Main menu loop - Integer
        while (menu != 8) 
        {
            // Repeating menu
            System.out.print("----------------MAIN MENU---------------\n" +
                    "0. Enter Queue Type (integer or string)\n" +
                    "1. Enqueue Element\n" +
                    "2. Dequeue Element\n" +
                    "3. Check is_Full\n" +
                    "4. Check is_Empty\n" +
                    "5. Print PQueue Size\n" +
                    "6. Display Front Element\n" +
                    "7. Print PQueue Elements\n" +
                    "8. Exit program\n" +
                    "\nEnter option number: ");
            
            menu = scanner.nextInt();
            System.out.println();
            
            // Switch case containing method calls
            switch (menu) 
            {
                // Create new heap each time this option is chosen
                case 0:
                {
                    System.out.print("Enter Queue Type (integer or string) ");
                    type = scanner.next();
                    
                    if (type.equalsIgnoreCase("string")) 
                    {
                        type = "string";
                        myPQ = new PQ_Heap<String>();
                        System.out.println("String Priority Queue created.");
                    }
                    
                    else if (type.equalsIgnoreCase("integer")) 
                    {
                        type = "integer";
                        myPQ = new PQ_Heap<Integer>();
                        System.out.println("Integer Priority Queue created.");
                    }
                    
                    else 
                    { 
                    	System.out.println("Invalid Type."); 
                    }
                    
                    break;
                }
                
                // Enqueue element
                case 1: 
                {
                    System.out.println("Testing method enqueue()");
                    
                    if (!myPQ.is_full()) 
                    {
                    		// Integer Queue
                            if (type.equals("integer")) 
                            {
                                System.out.print("What integer would you like to enqueue? ");
                                Integer enqueueInt = scanner.nextInt();
                                System.out.println("\nBefore enqueue: ");
                                myPQ.printHeap();
                                myPQ.enqueue(enqueueInt);
                                System.out.println("\nAfter enqueue: ");
                                myPQ.printHeap();
                            }
                            // String Queue
                            else if (type.equals("string")) 
                            {
                                System.out.print("What string would you like to enqueue? ");
                                String enqueueString = scanner.next();
                                System.out.println("\nBefore enqueue: ");
                                myPQ.printHeap();
                                myPQ.enqueue(enqueueString);
                                System.out.println("\nAfter enqueue: ");
                                myPQ.printHeap();
                            }
                      }
                    
                    else 
                    	System.out.println("Priority Queue is currently full."); 
                    
                    break;
                }
                
                // Dequeues 
                case 2: 
                { 
                    System.out.println("Testing method dequeue()");
                    
                    if (!myPQ.is_empty()) 
                    {
                        System.out.println("\nBefore dequeue: ");
                        myPQ.printHeap();
                        System.out.println(myPQ.dequeue() + " has been dequeued.");
                        System.out.println("\nAfter dequeue: ");
                        myPQ.printHeap();
                    }
                    else 
                    { 
                    	System.out.println("Priority Queue is currently empty."); 
                    }

                    break;
                }
                
                case 3: 
                { 
                	// Prints whether the PQ is full or not
                    System.out.println("Testing method is_Full()");
                    
                    if (myPQ.is_empty()) 
                		System.out.println("Priority Queue is empty.");
                   
                    if (myPQ.is_full())
                        System.out.println("Priority Queue is full.");
                    else 
                        System.out.println("Priority Queue is not full.");
                    
                    break;
                }
                
                case 4: 
                { 
                	// Prints whether the PQ is empty or not
                    System.out.println("Testing method is_Empty()");
                    
                    if (myPQ.is_empty()) 
                        System.out.println("Priority Queue is empty.");
                    
                    else 
                        System.out.println("Priority Queue is not empty.");
                    
                    break;
                }
                
                case 5: 
                { 
                	// Prints size of current PQ
                	System.out.println("Testing method size()");
                	
                	if(myPQ.is_empty())
                    	System.out.println("Priority Queue is empty.");
                    System.out.println("Size of PQ is " + myPQ.size());
                    
                    break;
                    
                }
                
                case 6: 
                { 
                	// Prints first index of int PQ without removing it
                    System.out.println("Testing method front()");
                    
                    if (!myPQ.is_empty()) 
                    	System.out.println("Front element is " + myPQ.front());
                    
                    else 
                    	System.out.println("Priority Queue is currently empty."); 
                
                    break;
                }
                
                case 7: 
                { 
                	if(myPQ.is_empty())
                	{
                		System.out.println("Priority Queue is currently empty");
                		break; 
                	}
                		
                	// Prints all indexes + children in PQ, based on method in Heap
                	System.out.println("Testing method printHeap()\n");
                    myPQ.printHeap();
                    break;
                }
                
                // Ends program
                case 8: 
                {
                	System.out.println("Exiting");
                    break;
                }
                
                default: 
                {
                    System.out.println("Please choose a valid menu option 0-8.");
                    break;
                }
            }
            
            System.out.println();
        }
        
    }

}
