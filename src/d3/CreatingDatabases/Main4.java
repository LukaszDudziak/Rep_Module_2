package d3.CreatingDatabases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main4 {
    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego pierwszą tabelę
    public static String queryCreateTableCinemas = "CREATE TABLE cinemas (" +
            "id INT AUTO_INCREMENT," +
            "name VARCHAR(255)," +
            "address VARCHAR(255)," +
            "PRIMARY KEY(id))";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego drugą tabelę
    public static String queryCreateTableMovies = "CREATE TABLE movies (" +
            "id INT AUTO_INCREMENT," +
            "title VARCHAR(255)," +
            "description VARCHAR(255)," +
            "rating DECIMAL(4,2)," +
            "PRIMARY KEY(id))";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego trzecią tabelę
    public static String queryCreateTableTickets = "CREATE TABLE tickets (" +
            "id INT AUTO_INCREMENT," +
            "quantity INT," +
            "price DECIMAL(4,2)," +
            "PRIMARY KEY(id))";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego czwartą tabelę
    public static String queryCreateTablePayments = "CREATE TABLE payments (" +
            "id INT AUTO_INCREMENT," +
            "type VARCHAR(255)," +
            "payment_date DATE," +
            "PRIMARY KEY(id))";

    public static void main(String[] args) {
        Connection conn = null;
        String sql1 = queryCreateTableCinemas;
        String sql2 =queryCreateTableMovies;
        String sql3 =queryCreateTableTickets;
        String sql4 =queryCreateTablePayments;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cinemas_xe?useSSL=false&seJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow&characterEncoding=utf8",
                    "root", "coderslab");
            Statement stat = conn.createStatement();
            {
                stat.executeUpdate(sql1);
                stat.executeUpdate(sql2);
                stat.executeUpdate(sql3);
                stat.executeUpdate(sql4);
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