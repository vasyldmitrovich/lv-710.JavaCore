package com.softserve.hw08.task2;

public class Wrapper<T> {

    T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public T setValue(T value) {
        return this.value;
    }
}
