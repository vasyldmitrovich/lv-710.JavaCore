package com.softserve.edu11.practical_tasks.task2.entity;


import com.softserve.edu11.practical_tasks.task2.exception.ColorException;
import com.softserve.edu11.practical_tasks.task2.exception.TypeException;

public class Plant {
    int size;
    Color color;
    Type type;

    public Plant() {
    }

    public Plant(int size, Color color, Type type) throws TypeException, ColorException {
        if (size < 0) {
            throw new IllegalArgumentException("size < 0");
        }
        if (type != Type.TREES) {
            throw new TypeException("We need just a trees, but it is " + type.name());
        }
        if (color != Color.GREEN) {
            throw new ColorException("color " + color.name());
        }
        this.size = size;
        this.color = color;
        this.type = type;

    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
