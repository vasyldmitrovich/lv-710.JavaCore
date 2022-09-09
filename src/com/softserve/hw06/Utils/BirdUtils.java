package com.softserve.hw06.Utils;

import com.softserve.hw06.Birds.*;

import java.util.ArrayList;

public class BirdUtils {
    public static void run() {
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Swallow());
        birds.add(new Penguin());
        birds.add(new Chicken());
        birds.forEach(Bird::fly);
        birds.forEach(Bird::print);
    }
}
