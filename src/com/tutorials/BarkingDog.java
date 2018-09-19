package com.tutorials;

public class BarkingDog {

    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && hourOfDay < 8) {
            return true;
        } else if (barking && hourOfDay > 22){
            return true;
        } else {
            return false;
        }
    }
}
