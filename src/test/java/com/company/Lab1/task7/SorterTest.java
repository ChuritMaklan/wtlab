package test.java.com.company.Lab1.task7;

import main.java.com.company.Lab1.task7.Sorter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SorterTest {
    Sorter sorter = new Sorter();
    @Test
    void givenArray_whenSort_ThenReturnSortedArray() {
        int[] array = {3, 2, 5, 1, 4};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = sorter.sort(array);
        assertTrue(Arrays.equals(expected, actual));
    }
}