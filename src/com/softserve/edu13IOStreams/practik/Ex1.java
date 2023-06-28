package com.softserve.edu13IOStreams.practik;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Prepare mytext.txt file with a lot of text inside.
 * Read context from file into array of strings.
 * Each array item contains one line from file.
 * Complete next tasks:
 *    1) count and write the number of symbols in every line.
 *    2) find the longest and the shortest line.
 *    3) find and write only that lines, which consist of word «to»
 */


public class Ex1 {
    public static void main(String[] args) throws IOException {
        List<String> strings = new ArrayList<>();
        File file = new File("mytext");
        try (BufferedReader in = new BufferedReader(new FileReader(file));
             Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                strings.add(line);
            }
            for (String s :
                    strings) {
                System.out.println("length of the next line -> " + s.length());
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        Optional<String> optionalMax = strings.stream().
                max(Comparator.comparingInt(String::length));
        if (optionalMax.isPresent()) {
            System.out.println("The longest line -> " + optionalMax.toString());
            Optional<String> optionalMin = strings.stream().
                    max(Comparator.comparingInt(String::length).reversed());
            if (optionalMin.isPresent()) {
                System.out.println("The shortest line -> " + optionalMin.toString());
            }
        }
        Pattern pattern = Pattern.compile("\\bto\\b");
        System.out.println();
        System.out.println("lines, which consist of word 'to'");
        strings.stream().filter(str -> pattern.matcher(str).find()).forEach(System.out::println);
    }
}
