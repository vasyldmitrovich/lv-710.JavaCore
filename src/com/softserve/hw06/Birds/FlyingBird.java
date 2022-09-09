package com.softserve.hw06.Birds;

public class FlyingBird extends Bird {
    FlyingBird() {
        this.fly = true;
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
