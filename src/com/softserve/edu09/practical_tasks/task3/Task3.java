package com.softserve.edu09.practical_tasks.task3;

import static com.softserve.hw01.MessageHelper.readStringMessage;
import static com.softserve.hw01.MessageHelper.writeMessage;

/**
 * The username can be 3 to 15 characters of the Latin alphabet, numbers, and underscores. Using regular
 * expressions implement checking the username for validity. Input five names in the main method .
 * Output a message to the console of the validation of each of the entered names.
 */
public class Task3 {
    public void run() {
        writeMessage("Input five names in one line:");
        String[] input = readStringMessage().split(",?[\\s,]");
        new Task3().checkValidation(input);
    }

    private void checkValidation(String... usernames) {
        for (String username : usernames) {
            writeMessage(username + (username.matches("\\w{3,15}") ?
                    " is valid username" : "is not supported username"));
        }
    }
}
