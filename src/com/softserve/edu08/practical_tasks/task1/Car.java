package com.softserve.edu08.practical_tasks.task1;

import java.time.LocalDate;

public class Car {
    private String model;
    private LocalDate dateOfProduction;
    private double engineCapacity;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioning;

    private Car() {
    }

    public String getModel() {
        return model;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public boolean isAirConditioning() {
        return isAirConditioning;
    }

    public static CarBuilder getCar() {
        return new Car.CarBuilder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", dateOfProduction=" + dateOfProduction +
                ", engineCapacity=" + engineCapacity +
                ", color=" + color +
                ", passengerCapacity=" + passengerCapacity +
                ", isAirConditioning=" + isAirConditioning +
                '}';
    }

    public static class CarBuilder implements Builder<CarBuilder> {
        private Car car;

        public CarBuilder() {
            this.car = new Car();
        }

        @Override
        public CarBuilder setModel(String model) {
            this.car.model = model;
            return this;
        }

        @Override
        public CarBuilder setDateOfProduction(LocalDate dateOfProduction) {
            this.car.dateOfProduction = dateOfProduction;
            return this;
        }

        @Override
        public CarBuilder setEngineCapacity(double engineCapacity) {
            this.car.engineCapacity = engineCapacity;
            return this;
        }

        @Override
        public CarBuilder setColor(String color) {
            this.car.color = color;
            return this;
        }

        @Override
        public CarBuilder setPassengerCapacity(int passengerCapacity) {
            this.car.passengerCapacity = passengerCapacity;
            return this;
        }

        @Override
        public CarBuilder setAirConditioning(boolean airConditioning) {
            this.car.isAirConditioning = airConditioning;
            return this;
        }

        public Car build() {
            return car;
        }
    }
}
