package main.java.com.company.Lab1.task6;

public class MatrixTransformer {
    public int[][] getMatrix(int[] array){
        int[][] matrix = new int[array.length][array.length];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                matrix[i][j] = array[(i + j) % array.length];
            }
        }
        return matrix;
    }
}
