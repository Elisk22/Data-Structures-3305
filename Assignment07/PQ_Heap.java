// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 7
// IDE Name: Eclipse

// Generic code for class priority_queue_heap for Assignment 7 
public class PQ_Heap <E extends Comparable<E>>
{	
   private Heap heap;
   
   // Constructor method
   public PQ_Heap() 
   {
	   heap = new Heap<E>();
   }
	
	// Return true if priority queue is empty; otherwise return false
   public boolean is_empty() 
   {
	   if (heap.getSize() == 0) 
		   return true;  // If the heap size is 0, it is empty
	   
       return false;
   }
	
	// Return true if priority queue is full; otherwise return false
   public boolean is_full() 
   {
	   if (heap.getSize() >= heap.CAPACITY )
		   return true;  // If the heap size is 100+, it is full
	   
       return false; 
   }

   // Return (don't remove) the front element from the priority queue
   // Precondition: priority queue is not empty.
   public E front()
   {
	   return (E) heap.getFirst();
   }

	// return number of elements in the queue
   public int size() 
   {
	   return heap.getSize(); // Return heap's size
   }
   
	// Remove the largest value from this priority queue and return it.
	// Precondition: priority queue is not empty.
   public E dequeue() 
   {
	   return (E) heap.remove(); // Remove value from priority queue
   }

	// Inserts the 'value' into the priority queue.
	// Precondition: priority queue is not full
   public void enqueue(E value) 
   {
	   heap.add(value); // Add value to priority queue
   }
   
   // Prints all elements in heap
   public void printHeap() 
   {
       heap.printList(); // Prints all elements in priority queue
   }
}
