package com.softserve.hw07.task2;

public class Bus extends GroundVehicle{
    private String route;

    public Bus(String route, int passengers){
        this.route = route;
        setPassengers(passengers);
    }

    public String getRoute(){
        return route;
    }

    public void setRoute(String route){
        this.route=route;
    }

    @Override
    public void drive(){
    }
    
    
}
