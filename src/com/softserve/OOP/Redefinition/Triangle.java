package com.softserve.OOP.Redefinition;

public class Triangle extends Figure{
    double side3;

    public Triangle(double side1, double side2,double side3) {
        super(side1, side2);
        this.side3 = side3;

    }

    @Override
    public double getArea() {
        System.out.println("Площадь треугольника: " + side1*side2/2);
        return side1*side2/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side3=" + side3 +
                '}' + super.toString();
    }
}
