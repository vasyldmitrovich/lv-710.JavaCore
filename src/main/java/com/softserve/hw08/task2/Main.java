package com.softserve.hw08.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        task2();
    }

    public static void task2(){
        List<Wrapper<?>> wrappers = new ArrayList<>() {{

            add(new Wrapper<>("S"));
            add(new Wrapper<>(1));
            add(new Wrapper<>(true));

        }};

        wrappers.forEach(wrapper -> System.out.println(wrapper.getValue()));
    }


}
