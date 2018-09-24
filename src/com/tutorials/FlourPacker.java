package com.tutorials;

public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal){
        if ( bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int bigSack = bigCount * 5;
        int smallSack = smallCount * 1;
        int sum = bigSack + smallSack;

        if (sum == goal){
//            System.out.println("The goal is reached !");
            return true;
        } else if(sum > goal){
            if((bigSack == 0) && ((sum - goal) < smallSack)){
                return true;
            }else if (((sum - goal) % 5 <= smallSack)){
                return true;
            }
            else {
                return false;
            }
        }
        else {
//            System.out.println("The goal is not reached !");
            return false;
        }
    }

}
