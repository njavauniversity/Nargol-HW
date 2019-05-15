package sqlExercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCsample
{
    Connection con;
    PreparedStatement statement;
    public JDBCsample() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nargol","MyJava123");

    }

    public void insert(int id, String name , String lastname) throws SQLException {
        preparedstatement = con.prepareStatement(("insert into jadval(id ,name,lastname) VALUES (1,'yekkkk', 'dooooooo')"));
        preparedstatement.executeUpdate();
    }

    public void delete(student st) {
        preparedstatement = conn
    }
}
