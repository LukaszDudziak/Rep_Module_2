package d3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
    public Connector() {
    }

    public void connect(String db_name,String sql){
        try (
                Connection conn =
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db_name
                                        + "?useSSL=false&seJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow&characterEncoding=utf8",
                                "root", "coderslab");
                Statement stat = conn.createStatement()) {

            String sq = sql;
            stat.executeUpdate(sq);
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
}
