package date_2_5_24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementVsPreparedStatement {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "your_password"; // Replace with your MySQL password

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            // Using Statement
            try (Statement statement = connection.createStatement()) {
                String username1 = "user1";
                String email1 = "user1@example.com";

                String sql = "INSERT INTO users (username, email) VALUES ('" + username1 + "', '" + email1 + "')";
                int rowsInserted = statement.executeUpdate(sql);
                if (rowsInserted > 0) {
                    System.out.println("Using Statement: A new user was inserted successfully!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Using PreparedStatement
            try (PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO users (username, email) VALUES (?, ?)")) {
                String username2 = "user2";
                String email2 = "user2@example.com";

                preparedStatement.setString(1, username2);
                preparedStatement.setString(2, email2);

                int rowsInserted = preparedStatement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Using PreparedStatement: A new user was inserted successfully!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
