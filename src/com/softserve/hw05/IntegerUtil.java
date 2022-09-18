package com.softserve.hw05;

public class IntegerUtil {
    public static Integer findArraySum(int[] arreyOfInteger) {
        if (arreyOfInteger.length != 10) {
            System.out.println("It has wrong size. Correct size is 10.");
            return null;
        }

        if (hasNegativeNumbers(arreyOfInteger)) {
            int sum = 0;
            for (int i = 5; i < arreyOfInteger.length; i++) {
                int number = arreyOfInteger[i];
                if (number > 0) {
                    sum += number;

                }
            }

            return sum;
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int number = arreyOfInteger[i];
            if (number > 0) {
                sum += number;

            }
        }
        return sum;
    }

    private static boolean hasNegativeNumbers(int[] arreyOfInteger) {
        for (int i = 0; i < 5; i++) {
            int number = arreyOfInteger[i];
            if (number < 0) {
                return true;

            }

        }
        return false;
    }
}