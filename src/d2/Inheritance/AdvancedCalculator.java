package d2.Inheritance;

import d1.Constructor.Calculator;

import java.util.ArrayList;
import java.util.List;

public class AdvancedCalculator extends Calculator {

    static double PI = Math.PI;

    public double pow(double a, double b){
        double result = Math.pow(a,b);
        this.operations.add(a +" ^ "+ b +" = "+ result);
        return result;
    }

    static double computeCircleArea(double r){
        return PI*Math.pow(r,2.0);
    }

}
