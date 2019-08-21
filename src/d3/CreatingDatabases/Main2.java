package d3.CreatingDatabases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {
    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego pierwszą tabelę
    public static String queryCreateTableProducts = "CREATE TABLE products (" +
            "id INT AUTO_INCREMENT," +
            "name VARCHAR(255)," +
            "description VARCHAR(255)," +
            "price DECIMAL(9,2)," +
            "PRIMARY KEY(id))";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego drugą tabelę
    public static String queryCreateTableOrders = "CREATE TABLE orders (" +
            "id INT AUTO_INCREMENT," +
            "description VARCHAR(255)," +
            "PRIMARY KEY(id))";

    //Zapisz w poniższej zmiennej kod zapytania SQL tworzącego trzecią tabelę
    public static String queryCreateTableClients = "CREATE TABLE clients (" +
            "id INT AUTO_INCREMENT," +
            "name VARCHAR(255)," +
            "surname VARCHAR(255)," +
            "PRIMARY KEY(id))";



    public static void main(String[] args) {
        Connection conn = null;
        String sql1= queryCreateTableClients;
        String sql2 = queryCreateTableOrders;
        String sql3 = queryCreateTableProducts;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/products_xe?useSSL=false&seJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow&characterEncoding=utf8",
                    "root", "coderslab");
            Statement stat = conn.createStatement();{
                stat.executeUpdate(sql1);
                stat.executeUpdate(sql2);
                stat.executeUpdate(sql3);

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
