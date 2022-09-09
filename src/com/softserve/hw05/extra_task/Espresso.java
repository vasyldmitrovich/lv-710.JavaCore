package com.softserve.hw05.extra_task;

import java.util.Map;

public class Espresso extends Coffee {
    public Espresso() {
    }

    public Espresso(String name, int rating) {
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        addComponent("Water", 50);
        addComponent("Arabica", 20);
        return ingredients;
    }
}
