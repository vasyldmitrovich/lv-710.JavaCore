package com.softserve.edu11.Tasks;

import com.softserve.edu11.Tasks.Entity.Color;
import com.softserve.edu11.Tasks.Entity.Plant;
import com.softserve.edu11.Tasks.Entity.Type;

import java.util.ArrayList;

public class Task2 {
    public static void run(){
        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(new Plant(1, Color.BLUE, Type.FLOWER));
        plants.add(new Plant(1, Color.RED, Type.HERB));
        plants.add(new Plant(1, Color.BLUE, Type.HERB));
        plants.add(new Plant(1, Color.RED, Type.TREE));
        plants.add(new Plant(1, Color.BLACK, Type.FLOWER));
    }
}
