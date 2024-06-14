/*Fibonacci Series
Write a Java program to generate and print the Fibonacci series up to a given number of terms. using java */
package date_22_4_24;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        
        // Check if the number of terms is valid
        if (terms <= 0) {
            System.out.println("The number of terms should be a positive integer.");
        } else {
            // Generate and print the Fibonacci series
            System.out.print("Fibonacci Series: ");
            for (int i = 0; i < terms; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}