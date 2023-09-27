package main.java.com.company.Lab1.task1;

public class EquationCalculator {
    public  double calculate(double x, double y){
        double numerator = 1 + Math.sqrt(Math.sin(x + y));
        double denominator = 2 + Math.abs(x - 2 * x / (1 + x* x * y * y));
        return numerator / denominator + x;
    }
}
