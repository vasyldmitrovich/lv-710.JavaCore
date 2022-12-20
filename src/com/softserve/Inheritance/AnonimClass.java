package com.softserve.Inheritance;



import java.util.concurrent.Callable;

public class AnonimClass {
    public static void main(String[] args) {
        JackRassel jackRassel = new JackRassel() {
            public void eat() {
                System.out.println("Jack is eating...");
            }
        };
        jackRassel.eat();

    }
}
class JackRassel extends Dog {
}


