package com.softserve.edu06Inheritance.hw.Birds;

public class NonFlyingBirds extends Bird {
    public NonFlyingBirds(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
