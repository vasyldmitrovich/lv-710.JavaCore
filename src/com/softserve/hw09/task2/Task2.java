package com.softserve.hw09.task2;

import static com.softserve.hw01.MessageHelper.readStringMessage;
import static com.softserve.hw01.MessageHelper.writeMessage;

/**
 * Enter a sentence that contains the words between more than one space. Convert all
 * spaces, consecutive, one. For example, if we introduce the
 * sentence "I    am      learning     Java   Core», we have to get the "I'm learning Java Core»
 */
public class Task2 {
    public void run() {
        writeMessage("Enter a sentence that contains the words between more than one space.");
        String sentence = readStringMessage().trim();
        writeMessage(sentence.replaceAll("\\b\\s{2,}\\b", " "));
    }
}
