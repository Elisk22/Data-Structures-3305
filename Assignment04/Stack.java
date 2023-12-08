// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: Eclipse

public class Stack<E> {
	
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
    
    // Constructor for Stack --- implementing stack as a linked list
    public Stack() 
    {
        head = null;
        tail = null;
    }

    // Adds a new element to the top of this stack. Reused from Linked List addFirstNode
    public void push(E data) 
    {
        if (head == null) //If head is null, list is empty.
            head = tail = new Node(data); // Set head = tail = new node
        
        else 
        { 
            Node newNode = new Node(data); //Create new node with data
            newNode.next = head;
            head = newNode; //Set new node to head
        }
        
        size++;
    }
    
    
    // Returns and removes the top element in this stack.
    public E pop() 
    {
    	if(isEmpty())
    		return null;  
        
        // If stack has data, return and remove top of stack
        else 
        { 
            Node<E> top = head; // Set temp node to top of stack before removing
            
            if (head.next != null)
            	// If head.next is not null Set head = head.next, eliminating top node
                head = head.next; 
            
            else 
            	head = null; 
            
            
            size--;
            return top.data;
        }

    }
    
    // Returns the top element in this stack
    public E top() 
    {
        return (E) head.data; 
        // Have to cast--- generics
    }
    
    // Prints elements in stack
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
    
    // Returns true if the stack is empty.
    public boolean isEmpty() 
    {
        // If there is no head then list is empty 
        if (head == null)
        	return true; 
        
        // Stack is not empty
        return false;
    }
	
}
