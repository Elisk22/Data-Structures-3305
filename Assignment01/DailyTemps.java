// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: Eclipse

public class DailyTemps {
	
	private int[] temperatures;
	private String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
	
	public DailyTemps(int[] temp)
	{
		temperatures = temp; 
	}
	
	// Method to set temperature for a specific day
    public void setTemp(String day, int temperature) 
    {
        int index = getDayIndex(day);
        if (index != -1) 
        	temperatures[index] = temperature;
    
    }

    // Method to find the number of freezing days
    public int Freezing() 
    {
        int freezingCount = 0;
        for (double temp : temperatures) 
        {
            if (temp < 32)
                freezingCount++;
            
        }
        return freezingCount;
    }

    // Method to find the warmest day
    public String Warmest() 
    {
        int warmestIndex = 0;
        for (int i = 1; i < temperatures.length; i++) 
        {
            if (temperatures[i] > temperatures[warmestIndex])
                warmestIndex = i;
            
        }
        return days[warmestIndex];
    }

    // Method to print temperatures for the week
    public void printTemps() 
    {
        for (int i = 0; i < temperatures.length; i++) 
        {
        	// Align with a width of 9 char
            System.out.printf("%-9s %d\n", days[i], temperatures[i]);
        }
    }

    // Helper method to get the index of a day in the days array
    private int getDayIndex(String day) 
    {
        for (int i = 0; i < days.length; i++) 
        {
            if (days[i].equalsIgnoreCase(day))
                return i;
            
        }
        return -1; // Day not found
    }

}
