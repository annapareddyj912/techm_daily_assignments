package date_26_4_24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0; // Initialize to handle scope

        try {
            // Prompt user to enter an integer
            System.out.print("Enter an integer: ");
            number = scanner.nextInt(); // Try to read an integer input

            // Print the entered number
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            // Catch InputMismatchException if non-integer input is entered
            System.out.println("Invalid input. Please enter an integer.");
            // Consume invalid input to avoid infinite loop
            scanner.nextLine();
        } finally {
            // Finally block to close scanner and perform cleanup
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}
