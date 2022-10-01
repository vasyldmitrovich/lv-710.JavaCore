package com.softserve.hw05;

import javax.swing.*;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Calculations {

    private Scanner in = new Scanner(System.in);

    public void isPositiveOrNegativeInt(int[] value) {
        for (int i = 0; i < value.length; i++) {
            if (value[i] > -1) {
                System.out.println(value[i] + " - is a positive Integer");
            } else if (value[i] <= -1) {
                System.out.println(value[i] + " - is a negative Integer");
            }
        }
    }

    public int sumOfPositiveNumbers(int[] value) {
        int positiveIntSum = 0;
        for (int i = 0; i < value.length; i++) {
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

    public void firstFivePosNum(int[] numbers) {
        int sum = 0;
        int count = 0;
        for (Integer number : numbers) {
            if (number >= 0) {
                sum = number + sum;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum of first 5th positive numbers is: " + sum);
    }

    public void positionOfSecondPositiveNum(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > 0) {
                count++;
                if (count == 2) {
                    System.out.println("Second positive number have an index equal: " + numbers[i]);
                    break;
                }
            }
        }
    }

    public int indexOfSmallestValue(int[] array) {
        int index = 0;
        int min = array[index];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("The smallest value is: " + min + " with index: " + index);
        return index;
    }

    public int sumOfEvenNumbers(int[] numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum = sum + number;
            }
        }
        System.out.println("Sum of all even numbers is equal: " + sum);
        return sum;
    }

    public int numberDaysMonth() {
        System.out.println("Please input the year...");
        int year = in.nextInt();
        System.out.println("Please input month...");
        int month = in.nextInt();
        YearMonth yearMonthObject = YearMonth.of(year, month);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        System.out.println("This month have " + daysInMonth + " days.");
        return daysInMonth;
    }

    public int numberDaysInYear() {
        int yearDaysSum = 0;
        int daysInMonth = 0;
        System.out.println("Please input the year...");
        int year = in.nextInt();
        for (int i = 1; i <= 12; i++) {
            YearMonth yearMonthObject = YearMonth.of(year, i);
            daysInMonth = yearMonthObject.lengthOfMonth();
            yearDaysSum = yearDaysSum + daysInMonth;
        }
        System.out.println("This year have " + yearDaysSum + " days.");
        return daysInMonth;
    }

    public List<Integer> numberDaysInYearArr() {
        int daysInMonth;
        System.out.println("Please input the year...");
        int year = in.nextInt();
        List<Integer> month = new ArrayList<>();
        Integer sum = null;
        for (int i = 1; i <= 12; i++) {
            YearMonth yearMonthObject = YearMonth.of(year, i);
            daysInMonth = yearMonthObject.lengthOfMonth();
            month.add(daysInMonth);
            sum = month.stream()
                    .reduce(0, Integer::sum);
        }
        System.out.println("This year have " + sum + " days.");
        return month;
    }
}
