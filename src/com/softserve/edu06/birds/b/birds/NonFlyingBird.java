package com.softserve.edu06.birds.b.birds;

class NonFlyingBird extends Bird{
    public NonFlyingBird(){};

    public NonFlyingBird(String name, boolean feathers, boolean layEggs){
        super(name, feathers, layEggs);
    }

    @Override
    boolean fly(){
        return false;
    }

}
