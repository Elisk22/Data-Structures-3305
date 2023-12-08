// Name: Kendal Elison
// Class: CS 3305 / Section 03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: Eclipse

import java.util.Scanner;

public class TestTemps {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize temperatures for the week
        int [] initialTemps = { 57, 76, 81, 65, 30, 71, 40 };
        DailyTemps weeklyTemps = new DailyTemps(initialTemps);

        System.out.println("Initial temperatures:");
        weeklyTemps.printTemps();

        // Test setTemp method
        System.out.print("\nTesting method setTemp-");
        System.out.print("\nEnter the day you want to set the temperature for: ");
        String dayToSet = scanner.nextLine();
        System.out.print("Enter the new temperature for " + dayToSet + ": ");
        int newTemp = scanner.nextInt();
        weeklyTemps.setTemp(dayToSet, newTemp);
        System.out.println("Temperature for " + dayToSet + " set to " + newTemp + "\n");
        weeklyTemps.printTemps();

        // Test Freezing method
        int freezingDays = weeklyTemps.Freezing();
        System.out.println("\nTesting method Freezing-");
        System.out.println("Number of freezing days is " + freezingDays + " days");

        // Test Warmest method
        String warmestDay = weeklyTemps.Warmest();
        System.out.println("\nTesting method Warmest-");
        System.out.println("The warmest day of the week is " + warmestDay);
	}

}
