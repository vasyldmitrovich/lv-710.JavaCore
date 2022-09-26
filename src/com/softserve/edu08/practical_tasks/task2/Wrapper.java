package com.softserve.edu08.practical_tasks.task2;

public class Wrapper<T extends Shape> {
    private T shape;

    public Wrapper(T shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return shape.getClass().getSimpleName();
    }
}
