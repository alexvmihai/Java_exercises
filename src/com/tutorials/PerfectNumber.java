package com.tutorials;

public class PerfectNumber {

    public static boolean isPerfectNumber ( int number ){
        if ( number < 1) {
            return false;
        }
        int sum = 0;
        for ( int i =1; i < number; i++){
            if ( number % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        if ( sum == number){
            System.out.println("The number is perfect !");
            return true;
        }else {
            System.out.println("The number is not perfect !");
            return false;
        }
    }
}
