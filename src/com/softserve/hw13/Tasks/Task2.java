package com.softserve.hw13.Tasks;

import java.util.stream.Collectors;

public class Task2 {
    public static void run() {
        System.out.println(encrypt("abc", 10));
        System.out.println(decrypt(encrypt("abcd", 10), 10));
    }

    private static String encrypt(String s, int n) {
        return s.chars().mapToObj(c -> (char) (c += n)).map(String::valueOf).collect(Collectors.joining());
    }

    private static String decrypt(String s, int n) {
        return s.chars().mapToObj(c -> (char) (c -= n)).map(String::valueOf).collect(Collectors.joining());
    }
}
