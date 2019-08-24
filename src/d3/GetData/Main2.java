package d3.GetData;

import java.sql.*;

public class Main2 {
    public static void main(String[] args) {


        String query = "SELECT AVG(price) FROM tickets";

        try (
                Connection conn =
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/cinemas_xe"
                                        + "?useSSL=false&seJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow&characterEncoding=utf8",
                                "root", "coderslab");
                Statement stat = conn.createStatement()) {


            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("title");
                int id = rs.getInt("id");
                String description = rs.getString("description");
                int rating = rs.getInt("rating");

                System.out.println(id + " " + name + " " + description + " " + rating);

            }


        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

}
