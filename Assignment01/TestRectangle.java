// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: Eclipse
 
import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Create Rectangle with default values
        Rectangle myRectangle = new Rectangle();
        
        // Display information about the myRectangle
        System.out.println("myRectangle:\n------------\nWidth:\t\t" + myRectangle.getWidth() + "\nHeight:\t\t"
        		+ myRectangle.getHeight() + "\nArea:\t\t" + myRectangle.getArea() + "\nPerimeter:\t" + myRectangle.getPerimeter());
        
        myRectangle.printRectangle("myRectangle");
        
        // Create yourRectangle with specified values
        System.out.print("\n\nEnter the width of yourRectangle: ");
        double yourWidth = scanner.nextDouble();
        System.out.print("Enter the height of yourRectangle: ");
        double yourHeight = scanner.nextDouble();
        Rectangle yourRectangle = new Rectangle(yourWidth, yourHeight);

        // Display information about the rectangles
        System.out.println("\nyourRectangle:\n--------------\nWidth:\t\t" + yourRectangle.getWidth() + "\nHeight:\t\t"
        		+ yourRectangle.getHeight() + "\nArea:\t\t" + yourRectangle.getArea() + "\nPerimeter:\t" + yourRectangle.getPerimeter());
        
        yourRectangle.printRectangle("yourRectangle");
        
        
        // Test getWidth() method on yourRectangle
        System.out.println("\n\nTesting method getWidth() on object yourRectangle:");
        System.out.println("Width: " + yourRectangle.getWidth());

        // Test getHeight() method yourRectangle
        System.out.println("\nTesting method getHeight() on object yourRectangle:");
        System.out.println("Height: " + yourRectangle.getHeight());

        // Test getArea() method yourRectangle
        System.out.println("\nTesting method getArea() on object yourRectangle:");
        System.out.println(yourRectangle.getArea());

        // Test getPerimeter() method yourRectangle
        System.out.println("\nTesting method getPerimeter() on object yourRectangle:");
        System.out.println("Perimeter: " + yourRectangle.getPerimeter());

        // Test printRectangle() method yourRectangle
        System.out.print("\nTesting method printRectangle() on object yourRectangle:");
        yourRectangle.printRectangle("yourRectangle");
	
	}

}
