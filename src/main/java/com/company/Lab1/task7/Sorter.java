package main.java.com.company.Lab1.task7;

public class Sorter {
    public int[] sort(int[] array){
        for(int i = 0; i < array.length ; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    array[j] = array[j] ^ array[j + 1];
                    array[j + 1] = array[j] ^ array[j + 1];
                    array[j] = array[j] ^ array[j + 1];
                }
            }
        }
        return array;
    }
}
