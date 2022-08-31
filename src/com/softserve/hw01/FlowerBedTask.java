package com.softserve.hw01;


import static com.softserve.hw01.MessageHelper.readDoubleMessage;
import static com.softserve.hw01.MessageHelper.writeMessage;

/**
 * Flower bed is shaped like a circle. Calculate the perimeter and area by
 * entering the radius. Output obtained results.
 */

class FlowerBedTask {
    protected static void calculateThePerimeterAndArea() {
        writeMessage("Enter the radius:");

        double radius = getRadiusFromUser();

        writeMessage(String.format("Circle has:" +
                "\nradius = %.2f" +
                "\narea = %.2f" +
                "\nperimeter = %.2f"
                , radius, getArea(radius), getPerimeter(radius)));
    }

    private static double getRadiusFromUser() {
        return readDoubleMessage();
    }

    private static double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    private static double getPerimeter(double radius) {
        return Math.PI * 2 * radius;
    }
}
