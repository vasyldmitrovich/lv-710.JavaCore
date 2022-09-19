package com.softserve.edu06.practical_tasks.Task1;

public class Sedan extends Car {

    @Override
    public void run() {
        System.out.println("Sedan is running!");
    }

    @Override
    public void stop() {
        System.out.println("Sedan is stopped!");
    }
}
