package com.softserve.edu05.practical_tasks.task1;


import java.util.Arrays;
import java.util.Objects;

import static com.softserve.hw01.MessageHelper.writeMessage;

/**
 * Create an array of ten integers. Display
 * - the biggest of these numbers;
 * - the sum of positive numbers in the array;
 * - the amount of negative numbers in the array.
 * What values there are more: negative or positive?
 */
public class App {
    public static void main(String[] args) {
        App app = new App();
        int[] integers = {1, 5, -3, -4, 9, 7, 0, -2, 4, 2};

        app.declarativeExecute(integers);

        app.imperativeExecute(integers);

    }

    private void declarativeExecute(int[] arr) {
        Objects.requireNonNull(arr);
        int countNegativeNumb = getCountNegativeNumbDeclarative(arr);
        // #1
        writeMessage("The biggest of array is - " + Arrays.stream(arr)
                .max()
                .getAsInt());
        // #2
        writeMessage("The sum is - " + Arrays.stream(arr)
                .sum());
        // #3
        writeMessage("Amount of negative numbers is - " + countNegativeNumb);
        // #4
        writeMessage(getMessage(arr, countNegativeNumb));
    }

    private String getMessage(int[] arr, int countNegativeNumb) {
        return countNegativeNumb == arr.length / 2 ?
                "The amount of negative and positive values is the same" :
                countNegativeNumb > arr.length / 2 ?
                        "There are more negatives than positives" :
                        "There are more positives than negatives";
    }

    private int getCountNegativeNumbDeclarative(int[] arr) {
        return (int) Arrays.stream(arr)
                .filter(i -> i < 0)
                .count();
    }

    private int getCountNegativeNumbImperative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        return count;
    }

    private void imperativeExecute(int[] arr) {
        Objects.requireNonNull(arr);
        int countNegativeNumb = getCountNegativeNumbImperative(arr);
        // #1
        writeMessage("The biggest of array is - " + getMaxValue(arr));
        // #2
        writeMessage("The sum is - " + getSum(arr));
        // #3
        writeMessage("Amount of negative numbers is - " + countNegativeNumb);
        // #4
        if (countNegativeNumb == arr.length / 2) {
            writeMessage("The amount of negative and positive values is the same");
        } else if (countNegativeNumb > arr.length / 2) {
            writeMessage("There are more negatives than positives");
        } else {
            writeMessage("There are more positives than negatives");
        }
    }

    private int getMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
