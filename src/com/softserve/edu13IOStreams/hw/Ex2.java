package com.softserve.edu13IOStreams.hw;

import java.io.*;

/**
 * A file with java code is given. Read program text from file and all words public
 * in the declaration of class attributes and methods should be replaced with the word private.
 * Save the result to another previously created file.
 */


public class Ex2 {
    public static void main(String[] args) throws IOException {
        File fileName = new File("javacode");
        File outFileName = new File("javacode_Private");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             FileWriter fileWriter = new FileWriter(outFileName)) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replace("public", "private");
                fileWriter.write(line + System.lineSeparator());
            }
        }
    }
}