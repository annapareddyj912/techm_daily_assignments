package date_29_4_24;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaSortExample {
    public static void main(String[] args) {
        String[] array = {"apple", "orange", "banana", "grape", "pear"};

        // Sorting array in descending order using lambda expression
        Arrays.sort(array, (s1, s2) -> s2.compareTo(s1));

        // Printing the sorted array
        System.out.println("Array sorted in descending order:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
