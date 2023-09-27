package main.java.com.company.Lab1.task3;

import java.util.HashMap;
import java.util.Map;

public class FunctionCalculator {
    public HashMap<Double, Double> getValues(double a, double b, double h){
        HashMap<Double, Double> values = new HashMap<>();
        for(double i = a; i <= b; i += h){
            values.put(i, Math.tan(i));
        }
        return values;
    }
    public void print(HashMap<Double, Double> values){
        for(Map.Entry<Double, Double> entry : values.entrySet()){
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }

}
