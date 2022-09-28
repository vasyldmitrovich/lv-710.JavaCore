package com.softserve.hw10.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.softserve.hw01.MessageHelper.readStringMessage;
import static com.softserve.hw01.MessageHelper.writeMessage;

/**
 * Implement a pattern for US currency: the first symbol "$", then any number of digits, dot and
 * two digits after the dot. Enter the text from the console that contains several occurrences
 * of US currency. Display all occurrences on the screen.
 */
public class Task3 {
    public void run() {
        writeMessage("Enter the text from the console that contains several occurrences of US currency.");
        Pattern pattern = Pattern.compile("[$]\\d+?\\.\\d{2}\\b");
        String input = readStringMessage();
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            writeMessage(input.substring(matcher.start(), matcher.end()));
        }
    }
}
