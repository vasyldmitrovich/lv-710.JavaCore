package com.softserve.hw05.extra_task;


import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class MyUtils {
    public static Map<String, Double> averageRating(List<? extends Coffee> coffees) {
        return coffees.stream()
                .collect(groupingBy(Coffee::getName, averagingInt(Coffee::getRating)));
    }
}