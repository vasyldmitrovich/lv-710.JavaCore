package com.softserve.edu06.birds.b.birds;


/**
 * Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().
 * Develop classes FlyingBird and NonFlyingBird.
 * Create class Eagle, Swallow, Penguin and Chicken.
 * Create array Bird and add different birds to it.
 * Call fly() method for all of it. Output the information about  each type of created bird.
 */

abstract class Bird {
    public String name;
    public boolean feathers;
    public boolean layEggs;

    public Bird(){};

    public Bird(String name,boolean feathers,boolean layEggs){
        this.name = name;
        this.feathers = feathers;
        this.layEggs = layEggs;

    }

    abstract boolean fly();

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;

    }
    public void setFeathers(boolean feathers){
        this.feathers = feathers;
    }
    public void setLayEggs(boolean layEggs){
        this.layEggs = layEggs;
    }
}
