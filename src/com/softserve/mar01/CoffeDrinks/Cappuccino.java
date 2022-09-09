package com.softserve.mar01.CoffeDrinks;

import java.util.Map;

public class Cappuccino extends Caffee {
    public Cappuccino(String name, int rating) {
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        super.makeDrink();
        addComponent("Milk", 50);
        return getIngredients();
    }
}
