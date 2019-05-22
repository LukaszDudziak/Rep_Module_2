package d2.Inheritance;

public class HourlyEmployee extends Employee {

    public double calculatePayment(int hours){
        return this.salary*hours; //5th
    }

}