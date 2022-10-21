package com.softserve.edu12.Tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void run() {
        try (BufferedReader file = new BufferedReader(new FileReader("src\\com\\softserve\\edu12\\tasks\\test.txt"))) {
            List<String> lines = file.lines().collect(Collectors.toList());
            System.out.println("Length of lines: ");
            lines.stream().map(String::length).forEach(System.out::println);
            System.out.println();

            System.out.println("Longest line: ");
            System.out.println(lines.stream().max(Comparator.comparing(String::length)).orElse(null));
            System.out.println();

            System.out.println("Lines, which contain of word «var»: ");
            lines.stream().filter(o -> o.contains("var")).forEach(System.out::println);
            System.out.println();

            System.out.println("Lines, which consist of word «var»: ");
            lines.stream().filter(o -> o.matches("^var$")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
