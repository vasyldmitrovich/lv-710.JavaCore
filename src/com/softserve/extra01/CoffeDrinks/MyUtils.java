package com.softserve.extra01.CoffeDrinks;

import java.util.ArrayList;
import java.util.HashMap;

public class MyUtils {
    public static void prepareCaffee(ArrayList<Caffee> list) {
        list.add(new Espresso("Espresso", 8));
        list.add(new Cappuccino("Cappuccino", 10));
        list.add(new Espresso("Espresso", 10));
        list.add(new Cappuccino("Cappuccino", 6));
        list.add(new Caffee("Caffee", 6));
        System.out.println(list);
    }

    public static void averageRating(ArrayList<Caffee> caffeeArray) {
        HashMap<String, Double> averageRating = new HashMap<>();
        for (Caffee caffee : caffeeArray)
            if (averageRating.containsKey(caffee.getName()))
                averageRating.put(caffee.getName(), ((averageRating.get(caffee.getName()) + caffee.getRating()) / 2));
            else averageRating.put(caffee.getName(), (double) caffee.getRating());
        System.out.println(averageRating);
    }
}
