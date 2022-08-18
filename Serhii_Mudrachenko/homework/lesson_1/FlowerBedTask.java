package homework.lesson_1;


import static homework.lesson_1.MessageHelper.readDoubleMessage;
import static homework.lesson_1.MessageHelper.writeMessage;

/**
 * Flower bed is shaped like a circle. Calculate the perimeter and area by
 * entering the radius. Output obtained results.
 */

class FlowerBedTask {
    protected static void calculateThePerimeterAndArea() {
        writeMessage("Enter the radius:");

        double radius = getRadiusFromUser();

        writeMessage(String.format("""
                Circle has:
                radius = %.2f
                area = %.2f
                perimeter = %.2f
                """, radius, getArea(radius), getPerimeter(radius)));
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
