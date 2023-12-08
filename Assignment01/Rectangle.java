// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: Eclipse

public class Rectangle {
	
	private double width; 
	private double height; 
	
	//Default constructor
	public Rectangle()
	{
		width = 1.00; 
		height = 1.00; 
	}
	
	// Specified values constructor
	public Rectangle(double w, double h)
	{
		width= w; 
		height = h; 
	}
	
	// Returns width
	public double getWidth()
	{
		return width; 
	}
	
	// Returns height
	public double getHeight()
	{
		return height; 
	}
	
	// Returns area of rectangle 
	public double getArea()
	{
		return width * height; 
	}
	
	// Returns perimeter of rectangle
	public double getPerimeter()
	{ 
		return 2 * (width + height); 
	}
	
	public void printRectangle(String r)
	{
		System.out.print("\nRectangle " + r + " is " + width + " units wide and " + height + " units high.");  
	}

}
