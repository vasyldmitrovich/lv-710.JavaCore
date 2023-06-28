package com.softserve.edu12StreamAPI.practik;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics statistics = primes.stream()
                .mapToInt(x -> Integer.valueOf(x))
                .summaryStatistics();
        System.out.println("Кількісь елементів коллекції: " + statistics.getCount());
        System.out.println("Мін елемент коллекції: " + statistics.getMin());
        System.out.println("Макс елемент коллекції: " + statistics.getMax());
        System.out.println("Сума елементів коллекції: " + statistics.getSum());
    }
}
