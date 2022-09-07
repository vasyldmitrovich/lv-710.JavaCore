package com.softserve.hw05.task1;

import static com.softserve.hw01.MessageHelper.readIntMessage;
import static com.softserve.hw01.MessageHelper.writeMessage;

/**
 * Ask user to enter the number of month.
 * Read the value and write the number of days in this month (create array with amount days of each month).
 */
public class Task1 {
    public static void main(String[] args) {
        int[] amountDaysOfEachMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        writeMessage("Enter the number of month:");
        int month = readIntMessage();
        try {
            writeMessage("The " + month + " month contains " + amountDaysOfEachMonth[month - 1] + " days");
        } catch (IndexOutOfBoundsException e) {
            writeMessage(month + " month is not exist");
        }
    }
}
