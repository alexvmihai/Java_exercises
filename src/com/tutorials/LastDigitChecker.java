package com.tutorials;

public class LastDigitChecker {

    public static boolean hasSameLastDigit (int a, int b, int c){
        if (a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000){
            System.out.println("Invalid numbers !");
            return false;
        }
        int lastDigitA;
        int lastDigitB;
        int lastDigitC;

        lastDigitA = a % 10;
        lastDigitB = b % 10;
        lastDigitC = c % 10;

        if (lastDigitA == lastDigitB || lastDigitA == lastDigitC || lastDigitB == lastDigitC){
            System.out.println("At least two numbers have the rightmost digit shared !");
            return true;
        } else {
            System.out.println("No numbers have the rightmost shared digit !");
            return false;
        }
    }
}
