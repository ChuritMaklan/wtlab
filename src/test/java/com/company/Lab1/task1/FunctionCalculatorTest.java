package test.java.com.company.Lab1.task1;

import main.java.com.company.Lab1.task1.EquationCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionCalculatorTest {
    private EquationCalculator calculator = new EquationCalculator();

    @Test
    void givenZeroValues_whenCalculate_thenReturnValue() {
        double x = 0.0;
        double y = 0.0;
        double actual = calculator.calculate(x, y);
        assertEquals(0.5, actual);
    }
}