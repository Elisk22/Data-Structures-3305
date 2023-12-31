// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 7
// IDE Name: Eclipse


// Class Heap.java 
// Textbook - Listing 23.9, Page 878

public class Heap<E extends Comparable<E>> {
  private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
  
  final int CAPACITY = 100; 

  /** Create a default heap */
  public Heap() {
  }

  /** Create a heap from an array of objects */
  public Heap(E[] objects) {
    for (int i = 0; i < objects.length; i++)
      add(objects[i]);
  }

  /** Add a new object into the heap */
  public void add(E newObject) {
    list.add(newObject); // Append to the heap
    int currentIndex = list.size() - 1; // The index of the last node

    while (currentIndex > 0) {
      int parentIndex = (currentIndex - 1) / 2;
      // Swap if the current object is greater than its parent
      if (list.get(currentIndex).compareTo(
          list.get(parentIndex)) > 0) {
        E temp = list.get(currentIndex);
        list.set(currentIndex, list.get(parentIndex));
        list.set(parentIndex, temp);
      }
      else
        break; // the tree is a heap now

      currentIndex = parentIndex;
    }
  }

  /** Remove the root from the heap */
  public E remove() {
    if (list.size() == 0) return null;

    E removedObject = list.get(0);
    list.set(0, list.get(list.size() - 1));
    list.remove(list.size() - 1);

    int currentIndex = 0;
    while (currentIndex < list.size()) {
      int leftChildIndex = 2 * currentIndex + 1;
      int rightChildIndex = 2 * currentIndex + 2;

      // Find the maximum between two children
      if (leftChildIndex >= list.size()) break; // The tree is a heap
      int maxIndex = leftChildIndex;
      if (rightChildIndex < list.size()) {
        if (list.get(maxIndex).compareTo(
            list.get(rightChildIndex)) < 0) {
          maxIndex = rightChildIndex;
        }
      }

      // Swap if the current node is less than the maximum
      if (list.get(currentIndex).compareTo(
          list.get(maxIndex)) < 0) {
        E temp = list.get(maxIndex);
        list.set(maxIndex, list.get(currentIndex));
        list.set(currentIndex, temp);
        currentIndex = maxIndex;
      }
      else
        break; // The tree is a heap
    }

    return removedObject;
  }

  /** Get the number of nodes in the tree */
  public int getSize() {
    return list.size();
  }
  
 // Get the first element in the heap
 public E getFirst() 
 {
   return list.get(0); // Get first object from arraylist
 }
 
 // Method to print content of the heap
 public void printList() 
 {
	    if (!list.isEmpty()) // Make sure list is not empty
	    { 
	      for (int i = 0; i < list.size(); i++) 
	      {
	        System.out.print("Index " + i + ":   " + list.get(i) + "   "); // Print initial
	        
	        if (list.size() > (i * 2 + 1)) 
	        {
	          if (list.get(2 * i + 1) != null) 
	            System.out.print(list.get(2 * i + 1) + "   "); // Print left child
	          
	        }
	        
	        if (list.size() > (i * 2 + 2)) 
	        {
	          if (list.get(2 * i + 2) != null) 
	            System.out.print(list.get(2 * i + 2) + "   "); // Print right child
	          
	        }
	        System.out.println(); // New line
	      }
	    }
 	}
}
