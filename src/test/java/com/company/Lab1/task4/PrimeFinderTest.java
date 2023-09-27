package test.java.com.company.Lab1.task4;

import main.java.com.company.Lab1.task4.PrimeFinder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFinderTest {
    PrimeFinder finder = new PrimeFinder();
    @Test
    void givenArray_whenFindAllPrimeNumbers_ThenReturnPrimeNumbers() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 10, 31};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 8));
        assertEquals(expected, finder.findAllPrimeNumbers(array));
    }
}