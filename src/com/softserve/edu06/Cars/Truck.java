package com.softserve.edu06.Cars;

public class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + this.getModel() + '\'' +
                ", maxSpeed=" + this.getMaxSpeed() +
                ", yearOfManufacture=" + this.getYearOfManufacture() +
                '}';
    }
}
