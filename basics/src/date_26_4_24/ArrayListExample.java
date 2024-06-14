package date_26_4_24;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList with mixed data types
        ArrayList<Object> list = new ArrayList<>();

        // Add elements of different data types
        list.add(10);            // Integer
        list.add("Hello");       // String
        list.add(3.14);          // Double
        list.add('A');           // Character

        // Print all elements in the ArrayList
        System.out.println("Elements in ArrayList:");
        for (Object element : list) {
            System.out.println(element);
        }
    }
}