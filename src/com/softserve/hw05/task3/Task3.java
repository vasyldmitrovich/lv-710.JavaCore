package com.softserve.hw05.task3;

import static com.softserve.hw01.MessageHelper.readIntNumbersMessage;
import static com.softserve.hw01.MessageHelper.writeMessage;

/**
 * Enter 5 integer numbers. Find
 * - position of second positive number;
 * - minimum and its position in the array.
 * Count the product of all entered even numbers.
 */
public class Task3 {
    public static void main(String[] args) {
        writeMessage("Enter 5 integer numbers in one line:");
        int[] input = readIntNumbersMessage();

        new Task3().displayResult(input);
    }

    private void displayResult(int[] arr) {
        long productOfEvenNumbers = 1;
        int secondPositiveNumber = -1;
        int min = arr[0];
        int positionMin = 0;
        int positionSecondPositiveNumber = 0;
        int counter = arr[0] > 0 ? 1 : 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                positionMin = i;
            }
            if (counter != 2 && arr[i] > 0) {
                counter++;
            }
            if (secondPositiveNumber == -1 && counter == 2) {
                secondPositiveNumber = arr[i];
                positionSecondPositiveNumber = i;
            }
            if (arr[i] % 2 == 0) {
                productOfEvenNumbers *= arr[i];
            }
        }

        writeMessage("[" + positionSecondPositiveNumber + "]" + " - position of second positive number");
        writeMessage("[" + min + "]" + " -  minimum value, and its position is " + "[" + positionMin + "]");
        writeMessage("Product of all entered even numbers is " + "[" + productOfEvenNumbers + "]");
    }
}
