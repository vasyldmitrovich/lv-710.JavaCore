package com.softserve.hw06.task1;

import java.util.Arrays;

/**
 * Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().
 * Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.
 * Create array Bird and add different birds to it.
 * Call fly() method for all of it. Output the
 * information about each type of created bird.
 */
public class Task1 {
    public void run() {
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Chicken(),
                new Penguin()
        };

        Arrays.stream(birds)
                .forEach(bird -> {
                    System.out.println(bird);
                    bird.fly();
                });
    }
}
