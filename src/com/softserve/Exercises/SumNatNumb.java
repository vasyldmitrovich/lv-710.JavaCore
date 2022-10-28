package com.softserve.Exercises;

public class SumNatNumb {
    public static void main(String[] args) {
        int n = 26;
        int sum = 0;
        int i;
        for (i = 1; i <= n; i++) {
            sum = i + sum;
        }
        System.out.println(sum);
    }
}

