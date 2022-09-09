package com.softserve.hw05.extra_task;

public interface DrinkReceipt {

    String getName();

    DrinkReceipt addComponent(String componentName, int componentCount);

}
