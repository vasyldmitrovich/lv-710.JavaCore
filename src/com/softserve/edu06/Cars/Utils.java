package com.softserve.edu06.Cars;

import java.util.ArrayList;

public class Utils {
    public static void run() {
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Truck("Renault", 150, 2015));
        carList.add(new Truck("Daf", 140, 2011));
        carList.add(new Sedan("Renault", 170, 2010));
        carList.add(new Truck("Scania", 160, 2020));
        carList.add(new Sedan("BMW", 240, 2018));
        carList.forEach(System.out::println);
    }
}
