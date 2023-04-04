package com.softserve.edu06.practik.Cars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyRealization {
    public static void createCars() {
        Car[] cars = new Car[4];
        cars[0] = new Truck(showMessageAndReturnInputData("Print a model"),
                Integer.parseInt(showMessageAndReturnInputData("Print a max speed")),
                Integer.parseInt((showMessageAndReturnInputData("Print a year of manufacture"))));
        cars[1] = new Truck(showMessageAndReturnInputData("Print a model"),
                Integer.parseInt(showMessageAndReturnInputData("Print a max speed")),
                Integer.parseInt((showMessageAndReturnInputData("Print a year of manufacture"))));
        cars[2] = new Truck(showMessageAndReturnInputData("Print a model"),
                Integer.parseInt(showMessageAndReturnInputData("Print a max speed")),
                Integer.parseInt((showMessageAndReturnInputData("Print a year of manufacture"))));
        cars[3] = new Truck(showMessageAndReturnInputData("Print a model"),
                Integer.parseInt(showMessageAndReturnInputData("Print a max speed")),
                Integer.parseInt((showMessageAndReturnInputData("Print a year of manufacture"))));
        for (Car car:
            cars ) {
            System.out.println(car.toString());
        }
    }
    public static String showMessageAndReturnInputData(String s) {
        System.out.println(s);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        try {
            result = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("You input wrong data");
        }
        return result;
    }

    public static void main(String[] args) {
        createCars();
    }
}
