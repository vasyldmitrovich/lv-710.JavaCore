package com.softserve.edu11.practical_tasks.task2;

import com.softserve.edu11.practical_tasks.task2.entity.Color;
import com.softserve.edu11.practical_tasks.task2.entity.Plant;
import com.softserve.edu11.practical_tasks.task2.entity.Type;
import com.softserve.edu11.practical_tasks.task2.exception.ColorException;
import com.softserve.edu11.practical_tasks.task2.exception.TypeException;

import java.util.Arrays;
import java.util.Optional;

/**
 * Create a class Plant, which includes fields int size, Color color and Type type, and
 * constructor where these fields are initialized. Color and type are Enum. Override the
 * method toString( ). Create classes ColorException and TypeException and describe there all
 * possible colors and types of plants. In the method main create an array of five plants.
 * Check to work your exceptions.
 */
public class Task2 {

    public void run() {
        Plant[] plants = new Plant[5];
        plants[0] = createPlant(4, Color.GREEN, Type.HERBS);
        plants[1] = createPlant(-3, Color.GREEN, Type.HERBS);
        plants[2] = createPlant(40, Color.RED, Type.TREES);
        plants[3] = createPlant(150, Color.GREEN, Type.SHRUBS);
        plants[4] = createPlant(200, Color.GREEN, Type.TREES);

        Arrays.stream(plants).forEach(System.out::println);
    }

    private Plant createPlant(int size, Color color, Type type) {
        try {
            return new Plant(size, color, type);
        } catch (TypeException | ColorException | IllegalArgumentException e) {
            e.printStackTrace();
            return new Plant();
        }
    }
}
