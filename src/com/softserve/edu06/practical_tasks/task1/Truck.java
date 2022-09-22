package com.softserve.edu06.practical_tasks.task1;

public class Truck extends Car {

    @Override
    public void run() {
        System.out.println("Truck is running!");
    }

    @Override
    public void stop() {
        System.out.println("Truck is stopped!");
    }
}
