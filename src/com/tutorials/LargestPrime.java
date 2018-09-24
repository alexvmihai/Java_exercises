package com.tutorials;

public class LargestPrime {

    public static boolean isPrime ( int number ){
        if (number < 0){
            return false;
        }
        int num1 = 0;
        int flag = 0;
        num1 = number / 2;

        for (int i = 2; i <= num1; i++){
            if(number % i == 0){
//                System.out.println("Not a prime number");
                flag = 1;
                break;
            }
        }

        if (flag == 0){
//            System.out.println("Is a prime number !");
            return true;
        }

        return false;
    }

    public static int getLargestPrime (int number){
        int largestPrime = 0;
        if (number >= 2){
            for ( int i=2; i<=number; i++ ){
                if(isPrime(i)){
                    if(number % i == 0){
                        largestPrime = i;
                    }
                }
            }
        } else {
            return -1;
        }

//        System.out.println("The largest prime is: " + largestPrime);
        return largestPrime;
    }

}
