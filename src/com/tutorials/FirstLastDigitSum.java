package com.tutorials;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = number % 10;
        int firstDigit;
        int sum = 0;
        if (number < 0) {
            return -1;
        } else if (number < 10){
            sum = number*2;
            System.out.println("The sum of only 1 digit is: " + sum);
            return sum;
        }
        while (true) {
            number = number / 10;

            if (number < 10) {
                firstDigit = number;
                sum = firstDigit + lastDigit;
                System.out.println("The sum is: " + sum);
                break;
            }
        }
        return sum;

    }

}
