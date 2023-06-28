package com.softserve.edu12StreamAPI.practik;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        System.out.println(countEmptyString(list));
        System.out.println(listWithOutEmpty(list));
        System.out.println(listToString(listWithOutEmpty(list)));
    }

    public static long countEmptyString(List<String> list) {
        return list.stream().
                filter(String::isEmpty).
                count();
    }

    public static List<String> listWithOutEmpty(List<String> list) {
        return list.stream().
                filter(s -> !s.isEmpty()).
                collect(Collectors.toList());
    }

    public static String listToString(List<String> list) {
        return list.stream().
                map(String::toUpperCase).
                collect(Collectors.joining(","));
    }
}
