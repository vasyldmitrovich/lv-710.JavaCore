package com.company;

import java.util.Scanner;

public class Circle {
    Scanner input = new Scanner(System.in);
    long radius;

    public long setRadius(){
        System.out.println("Please enter the radius!");
        this.radius = input.nextLong();
        return radius;
    }

    public void getCirclePerimeter (){
        double circlePerimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of your circle is: " + circlePerimeter);
    }

    public void getCircleArea() {
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of your circle is: " + circleArea);
    }
}
