package date_31_4_24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveEmployees {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "your_password"; // Replace with your MySQL password

    public static void main(String[] args) {
        // SQL query to retrieve records
        String sqlQuery = "SELECT id, name, age, department FROM employees";

        try (
            // Establishing a connection to the database
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Creating a statement for executing SQL queries
            Statement statement = connection.createStatement();

            // Executing the query and retrieving the result set
            ResultSet resultSet = statement.executeQuery(sqlQuery);
        ) {
            // Printing column headers
            System.out.println("ID\tName\tAge\tDepartment");

            // Iterating through the result set and printing employee details
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String department = resultSet.getString("department");

                // Printing each record
                System.out.println(id + "\t" + name + "\t" + age + "\t" + department);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle SQL exceptions
        }
    }
}
