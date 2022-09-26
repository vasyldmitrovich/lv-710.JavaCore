package com.softserve.edu09.practical_tasks.task1;

import static com.softserve.hw01.MessageHelper.readStringMessage;
import static com.softserve.hw01.MessageHelper.writeMessage;

/**
 * Enter the two variables of type String. Determine whether the first variable substring second.
 * For example, if you typed «IT» and «IT Academy» you must receive true.
 */
public class Task1 {
    public void run() {
        writeMessage("Enter first variable of type String:");
        String firstString = readStringMessage();

        writeMessage("Enter second variable of type String:");
        String secondString = readStringMessage();

        writeMessage("The first variable substring second - " + secondString.contains(firstString));
    }
}
