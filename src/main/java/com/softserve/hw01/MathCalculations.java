package com.softserve.hw01;

public class MathCalculations {

    public void m1() {
        System.out.println("Hello");
    }

    public void circlePerimeter(double radius) {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter = " + perimeter);
    }

    public void circleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area = " + area);
    }
}
