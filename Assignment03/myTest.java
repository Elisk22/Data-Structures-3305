// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 3
// IDE Name: Eclipse

import java.util.Scanner;

public class myTest
{
   public static void main (String[] args)
   {
	  Scanner sc = new Scanner(System.in);
      LinkedList myList = new LinkedList(); //create a list object
      
	  int choice = 0; 
	  int val = 0; 
	  int index = 0; 
	  
      do {
    	  //Prints menu
    	  System.out.println("---------MAIN MENU--------\n1 - Add First Node\n2 - Add Last Node\n"
    	  		+ "3 - Add At Index\n4 - Remove First Node\n5 - Remove Last Node\n6 - Remove at Index"
    	  		+ "\n7 - Print List Size\n8 - Print List (Forward)\n9 - Print List (In Reverse)\n10- Exit Program");
    	  
    	  System.out.print("\nEnter option number: ");
    	  choice = sc.nextInt(); 
    	  System.out.println();
    	  
    	  switch(choice)
    	  {
    	  	case 1: 
    	  		
    	  		System.out.println("Running method addFirstNode()");
    	  		
    	  		//Prints list
    	  		System.out.print("List content before adding first node is: ");
    	  		myList.printList();
    	  		
    	  		//User enters value to add
    	  		System.out.print("\nEnter value to add: ");
    	  		val = sc.nextInt(); 
    	  		myList.addFirstNode(val);
    	  		
    	  		//Prints list after method
    	  		System.out.print("List content after adding first node is: ");
    	  		myList.printList();
    	  		
    	  		System.out.println("\n");
    	  		
    	  		break; 
    	  		
    	  	case 2: 
    	  		System.out.println("Running method addLastNode()");
    	  		
    	  		//Prints list content before method
    	  		System.out.print("List content before adding last node is: ");
    	  		myList.printList(); 
    	  		
    	  		//User enters value to add to list
    	  		System.out.print("\nEnter value to add: ");
    	  		val = sc.nextInt(); 
    	  		myList.addLastNode(val);
    	  		
    	  		//List content after method is executed
    	  		System.out.print("List content after adding last node is: ");
    	  		myList.printList(); 
    	  		
    	  		System.out.println("\n");
    	  		break;
    	  		
    	  	case 3: 
    	  		System.out.println("Running method addAtIndex()");
    	  		
    	  		//Prints list content before method
    	  		System.out.print("List content before adding at an index is: ");
    	  		myList.printList(); 
    	  		
    	  		//User enters value and index to add
    	  		System.out.print("\nEnter value to add: ");
    	  		val = sc.nextInt(); 
    	  		System.out.print("Enter index to add value at: ");
    	  		index = sc.nextInt(); 
    	  		myList.addAtIndex(index, val);
    	  		
    	  		if(index >= 0 && index <= (myList.countNodes()-1))
    	  		{
    	  			System.out.print("List content after adding at an index is: ");
        	  		myList.printList(); 
    	  		}
    	  		
    	  		System.out.println("\n");
    	  		break;
    	  		
    	  	case 4: 
    	  		System.out.println("Running method removeFirstNode()");
    	  		
    	  		//Runs is list is empty
    	  		if(myList.head == null)
    	  		{
    	 		   System.out.println("List is empty\n");
    	 		   break; 
    	  		}
    	  		
    	  		//Prints list content before method
    	  		System.out.print("List content before removing first node is: ");
    	  		myList.printList(); 
    	  		
    	  		//Removes first node
    	  		myList.removeFirstNode();
    	  		
    	  		//Content after method
    	  		System.out.print("\nList content after removing first node is: ");
    	  		myList.printList();
    	  		
    	  		System.out.println("\n");
    	  		break;
    	  		
    	  	case 5: 
    	  		System.out.println("Running method removeLastNode()");
    	  		
    	  		//Runs if list is empty 
    	  		if(myList.head == null)
    	  		{
    	 		   System.out.println("List is empty\n");
    	 		   break; 
    	  		}
    	  		
    	  		//Prints list content before method
    	  		System.out.print("List content before removing last node is: ");
    	  		myList.printList(); 
    	  		
    	  		myList.removeLastNode();
    	  		
    	  		//Content after method
    	  		System.out.print("\nList content after removing last node is: ");
    	  		myList.printList();
    	  		
    	  		System.out.println("\n");
    	  		break;
    	  		
    	  	case 6:
    	  		System.out.println("Running method removeAtIndex()");
    	  		
    	  		//Runs if list is empty 
    	  		if(myList.head == null)
    	  		{
    	 		   System.out.println("List is empty\n");
    	 		   break; 
    	  		}
    	  		
    	  		//Prints list content before method
    	  		System.out.print("List content before removing at an index is: ");
    	  		myList.printList(); 
    	  		
    	  		// First index of the list in 0
    	  		System.out.print("\nEnter the index of the value you would like to remove: ");
    	  		index = sc.nextInt(); 
    	  		myList.removeAtIndex(index);
    	  		
    	  		if(index >= 0 && index <= (myList.countNodes()))
    	  		{
    	  			System.out.print("List content after removing at an index is: ");
        	  		myList.printList(); 
    	  		}
    	  		
    	  		System.out.println("\n");
    	  		break;
    	  		
    	  	case 7: 
    	  		System.out.println("Running method countNodes()");
    	  		
    	  		//Prints list size
    	  		System.out.print("List Size: " + myList.countNodes());
    	  		
    	  		System.out.println("\n");
    	  		break;
    	  	
    	  	case 8: 
    	  		System.out.println("Running method printList()");
    	  		
    	  		//Prints list content
    	  		System.out.print("List Content (Forward): ");
    	  		myList.printList();
    	  		
    	  		System.out.println("\n");
    	  		break;
    	  	
    	  	case 9: 
    	  		System.out.println("Running method printInReverse()");
    	  		
    	  		//Prints list content before method
    	  		System.out.print("Original list content: ");
    	  		myList.printList();
    	  		
    	  		//Prints list content in reverse
    	  		System.out.print("\nList content in reverse: ");
    	  		myList.printInReverse(myList.head);
    	  		
    	  		System.out.println("\n");
    	  		break;
    	  	
    	  	case 10: 
    	  		//Ends program loop
    	  		System.out.println("Exiting program");
    	  		break;
    	 }
    	  
      }while(choice != 10); 
      
      sc.close();
      
   } 
}
   
