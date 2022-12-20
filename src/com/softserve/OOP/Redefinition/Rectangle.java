package com.softserve.OOP.Redefinition;

public class Rectangle extends Figure{
    double side3;

    public Rectangle(double side1, double side2) {
        super(side1, side2);

    }

    @Override
    public double getArea() {
        System.out.println("Площадь прямоугольника: " + side1*side2);
        return side1*side2;
    }
}
