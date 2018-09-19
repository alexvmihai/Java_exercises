package com.tutorials;

public class DigitSumChallenge {

    public static int sumDigits ( int number ){
        int sum = 0;
        int digit;
        if(number < 10 ){
            return -1;
        }
        while (true) {
            digit = number % 10;
            number = number / 10;
            sum = sum + digit ;
            if(number < 10){
                sum += number;
                break;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
