package d3.GetData;

public class Main4 {
    //zapisz poniżej zapytania do bazy
    public static String query1 = "SELECT SUM(quantity) FROM tickets";
    public static String query2 = "SELECT type, COUNT(*) FROM payments GROUP BY type";
    public static String query3 = "SELECT AVG(price) FROM tickets";
    public static String query4 = "SELECT * FROM payments LIMIT 5 OFFSET 2";
    public static String query5 = "SELECT type WHERE COUNT(*)>2 FROM payments GROUP BY type";
    public static String query6 = "SELECT SUM(quantity) FROM tickets";
}
