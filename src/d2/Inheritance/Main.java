package d2.Inheritance;

public class Main {

    public static void main(String[] args) {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.pow(2.3,5.2);
        advancedCalculator.printOperations(); //1st

        Shape shape = new Shape(2.0,3.1,"blue");
        Shape shape1 = new Shape(10.0,15.4,"yellow");
        System.out.println(shape.getDiscription());
        System.out.println(shape.getDistance(shape1)); //2nd

        Circle circle = new Circle(2.4,3.1,"red",4.3);
        System.out.println(circle.getDiscription());  //3rd

        Employee employee = new Employee(1,"John","Doe",13.99);
        employee.raiseSalary(10);
        System.out.println(employee.getSalary());  //4th

        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        hourlyEmployee.calculatePayment(10);



    }
}
