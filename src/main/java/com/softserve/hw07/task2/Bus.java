package com.softserve.hw07.task2;

public class Bus extends GroundVehicle {

    private String route;

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    @Override
    public void drive() {

    }
}
