package test.java.com.company.Lab1.task8;

import main.java.com.company.Lab1.task8.SequenceJoiner;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SequenceJoinerTest {
    SequenceJoiner joiner = new SequenceJoiner();
    @Test
    void givenTwoIncreasingSequences_whenJoin_thenReturnIncreasingSequence() {
        int[] firstSequence = {1, 3, 5};
        int[] secondSequence = {2, 4, 6};
        int[] expected = {1, 2, 3 ,4, 5, 6};
        int[] actual = joiner.join(firstSequence, secondSequence);
        assertTrue(Arrays.equals(actual, expected));
    }
    @Test
    void givenIncreasingSequenceAndEmptySequence_whenJoin_thenReturnIncreasingSequence() {
        int[] secondSequence = {1, 3, 5};
        int[] firstSequence = {};
        int[] expected = {1, 3 , 5};
        int[] actual = joiner.join(firstSequence, secondSequence);
        assertTrue(Arrays.equals(actual, expected));
    }
}