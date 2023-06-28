package com.softserve.edu13IOStreams.hw;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Create file1.txt file with a text about your career.
 * Read context from file into array of strings. Each array item contains one line from file.
 * Write in to the file2.txt
 *    1) number of lines in file1.txt.
 *    2) the longest line in file1.txt.
 *    3) your name and birthday date.
 */

public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> strings = new ArrayList<>();
        File fileIn = new File("file1");
        try (BufferedReader in = new BufferedReader(new FileReader(fileIn));
             Scanner scanner = new Scanner(fileIn)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                strings.add(line);
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String longestLine = strings.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println("\nThe longest line -> " + longestLine);
        int sizeStrings = strings.size();
        System.out.println("The size of Array Strings -> " + sizeStrings);
        Pattern patternName = Pattern.compile("(?m)^[A-Za-z]+\\s[A-Za-z]+$");
        Pattern patternBDay = Pattern.compile("(0[1-9]|1[0-9]|2[0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d{2}$");
        List<String> findValues = strings.stream().filter(str ->
                patternName.matcher(str).find() || patternBDay.matcher(str).find()).collect(Collectors.toList());
        System.out.println("Retrieved data -> " + findValues);
        try (PrintWriter printWriter = new PrintWriter("file2")) {
            printWriter.println("The longest line -> " + longestLine);
            printWriter.println("The size of Array Strings -> " + sizeStrings);
            printWriter.println("Retrieved data -> " + findValues);
        }
    }
}

