package com.softserve.Enum;

import static com.softserve.Enum.Car.*;

public class TestCar {
    public static void main(String[] args) {
        Car audi = AUDI;

        for (Car car :
                Car.values()) {
            System.out.println(car + " have color: " + car.getColor());
        }
    }
}
