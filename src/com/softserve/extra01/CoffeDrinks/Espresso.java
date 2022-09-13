package com.softserve.extra01.CoffeDrinks;

import java.util.Map;

public class Espresso extends Caffee {
    public Espresso(String name, int rating) {
        super(name, rating);
    }

    @Override
    public Map<String, Integer> makeDrink() {
        super.makeDrink();
        addComponent("Water", 50);
        return getIngredients();
    }
}
