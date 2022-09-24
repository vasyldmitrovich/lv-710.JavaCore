package com.softserve.edu08.practical_tasks.task1;

public class Task1 {
    public void run() {
        Car car = Car.getCar()
                .setModel("BMW")
                .setColor("red")
                .setPassengerCapacity(4)
                .build();

        System.out.println(car);
    }
}
