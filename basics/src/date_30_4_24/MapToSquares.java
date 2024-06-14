package date_30_4_24;

import java.util.Arrays;
import java.util.List;

public class MapToSquares {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Use Stream API to map integers to their squares and print the results
        numbers.stream()
               .map(num -> num * num) // Mapping each number to its square
               .forEach(System.out::println); // Printing each squared number
    }
}
