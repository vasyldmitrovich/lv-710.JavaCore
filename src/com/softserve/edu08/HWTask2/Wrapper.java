package com.softserve.edu08.HWTask2;

public class Wrapper<T> {
    private T value;


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Wrapper [value=" + value + "]";
    }


}
