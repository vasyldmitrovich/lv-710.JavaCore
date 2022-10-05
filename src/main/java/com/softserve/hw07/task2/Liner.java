package com.softserve.hw07.task2;

public class Liner extends WatterVehicle{

    private int floors;

    public Liner(int floors) {
        super(floors);
        this.floors = floors;
    }

    @Override
    public void isSailing() {
    }

    @Override
    public int getPassengers() {
        return super.getPassengers();
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
