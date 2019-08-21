package d3.CreatingDatabases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test {
    public static void main(String[] args) {
        Connection conn = null;
        String sql = "CREATE TABLE users (user_id INT AUTO_INCREMENT,"
                + " user_name VARCHAR(255),"
                + " user_email VARCHAR(255) UNIQUE, "
                + " PRIMARY KEY(user_id))";
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/new_db?useSSL=false&seJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow&characterEncoding=utf8",
                    "root", "coderslab");
            Statement stat = conn.createStatement();{
                stat.executeUpdate(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

