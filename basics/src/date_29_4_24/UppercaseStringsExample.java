package date_29_4_24;

import java.util.Arrays;
import java.util.List;

public class UppercaseStringsExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Iterate through the list and print each string in uppercase using lambda expression
        words.forEach(word -> System.out.println(word.toUpperCase()));
    }
}
