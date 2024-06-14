/* Check Prime Number Using Method
Write a Java program to check if a given number is prime or not using a method. The method should take an integer as input and return true if the number is prime, otherwise false*/
package date_24_4_24;

import java.util.Scanner;

public class PrimeNumber {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 1 and numbers less than or equal to 1 are not prime
        }
        
        // Check from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself, not prime
            }
        }
        
        return true; // Otherwise, prime
    }
    
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a positive integer to check if it is prime: ");
        int n = scanner.nextInt();
        
        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Check if the number is prime using the method
            boolean prime = isPrime(n);
            
            // Print the result
            if (prime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
