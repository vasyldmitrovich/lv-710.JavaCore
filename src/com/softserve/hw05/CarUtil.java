package com.softserve.hw05;

public class CarUtil {
    public static Car findCarByYear(int yearOfProduction, Car[] cars) {
        Car carByYear = null;

        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            if (car.getYearOfProduction() == yearOfProduction) {
                carByYear = car;
                break;

            }
        }

        return carByYear;

    }
}
