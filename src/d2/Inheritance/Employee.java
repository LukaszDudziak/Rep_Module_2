package d2.Inheritance;

import java.math.BigDecimal;

public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public double salary;

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public void raiseSalary(int percent){
        if(percent>= 0) {
            this.salary = this.salary + this.salary * percent / 100;
        } else {
            System.out.println("wrong numb mate");
        }
    }

    public Employee() {
    }

    public double getSalary() {
        return salary;
    }
}
