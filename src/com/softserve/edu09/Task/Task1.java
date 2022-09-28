package com.softserve.edu09.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void run() {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(7);
        list.add(7);
        list.add(2);
        list.add(7);
        list.add(7);
        System.out.println(list);

        List<Integer> result = new ArrayList<>();
        for (int i: list) {
            if (i>5)result.add(list.get(i));
        }
        System.out.println(result);

        System.out.println(list.stream().filter(x -> x<20).collect(Collectors.toList()));

        list.add(2,1);
        list.add(8,-3);
        list.add(5,-4);
        for (int i=0;i<list.size();i++) {
            System.out.println("position – "+i+", value of element – "+list.get(i));
        }

        System.out.println(list.stream().sorted().collect(Collectors.toList()));

//        Map<Integer, Long> counted = list.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        List<Integer> result = new ArrayList<>();
//        for (int key: counted.keySet()) {
//            if (counted.get(key)>=4) {
//                for (int i=0; i<list.size(); i++) {
//                    if (list.get(i)==key) {
//                        result.add(i);
//                    }
//                }
//            }
//
//        }
//        System.out.println(result);
    }
}
