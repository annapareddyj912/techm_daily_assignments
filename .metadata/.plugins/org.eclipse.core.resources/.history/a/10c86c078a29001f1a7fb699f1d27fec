package date_29_4_24;

import java.util.ArrayList;
import java.util.List;

public class LambdaFilterExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Print the original list
        System.out.println("Original List: " + numbers);

        // Filter and print even numbers using lambda expression
        System.out.println("Even Numbers:");
        numbers.stream()
               .filter(num -> num % 2 == 0) // Lambda expression to filter even numbers
               .forEach(System.out::println); // Method reference to print each element
    }
}
