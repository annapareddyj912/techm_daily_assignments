package date_25_4_24;

import java.util.ArrayList; // Import ArrayList from java.util package

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();
        
        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        
        // Print all elements in the ArrayList
        System.out.println("Elements in ArrayList:");
        for (String element : list) {
            System.out.println(element);
        }
        
        // Accessing elements by index
        System.out.println("\nFirst element: " + list.get(0));
        System.out.println("Second element: " + list.get(1));
        System.out.println("Third element: " + list.get(2));
        
        // Size of the ArrayList
        System.out.println("\nSize of ArrayList: " + list.size());
    }
}
