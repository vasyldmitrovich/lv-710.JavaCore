package com.softserve.edu06.Cars;

public class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" + this.getModel() + '\'' +
                ", maxSpeed=" + this.getMaxSpeed() +
                ", yearOfManufacture=" + this.getYearOfManufacture() +
                '}';
    }
}
