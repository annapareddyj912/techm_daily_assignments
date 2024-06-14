/*Calculate Factorial Using Method
Write a Java program that calculates the factorial of a number using a method. The method should take an integer as input and return its factorial. */
package date_24_4_24;

import java.util.Scanner;

public class Factorial {
    // Method to calculate factorial
    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1; // 0! and 1! are both 1
        } else {
            long factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
    
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int n = scanner.nextInt();
        
        // Validate input
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Calculate factorial using the method
            long factorial = calculateFactorial(n);
            
            // Print the result
            System.out.println("Factorial of " + n + " is: " + factorial);
        }
        
        // Close the scanner
        scanner.close();
    }
}
