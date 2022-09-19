package com.softserve.edu15.Tasks;

import com.softserve.edu15.IO.In;
import com.softserve.edu15.IO.Input;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void run() {
        ArrayList<Character> loudLetters = new ArrayList<>(Arrays.asList('e', 'y', 'u', 'i', 'o', 'a', 'j'));
        int countOfLoudLetters = 0;
        In myIn = new Input();
        String text = myIn.readString("Enter text: ").toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            if (loudLetters.contains(text.charAt(i))) countOfLoudLetters++;
        }
        System.out.println("Number of loud letters: " + countOfLoudLetters);
    }
}
