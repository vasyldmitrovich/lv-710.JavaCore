package com.softserve.edu12.practical_tasks.task3;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Prepare mytext.txt file with a lot of text inside.
 * Read context from file into array of strings.
 * Each array item contains one line from file.
 * Complete next tasks:
 * <p>1) count and write the number of symbols in every line.
 * <p>2) find the longest and the shortest line.
 * <p>3) find and write only that lines, which consist of word «var»
 */
public class Task3 {
    private static final String PATH_TO_DATA = "src\\com\\softserve\\edu12\\practical_tasks\\task3\\data.txt";
    private static final String PATH_TO_RESULT = "src\\com\\softserve\\edu12\\practical_tasks\\task3\\result.txt";
    private static final String SEARCH_WORD = "var";

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_DATA));
             BufferedWriter writer = new BufferedWriter(new FileWriter(PATH_TO_RESULT, true))) {
            List<String> lines = reader.lines().collect(Collectors.toList());

            List<String> linesContainsPattern = lines.stream()
                    .filter(line -> line.matches(".*?\\b" + SEARCH_WORD + "\\b.*?"))
                    .collect(Collectors.toList());

            for (String line : lines)
                writer.write(line + String.format(" - %d symbols\n", line.length()));
            writer.newLine();
            lines.sort(Comparator.comparing(String::length));

            writer.write(String.format("The longest line is: «%s»\n", lines.get(lines.size() - 1)));
            writer.newLine();
            writer.write(String.format("The shortest line is: «%s»\n", lines.get(0)));
            writer.newLine();
            writer.write(String.format("Lines containing the word «%s»:\n%s", SEARCH_WORD, linesContainsPattern));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
