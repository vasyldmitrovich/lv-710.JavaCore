package com.softserve.edu06Inheritance.hw.Birds;

public class FlyingBirds extends Bird{
    public FlyingBirds(String feathers, int layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
