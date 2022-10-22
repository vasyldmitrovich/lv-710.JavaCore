package com.softserve.hw06.task1;

public class Non_Flying_Bird extends Bird{



    @Override
    public String fly() {
        //super.fly();
        return ("This bird can not fly");
    }

    @Override
    public String toString() {
        return "Bird`s type: " +  super.getType() + "\n" + "Feathers: "+ super.getFeathers() + "\n" + "Flying/Non-flying: " + fly() + "\n\n";
    }

}
