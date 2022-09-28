package com.softserve.hw10.task1;

import java.util.Arrays;
import java.util.Comparator;

import static com.softserve.hw01.MessageHelper.readStringMessage;
import static com.softserve.hw01.MessageHelper.writeMessage;

/**
 * Enter in console sentence of five words.
 * - display the longest word in the sentence
 * - determine the number of its letters
 * - bring the second word in reverse order
 */
public class Task1 {
    public void run() {
        writeMessage("Enter in console sentence of five words.");
        String sentence = readStringMessage();

        Task1 task = new Task1();

        task.showLongestWord(sentence);
        task.showAmountLetters(sentence);
        task.showReverseSecondWord(sentence);
    }

    private void showLongestWord(String sentence) {
        writeMessage("The longest word is - " + Arrays.stream(sentence.split("\\b\\s+?\\b"))
                .map(word -> word
                        .trim()
                        .replaceAll("(\\w+)(\\W*?$)", "$1"))
                .max(Comparator.comparing(String::length))
                .get());
    }

    private void showAmountLetters(String sentence) {
        writeMessage("Amount letters - " + sentence
                .replaceAll("[^a-zA-Z]", "")
                .length());
    }

    private void showReverseSecondWord(String sentence) {
        try {
            String[] words = sentence.split("\\b\\s+?\\b");
            StringBuilder secondWord = new StringBuilder(words[1]
                    .trim()
                    .replaceAll("(\\w+)(\\W*?$)", "$1"));
            writeMessage("Inverted second word - " + secondWord.reverse());
        } catch (IndexOutOfBoundsException e) {
            writeMessage("The sentence does not contain a second word.");
        }
    }
}
