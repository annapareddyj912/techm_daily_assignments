package date_30_4_24;

import java.util.Arrays;
import java.util.List;

public class FilterStrings {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> words = Arrays.asList("Apple", "Banana", "Ant", "Car", "Apricot");

        // Use Stream API to filter strings starting with "A" and print them
        words.stream()
             .filter(word -> word.startsWith("A"))
             .forEach(System.out::println);
    }
}
