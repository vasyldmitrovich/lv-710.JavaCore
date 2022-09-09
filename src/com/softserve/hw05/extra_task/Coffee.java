package com.softserve.hw05.extra_task;

import java.util.HashMap;
import java.util.Map;

public class Coffee implements DrinkReceipt, DrinkPreparation, Rating {
    private String name;
    private int rating;
    protected Map<String, Integer> ingredients = new HashMap<>();

    public Coffee() {
    }

    public Coffee(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    @Override
    public Map<String, Integer> makeDrink() {
        addComponent("Water", 100);
        addComponent("Arabica", 20);
        return ingredients;
    }

    @Override
    public DrinkReceipt addComponent(String componentName, int componentCount) {
        this.ingredients.put(componentName, componentCount);
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
