package com.softserve.hw04;

public class Calculations {

    public void range(Float... value) {
        for (Float aFloat : value) {
            if (-5.0f < aFloat & aFloat < 5.0f) {
                System.out.println("Value belongs to range [-5, 5] " + aFloat);
            }
        }
    }

    public void maxInt(Integer... integers) {
        int maxValue = 0;
        for (Integer integer : integers) {
            if (integer > maxValue) {
                maxValue = integer;
            }
        }
        System.out.println("Maximum integer in array is equal to: " + maxValue);
    }

    public void minInt(Integer... integers) {
        for (int i = 0; i <= integers.length - 1; i++) {
            for (int j = i + 1; j < integers.length - 1; j++) {
                if (integers[i] > integers[j]) {
                    int q = integers[i];
                    integers[i] = integers[j];
                    integers[j] = q;
                }
            }
        }
    }

    public int oddNumbers(Integer... values) {
        int val = 0;
        for (Integer value : values) {
            if (value % 2 == 0) {
                val = value;
                System.out.println("Even number" + value);
            } else {
                val = value;
                System.out.println("Odd number " + value);
            }
        }
        return val;
    }
}
