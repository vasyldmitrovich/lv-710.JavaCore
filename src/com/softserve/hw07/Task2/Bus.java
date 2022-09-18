package com.softserve.hw07.Task2;

public class Bus extends GroundVehicle{
    private String route;

    public Bus(String route) {
        this.route = route;
    }

    @Override
    void drive() {

    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
