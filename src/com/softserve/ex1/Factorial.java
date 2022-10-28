package com.softserve.ex1;

public class Factorial {
    public static void main(String[] args) {

        int i = (int) getRandomValue();
        int n = 1;

        for (int k = 1; k <= i; k++) {
            n = n * k;
        }
            System.out.println(i);
            System.out.println(n);
        }
    static int getRandomValue() {
        return (int) (Math.random() * 20);
    }
}