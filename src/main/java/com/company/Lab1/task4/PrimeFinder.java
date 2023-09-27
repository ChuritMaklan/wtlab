package main.java.com.company.Lab1.task4;

import java.util.ArrayList;

public class PrimeFinder {
    private boolean isPrime(int number){
        if (number == 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> findAllPrimeNumbers(int[] numbers){
        ArrayList<Integer> index = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            if(isPrime(numbers[i])){
                index.add(i);
            }
        }
        return index;
    }
}
