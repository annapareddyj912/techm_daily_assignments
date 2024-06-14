package date_23_4_24;

/*Sum of Natural Numbers
Write a Java program to calculate the sum of first n natural numbers where n is entered by the user */
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        // Check if the entered number is positive
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the sum of the first n natural numbers
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            
            // Print the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
        
        // Close the scanner
        scanner.close();
    }
}
