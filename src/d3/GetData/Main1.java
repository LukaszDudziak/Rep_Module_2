package d3.GetData;

import java.sql.*;
import java.text.DecimalFormat;

public class Main1 {
    //Zapisz w poniższej zmiennej kod zapytania SQL pobierającego odpowiednie dane

    public static void main(String[] args) {
        String query = "SELECT * FROM products";


        try (
                Connection conn =
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/products_xe"
                                        + "?useSSL=false&seJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow&characterEncoding=utf8",
                                "root", "coderslab");
                Statement stat = conn.createStatement()) {


            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String name = rs.getString("name");
                int id = rs.getInt("id");
                String description = rs.getString("description");
                int price = rs.getInt("price");
                if( description.length()>=20){
                    description = description.substring(0,20)+"...";
                }
                System.out.println(id + " " + name+ " " + description+ " "+ price);
            }


        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

}
