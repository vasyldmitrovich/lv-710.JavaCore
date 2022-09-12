package com.softserve.hw04;

public class NumbersUtil {
    public static boolean isBelongToTheRange(float checkNumber, float minRange, float maxRange) {
        if (checkNumber >= minRange && checkNumber <= maxRange) {
            return true;
        }

        return false;

    }
}
