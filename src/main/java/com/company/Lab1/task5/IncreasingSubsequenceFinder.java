package main.java.com.company.Lab1.task5;

public class IncreasingSubsequenceFinder {
    private  int getIndexBinarySearch(int[] array, int high, int number){
        int low = 0;
        while(low <= high){
            int medium = (high + low) / 2;
            if(number < array[medium]) {
                high = medium - 1;
            } else {
                low = medium + 1;
            }
        }
        return low;
    }
    public int findLISLength(int[] array){
        int[] increasingSubsequence = new int[array.length];
        int length = 1;
        increasingSubsequence[0] = array[0];
        for(int i = 1; i < array.length; i++){
            int index = getIndexBinarySearch(increasingSubsequence, length - 1, array[i]);
            increasingSubsequence[index] = array[i];
            if(index == length){
                length++;
            }
        }
        return array.length - length;
    }
}
