package com.softserve.OOP.Redefinition;

public abstract class Figure {
    double side1;
    double side2;

    public Figure(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    public abstract double getArea ();

    @Override
    public String toString() {
        return "Figure{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}
