import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
//Executing a Named Parameter Query
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<User> findUsersByAge(int age) {
        String sql = "SELECT * FROM users WHERE age = :age";
        SqlParameterSource namedParameters = new MapSqlParameterSource("age", age);
        return namedParameterJdbcTemplate.query(sql, namedParameters, (rs, rowNum) ->
                new User(rs.getLong("id"), rs.getString("username"), rs.getInt("age"), rs.getString("email"))
        );
    }

    public int updateUserEmail(Long id, String email) {
        String sql = "UPDATE users SET email = :email WHERE id = :id";
        SqlParameterSource namedParameters = new MapSqlParameterSource()
                .addValue("id", id)
                .addValue("email", email);
        return namedParameterJdbcTemplate.update(sql, namedParameters);
    }
}
