package date_31_4_24;

import java.sql.Connection;
simport java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertStudent {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "your_password"; // Replace with your MySQL password

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student details:");
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();

        try (
            // Establishing a connection to the database
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // SQL statement to insert a new record into the students table
            PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO students (id, name, age) VALUES (?, ?, ?)"
            );
        ) {
            // Setting parameters for the prepared statement
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setInt(3, age);

            // Executing the insert operation
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("A new student record was inserted successfully!");
            } else {
                System.out.println("Failed to insert the student record. Please try again.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle SQL exceptions
        } finally {
            scanner.close(); // Close scanner
        }
    }
}
