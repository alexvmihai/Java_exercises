package com.tutorials;

public class PlayingCat {
    public static boolean isCatPlaying (boolean summer, int temperature){
        int range1 = 25;
        int range2 = 35;
        if (summer) {
            range2 = 45;
        }
        if (summer && temperature >= range1 && temperature <= range2){
            return true;
        } else if ( temperature >= range1 && temperature <= range2){
            return true;
        } else {
            return false;
        }
    }
}
