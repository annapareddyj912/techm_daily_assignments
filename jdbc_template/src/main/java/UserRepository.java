//Executing a Parameterized Query
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> findUsersByAge(int age) {
        String sql = "SELECT * FROM users WHERE age = ?";
        return jdbcTemplate.query(sql, new Object[]{age}, (rs, rowNum) ->
                new User(rs.getLong("id"), rs.getString("username"), rs.getInt("age"), rs.getString("email"))
        );
    }

    public int updateUserEmail(Long id, String email) {
        String sql = "UPDATE users SET email = ? WHERE id = ?";
        return jdbcTemplate.update(sql, email, id);
    }
}
