package com.softserve.hw07.Task2;

public class Liner extends WaterVehicle{
    private int floors;
    public Liner(int floors) {
        this.floors = floors;
    }
    @Override
    void isSailing() {

    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
