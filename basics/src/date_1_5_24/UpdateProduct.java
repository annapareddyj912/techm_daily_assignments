package date_1_5_24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateProduct {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "your_password"; // Replace with your MySQL password

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product details to update:");
        System.out.print("Product ID: ");
        int productId = scanner.nextInt();
        System.out.print("New Price: ");
        double newPrice = scanner.nextDouble();

        try (
            // Establishing a connection to the database
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // SQL statement to update the price of a product
            PreparedStatement statement = connection.prepareStatement(
                "UPDATE products SET price = ? WHERE id = ?"
            );
        ) {
            // Setting parameters for the prepared statement
            statement.setDouble(1, newPrice);
            statement.setInt(2, productId);

            // Executing the update operation
            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("The product price was updated successfully!");
            } else {
                System.out.println("No product found with the given ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle SQL exceptions
        } finally {
            scanner.close(); // Close scanner
        }
    }
}
