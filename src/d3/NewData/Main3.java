package d3.NewData;

import d3.Connector;

public class Main3 {
    public static void main(String[] args) {

        Connector connector = new Connector();
        String db_name = "cinemas_xe";

        //zapisz poniżej zapytania dodające rekordy do pierwszej tabeli:
        String table1row2 = "INSERT INTO cinemas VALUES(0,'multikino','multi 24')";
        String table1row3 = "INSERT INTO cinemas VALUES(0,'helios','helio 24')";
        String table1row1 = "INSERT INTO cinemas VALUES(0,'cinemacity','city 24')";
        String table1row4 = "INSERT INTO cinemas VALUES(0,'luna','luny 24')";
        String table1row5 = "INSERT INTO cinemas VALUES(0,'wisla','wisly 24')";
        //connector.connect(db_name,table1row1);
        //connector.connect(db_name,table1row2);
        //connector.connect(db_name,table1row3);
        //connector.connect(db_name,table1row4);
        //connector.connect(db_name,table1row5);

        //zapisz poniżej zapytania dodające rekordy do drugiej tabeli:
        String table2row1 = "INSERT INTO movies VALUES(0,'Pierwszy','pierwszy',1.0)";
        String table2row2 = "INSERT INTO movies VALUES(0,'Drugi','drugi',2.0)";
        String table2row3 = "INSERT INTO movies VALUES(0,'Trzeci','trzeci',3.0)";
        String table2row4 = "INSERT INTO movies VALUES(0,'Czwarty','czwarty',4.0)";
        String table2row5 = "INSERT INTO movies VALUES(0,'Piaty','piaty',5.0)";
        //connector.connect(db_name,table2row1);
        //connector.connect(db_name,table2row2);
        //connector.connect(db_name,table2row3);
        //connector.connect(db_name,table2row4);
        //connector.connect(db_name,table2row5);

        //zapisz poniżej zapytania dodające rekordy do trzeciej tabeli:
        String table3row1 = "INSERT INTO payments VALUES(0,'cash',NOW())";
        String table3row2 = "INSERT INTO payments VALUES(0,'card',NOW())";
        String table3row3 = "INSERT INTO payments VALUES(0,'cash',NOW())";
        String table3row4 = "INSERT INTO payments VALUES(0,'transfer',NOW())";
        String table3row5 = "INSERT INTO payments VALUES(0,'card',NOW())";

        //connector.connect(db_name,table3row1);
        //connector.connect(db_name,table3row2);
        //connector.connect(db_name,table3row3);
        //connector.connect(db_name,table3row4);
        //connector.connect(db_name,table3row5);

        //zapisz poniżej zapytania dodające rekordy do czwartej tabeli:
        String table4row1 = "INSERT INTO tickets VALUES(0,5,20)";
        String table4row2 = "INSERT INTO tickets VALUES(0,4,15)";
        String table4row3 = "INSERT INTO tickets VALUES(0,1,4)";
        String table4row4 = "INSERT INTO tickets VALUES(0,5,21)";
        String table4row5 = "INSERT INTO tickets VALUES(0,5,23)";

        //connector.connect(db_name,table4row1);
        ////connector.connect(db_name,table4row2);
        ////connector.connect(db_name,table4row3);
        ////connector.connect(db_name,table4row4);
        //connector.connect(db_name,table4row5);
    }
}
