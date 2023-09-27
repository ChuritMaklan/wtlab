package test.java.com.company.Lab1.task2;

import main.java.com.company.Lab1.task2.PointChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointCheckerTest {
    PointChecker checker = new PointChecker();
    @Test
    void givenCoordinatesInsideArea_whenIsPointInArea_thenReturnTrue() {
        int x = 3;
        int y = 4;
        boolean actual = checker.isPointInArea(x, y);
        assertTrue(actual);
    }

    @Test
    void givenCoordinatesOutsideArea_whenIsPointInArea_thenReturnFalse(){
        int x = 10;
        int y = 10;
        boolean actual = checker.isPointInArea(x, y);
        assertFalse(actual);
    }
}