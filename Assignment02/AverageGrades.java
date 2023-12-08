// Name: Kendal Elison
// Class: CS 3305/section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 2 

import java.util.Scanner;

public class AverageGrades {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
		// Variables
		int[] grades = null;
        int classSize = 0;
        int option;

        do {
        	// Display class menu for options
            System.out.println("--------MAIN MENU-------");
            System.out.println("1. Read class size");
            System.out.println("2. Read class grades");
            System.out.println("3. Compute class average");
            System.out.println("4. Exit program");
            System.out.print("Enter option number: ");

            // Reads in user option 
            option = scanner.nextInt();
            scanner.nextLine(); 
            
            // Class size
            if (option == 1) 
            {
                System.out.print("Enter class size:    ");
                classSize = scanner.nextInt();
                scanner.nextLine();
            } 
            
            // Generates array of grades
            else if (option == 2) 
            {
            	// Checks in user entered class size yet
                if (classSize <= 0)
                    System.out.println("Invalid class size. Please enter a valid class size first.");
                else
                {
                	// Sets array to classSize
                    grades = new int[classSize];
                    System.out.print("Enter grades:\t     ");
                    for (int i = 0; i < classSize; i++) 
                    {	
                    	// Fills up array with grades
                        grades[i] = scanner.nextInt();
                    }
                    scanner.nextLine();
                }
            } 
            
            // Finds class average of grades
            else if (option == 3) 
            {
                if (grades == null)
                    System.out.println("Grades have not been entered yet. Please enter grades first.");
                else 
                {
                	//Reiterated user data
                	System.out.println("You entered class size:\t" + classSize);
                	
                	System.out.print("You entered grades:\t");
                	//Prints grades
                	for(int grade : grades)
                	{
                		System.out.print(grade + " ");
                	}
              
                	// Calls method to find average
                    double average = findAverage(grades, 0, 0);
                    System.out.printf("\nClass average:\t\t%.2f%n", average);
                }
            } 
            
            // Exits program
            else if (option == 4) 
            {
                System.out.println("Exiting program.");
            } 
            
            // If user enters wrong number
            else 
            {
                System.out.println("Please select another option.");
            }

            System.out.println("\n");

        } while (option != 4);

        scanner.close();

	}
	
	// Recursive method to find average of grades
	private static double findAverage(int[] grades, int index, int sum) 
	{
	    // When the index surpasses length of array returns average
		if (index >= grades.length)
			return (double) sum / grades.length;
	        

		return findAverage(grades, index + 1, sum + grades[index]);
	}

}
