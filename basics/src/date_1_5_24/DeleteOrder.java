package date_1_5_24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteOrder {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "your_password"; // Replace with your MySQL password

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Order ID to delete: ");
        int orderId = scanner.nextInt();

        try (
            // Establishing a connection to the database
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // SQL statement to delete a record from the orders table
            PreparedStatement statement = connection.prepareStatement(
                "DELETE FROM orders WHERE order_id = ?"
            );
        ) {
            // Setting parameters for the prepared statement
            statement.setInt(1, orderId);

            // Executing the delete operation
            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("The order was deleted successfully!");
            } else {
                System.out.println("No order found with the given ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle SQL exceptions
        } finally {
            scanner.close(); // Close scanner
        }
    }
}
