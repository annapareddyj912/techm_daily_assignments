package date_30_4_24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapToUpper {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        // Use Stream API to convert each string to uppercase and collect into a new list
        List<String> uppercaseStrings = strings.stream()
                                               .map(String::toUpperCase) // Convert each string to uppercase
                                               .collect(Collectors.toList()); // Collect results into a list

        // Print the resulting list of uppercase strings
        System.out.println("Uppercase strings: " + uppercaseStrings);
    }
}
