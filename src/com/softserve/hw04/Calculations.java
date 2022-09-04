package com.softserve.hw04;

public class Calculations {

    public void range(Float... value) {
        for (Float aFloat : value) {
            if (-5.0f < aFloat & aFloat < 5.0f) {
                System.out.println(aFloat);
            }
        }
    }

    public void maxInt(Integer... value) {
        int maxValue = 0;
        for (Integer integer : value) {
            if (integer > maxValue) {
                maxValue = integer;
            }
        }
        System.out.println(maxValue);
    }
}
