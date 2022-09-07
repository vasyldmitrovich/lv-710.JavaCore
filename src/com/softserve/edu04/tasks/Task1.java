package com.softserve.edu04.tasks;

public class Task1 {

    private static final String MESSAGE = "Number %s is odd: %s";

    public static void main(String[] args) {


        int a = 453;
        int b = 344;
        int c = 567;

        System.out.println(MESSAGE.formatted(a, isOdd(a)));
        System.out.println(MESSAGE.formatted(b, isOdd(b)));
        System.out.println(MESSAGE.formatted(c, isOdd(c)));

    }

    static boolean isOdd(int number) {
        return number % 2 != 0;
    }

}
