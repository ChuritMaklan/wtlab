package test.java.com.company.Lab1.task3;

import main.java.com.company.Lab1.task3.FunctionCalculator;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class FunctionCalculatorTest {
    FunctionCalculator calculator = new FunctionCalculator();
    @Test
    void givenBordersAndStep_whenGetValues_thenReturnValuesOfFunctionInGivenPoints(){
        double a = 0.0;
        double b = 2.0;
        double h = 0.1;
        HashMap<Double, Double> values = calculator.getValues(a, b, h);
        for(double i = a; i <= b; i += h){
            assertEquals(Math.tan(i), values.get(i));
        }
    }

}