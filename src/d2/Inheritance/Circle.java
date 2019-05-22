package d2.Inheritance;

public class Circle extends Shape{
    private double radius;

    public Circle(double x, double y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }
    @Override
    public String getDiscription(){
        return this.radius + " "+ this.getX()+" " + " "+ this.getY()+" " +" "+ this.getColor();
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
    public double getCircuit(){
        return 2*Math.PI*radius;
    }
}
