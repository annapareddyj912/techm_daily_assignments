/*Largest Among Three Numbers
Write a Java program to find the largest among three numbers entered by the user. */
package date_23_4_24;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Prompt the user to enter the third number
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Determine the largest number
        int largest;
        
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        
        // Print the largest number
        System.out.println("The largest number is: " + largest);
        
        // Close the scanner
        scanner.close();
    }
}
