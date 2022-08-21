package circle;

import main.Main;
import java.text.DecimalFormat;

public class Circle {
    public static void getCircle() {
        System.out.print("Enter radius: ");
        double usrRadius = Main.readInputDouble();
        showResult(usrRadius);
    }

    private static final DecimalFormat format = new DecimalFormat("00.00");

    private static double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    private static double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    private static void showResult(double radius) {
        System.out.println("Area = " + format.format(getArea(radius)) + " cm;\n" +
                "Perimeter = " + format.format(getPerimeter(radius)) + " cm;\n");
    }
}
