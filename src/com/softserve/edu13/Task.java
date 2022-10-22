package com.softserve.edu13;

import com.softserve.hw04.IO.In;
import com.softserve.hw04.IO.Input;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

class Task {
    public static void run() {
        In myIn = new Input();
        int quantity = myIn.readInt("Enter number of randoms: ");
        List<Integer> randoms = new ArrayList<>();
        ThreadLocalRandom.current().ints(quantity).forEach(randoms::add);
        System.out.println("Randoms:");
        randoms.forEach(System.out::println);
        System.out.println("Sorted randoms:");
        randoms.stream().sorted().forEach(System.out::println);
        System.out.println("Biggest: ");
        randoms.stream().max(Integer::compare).ifPresent(System.out::println);
        System.out.println();
        System.out.println("Today is " + LocalDate.now().getDayOfWeek());
        System.out.println();
        System.out.println("First Monday for current month: "
                + LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
        List<String> temp = new ArrayList<>();
        temp.add("Aaa");
        temp.add("Baa");
        temp.add("Abb");
        System.out.println();
        System.out.println("String list: " + temp);
        System.out.println("Sorted list: " + sortStringList(temp));
    }

    private static List<String> sortStringList(List<String> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }
}
