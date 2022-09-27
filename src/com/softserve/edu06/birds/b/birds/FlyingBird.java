package com.softserve.edu06.birds.b.birds;

class FlyingBird extends Bird {
    public FlyingBird(){};
    public FlyingBird(String name, boolean feathers, boolean layEggs){
        super(name, feathers, layEggs);
    }

    @Override
    boolean fly() {
        return true;
    }
}