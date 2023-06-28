package com.softserve.edu14LambdaDate.hw;

import java.util.stream.Collectors;

public class CryptDemo {
    public static void main(String[] args) {
        String original = "Dipol";
        int shift = 3;
        String encrypt = encrypt(original, shift);
        String decrypt = decrypt(encrypt, shift);
        System.out.println(original);
        System.out.println(encrypt);
        System.out.println(decrypt);
    }
    public static String encrypt(String s, int n) {
        return stringShifter(s, n);
    }
    public static String decrypt(String s, int n) {
        return stringShifter(s, -n);
    }

    private static String stringShifter(String s, int n) {
        return s.chars()
                .mapToObj(c -> {
                    if (Character.isLetter(c)) {
                        char shifted = (char) (c + n);
                        if (Character.isUpperCase(c) && shifted > 'Z') {
                            shifted = (char) ('A' + (Math.abs(shifted - 'Z') - 1));
                        } else if (Character.isLowerCase(c) && shifted > 'z') {
                            shifted = (char) ('a' + (Math.abs(shifted - 'z') - 1));
                        }else if (Character.isUpperCase(c) && shifted < 'A') {
                            shifted = (char) ('Z' - (Math.abs(shifted - 'A') - 1));
                        } else if (Character.isLowerCase(c) && shifted < 'a') {
                            shifted = (char) ('z' - (Math.abs(shifted - 'a') - 1));
                        }
                        return Character.toString(shifted);
                    } else {
                        return Character.toString((char) c);
                    }
                })
                .collect(Collectors.joining());
    }
}