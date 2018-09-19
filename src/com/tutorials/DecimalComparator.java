package com.tutorials;

import java.math.BigDecimal;

public class DecimalComparator  {

    public static boolean areEqualByThreeDecimalPlaces (double y, double x){
        double yy = (int)( y * 1e3) / 1e3;
        double xx = (int)( x * 1e3) / 1e3;
        System.out.println("xx= " + xx + "\nyy= " + yy);
        if(yy == xx){
            return true;
        } else {
            return false;
        }
    }
}
