package com.softserve.hw06.task1;

public class Kiwi extends NonFlayingBird{

    @Override
    public Bird fly() {
        System.out.println("This bird can't fly");
        return null;
    }
}
