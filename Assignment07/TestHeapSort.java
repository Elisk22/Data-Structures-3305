// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 7
// IDE Name: Eclipse


// Class Heap.java 
// Textbook - Listing 23.9, Page 878

public class TestHeapSort { 
   /** A test method */
   public static void main(String[] args) {
    
	// Test list from your initial code
       Integer[] list1 = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};

       // Test list 2 (character array)
       Character[] list2 = {'w', 'f', 'A', 'X', 'T', 'Q', 'k', 's', '8', 'L', '3', 'b', 'A', 'w', 's', 'H', 'j', 'K', 'L'};

       // Test list 3 (string array)
       String[] list3 = {"Class", "Study", "Data", "Computing", "hard", "Structures,", "to pass."};

       // List 1
       System.out.println("Original List:");
       printArray(list1); 
       // Sort list 1
       HeapSort.heapSort(list1);
       System.out.println("\nSorted List:");
       printArray(list1);

       // List 2
       System.out.println("\nOriginal List:");
       printArray(list2);
       // Sort list 2
       HeapSort.heapSort(list2);
       System.out.println("\nSorted List:");
       printArray(list2);

       // List 3
       System.out.println("\nOriginal List:");
       printArray(list3);
       // Sort list 3
       HeapSort.heapSort(list3);
       System.out.println("\nSorted List:");
       printArray(list3);
         
   }
   
   // Method to print an array
   public static <T> void printArray(T[] array) 
   {
       for (T element : array) 
       {
           System.out.print(element + " ");
       }
       System.out.println();
   }

}
