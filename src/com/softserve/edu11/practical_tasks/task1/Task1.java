package com.softserve.edu11.practical_tasks.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create a method for calculating the area of a rectangle
 * int squareRectangle (int a, int b),
 * which should throw an exception if the user enters negative value.
 * Input values a and b from console. Check the squareRectangle method in the method main.
 * Check to input nonnumeric value.
 */
public class Task1 {

    public void run() {
        try {
            int area = new Task1().getAreaOfRectangle();
            System.out.println("Area of the rectangle = " + area);
        } catch (NumberFormatException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private int getAreaOfRectangle() throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first side:");
        int a = Integer.parseInt(reader.readLine());
        isNegative(a);
        System.out.println("Enter second side:");
        int b = Integer.parseInt(reader.readLine());
        isNegative(b);
        isSquareRectangle(a, b);
        return a * b;
    }

    private void isSquareRectangle(int a, int b) {
        if (a == b) {
            System.out.println("Rectangle id square");
        } else {
            System.out.println("Rectangle id not square");
        }
    }

    private void isNegative(int i) {
        if (i < 0) {
            throw new NumberFormatException("negative value");
        }
    }
}
