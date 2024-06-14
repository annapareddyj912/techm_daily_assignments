/*Check Leap Year
Write a Java program to check if a given year is a leap year or not. using java */
package date_22_4_24;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Check if the year is a leap year
        boolean isLeapYear = false;
        
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }
        
        // Print the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
