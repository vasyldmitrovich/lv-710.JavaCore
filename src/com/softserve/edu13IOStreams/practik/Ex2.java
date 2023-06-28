package com.softserve.edu13IOStreams.practik;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * In this class we have prepared a file with text and completed the following tasks:
 * 1) find and output to the console all words starting with a vowel.
 * 2) find and output to the console all words for which the last letter of one word matches the first letter of the next word.
 */
public class Ex2 {
    public static void main(String[] args) throws IOException {
        StringBuilder words = new StringBuilder();
        int count = 0;
        int count1 = 0;
        File file = new File("mytext");
        try (BufferedReader in = new BufferedReader(new FileReader(file));
             Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                count++;
                words.append(word).append(" ");
                if (count % 15 == 0) {
                    words.append("\n");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(words);
        Pattern pattern1 = Pattern.compile("\\b[AEIOUaeiou]\\w*\\b");
        System.out.println();
        Matcher matcher1 = pattern1.matcher(words);
        while (matcher1.find()) {
            count1++;
            System.out.print(matcher1.group().concat(", "));
            if (count1 % 15 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        String[] wordArray = words.toString().split(" ");
        for (int i = 0; i < wordArray.length - 1; i++) {
            String currentWord = wordArray[i];
            String nextWord = wordArray[i + 1];
            if (currentWord.charAt(currentWord.length() - 1) == nextWord.charAt(0)) {
                System.out.println("current word -> " + currentWord + " ..... next word-> " + nextWord);
            }
        }
    }
}
