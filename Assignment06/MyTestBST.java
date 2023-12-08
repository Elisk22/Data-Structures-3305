// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 6
// IDE Name: Eclipse

import java.util.ArrayList;
import java.util.Scanner;

public class MyTestBST {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in); 
	
	    // Create the BSTs
	    BST<String> strTree = new BST<>();
	    BST<Integer> intTree = new BST<>();
	
	    int option = -1;
	    
	    // Variables to hold data user wants to enter in the tree
	    	// Dependent of whether they select String or int
	    int insertInt = 0;
	    String inputStr = null;
	    
	    // Boolean value to declare whether user chose int or string as tree data type
	    boolean data = true;
	    // Boolean value to represent if the user has selected tree data type
	    boolean pick = false; 
	    
	    // Continuous loop until user selects ---- exit on menu
	    while (option != 10) 
	    {
	    	System.out.println("\n----------------MAIN MENU---------------");

	        System.out.println("0. Enter Tree Data Type (integer or string)");
	        System.out.println("1. Insert Data Element");
	        System.out.println("2. Delete Data Element");
	        System.out.println("3. Search for Data Element");
	        System.out.println("4. Print Tree Size");
	        System.out.println("5. Path from Root to Data Element");
	        System.out.println("6. Check if Empty Tree");
	        System.out.println("7. Print Preorder Traversal");
	        System.out.println("8. Print Inorder Traversal");
	        System.out.println("9. Print Postorder Traversal");
	        System.out.println("10. Exit program");

	        System.out.print("\nEnter option number: ");
	        option = input.nextInt();
           
	        switch (option) 
	        {

                case 0: // Enter data type
                {
                	System.out.print("\nEnter the data type(integer/string): ");
                    inputStr = input.next();
                    
                    //User selects int
                    if (inputStr.equals("integer") || inputStr.equals("Integer") )
                    {
                    	data = false;
                    	pick = true; 
                    }
                    
                    // User selects string
                    else if (inputStr.equals("string") || inputStr.equals("String")) 
                    {
                        data = true;
                        pick = true; 
                    }
                    
                    else
                        System.out.println("Please select either integer or string.");
                   
                    break;
                }
                    

                // Insert data element
                case 1:
                {
                	// Need to enter data type first
                	if (pick == false )
                	{
                		System.out.println("Please enter a tree data type in option 0 before beginning");
                		break; 
                	}
                	
                	if (data) 
                    {
                		// User enters element to enter into tree
                        System.out.print("\nEnter element to insert in the strTree: ");
                        String insertStr = input.next();

                        System.out.println("\nTesting method Insert Data Element (Option 1)");
                        System.out.print("BST before inserting " + insertStr + " (Inorder):\t");
                        strTree.inorder();

                        // Insert element into tree
                        strTree.insert(insertStr);

                        System.out.print("\nBST after inserting " + insertStr + " (Inorder):\t");
                        strTree.inorder();
                        System.out.println();

                    } 
                	
                	else 
                	{
                		// User enters element to enter into tree
                        System.out.print("\nEnter element to insert in the intTree: ");
                        
                        // User must enter an int
                        if(input.hasNextInt())
                            insertInt = input.nextInt();
                        else
                            System.out.println("Please enter an Integer");
                        
                        System.out.println("\nTesting method Insert Data Element (Option 1)");
                        System.out.print("BST before inserting " + insertInt + " (Inorder):\t");
                        intTree.inorder();

                        // Insert element into tree
                        intTree.insert(insertInt);

                        System.out.print("\nBST after inserting " + insertInt + " (Inorder):\t");
                        intTree.inorder();
                        System.out.println();
                    }
                    
                	break;
                }
              

                case 2: // Delete data element
                {
                	// Need to enter data type first
                	if (pick == false )
                	{
                		System.out.println("Please enter a tree data type in option 0 before beginning");
                		break; 
                	}
                	
                
                	if (data)
                    {
                		// Can not delete element if nothing is in the tree
                		if(strTree.isEmpty())
                		{
                			System.out.println("\nTree is Empty, please enter data values before trying this method");
                			break;
                		}
                		
                		// User enters element to delete
                        System.out.print("\nEnter element to delete from the strTree: ");
                        String deleteStr = input.next();

                        System.out.println("\nTesting method Delete Data Element (Option 2)");
                        System.out.print("BST before deleting " + deleteStr + " (Inorder):\t");
                        strTree.inorder();
                        
                        // Deletes element
                        strTree.delete(deleteStr);

                        System.out.print("\nBST after deleting " + deleteStr + " (Inorder):\t");
                        strTree.inorder();
                        System.out.println();
                    } 
                    
                    else 
                    {
                    	// Can not delete element if nothing is in the tree
                    	if(intTree.isEmpty())
                		{
                			System.out.println("\nTree is Empty, please enter data values before trying this method");
                			break;
                		}
                    	
                    	// User enters element to delete
                        System.out.print("\nEnter element to delete from the intTree: ");
                        int deleteInt = input.nextInt();

                        System.out.println("\nTesting method Delete Data Element (Option 2)");
                        System.out.print("BST before deleting " + deleteInt + " (Inorder):\t");
                        intTree.inorder();

                        // Deletes element
                        intTree.delete(deleteInt);

                        System.out.print("\nBST after deleting " + deleteInt + " (Inorder):\t");
                        intTree.inorder();
                        System.out.println();
                    }
                    
                    break;

                }
                    
                case 3: // Search for data element
                {
                	// Need to enter data type first
                	if (pick == false )
                	{
                		System.out.println("Please enter a tree data type in option 0 before beginning");
                		break; 
                	}
                	
                	
                    if (data) 
                    {
                    	// Can not search for an element of no elements in tree
                    	if(strTree.isEmpty())
                		{
                			System.out.println("\nTree is Empty, please enter data values before trying this method");
                			break;
                		}
                    	
                    	// User enters element to search for
                    	System.out.print("Enter element to search for: ");
                        String searchStr = input.next();

                        System.out.println("\nTesting method Search for Data Element (Option 3)");
                        System.out.print("Search for " + searchStr + "? " + strTree.search(searchStr));
                    } 
                    
                    else 
                    {
                    	// Can not search for an element of no elements in tree
                    	if(intTree.isEmpty())
                		{
                			System.out.println("\nTree is Empty, please enter data values before trying this method");
                			break;
                		}
                    	
                    	// User enters element to search for
                    	System.out.print("Enter element to search for: ");
                        int searchInt = input.nextInt();

                        System.out.println("\nTesting method Search for Data Element (Option 3)");
                        System.out.print("Search for " + searchInt + "? " + intTree.search(searchInt));
                    }

                    System.out.println();
                    break;
                }
                    
                
                case 4: // Print Tree size
                {
                	// Need to enter data type first
                	if (pick == false )
                	{
                		System.out.println("Please enter a tree data type in option 0 before beginning");
                		break; 
                	}
                	
                	// For a tree of strings
                	if(data)
                    {
                    	if(strTree.isEmpty())
                			System.out.println("\nTree is Empty");
                		
                    	System.out.println("\nTesting method Tree size (Option 4)");
                		
                    	System.out.println("Tree size: " + strTree.getSize());
                    }
  
                    
                    // For a tree of ints
                    else
                    {
                    	if(intTree.isEmpty())
                    		System.out.println("\nTree is Empty");
                		
                    	System.out.println("\nTesting method Tree size (Option 4)");
                    	
                    	System.out.println("Tree size: " + intTree.getSize());
                    }
                        
                    
                    break;
                }
                    

                case 5: // Path from root to element
                {
                	// Need to enter data type first
                	if (pick == false )
                	{
                		System.out.println("Please enter a tree data type in option 0 before beginning");
                		break; 
                	}
                	
                    
                    if (data) 
                    {
                    	// If tree is empty cannot find a path to a node
                    	if(strTree.isEmpty())
                		{
                			System.out.println("\nTree is Empty, please enter data values before trying this method");
                			break;
                		}
                    	
                    	// User enters Node that they want to find a path to
                    	System.out.print("\nEnter the node to get the path to: ");
                        String nodePathStr = input.next();

                        System.out.println("\nTesting method Path from Root to Data Element (Option 5)");
                        System.out.print("Path from root to " + nodePathStr + ": ");
                        
                        // Finds path from root to Node
                        ArrayList<BST.TreeNode<String>> path = strTree.path(nodePathStr);
                        for (int i = 0; path != null && i < path.size(); i++)
                            System.out.print(path.get(i).element + " ");
                    } 
                    
                    else 
                    {
                    	// If tree is empty cannot find a path to a node
                    	if(intTree.isEmpty())
                		{
                			System.out.println("\nTree is Empty, please enter data values before trying this method");
                			break;
                		}
                    	
                    	// User enters Node that they want to find a path to
                    	System.out.print("\nEnter the node to get the path to: ");
                        int nodePathInt = input.nextInt();

                        System.out.println("\nTesting method Path from Root to Data Element (Option 5)");
                        System.out.print("Path from root to " + nodePathInt + ": ");
                        
                        // Finds path from root to Node
                        ArrayList<BST.TreeNode<Integer>> path = intTree.path(nodePathInt);
                        for (int i = 0; path != null && i < path.size(); i++)
                            System.out.print(path.get(i).element + " ");
                       
                    }
                    
                    System.out.println();
                    break;
                }
                    

                case 6: // Check if strTree is empty
                {
                	// Need to enter data type first
                	if (pick == false )
                	{
                		System.out.println("Please enter a tree data type in option 0 before beginning");
                		break; 
                	}
                	
                	System.out.println("\nTesting method Check if Empty Tree (Option 6)");
                
                    if (data)
                        System.out.println("Is empty strTree? " + strTree.isEmpty());

                    else 
                        System.out.println("Is empty strTree? " + intTree.isEmpty());
                    
                    break;
                }
                    

                case 7: // Print preorder traversal
                {
                	// Need to enter data type first
                	if (pick == false )
                	{
                		System.out.println("Please enter a tree data type in option 0 before beginning");
                		break; 
                	}
                	
                	// Print for string type
                    if (data)
                    {
                    	if(strTree.isEmpty())
                			System.out.println("\nTree is Empty");
                    	
                    	System.out.println("\nTesting method Preorder Traversal (Option 7)");
                        System.out.print("Preorder: ");
                		
                    	strTree.preorder();
 
                    }
                    
                    // Print for int type
                    else 
                    {
                    	if(intTree.isEmpty())
                    		System.out.println("\nTree is Empty");
                    	
                    	System.out.println("\nTesting method Preorder Traversal (Option 7)");
                        System.out.print("Preorder: ");
                        
                    	intTree.preorder();
                    }
                        
                    
                    System.out.println();
                    break;
                }
                    

                case 8: // Print Inorder traversal
                {
                	// Need to enter data type first
                	if (pick == false )
                	{
                		System.out.println("Please enter a tree data type in option 0 before beginning");
                		break; 
                	}
                	
                	// Prints for string stype
                    if (data)
                    {
                    	if(strTree.isEmpty())
                    		System.out.println("\nTree is Empty");
                    	
                    	System.out.println("\nTesting method Inorder Traversal (Option 8)");
                        System.out.print("Inorder: ");
                			
                    	strTree.inorder();
                    }

                    // Prints for int type
                    else 
                    {
                    	if(intTree.isEmpty())
                    		System.out.println("\nTree is Empty");
                    	
                    	System.out.println("\nTesting method Inorder Traversal (Option 8)");
                        System.out.print("Inorder: ");
                        
                    	intTree.inorder();
                    }
                        
                    
                    System.out.println();
                    break;
                }
                    

                case 9: // Print Postorder traversal
                {
                	// Need to enter data type first
                	if (pick == false )
                	{
                		System.out.println("Please enter a tree data type in option 0 before beginning");
                		break; 
                	}
                	
                	// Prints for string type 
                    if (data)
                    {
                    	if(strTree.isEmpty())
                    		System.out.println("\nTree is Empty");
                			
                    	System.out.println("\nTesting method Postorder Traversal (Option 9)");
                        System.out.print("Postorder: ");
                        
                    	strTree.postorder();
                    }
                        
                    // Prints for int type
                    else
                    {
                    	if(intTree.isEmpty())
                    		System.out.println("\nTree is Empty");
                    	
                    	System.out.println("\nTesting method Postorder Traversal (Option 9)");
                        System.out.print("Postorder: ");
                        
                    	intTree.postorder();
                    }
                        
                    
                    System.out.println();
                    break;
                }  

                case 10: // Exit
                {
                	System.out.println("\nExiting Program");;
                    break;
                }
                    
                 // User doesn't select menu option
                default: 
                {
                    System.out.println("Please choose a valid menu option.");
                    
                    System.out.println();
                    break;
                }
            }
	        
	        
	    }
	    	
	}
    	
}
