package test.java.com.company.Lab1.task6;

import main.java.com.company.Lab1.task6.MatrixTransformer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTransformerTest {
    MatrixTransformer matrixTransformer = new MatrixTransformer();
    @Test
    void givenMatrix_whenGetMatrix_thenReturnMatrix() {
        int[] array = {1, 2, 3};
        int[][] expected = {{1, 2, 3},
                            {2, 3, 1},
                            {3, 1, 2}};
        int[][] actual = matrixTransformer.getMatrix(array);
        for(int i = 0; i < expected.length; i++){
            assertTrue(Arrays.equals(actual[i], expected[i]));
        }
    }
}