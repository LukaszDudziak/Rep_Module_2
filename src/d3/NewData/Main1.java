package d3.NewData;

import d3.Connector;
import sun.util.calendar.LocalGregorianCalendar;

import java.sql.*;
import java.time.LocalDate;

public class Main1 {
    public static void main(String[] args) {
        //zapisz poniżej zapytania dodające rekordy do pierwszej tabeli:

        String table1row1 = "INSERT INTO clients VALUES(0, 'Adam', 'Czynski')";
        String table1row2 = "INSERT INTO clients VALUES(0, 'Janek', 'Bekowy')";


        //zapisz poniżej zapytania dodające rekordy do drugiej tabeli:

        String table2row1 = "INSERT INTO orders VALUES(0,'kolorowe')";
        String table2row2 = "INSERT INTO orders VALUES(0,'czarnobiale')";


        //zapisz poniżej zapytania dodające rekordy do trzeciej tabeli:

        String table3row1 = "INSERT INTO products VALUES(0,'samochód','ma 4 kola',10000)";
        String table3row2 = "INSERT INTO products VALUES(0,'motocykl','ma 2 kola',7500)";

        //Connector connector = new Connector("products_xe", table3row1);
        //connector.setSql(table3row2);

        //connector.connect();

        String sq = "INSERT INTO payments VALUES(90,'cash', NOW())";
        try (
                Connection conn =
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_xe"
                                        + "?useSSL=false&seJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow&characterEncoding=utf8",
                                "root", "coderslab");
                Statement stat = conn.createStatement()) {

            String sql = sq;
            stat.executeUpdate(sql);
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
}
