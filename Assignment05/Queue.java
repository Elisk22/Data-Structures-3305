// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 5
// IDE Name: Eclipse

public class Queue <E> {
	
	// Create head/tail nodes
    public Node head, tail;
    
    // Keeps count of size as nodes are added or subtracted
    public int size;
   
    public int Size() 
    {
        return size;
    }
    
    //Class to create nodes as objects
    private class Node<E>
    {
        private E data;  //data field
        private Node next; //link field

        public Node(E item) //constructor method
        {
            data = item;
            next = null;
        }
    }
    
    //Constructor for Queue
    public Queue()
    {
    	head = null;
    	tail = null; 
    }
    
    // Queue up element--similar to adding last Node in list
    public void enqueue(E element)
    {
    	if (tail == null) 
            head = tail = new Node(element); //empty list
        else 
        {
            tail.next = new Node(element); //link new node as last node
            tail = tail.next; //make tail pointer points to last node
        }
    	
    	size ++; 
    }
    
    // Removes first element and returns its data
    public E dequeue()
    {
       if(head == null)
    	   return null; 
       
       // If queue has data, return and remove top queue
       else 
       { 
           Node<E> top = head; // Set temp node to first element of queue before removing
           
           head = head.next; 
           
           size--;
           return top.data;
       }
    }
    
    // Returns front element in the queue
    public E front()
    {
    	if(head == null)
    		return null; 
    	
    	return (E) head.data; 
    }
    
    // Returns how many elements are in the queue
    public int size()
    {
    	return size; 
    }
    
    // Returns true if queue has no elements and false otherwise
    public boolean isEmpty()
    {
    	// Queue is empty
    	if(head == null)
    		return true; 
    	
    	return false; 
    }
    
    // Prints elements in queue
    public void printList() {
        Node temp;
        temp = head;
        
        while (temp != null)
        {
            System.out.print(temp.data + "   ");
            temp = temp.next;
        }
        System.out.println(" ");
    }

}
