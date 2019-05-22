package d1.Constructor;

public class Main {
    public static void main(String[] args) {

        Burger burger = new Burger("medium", 14); //1st

        Calculator calculator = new Calculator();
        calculator.add(3,1);
        calculator.add(4,2);
        calculator.printOperations();
        calculator.clearOperations();
        System.out.println("Cleared");
        calculator.add(2,2);
        calculator.printOperations(); //2nd
    }
}
