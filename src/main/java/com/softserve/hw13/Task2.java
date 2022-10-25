package com.softserve.hw13;

import java.util.stream.Collectors;

public class Task2 {

    public static void run() {
        System.out.println(new Task2().decrypt(new Task2().encrypt("String", 82), 681));
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
