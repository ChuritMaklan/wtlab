package main.java.com.company.Lab1.task8;

public class SequenceJoiner {
    public int[] join(int[] firstArray, int[] secondArray){
        int[] finalArray = new int[firstArray.length + secondArray.length];
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        while(firstArrayIndex < firstArray.length || secondArrayIndex < secondArray.length){
            if(firstArrayIndex == firstArray.length){
                finalArray[firstArrayIndex + secondArrayIndex] = secondArray[secondArrayIndex];
                secondArrayIndex++;
            } else if (secondArrayIndex == secondArray.length) {
                finalArray[firstArrayIndex + secondArrayIndex] = firstArray[firstArrayIndex];
                firstArrayIndex++;
            } else if(firstArray[firstArrayIndex] < secondArray[secondArrayIndex]){
                finalArray[firstArrayIndex + secondArrayIndex] = firstArray[firstArrayIndex];
                firstArrayIndex++;
            }else{
                finalArray[firstArrayIndex + secondArrayIndex] = secondArray[secondArrayIndex];
                secondArrayIndex++;
            }
        }
        return finalArray;
    }
}
