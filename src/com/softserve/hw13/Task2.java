package com.softserve.hw13;

import java.util.stream.Collectors;

public class Task2 {

    public void task2(){
        System.out.println(encrypt("Word", 5));
        System.out.println(decrypt(encrypt("Word", 5),5));
    }

    private static String encrypt(String s, int n){
        return s.chars().mapToObj(c -> (char) (c+= n)).map(String::valueOf).collect(Collectors.joining());
    }

    private static String decrypt (String s, int n){
        return s.chars().mapToObj(c -> (char) (c+= n)).map(String::valueOf).collect(Collectors.joining());
    }
}
