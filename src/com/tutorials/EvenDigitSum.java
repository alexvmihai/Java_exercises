package com.tutorials;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number){
        int lastDigit;
        int sum = 0;
        if (number < 0) {
            return -1;
        }

        while (true) {
            lastDigit = number % 10;
            number = number / 10;
            if (lastDigit % 2 == 0){
                sum += lastDigit;
                if (number < 10) {
                    if(number % 2 == 0)
                        sum += number;
                    System.out.println("The sum is: " + sum);
                    break;
                }
            }
        }
        return sum;
    }
}
