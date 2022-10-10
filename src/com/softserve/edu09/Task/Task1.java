package com.softserve.edu09.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Task1 {
    public static void run() {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(23);
        list.add(7);
        list.add(2);
        list.add(72);
        list.add(7);
        list.add(2);
        list.add(7);
        list.add(7);
        System.out.println(list);

        List<Integer> result = new ArrayList<>();
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            int element = iterator.next();
            if (element>5) result.add(iterator.nextIndex());
        }
        System.out.println(result);

        System.out.println(list.stream().filter(x -> x<20).collect(Collectors.toList()));

        list.add(1,1);
        list.add(7,-3);
        list.add(4,-4);
        for (int i=0;i<list.size();i++) {
            System.out.println("position – "+i+", value of element – "+list.get(i));
        }

        System.out.println(list.stream().sorted().collect(Collectors.toList()));
    }
}
