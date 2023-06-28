package com.softserve.edu08NestedClasses.hw.Wrapper;

public class Wrapper<T> {
    private T value;

    public Wrapper() {;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
