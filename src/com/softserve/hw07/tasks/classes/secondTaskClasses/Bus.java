package com.softserve.hw07.tasks.classes.secondTaskClasses;

public class Bus extends GroundVehicle{

    private String route;

    public Bus() {

    }

    public Bus(String route, int passengers) {
        this.route = route;
        setPassengers(passengers);
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {

    }
}
