package com.softserve.hw05;

import java.util.Arrays;

public class Main {

    static Calculations calc = new Calculations();
    private static final int[] digits = {-3, -5, 4, 6, 9, -8, 0, 2, 1, -10};

    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }

    public static void task1() {
        calc.numberDaysMonth();
        calc.numberDaysInYear();
        calc.numberDaysInYearArr();
    }

    public static void task2() {
        calc.firstFivePosNum(digits);
    }

    public static void task3() {
        calc.positionOfSecondPositiveNum(digits);
        calc.indexOfSmallestValue(digits);
        calc.sumOfEvenNumbers(digits);
    }

    public static void task4() {
    }

    public static void task5() {
    }
}
