package date_29_4_24;

import java.util.Arrays;

public class SumOfSquaresExample {
    public static void main(String[] args) {
        // Create an integer array
        int[] array = {1, 2, 3, 4, 5};

        // Calculate sum of squares using lambda expression
        int sumOfSquares = Arrays.stream(array)
                                 .map(x -> x * x) // Lambda expression to square each element
                                 .sum(); // Summing up the squares

        // Print the sum of squares
        System.out.println("Sum of squares: " + sumOfSquares);
    }
}
