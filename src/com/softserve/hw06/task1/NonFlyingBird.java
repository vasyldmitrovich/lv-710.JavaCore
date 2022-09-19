package com.softserve.hw06.task1;

public abstract class NonFlyingBird extends Bird {
    @Override
    public void fly() {
        System.out.println("Let's fly away? No-o-o-o-ope!");
    }
}
