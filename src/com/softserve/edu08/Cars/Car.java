package com.softserve.edu08.Cars;

import java.time.LocalDate;

public class Car {
    private String model;
    private LocalDate dataOfProduction;
    private double engineCapacity;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioning;

    private Car() {
    }

    public static CarBuilder getCar(){
        return new Car().new CarBuilder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", dataOfProduction=" + dataOfProduction +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", isAirConditioning=" + isAirConditioning +
                '}';
    }

    public class CarBuilder {
        private final Car car = new Car();

        public CarBuilder addModel(String model) {
            car.model = model;
            return this;
        }

        public CarBuilder addDataOfProduction(LocalDate dataOfProduction) {
            car.dataOfProduction = dataOfProduction;
            return this;
        }

        public CarBuilder addEngineCapacity(double engineCapacity) {
            car.engineCapacity = engineCapacity;
            return this;
        }

        public CarBuilder addColor(String color) {
            car.color = color;
            return this;
        }

        public CarBuilder addPassengerCapacity(int passengerCapacity) {
            car.passengerCapacity = passengerCapacity;
            return this;
        }

        public CarBuilder addIsAirConditioning(boolean isAirConditioning) {
            car.isAirConditioning = isAirConditioning;
            return this;
        }

        public Car build() {
            return car;
        }
    }
}
