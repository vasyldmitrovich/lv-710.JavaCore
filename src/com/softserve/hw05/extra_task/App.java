package com.softserve.hw05.extra_task;

import java.util.ArrayList;
import java.util.List;

/**
 * Create interface DrinkReceipt with methods String getName() and DrinkReceipt addComponent(String componentName,
 * int componentCount). Create interface DrinkPreparation with method Map<String, Integer> makeDrink() to return
 * a drink components. Create interface Rating with method int getRating().
 * Class Coffee contains fields String name, int rating, Map of ingredients and implements interfaces DrinkReceipt,
 * DrinkPreparation and Rating. Method makeDrink() prepare coffee with typically
 * components: {Water=100, Arabica=20}. Espresso and Cappuccino classes extends the Coffee Class and override
 * method makeDrink(). Espresso coffee has 50 g. of Water. Cappuccino coffee has additional of 50 g. of Milk.
 * Create a averageRating() method of the MyUtils class to return a Map with coffee name as key and coffee
 * average rating as value.
 * 
 * For example, for a given list
 * [Espresso [name=Espresso, rating=8],
 * Cappuccino [name=Cappuccino, rating=10],
 * Espresso [name=Espresso, rating=10],
 * Cappuccino [name=Cappuccino, rating=6],
 * Coffee [name=Coffee, rating=6]]
 * you should get
 * {Espresso=9.00, Cappuccino=8.00, Coffee=6.00}
 */
public class App {

    public static void main(String[] args) {
        List<Coffee> coffees = new ArrayList<>() {{
            add(new Espresso("Espresso", 8));
            add(new Cappuccino("Cappuccino", 10));
            add(new Espresso("Espresso", 10));
            add(new Cappuccino("Cappuccino", 6));
            add(new Coffee("Coffee", 6));
        }};

        System.out.println(MyUtils.averageRating(coffees));
    }

}
