package com.tutorials;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        int smallest;
        int divisor = 0;
        if (first <= second){
            smallest = first;
        } else {
            smallest = second;
        }

        for ( int i=1; i<= smallest; i++){
            if ((first % i == 0) && (second % i ==0)){
                divisor = i;
            }
        }
        System.out.println("The highest common divisor is: " + divisor);
        return divisor;
    }
}
