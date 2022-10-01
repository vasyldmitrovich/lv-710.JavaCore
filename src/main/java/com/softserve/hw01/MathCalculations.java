package com.softserve.hw01;

import java.util.List;

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

    public int phoneCallCoast(List<User> users) {
        int coast = 0;
        for (User user : users) {
            int coastForUser = user.getCostPerMin() * user.getMinutesAmount();
            System.out.println("Phone call coast for " + user.getName() + " = " + coastForUser + " $");
            coast = coast + coastForUser;
        }
        System.out.println("Total phone calls coast = " + coast + " $");
        return coast;
    }
}
