package com.softserve.hw05.extra_task;

import java.util.Map;

public class Cappuccino extends Coffee {
    public Cappuccino() {
    }

    public Cappuccino(String name, int rating) {
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        super.makeDrink();
        ingredients.put("Milk", 50);
        return ingredients;
    }
}
