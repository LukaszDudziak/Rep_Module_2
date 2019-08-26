package d3_home;

public class Main1 {
    public String query1 = "SELECT * FROM users WHERE name='Julia';";//??

    public String query2 = "SELECT * FROM users  ORDER BY email DESC LIMIT 5;";

    public String query3 = "SELECT * FROM users WHERE email LIKE '%yahoo.com' AND name LIKE 'L%'";

    public String query4 = "SELECT * FROM users WHERE password = SHA2(CONCAT(name,salt),256)";

    public String query5 = "SELECT id, title FROM offers WHERE price > 500000";

    public String query6 = "SELECT id, price FROM offers WHERE activation_token = '' AND price BETWEEN 2000 AND 400000";

    public String query7 = "SELECT title, price, phone FROM offers WHERE UNIX_TIMESTAMP(DATE_ADD(CURRENT_TIMESTAMP,INTERVAL -10 DAY)) >  UNIX_TIMESTAMP(expire)";

    public String query8 = "SELECT * FROM offers WHERE description LIKE '% violent %' AND phone LIKE '%2%' AND price > 50000";

    public String query9 = "SELECT * FROM offers WHERE promoted = 0 AND price < 300000 AND title LIKE '%LLC'";

    public String query10 = "SELECT * FROM offers WHERE price*2 < 50000 AND promoted = 1;";

    public String query11 = "";

    public String query12 = "";

    public String query13 = "";

    public String query14 = "";

    public String query15 = "";
}
