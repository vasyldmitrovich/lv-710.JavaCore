package com.softserve.hw11.tasks.classes;

public class Number {

    private int value;

    public Number(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int readNumber(int start, int end) throws NullPointerException{
        int result = Integer.parseInt(null);
        if (this.value > start && this.value < end)
            result = this.value;
        return result;
    }
}
