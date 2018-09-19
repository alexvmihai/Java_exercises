package com.tutorials;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b){
        if(a < 10 || a > 99 || b < 10 || b > 99){
            return false;
        }
        int lastDigitA;
        int lastDigitB;
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        while(true){
            lastDigitA = a % 10;
            first.add(lastDigitA);
            a = a / 10;
            if ( a < 10){
                first.add(a);
                break;
            }
        }

        while(true){
            lastDigitB = b % 10;
            second.add(lastDigitB);
            b = b /10;
            if ( b < 10){
                second.add(b);
                break;
            }
        }
        System.out.println(first);
        System.out.println(second);

        for ( int i = 0; i < first.size(); i++ ){
            if (second.contains(first.get(i))){
                System.out.println("The numbers have shared digits !");
                return true;
            } else{
                System.out.println("The numbers don't have shared digits !");
                return false;
            }
        } return false;

    }
}
