// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 5
// IDE Name: Eclipse

import java.util.Scanner;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		// Instantiate new queue to fill with integers
		Queue<Integer> myQueue = new Queue<Integer>(); 
		
		int option = 0;
		
		while (option != 7) 
        {
            // Repeating menu
            System.out.print("--------MAIN MENU-------\n" +
                    "1 – Enqueue element\n" +
                    "2 – Dequeue element\n" +
                    "3 – Front element\n" +
                    "4 – Size of queue\n" +
                    "5 – Is Empty queue?\n" +
                    "6 - Print queue content\n" +
                    "7 - Exit program\n" +
                    "\nEnter option number: ");
            
            option = scanner.nextInt();
            
            System.out.println();
            
            // Switch case depending on why option user selects
            switch (option) 
            {
            	// Method enqueue to add element to queue
	            case 1: 
	            {
	                System.out.println("Testing method enqueue()");
	                
	                System.out.print("What number would you like to add to the queue: ");
	                int val = scanner.nextInt();
	                
	
	                System.out.print("Queue content before adding to end of queue: ");
	                myQueue.printList();
	                
	                myQueue.enqueue(val);
	                
	                System.out.print("Queue content after adding to end of queue: ");
	                myQueue.printList();
	                
	                System.out.println("\n");
	                break;
	            }
	            
	            // Method to remove first element in the queue and display its data 
	            case 2: 
	            {
	            	System.out.println("Testing method dequeue()");
	            	
	            	// If dequeue is empty, can't dequeue
                    if (myQueue.isEmpty())
                    	System.out.print("Queue is empty.");
                    
                    // If front element exists
                    else 
                    {
                    	System.out.print("Queue content before removing front element: ");
                        myQueue.printList();
                        
                        myQueue.dequeue();
    	                
    	                System.out.print("Queue content after removing front element: ");
    	                myQueue.printList();
                    }
	                
	                System.out.println("\n");
	                break; 
	              
	            }
	            
	            //Display First element in the queue
	            case 3: 
	            {
	            	System.out.println("Testing method front()");
	            	
	            	// If dequeue is empty, can't dequeue
                    if (myQueue.isEmpty())
                    	System.out.print("Queue is empty.");
                    
                    else 
                    {
                    	System.out.print("Queue content: ");
    	            	myQueue.printList();
    	            	
                        System.out.println("Front value is: " + myQueue.front());
                    }
	            	
                    System.out.println("\n");
                    break; 
	            }
	            
	            // Display how many elements are in the queue
	            case 4: 
	            {
	            	System.out.println("Testing method size()");
	            	
                    if (myQueue.isEmpty())
                    	System.out.println("Queue is empty.");
                    
                    else
                    {
                    	System.out.print("Queue content: ");
    	            	myQueue.printList();
                    }
                    	 
	            	System.out.println("Total queue size is: " + myQueue.Size());
	            	
	            	System.out.println("\n");
	            	break; 
	            	
	            }
	            
	            // Displays if queue is empty or not
	            case 5: 
	            {
	            	System.out.println("Testing method isEmpty()");
                    
                    // If myQueue.isEmpty returns
                    if (myQueue.isEmpty())
                        System.out.print("Queue is empty.");
                    
                    else 
                    {
                        System.out.println("Queue is not empty.");
                        System.out.print("Queue content is: ");
                        myQueue.printList();
                    }
                    
                    System.out.println("\n");
                    break;
	            }
	            
	            //
	            case 6: 
	            {
	            	System.out.println("Testing method print()");
                    
                    if (myQueue.isEmpty())
                        System.out.print("Queue is empty.");
                    else
                    {
                    	System.out.print("Queue content is: ");
                        myQueue.printList();
                    }
                    
                    
                    System.out.println("\n");
                    break;
	            }
	            
	            // Exit program
	            case 7: 
                {
                	System.out.println("Exiting Program");
                    
                	System.out.println("\n");
                	break;
                }
               
                // User enters invalid number
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
