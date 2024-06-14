package date_24_4_24;

import java.util.Scanner;

public class ReverseString {
    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        
        // Append characters from end to start
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        
        return reversed.toString();
    }
    
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string to reverse: ");
        String originalString = scanner.nextLine();
        
        // Reverse the string using the method
        String reversedString = reverseString(originalString);
        
        // Print the reversed string
        System.out.println("Reversed string: " + reversedString);
        
        // Close the scanner
        scanner.close();
    }
}
