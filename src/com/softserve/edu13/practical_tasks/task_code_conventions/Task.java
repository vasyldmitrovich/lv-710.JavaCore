package com.softserve.edu13.practical_tasks.task_code_conventions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * In the next method calculate amount of characters in the string. Need to find logic errors.
 */
public class Task {
    public void method() throws IOException {
        int countCharacters = 0;
        String testWord;
        String character = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input word");
        testWord = br.readLine();
        System.out.println("Input character");
        character = br.readLine();
        for (int i = 0; i < testWord.length(); i++) {
            // created new local variable in this line and changed arguments for method substring()
            String currentCharacter = testWord.substring(i, i + 1);   //character = testWord.substring(1, 1);
            if (character.equals(currentCharacter)) countCharacters++;//if (character.equals(character)) countCharacters++;
        }
        System.out.println("There are character" + character + " " + countCharacters + " times in the word " + testWord);
    }
}
