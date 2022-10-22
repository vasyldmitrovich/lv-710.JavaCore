package com.softserve.hw12.Tasks;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\com\\softserve\\hw12\\tasks\\test.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src\\com\\softserve\\hw12\\tasks\\result.txt", false))) {
            List<String> list = reader.lines().collect(Collectors.toList());
            writer.write("Number of lines: " + list.size());
            writer.newLine();
            String longestLine = list.stream().max(Comparator.comparing(String::length)).orElse(null);
            writer.write("Longest line: " + longestLine);
            writer.newLine();
            writer.write("Bogdan Dranchuk 12.09.1986");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

