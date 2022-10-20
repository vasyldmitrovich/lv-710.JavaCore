package com.softserve.hw13.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * There is a list of strings list1.
 * Create a new list list2 that has items from list1 and length less than 5 characters (use method removeIf)
 */
public class Task1 {
    public void run() {
        List<String> list1 = new ArrayList<>(Arrays.asList("one", "two", "three", "remove that"));
        list1.removeIf(word -> word.length() > 5);
        list1.forEach(System.out::println);
    }
}
