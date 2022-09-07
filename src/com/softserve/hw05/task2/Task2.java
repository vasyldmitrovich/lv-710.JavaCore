package com.softserve.hw05.task2;


import java.util.Arrays;

import static com.softserve.hw01.MessageHelper.readIntNumbersMessage;
import static com.softserve.hw01.MessageHelper.writeMessage;

/**
 * Enter 10 integer numbers.
 * Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
 */
public class Task2 {
    public static void main(String[] args) {
        writeMessage("Enter 10 integer numbers in one line:");
        int[] input = readIntNumbersMessage();

        new Task2().displayResult(input);
    }

    private void displayResult(int[] input) {
        int size = input.length / 2;
        if (Arrays.stream(input)
                .limit(size)
                .filter(i -> i > 0)
                .count() == size) {
            writeMessage("Sum of first " + size + " elements = " +
                    Arrays.stream(input).limit(size).sum());
        } else {
            writeMessage("Sum of last " + size + " elements = " +
                    Arrays.stream(Arrays.copyOfRange(input, size, input.length)).sum());
        }
    }

}
