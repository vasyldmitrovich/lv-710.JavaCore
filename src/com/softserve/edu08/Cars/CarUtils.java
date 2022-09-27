package com.softserve.edu08.Cars;

import java.time.LocalDate;

public class CarUtils {
    public static void run() {
        System.out.println("Running car utils");
        Car.CarBuilder cb = Car.getCar().addModel("Mersedes")
                .addColor("red")
                .addEngineCapacity(2.2)
                .addDataOfProduction(LocalDate.of(2020,1,1))
                .addPassengerCapacity(5)
                .addIsAirConditioning(true);
        Car car1 = cb.build();
        System.out.println(car1);
    }
}
