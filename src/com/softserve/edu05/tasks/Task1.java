package com.softserve.edu05.tasks;

import com.softserve.edu05.tasks.classes.Numbers;

public class Task1 {

    public static void runFirstTask() {

        // Task 1. Create an array of ten integers.Display
        //          - the biggest of these numbers;
        //          - the sum of positive numbers in the array;
        //          - the amount of negative numbers in the array.

        Numbers numbers = new Numbers(new int[] {-10, 3, 5, 67, -1, 0, -3, 8, 4, -11});
        System.out.println("The biggest number of array is " + numbers.getBiggestNumber() + ", sum of positive " +
                "numbers is " + numbers.getSumOfPositiveNumbers() + ", and amount of negative numbers is "
                + numbers.getAmountOfNegativeNumbers() + ", " + numbers.getBiggestGroupOfNumbers());
    }

}

