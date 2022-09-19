package com.softserve.hw05;

import com.softserve.edu04.Product;

public class IntegerNumberTask3 {

    public static Integer findSecondPositiveNumber(int[] arreyOfInteger) {
        Integer firstPositiveNumberPosition = null;
        Integer secondPositiveNumberPosition = null;
        for (int i = 0; i < arreyOfInteger.length; i++) {
            int number = arreyOfInteger[i];
            if (number > 0 && firstPositiveNumberPosition == null) {
                firstPositiveNumberPosition = i;
                continue;

            }

            if (number > 0 && secondPositiveNumberPosition == null) {
                secondPositiveNumberPosition = i;
                break;

            }

        }
        return secondPositiveNumberPosition;
    }

  //{-6, 32, -43, 105, 272};
    public static Integer findMinNumber(int[] arreyOfInteger) {
        int minimalNumber = Integer.MAX_VALUE;
        for (int i = 0; i < arreyOfInteger.length; i++) {

            int number = arreyOfInteger[i];
            if (number < minimalNumber) {

                minimalNumber = number;
            }


        }
        return minimalNumber;
    }
    public static Integer sumOfNumbers(int[] numbers) {
        int sumOfNumbers = 0;
        for (int i = 0; i < numbers.length; i++){
            int number = numbers[i];

                sumOfNumbers += number;

            }

        return sumOfNumbers;
    }

}
