package com.softserve.edu08NestedClasses.hw.Wrapper;

public class App {
    public static void main(String[] args) {
        Wrapper <Integer>wrapperInt = new Wrapper<>();
        Wrapper <String>wrapperString = new Wrapper<>();
        Wrapper <Boolean>wrapperBoolean = new Wrapper<>();
        wrapperInt.setValue(5768);
        wrapperString.setValue("Hello");
        wrapperBoolean.setValue(true);
        System.out.println(wrapperInt.getValue());
        System.out.println(wrapperString.getValue());
        System.out.println(wrapperBoolean.getValue());


    }
}
