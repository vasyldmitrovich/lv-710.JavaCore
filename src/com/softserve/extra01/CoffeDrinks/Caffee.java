package com.softserve.extra01.CoffeDrinks;

import java.util.HashMap;
import java.util.Map;

public class Caffee implements DrinkReceipt, DrinkPreparation, Rating {
    private String name;
    private int rating;
    private Map<String, Integer> ingredients;

    public Caffee(String name, int rating) {
        this.name = name;
        this.rating = rating;
        ingredients = new HashMap<>();
        ingredients = makeDrink();
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }

    @Override
    public Map<String, Integer> makeDrink() {
        addComponent("Water", 100);
        addComponent("Arabica", 20);
        return ingredients;
    }

    @Override
    public int getRating() {
        return this.rating;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addComponent(String componentName, int componentCount) {
        ingredients.put(componentName, componentCount);
    }

    @Override
    public String toString() {
        return '\n' + getClass().getSimpleName() + "[name= " + this.name + ", rating= " + this.rating + ']';
    }

}