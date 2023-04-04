package com.softserve.edu06.practik.Cars;

public class Truck extends Car{
    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
   public void run() {
        System.out.println("truck is run");
    }

    @Override
   public void stop() {
        System.out.println("truck is stop");
    }
}
