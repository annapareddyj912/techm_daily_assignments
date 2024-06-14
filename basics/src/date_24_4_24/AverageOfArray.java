/*Calculate Average of Array Elements Using Method
Write a Java program to calculate the average of elements in an integer array using a method. The method should take an integer array as input and return the average of its elements.*/
package date_24_4_24;

import java.util.Scanner;

public class AverageOfArray {
    // Method to calculate average of elements in an array
    public static double calculateAverage(int[] array) {
        int sum = 0;
        
        // Calculate sum of elements in the array
        for (int num : array) {
            sum += num;
        }
        
        // Calculate average
        double average = (double) sum / array.length;
        return average;
    }
    
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Create an array to store the elements
        int[] arr = new int[n];
        
        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Calculate the average using the method
        double average = calculateAverage(arr);
        
        // Print the average
        System.out.println("Average of array elements: " + average);
        
        // Close the scanner
        scanner.close();
    }
}
