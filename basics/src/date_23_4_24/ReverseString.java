/* Reverse a String
Write a Java program to reverse a given string entered by the user.*/
package date_23_4_24;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();
        
        // Reverse the string
        String reversedString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);
        
        // Close the scanner
        scanner.close();
    }
}
