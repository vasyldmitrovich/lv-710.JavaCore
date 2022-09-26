package com.softserve.edu09.practical_tasks.task2;

import static com.softserve.hw01.MessageHelper.readStringMessage;
import static com.softserve.hw01.MessageHelper.writeMessage;

/**
 * Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
 * - surnames and initials
 * - name
 * - name, middle name and last name
 */
public class Task2 {
    public void run() {
        writeMessage("Enter surname, name and patronymic on the console as a variable of type String");
        String[] input = readStringMessage().split(" ");

        if (input.length != 3) {
            writeMessage("Input error!");
            return;
        }

        String surname = input[0];
        String name = input[1];
        String patronymic = input[2];

        writeMessage(String.format("- %1$s %3$c. %5$c.\n- %2$s\n- %2$s %4$s %1$s",
                surname,
                name,
                name.charAt(0),
                patronymic,
                patronymic.charAt(0)));
    }
}
