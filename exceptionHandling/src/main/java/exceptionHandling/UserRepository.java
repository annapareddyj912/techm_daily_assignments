package exceptionHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> findUsersByAge(int age) {
        String sql = "SELECT * FROM users WHERE age = ?";
        try {
            return jdbcTemplate.query(sql, new Object[]{age}, (rs, rowNum) ->
                    new User(rs.getLong("id"), rs.getString("username"), rs.getInt("age"), rs.getString("email"))
            );
        } catch (DataAccessException e) {
            System.err.println("Error fetching users by age: " + e.getMessage());
            // Log the exception and rethrow it or return an appropriate response
            throw e;
        }
    }

    public int updateUserEmail(Long id, String email) {
        String sql = "UPDATE users SET email = ? WHERE id = ?";
        try {
            return jdbcTemplate.update(sql, email, id);
        } catch (DataAccessException e) {
            System.err.println("Error updating user email: " + e.getMessage());
            // Log the exception and rethrow it or return an appropriate response
            throw e;
        }
    }
}
