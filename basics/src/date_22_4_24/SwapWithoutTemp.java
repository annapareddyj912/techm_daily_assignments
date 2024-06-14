/*Swap Two Numbers
Write a Java program to swap the values of two variables without using a third variable. */
package date_22_4_24;

import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Display the original values
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        
        // Swap the numbers without using a third variable
        num1 = num1 + num2;  // Step 1
        num2 = num1 - num2;  // Step 2
        num1 = num1 - num2;  // Step 3
        
        // Display the swapped values
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
        
        // Close the scanner
        scanner.close();
    }
}
