package com.softserve.hw05.extra_task;

import java.util.HashMap;
import java.util.Map;

public class Espresso extends Coffee {
    public Espresso() {
    }

    public Espresso(String name, int rating) {
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        ingredients = new HashMap<>(){{
            put("Water", 50);
            put("Arabica", 20);
        }};
        return ingredients;
    }
}
