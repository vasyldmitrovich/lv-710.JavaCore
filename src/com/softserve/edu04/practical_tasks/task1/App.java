package com.softserve.edu04.practical_tasks.task1;

import com.softserve.hw01.MessageHelper;

import java.util.Arrays;

import static com.softserve.hw01.MessageHelper.*;

/**
 * Enter three numbers. Find out how many of them are odd.
 */

public class App {
    public static void main(String[] args) {
        findHowManyOdd();
    }
    
    private static void findHowManyOdd() {
        writeMessage("Enter any numbers:");
        String input = readStringMessage();
        int result = calculateOddNumbers(input);
        writeMessage(result + " odd " + (result > 1 ? "numbers" : "number"));
    }

    private static int calculateOddNumbers(String input) {
        return (int) Arrays.stream(input.split("[\\- _.,/]\\s?"))
                .mapToInt(Integer::parseInt)
                .filter(num -> num % 2 == 1)
                .count();
    }

}
