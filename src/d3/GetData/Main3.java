package d3.GetData;

public class Main3 {
    //zapisz poniżej zapytania do bazy
    public static String query1 = "SELECT * FROM movies WHERE title LIKE 'W%'";
    public static String query2 = "SELECT * FROM tickets WHERE price > 15.30";
    public static String query3 = "SELECT * FROM tickets WHERE quantity > 3";
    public static String query4 = "SELECT * FROM movies WHERE rating > 6.5";
    public static String query5 = "SELECT * FROM movies ORDER BY rating DESC LIMIT 1";
}
