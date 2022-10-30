package com.softserve.hw13;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public void task1() {
        List<String> list1 = new ArrayList<>();

        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        list1.add("Four");
        list1.add("Five");
        list1.add("Six");
        list1.add("Seven");
        list1.add("Eight");
        list1.add("Nine");
        list1.add("Ten");

        List<String>list2 = new ArrayList<>(list1);

        list2.removeIf(o -> o.length() < 5);

        System.out.println("Task 1\n");
        System.out.println(list1);
        System.out.println(list2 + "\n");

    }
}
