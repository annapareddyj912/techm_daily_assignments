/*Calculate Area of a Rectangle
Write a Java program to calculate and print the area of a rectangle given its length and width.*/
package date_22_4_24;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        // Calculate the area of the rectangle
        double area = length * width;
        
        // Print the area of the rectangle
        System.out.println("The area of the rectangle is: " + area);
        
        // Close the scanner
        scanner.close();
    }
}
