package com.softserve.hw08.Wrappers;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static void run() {
        Wrapper<Integer> wrapInt = new Wrapper<>(10);
        Wrapper<String> wrapString = new Wrapper<>("Hello");
        Wrapper<Boolean> wrapBool = new Wrapper<>(true);
        List<Wrapper> list= new ArrayList<>();
        list.add(wrapInt);
        list.add(wrapString);
        list.add(wrapBool);
        for (Wrapper wrapper: list) {
            System.out.println(wrapper.getValue());
        }

    }
}
