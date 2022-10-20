package com.softserve.hw01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Serhii Mudrachenko
 */
public class MessageHelper {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readStringMessage() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int readIntMessage() {
        try {
            return Integer.parseInt(readStringMessage());
        } catch (NumberFormatException e) {
            writeMessage("Invalid input. Try again.");
            return readIntMessage();
        }
    }

    public static int[] readIntNumbersMessage() {
        String input = readStringMessage();
        try {
            return Arrays.stream(input.split("[\\s_.,/]\\s?"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (NumberFormatException e) {
            writeMessage("Invalid input. Try again.");
            return readIntNumbersMessage();
        }
    }

    public static double readDoubleMessage() {
        String input = readStringMessage().replace(",", ".");
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            writeMessage("Invalid input. Try again.");
            return readDoubleMessage();
        }
    }

}

