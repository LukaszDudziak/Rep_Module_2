package d1.Constructor;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public List<String> operations;

    public Calculator() {
        this.operations = new ArrayList<>();
    }
    public void addToOperations(List<String> operations, String line){
        operations.add(line);
    }
    public int add(int num1, int num2){
        int result = num1+num2;
        addToOperations(this.operations,num1+ " added to "+num2+ " gives " + result);
        return result;
    }
    public void printOperations(){
        for (String l: this.operations) {
            System.out.println(l);
        }
    }
    public void clearOperations(){
        this.operations = new ArrayList<>();
    }
}
