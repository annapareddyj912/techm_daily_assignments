package date_26_4_24;

import java.util.HashMap;

public class StudentMarks {
    public static void main(String[] args) {
        // Create a HashMap to store student names (String) and their marks (Integer)
        HashMap<String, Integer> studentMarks = new HashMap<>();

        // Add student names and marks to the HashMap
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 72);
        studentMarks.put("Charlie", 90);
        studentMarks.put("Diana", 68);
        studentMarks.put("Emily", 95);

        // Print all student names and their marks
        System.out.println("Student Names and Marks:");
        for (String name : studentMarks.keySet()) {
            int marks = studentMarks.get(name);
            System.out.println(name + ": " + marks);
        }
    }
}
