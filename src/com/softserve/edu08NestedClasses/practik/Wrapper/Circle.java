package com.softserve.edu08NestedClasses.practik.Wrapper;

public class Circle implements Shape {
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
