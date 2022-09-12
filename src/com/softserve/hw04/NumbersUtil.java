package com.softserve.hw04;

import com.softserve.edu04.Product;

public class NumbersUtil {
    public static boolean isBelongToTheRange(float checkNumber, float minRange, float maxRange) {
        if (checkNumber >= minRange && checkNumber <= maxRange) {
            return true;
        }

        return false;

    }

    public static Integer findMinNumber(Integer[] numbers) {
        Integer minNumber = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            Integer number = numbers[i];
            if (number < minNumber) {
                minNumber = number;
            }

        }

        return minNumber;

    }

    public static Integer findMaxNumber(Integer[] numbers) {
        Integer maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            Integer number = numbers[i];
            if (number > maxNumber) {
                maxNumber = number;
            }

        }

        return maxNumber;
    }

}