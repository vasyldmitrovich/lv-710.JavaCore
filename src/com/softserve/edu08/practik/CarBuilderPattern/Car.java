package com.softserve.edu08.practik.CarBuilderPattern;

import java.time.LocalDate;

public class Car {
    private String model;
    private LocalDate dateOfProduction;
    private double engineCapacity;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioning;

    public Car() {
    }

    public Car(String model, LocalDate dateOfProduction, double engineCapacity, String color, int passengerCapacity, boolean isAirConditioning) {
        this.model = model;
        this.dateOfProduction = dateOfProduction;
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.passengerCapacity = passengerCapacity;
        this.isAirConditioning = isAirConditioning;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(LocalDate dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public boolean isAirConditioning() {
        return isAirConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        isAirConditioning = airConditioning;
    }

    @Override
    public String toString() {
        return "Car: " + "\n" +
                (model != null ? "model = " + model + "\n": "")  +
                (dateOfProduction != null ? "dateOfProduction = " + dateOfProduction + "\n": "") +
                (engineCapacity != 0.0 ? "engineCapacity = " + engineCapacity + "\n": "") +
                (color != null ? "color = " + color + "\n": "") +
                (passengerCapacity != 0 ? "passengerCapacity = " + passengerCapacity + "\n": "") +
                (isAirConditioning ? "isAirConditioning = " + true + "\n": "")
                ;
    }

    public static class CarBuilder {
        private Car newCar;

        public CarBuilder() {
            newCar = new Car();
        }

        public CarBuilder addModel(String model) {
            newCar.model = model;
            return this;
        }

        public CarBuilder addColor(String color) {
            newCar.color = color;
            return this;
        }

        public CarBuilder addDateOfProduction(LocalDate dateOfProduction) {
            newCar.dateOfProduction = dateOfProduction;
            return this;
        }

        public CarBuilder addEngineCapacity(double engineCapacity) {
            newCar.engineCapacity = engineCapacity;
            return this;
        }

        public CarBuilder addPassengerCapacity(int passengerCapacity) {
            newCar.passengerCapacity = passengerCapacity;
            return this;
        }

        public CarBuilder setIsAirConditioning(boolean isAirConditioning) {
            newCar.isAirConditioning = isAirConditioning;
            return this;
        }

        public Car build() {
            return newCar;
        }
    }
}
