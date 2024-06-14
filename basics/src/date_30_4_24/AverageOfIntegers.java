package date_30_4_24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        // Read integers from user input
        System.out.println("Enter integers (enter 'done' to finish input):");
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Use Stream API to calculate average
        double average = numbers.stream()
                                .mapToDouble(Integer::doubleValue) // Convert each integer to double
                                .average() // Calculate average of doubles
                                .orElse(0.0); // Default to 0 if no elements

        // Print the average
        System.out.println("Average of the entered numbers: " + average);

        scanner.close();
    }
}
