package com.softserve.hw04.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static com.softserve.hw01.MessageHelper.*;

/**
 * Solve the next tasks:
 * 1 - read 3 float numbers and check: are they all belong to the range [-5,5];
 * 2 - read 3 integer numbers and write max and min of them;
 * 3 - read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
 */

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();

        // #1
        task1.checkFloatsToTheRange(3, 5.0f);

        // #2
//        task1.findMaxIntegerValue(3);

        // #3
//        task1.identifyHTTPStatus(404);


    }

    // #1 ---------------------------------------------------------------
    private void checkFloatsToTheRange(int amount, float range) {
        List<Float> floatNumbers = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            writeMessage("Enter float number:");
            floatNumbers.add((float) readDoubleMessage());
            writeMessage("your number is added\n_____________");
        }

        boolean result = floatNumbers.stream()
                .filter(CheckRangePredicate(range))
                .count() == amount;

        writeMessage("All float numbers are included to range[" + -range + ", " + range + "]: " + result);
    }

    private Predicate<Float> CheckRangePredicate(float bound) {
        return f -> f >= -bound && f <= bound;
    }


    // #2 ---------------------------------------------------------------
    private void findMaxIntegerValue(int amount) {
        int[] intNumbers = new int[amount];

        for (int i = 0; i < amount; i++) {
            writeMessage("Enter integer number:");
            intNumbers[i] = readIntMessage();
            writeMessage("your number is added\n_____________");
        }
        outputMaxIntValue(intNumbers);
    }

    private void outputMaxIntValue(int... intNumbers) {
        Arrays.stream(intNumbers)
                .max()
                .ifPresentOrElse(i -> writeMessage("max value is: " + i),
                        () -> writeMessage("no max value"));
    }


    // #3 ---------------------------------------------------------------
    private void identifyHTTPStatus(Integer code) {
        Arrays.stream(HTTPStatus.values())
                .filter(containsCodePredicate(code))
                .findFirst()
                .ifPresentOrElse(getHttpStatusConsumer(code),
                        () -> writeMessage("unknown status code"));
    }

    private Consumer<HTTPStatus> getHttpStatusConsumer(Integer code) {
        return httpStatus -> httpStatus.getStatuses().stream()
                .filter(status -> status.getCode() == code)
                .findFirst()
                .ifPresent(status -> writeMessage(httpStatus.name() + " " + status.getCode() + " " + status.getName()));
    }

    private Predicate<HTTPStatus> containsCodePredicate(Integer code) {
        return httpStatus -> httpStatus.getStatuses().stream()
                .map(Status::getCode)
                .anyMatch(c -> c.equals(code));
    }
}
