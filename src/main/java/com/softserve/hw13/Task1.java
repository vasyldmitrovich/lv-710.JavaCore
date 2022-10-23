package com.softserve.hw13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void run() {
        List<String> list1 = new ArrayList<>(Arrays.asList("java", "c++", "spring", "testng", "(*_*)"));
        list1.removeIf(wordLength -> wordLength.length() > 5);
        list1.forEach(System.out::println);
    }
}
