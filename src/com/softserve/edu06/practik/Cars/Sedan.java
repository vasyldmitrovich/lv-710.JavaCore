package com.softserve.edu06.practik.Cars;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public void run() {
        System.out.println("sedan is run");
    }

    @Override
   public void stop() {
        System.out.println("sedan is stop");
    }
}
