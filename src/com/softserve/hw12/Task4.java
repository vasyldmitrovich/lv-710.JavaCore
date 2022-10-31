package com.softserve.hw12;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public void task4(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\com\\softserve\\hw12\\file1.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\com\\softserve\\hw12\\file2.txt",false))){
            List<String> list = bufferedReader.lines().collect(Collectors.toList());
            bufferedWriter.write("Number of lines: " + list.size());
            bufferedWriter.newLine();

            String longestLine = list.stream().max(Comparator.comparing(String::length)).orElse(null);
            bufferedWriter.write("The longest line is: " + longestLine);
            bufferedWriter.newLine();
            bufferedWriter.write("Alina Ladur, 08/03/1999");


        }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

