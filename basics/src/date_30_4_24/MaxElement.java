package date_30_4_24;

import java.util.Arrays;
import java.util.List;

public class MaxElement {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(10, 5, 17, 8, 21, 13);

        // Use Stream API to find the maximum element
        Integer maxElement = numbers.stream()
                                    .max(Integer::compareTo) // Using Integer's natural ordering
                                    .orElseThrow(); // If list is empty, throw NoSuchElementException

        // Print the maximum element
        System.out.println("Maximum element: " + maxElement);
    }
}
