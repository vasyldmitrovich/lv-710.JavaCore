package com.softserve.hw13;

import java.util.stream.Collectors;

public class Task2 {

    public static void run() {
        System.out.println(decrypt(encrypt("String", 82), 681));
    }

    private static String encrypt(String s, int n) {
        return s.chars()
                .mapToObj(c -> (char) (c += n))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private static String decrypt(String s, int n) {
        return s.chars()
                .mapToObj(c -> (char) (c -= n))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
