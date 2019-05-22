package d2.Inheritance;

public class Shape {
    private double x;
    private double y;
    private String color;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public String getDiscription(){
        String res = this.x+" " + " "+ this.y+" " +" "+ this.color;
        return res;
    }
    public double getDistance(Shape shape){
        double result = Math.abs(Math.sqrt(Math.pow((shape.x-this.x),2)+Math.pow((shape.y-this.y),2)));
        return result;
    }
}
//Stwórz klasę Shape, która będzie posiadała:
//
//    prywatne atrybuty x i y (określające środek tego kształtu) oraz color,
//    konstruktor, przyjmujący zmienne określające wartości x, y i color,
//    metodę o nazwie getDescription(), wypisującą informacje o tym kształcie, zwracającą wartość typu String,
//    metodę o nazwie getDistance(Shape shape), zwracającą odległość od środka innego kształtu, wynik ma być typu double.
//
//Sprawdź, co się dzieje, kiedy zmieniasz dostęp do poszczególnych funkcji z publicznego na prywatny.