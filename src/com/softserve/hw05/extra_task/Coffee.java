package com.softserve.hw05.extra_task;

import java.util.HashMap;
import java.util.Map;

public class Coffee implements DrinkReceipt, DrinkPreparation, Rating{
    private String name;
    private int rating;
    protected Map<String, Integer> ingredients;

    public Coffee() {
    }

    public Coffee(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }

    @Override
    public Map<String, Integer> makeDrink() {
        ingredients = new HashMap<>(){{
            put("Water", 100);
            put("Arabica", 20);
        }};
        return ingredients;
    }

    @Override
    public DrinkReceipt addComponent(String componentName, int componentCount) {
        return null;
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
