package com.softserve.task1;

public class Flying_Bird extends Bird{
    @Override
    public String fly() {
        //super.fly();
        return ("This is a flying bird") ;
    }

    @Override
    public String toString() {
        return "Bird`s type: " +  getType() + "\n" + "Feathers: "+ getFeathers() + "\n" + "Flying/Non-flying: " + fly() + "\n\n";
    }
}
