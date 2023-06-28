package com.softserve.edu08NestedClasses.practik.Wrapper;

public class Square implements Shape{
    private double length;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return Math.sqrt(length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
