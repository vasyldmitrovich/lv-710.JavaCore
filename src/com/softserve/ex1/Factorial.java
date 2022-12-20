package com.softserve.ex1;

public class Factorial {
    public static void main(String[] args) {
        fac(5);
        System.out.println("факториал 5 = " + factor(5));

    }

    static int getRandomValue() {
        return (int) (Math.random() * 10);
    }

    static int f = 4;

    public static int factor(int f) {
        if (f == 1) {
            return 1;
        }
        return factor(f - 1) * f;
    }

    public static int fac(int i) {
//        int i = (int) getRandomValue();
        long n = 1;
        long fac = 1;
        for (long k = 1; k <= i; k++) {
            n = n * k;
            fac = n;
        }
        System.out.println(fac);
        return (int) n;
    }
}




