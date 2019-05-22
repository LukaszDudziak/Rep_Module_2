package d2.Inheritance;

public class SalariedEmployee extends Employee{

    final static int hours = 190;

    public double CalculatePayment(){
        return this.salary*hours;
    }
}