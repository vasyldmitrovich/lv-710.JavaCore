package com.softserve.hw10.Tasks;

import com.softserve.hw04.IO.In;
import com.softserve.hw04.IO.Input;

import java.util.Arrays;
import java.util.Comparator;

public class Task1 {
    public static void run() {
        In myIn = new Input();
        String sentence = myIn.readString("Enter sentence of five words: ");
        String longestWord = Arrays.stream(sentence.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println("Longest word - "+longestWord + ", it have "+longestWord.length()+" letters");
        System.out.print("Second word in reverse order: ");
        System.out.println(new StringBuilder(sentence.split(" ")[1]).reverse());
    }
}
