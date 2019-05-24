package d2.Inheritance;

import d1.Constructor.Calculator;

public class AdvancedCalculator extends Calculator {

    public double pow(double a, double b){
        double result = Math.pow(a,b);
        this.operations.add(a +" ^ "+ b +" = "+ result);
        return result;
    }

}
