// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 8
// IDE Name: Eclipse

import java.util.Scanner;

public class HashFunctions {
	
	 public static void main (String[] args)
	 {
	        Scanner input = new Scanner(System.in);
	        
	        // Hardcoded keys 
	        int[] keys = {1234, 8234, 7867, 1009, 5438, 4312, 3420, 9487, 5418, 5299,
	                5078, 8239, 1208, 5098, 5195, 5329, 4543, 3344, 7698, 5412,
	                5567, 5672, 7934, 1254, 6091, 8732, 3095, 1975, 3843, 5589,
	                5439, 8907, 4097, 3096, 4310, 5298, 9156, 3895, 6673, 7871,
	                5787, 9289, 4553, 7822, 8755, 3398, 6774, 8289, 7665, 5523};

	        // Declare the table
	        int [][] Table = new int[50][2];
	        int probes;
	        
	        int option = 0; 

	        while( option != 5) 
	        {
	        	// Main menu
	        	System.out.println("\n-----MAIN MENU--------------------------------------");
	            System.out.println("1. Run HF1 (Division method with Linear Probing)");
	            System.out.println("2. Run HF2 (Division method with Quadratic Probing)");
	            System.out.println("3. Run HF3 (Division method with Double Hashing)");
	            System.out.println("4. Run HF4 (Student Designed HF)");
	            System.out.println("5. Exit program");

	            System.out.print("\nEnter option number: ");
	            
	            option = input.nextInt();

	            // Initialize the table
	            for (int i = 0; i < 50; i++) 
	            {
	                for (int x = 0; x < 2; x++) 
	                {
	                    Table[i][x] = 0;
	                }
	            }

	            switch (option) 
	            {
	            
	            // Division with Linear Probing
	                case 1:  
	                { 

	                    System.out.println();

	                    //Double hashing
	                    for (int value : keys) 
	                    {
	                        HF1(value, Table); // Insert to the hash table
	                    }

	                    // Calculate the sum of probe values
	                    probes = sumProbes(Table);
	                    System.out.println();

	                    // Display the hash-table
	                    System.out.println("Hash table resulted from HF1\n\nIndex\t  Key\t  Probes\n----------------------------");
	                    
	                    for (int i = 0; i < Table.length; i++) 
	                    {
	                        if (Table[i][0] != 0)
	                            System.out.printf("%-10d%-10d%d\n", i, Table[i][0], Table[i][1]);
	                        else
	                            System.out.printf("%-10d%-10s\n", i, "-- Empty --");
	                    }
	                    
	                    System.out.println("----------------------------");
	                    System.out.println("\nSum of probe values = " + probes + " probes");
	                    
	                    System.out.println();
	                    
	                    break; 
	                }

	                // Division with Quadratic Probing
	                case 2: 
	                { 

	                    // Double hashing
	                    for (int k : keys) 
	                    {
	                        HF2(k, Table); //insert to the hash table
	                    }

	                    //calculate the sum of probe values
	                    probes = sumProbes(Table);

	                    //display the hash-table
	                    System.out.println("\nHash table resulted from HF2\n\nIndex\t  Key\t  Probes\n----------------------------");
	                    
	                    for (int i = 0; i < Table.length; i++) 
	                    {
	                        if (Table[i][0] != 0)
	                            System.out.printf("%-10d%-10d%d\n", i, Table[i][0], Table[i][1]);
	                        else
	                            System.out.printf("%-10d%-10s\n", i, "-- Empty --");
	                    }
	                    
	                    System.out.println("----------------------------");
	                    System.out.println("\nSum of probe values = " + probes + " probes");
	                    
	                    System.out.println();
	                    break; 
	                }

	                case 3: 
	                { 
	                    for (int k : keys) 
	                    {
	                        HF3(k, Table); //insert to the hash table
	                    }

	                    // Calculate the sum of probe values
	                    probes = sumProbes(Table);

	                    // Display the hash-table
	                    System.out.println("\nHash table resulted from HF3\n\nIndex\t  Key\t  Probes\n----------------------------");
	                    
	                    for (int i = 0; i < Table.length; i++) 
	                    {
	                        if (Table[i][0] != 0)
	                            System.out.printf("%-10d%-10d%d\n", i, Table[i][0], Table[i][1]);
	                        else
	                            System.out.printf("%-10d%-10s\n", i, "-- Empty --");
	                    }
	                    
	                    System.out.println("----------------------------");
	                    System.out.println("\nSum of probe values = " + probes + " probes");
	                    
	                    System.out.println();
	                    break; 
	                }

	                // My function
	                case 4: 
	                {
	                    for (int key : keys) 
	                    {
	                        HF4(key, Table); //insert to the hash table
	                    }

	                    // Calculate the sum of probe values
	                    probes = sumProbes(Table);

	                    // Display the hash-table
	                    System.out.println("\nHash table resulted from HF4\n\nIndex\t  Key\t  Probes");
	                    System.out.println("----------------------------");
	                    
	                    for (int i = 0; i < Table.length; i++) 
	                    {
	                        if (Table[i][0] != 0)
	                            System.out.printf("%-10d%-10d%d\n", i, Table[i][0], Table[i][1]);
	                        else
	                            System.out.printf("%-10d%-10s\n", i, "-- Empty --");
	                    }
	                    
	                    System.out.println("----------------------------");
	                    System.out.println("Sum of probe values = " + probes + " probes");
	                    
	                    System.out.println();
	                    break; 
	                }
	                
	                // Exit
	                case 5: 
	                {
	                    System.out.println("Exiting");
	                    break; 
	                }
	                
	                // Invalid Option
	                default: 
	                {
	                	System.out.println("Please enter a valid option");
	                	break; 
	                }
	            }
	        }
	    }
	 
		// Method to return the sum of all probes in the table
		public static int sumProbes(int[][] table)
		{
		    	
			int totalProbes = 0;
		        
			for(int i = 0; i < 50; i++)
			{
				
				totalProbes += table[i][1];
		    }
		        
		    return totalProbes;
		}
		
		// Method that implements the Division method with Linear Probing for collision resolution
	    public static void HF1(int key, int hashTable[][])
	    {
	
	        // Division method
	        int n = key % 50;
	        int probes = 0;
	        int i = n;
	
	        // Insert the key into the table with Linear Probing
	        do
	        {
	        	// Check if the current slot is empty
	            if(hashTable[i][0]==0)
	            {
	            	// If empty, insert the key
	                hashTable[i][0] = key;
	                break;
	            }
	            
	            // If the current slot is occupied, increment probes and move to the next slot
	            probes++;
	            i = (i+1)%50;
	            
	        } while(i!=n); // Continue probing until we reach the initial index
	
	        // Stores number of probes in the second column of table
	        hashTable[i][1] = probes;
	    }
	
	    // Method that implements the Division method with Quadratic Probing for collision resolution
	    public static void HF2(int key, int Table[][])
	    {
	    	// Calculate the initial hash value
	    	int value = key % 50;
	    	
	    	// Check if the initial slot is empty
	    	if (Table[value][0] == 0)
	    		// If empty, insert the key
	    		Table[value][0] = key;
	
	    	else 
	    	{
	    		// If there is a collision go through all possible quadratic values
	    		int probes = 0;
	    		
	    		for (int j = 0; j < 50; j++)
	    		{
	    			// Computing the new hash value
	    			int temp = (key + j * j) % 50;
	    			
	    			// If the new slot is empty
	    			if (Table[temp][0] == 0)
	    			{
	    				 // If empty, insert the key and store the number of probes
	    				Table[temp][0] = key;
	    				Table[temp][1] = probes;
	    				break;
	    			}
	                
	    			// If the slot is occupied, increment the probes counter
	    			probes++;
	    		}
	    	}
	    }
	        
	    
	
	    // Method that implements the Division method with Double Hashing for collision resolution
	    public static void HF3(int key, int hashTable[][])
	    {
	    	
	       // Division hashing function
	 	   int num = key % 50;
	 	   
	 	   // Second hashing function
	 	   int k = 30 - key % 25;
	 	   int probes = 0;
	 	   int i = num;
	 	   int j = 1;
	 	   
	 	   // Insert the key into the table with Double Hashing
	 	   do
	 	   {
	 		   // Check if the current slot is empty
	 	   		if(hashTable[i][0]== 0)
	 	   		{
	 	   			// Store the key in table
	 	   			hashTable[i][0] = key;
	 	   			
	 	   			// Stores number of probes
	 	   			hashTable[i][1] = probes;
	 	            return;
	 	   		}
	 	   		
	 	   		// If the slot is occupied, increment probes and find new index
	 	   		probes++;
	 	   		i = (num+j*k)%50;
	 	   		j++;
	 	   		
	 	   } while(probes != 50); // Continue until we have probed all possible slots
	 	   
	 	   System.out.println ("Unable to hash key " + key + " to the table");
	        
	    }
	
	    // Folding hash function with Double Hashing for collision resolution
	    public static void HF4(int key, int[][] hashTable)
	    {
	        
	    	// Folding hash function
	        int sum = 0;
	        int k = key;
	        
	        // Calculate the sum of the digits using folding
	        while(k!=0)
	        {
	            sum +=  k %100;
	            k = k/100;
	        }
	        
	        // Initial index
	        int initalIndex = sum % 50;
	
	        // Second hashing function
	        int k2 = 30 - key % 25;
	        int probes = 0;
	        
	        int newIndex = initalIndex;
	        int j = 1;
	        
	        boolean fg = false;
	
	        // Insert the key into the table with Double Hashing
	        do
	        {
	        	// Check if the current slot is empty
	            if(hashTable[newIndex][0]==0)
	            {
	            	// If empty, insert the key and set flag to true
	                hashTable[newIndex][0] = key;
	                fg = true;
	                break;
	            }
	            
	            // If the slot is occupied, increment probes and find new index
	            probes++;
	
	            newIndex = (initalIndex+j*k2)%50;
	            j++;
	            
	        } while( newIndex != initalIndex);
	        
	        // If unable to find an empty slot after probing all possibilities
	        if(!fg)
	        {
	            System.out.println ("Unable to store key " + key + " to the table");
	            hashTable[newIndex][1] = 0; // Set the number of probes to 0 for unsuccessful insertion
	        }
	        
	        else
	        {
	            // Stores number of probes
	            hashTable[newIndex][1] = probes;
	        }
	    }
}
