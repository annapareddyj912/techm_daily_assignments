/* Check Even or Odd
Write a Java program that checks whether a given integer is even or odd. Print "Even" if the number is even, otherwise print "Odd". */
package date_23_4_24;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        
        // Close the scanner
        scanner.close();
    }
}
