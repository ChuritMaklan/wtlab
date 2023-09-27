package test.java.com.company.Lab1.task5;

import main.java.com.company.Lab1.task5.IncreasingSubsequenceFinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingSubsequenceFinderTest {
    IncreasingSubsequenceFinder finder = new IncreasingSubsequenceFinder();
    @Test
    void givenSequence_whenFindLISLength_thenAmountOfDeletedValues() {
        int[] sequence = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5 ,13, 3, 11, 7, 15};
        int expected = 10;
        int actual = finder.findLISLength(sequence);
        assertEquals(expected, actual);
    }
}