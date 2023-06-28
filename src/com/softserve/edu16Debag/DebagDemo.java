package com.softserve.edu16Debag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DebagDemo {
    public static void main(String[] args) {
        int countCharacters = 0;
        String testWord;
        String character = "";
        String characterWord = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input word");
        try {
            testWord = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Input character");
        try {
            character = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < testWord.length(); i++) {
            characterWord = testWord.substring(i, i + 1);
            if (character.equals(characterWord)) {
                countCharacters++;
            }
        }
        if (countCharacters > 0) {
            System.out.println("There is character \"" + character + "\" "
                    + countCharacters + " times in the word \"" + testWord + "\"");
        } else {
            System.out.println("There is no such character \"" + character + "\""
                    + " in the word \"" + testWord + "\"");
        }
    }
}

