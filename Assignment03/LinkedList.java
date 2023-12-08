// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 3
// IDE Name: Eclipse


/*
This class define a linked list that stores integer values.
*/

public class LinkedList
{
   public Node head, tail;

   //constructor method to create a list of object with head, tail, and size. 
   public LinkedList()
   {
      head = null;
      tail = null;
   }
  
   //method add node to end of list
   public void addLastNode(int data) 
   {
      if (tail == null) 
         head = tail = new Node(data); //empty list
      else 
      {
         tail.next = new Node(data); //link new node as last node
         tail = tail.next; //make tail pointer points to last node
      }
   }
  
   //======== Your part to complete for this assignment =========
   
   //method #1: add first node
   public void addFirstNode(int data)
   {
	   Node temp = new Node(data); 
	   
	   // If list is empty
	   if(head == null)
	   {
		   head = temp; tail = temp; 
		   return; 
	   }
	
	   else
	   {
		// Establishes new connection 
	       temp.next = head; 
	       head = temp; 
	       temp = null; 
	   }
       
   }
      
   //method #2: add node at index
   public void addAtIndex(int index, int data)
   {
	   Node temp = new Node(data);
	   
	   // If index is the first element
	   if(index == 0)
	   {
		   addFirstNode(data);
		   return; 
	   }
	   
	   //If user enters invaild index--out of bounds
	   if(index < 0 || index > (countNodes()-1))
	   {
		   System.out.println("Invaild index, try again");
		   return; 
	   }

	   Node current = head; 
	   							// index out of bounds
	   for(int i = 0; i < index -1 && current != null; i++)
	   {
		   current = current.next; 
	   }
	   
	  
		   

	   // Establish new connection
	   temp.next = current.next; 
	   current.next = temp; 
          

   }
      
   //method #3: remove first node
   public void removeFirstNode()
   {
	   // Links temp to list then removes current head
	   Node temp = head.next; 
	   head = null; 
	   
	   //Temp becomes head
	   head = temp; 
	   temp = null; 
   }
      
   //method #4: remove last node
   public void removeLastNode()
   {
	   
	   // Only one element in the list
	   if(head.next == null)
	   {
		   head = null; 
		   return; 
	   }
       
	   //Traverses list 
	   Node current = head; 
	   while(current.next.next != null)
	   {
		   current = current.next; 
	   }
       
	   // Removes last node
	   current.next = null; 
	   current = tail; 
   }
    
   //method #5: remove node at index
   public void removeAtIndex(int index)
   {
	// Remove first node
	   if (index == 0) 
	   {
           head = head.next;
           return;
       }
	   
	// If index is out of bounds or list is empty
 		if(index < 0 || index > (countNodes()-1))
 		{
		   System.out.println("Invaild index, try again");
		   return; 
 		}
	   
	   // Traverses List
	   Node current = head; 
	   for(int i = 0; i < index-1 && current != null; i++)
	   {
		   current = current.next; 
	   }
       
	   // Establishes connection 
	   current.next = current.next.next; 
         
   }
          
   //method #6: countNodes
   public int countNodes()
   {
         int listSize= 0;
         //complete this method
         //this methods returns the list size
        
         //Traverses list and counts elements 
         Node current = head; 
         while(current != null)
         {
        	 listSize ++; 
        	 current = current.next; 
         }
         
         return listSize;
         
   }
   
   //method #7: pritnInReverse  (Recursive method)
   public void printInReverse(Node L)
   {
         //complete this method as recursive methods
	   if(L == null)
		   return; 
	   
	   printInReverse(L.next);
	   
	   // Executues after the recursive call; ---- list in reverse
	   System.out.print(L.data + "   ");
   }   

   
   
   //================= end of your part ==============

   //method to print out the list
   public void printList() 
   {
      Node temp;
      temp = head;
      while (temp != null)
      {
         System.out.print(temp.data + "   ");
         temp = temp.next;
      }
   }
  
   //class to create nodes as objects
   class Node
   {
      private int data;  //data field
      private Node next; //link field
       
      public Node(int item) //constructor method
      {
         data = item;
         next = null;
      }
   }
}
