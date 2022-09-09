package com.softserve.hw06.Birds;

public class NonFlyingBird extends Bird {
    NonFlyingBird() {
        this.fly = false;
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
