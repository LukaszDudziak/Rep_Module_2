package d3.NewData;

import d3.Connector;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id kina: ");
        int id = scanner.nextInt();
        System.out.println("Podaj nazwe kina: ");
        String name = scanner.next();
        System.out.println("Podaj adres kina: ");
        String address = scanner.next();

        addCinema(id,name,address);
    }

    static void addCinema(int id, String name, String address){
        Connector connector = new Connector();
        connector.connect("cinemas_xe","INSERT INTO cinemas VALUES("+id+","+"'"+ name +"',"+"'"+address+"')");
    }
}
