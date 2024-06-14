package date_29_4_24;

import java.util.Arrays;
import java.util.List;

public class MaxElementExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(10, 7, 23, 14, 8, 19);

        // Find maximum element using lambda expression
        Integer max = numbers.stream()
                             .max(Integer::compare) // Lambda expression to find max element
                             .orElseThrow(); // Handle if list is empty

        // Print the maximum element
        System.out.println("Maximum element: " + max);
    }
}
