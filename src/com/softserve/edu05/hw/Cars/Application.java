package com.softserve.edu05.hw.Cars;

public class Application {
    public static void main(String[] args) {
        MyInterface myInterface = new MyRealisationInterface();
        myInterface.runMyApp("Hello, my program started");
    }
}
