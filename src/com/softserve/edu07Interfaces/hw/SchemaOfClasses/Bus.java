package com.softserve.edu07Interfaces.hw.SchemaOfClasses;

public class Bus extends GroundVehicle{
    public String route;

    public Bus() {
    }

    public Bus(int passengers, String route) {
        super(passengers);
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        super.drive();
    }
}
