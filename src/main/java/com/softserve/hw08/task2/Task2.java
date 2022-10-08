package com.softserve.hw08.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public void runApp(){
        List<Wrapper<?>> wrappers = new ArrayList<>() {{

            add(new Wrapper<>("S"));
            add(new Wrapper<>(1));
            add(new Wrapper<>(true));

        }};

        wrappers.forEach(wrapper -> System.out.println(wrapper.getValue()));
    }


}
