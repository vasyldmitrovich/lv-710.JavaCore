package com.softserve.hw08.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * @1 Create Wrapper<T> class with private field of T type which is called value.
 * @2 In Wrapper class create public constructor and setValue and getValue methods for value field.
 * @3 Create three objects of the Wrapper type: first object should be wrapper for int type,
 * second – for String, third - for boolean.
 * @4 Print all three values in the console using method getValue from Wrapper class.
 */
public class Task2 {
    public void run() {
        List<Wrapper<Object>> wrappers = new ArrayList<>() {{
            add(new Wrapper<>("text"));
            add(new Wrapper<>(26));
            add(new Wrapper<>(false));
        }};

        wrappers.forEach(wrapper -> System.out.println(wrapper.getValue()));
    }
}
