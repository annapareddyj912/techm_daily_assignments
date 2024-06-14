package date_30_4_24;

import java.util.Arrays;

public class SumOfArrayElements {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Calculate sum of array elements using Stream API
        int sum = Arrays.stream(numbers)
                        .sum();

        // Print the sum of array elements
        System.out.println("Sum of array elements: " + sum);
    }
}
