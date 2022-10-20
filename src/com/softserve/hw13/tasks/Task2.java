package com.softserve.hw13.tasks;

import java.util.stream.Collectors;

/**
 * Create two methods String encrypt(String s, int n) and String decrypt(String s, int n)
 * Method encrypt should take a string and return coded string where every letter is moved on n positions
 * in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should return decoded value
 */
public class Task2 {
    public void run() {
        System.out.println(decrypt(encrypt("String", 2), 2));
    }

    private String encrypt(String s, int n) {
        return s.chars()
                .mapToObj(c -> (char) (c += n))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private String decrypt(String s, int n) {
        return s.chars()
                .mapToObj(c -> (char) (c -= n))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

}
