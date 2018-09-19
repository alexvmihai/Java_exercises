package com.tutorials;

public class NumberPalindrome {

    public static boolean isPalindrome (int number){
        int reverse = 0;
        int first = Math.abs(number);
        int posNumber = Math.abs(number);
        int lastDigit;
        while (true) {
            lastDigit = posNumber % 10;
            reverse += lastDigit;
            posNumber = posNumber / 10;
            reverse *= 10;
            if (posNumber < 10){
                reverse += posNumber;
                break;
            }
        }
        if (reverse == first){
            System.out.println("The number is a palindrome !");
            return true;
        } else {
            System.out.println("The number is not a palindrome !");
            return false;
        }
    }
}
