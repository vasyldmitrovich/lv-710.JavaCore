package com.softserve.hw12.task4;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create file1.txt file with a text about your career.
 * Read context from file into array of strings. Each array item contains one line from file.
 * Write in to the file2.txt
 * <p>1) number of lines in file1.txt.
 * <p>2) the longest line in file1.txt.
 * <p>3) your name and birthday date.
 */
public class Task4 {
    private final String DATA = "I have more than 2 years of experience programming in java. Finished the course in Hillel IT school\n" +
            "\"Introduction Java\" with excellent marks. After that I continued self-education. Took a lot of courses\n" +
            "on Hexlet and other resources (UNIX console, Git, Maven, HTML, CSS, JavaScript). And I study up to\n" +
            "now at JavaRush (40 level), open-source java education “Bobocode”.";
    private final String PATH = "src\\" +
            getClass().getPackageName().replaceAll("\\.", "\\\\") + "\\file1.txt";

    public void run() {
        try (BufferedWriter writerToFile1 = new BufferedWriter(new FileWriter(PATH));
             BufferedReader reader = new BufferedReader(new FileReader(PATH));
             BufferedWriter writerToFile2 = new BufferedWriter(new FileWriter(PATH
                     .replaceAll("file1", "file2")))) {
            writerToFile1.write(DATA);
            writerToFile1.flush();
            List<String> lines = reader.lines().collect(Collectors.toList());
            //1
            writerToFile2.write("number of lines in file1.txt - " + lines.size());
            writerToFile2.newLine();
            //2
            lines.sort(Comparator.comparing(String::length));
            writerToFile2.write("the longest line in file1.txt - " + lines.get(lines.size() - 1));
            writerToFile2.newLine();
            //3
            writerToFile2.write("Serhii Mudrachenko 26.06.1990");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
