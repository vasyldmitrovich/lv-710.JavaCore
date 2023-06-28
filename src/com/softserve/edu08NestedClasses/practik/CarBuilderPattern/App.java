package com.softserve.edu08NestedClasses.practik.CarBuilderPattern;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Car firstCar = new Car.CarBuilder()
                .addColor("red")
                .addDateOfProduction(LocalDate.of(2000, 3,23))
                .addPassengerCapacity(5)
                .setIsAirConditioning(true)
                .build();
        System.out.println(firstCar);
    }
}
