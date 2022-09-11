package com.softserve.hw05;

import javax.swing.*;
import java.util.Arrays;

public class Calculations {

    public void isPositiveOrNegativeInt (int [] value) {
        for (int i = 0 ; i < value.length ; i++) {
            if(value[i] > -1) {
                System.out.println( value[i] + " - is a positive Integer");
            } else if(value[i] <= -1) {
                System.out.println( value[i] + " - is a negative Integer");
            }
        }
    }

    public int sumOfPositiveNumbers(int[] value) {
        int positiveIntSum = 0;
        for (int i = 0 ; i < value.length ; i++) {
            if (value[i] > -1) {
                positiveIntSum = value[i] + positiveIntSum;
            }
        }
        System.out.println("The sum of positive numbers is equal to: " + positiveIntSum);
        return positiveIntSum;
    }

    public int amountOfNegativeNumbers(int[] values) {
        int amountOfInt = 0;
        for (Integer var : values) {
            if (var <= -1) {
                amountOfInt++;
            }
        }
        System.out.println("The amount of negative integers is: " + amountOfInt);
        return amountOfInt;
    }

    public int maxInt(int[] array) {
        int maxInt = Arrays.stream(array).max().getAsInt();
        System.out.println("Max integer is equal to: " + maxInt);
        return maxInt;
    }

    public int moreNegativeOrPositive(int[] array) {
        int positiveInt = 0;
        int negativeInt = 0;
        for (Integer value : array) {
            if (value > -1) {
                positiveInt++;
            } else if (value < 0) {
                negativeInt++;
            }
        }
        System.out.println(positiveInt > negativeInt ? "There are more positive int = " + positiveInt :
                "There are more negative  int = " + negativeInt);
        return Math.max(positiveInt, negativeInt);
    }
}
