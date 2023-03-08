package com.softserve.edu05.hw.Cars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MyRealisationInterface implements interfaceRunMethod, interfaceSortOfYear, interfaceSearchOfYear {
    @Override
    public void runMyApp(String s) {
        System.out.println(s);
        Car[] car = new Car[]{createCar(), createCar(), createCar(), createCar()};
        System.out.println(Arrays.asList(car));
        sortOfYear(car);
        searchOfYear(car);
    }
    public String showMessageAndReturnInputData(String s) {
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

    @Override
    public void sortOfYear(Car[] car) {
        int i;
        boolean b = false;
        Car tmp;
        while (b == false) {
            b = true;
            for (i = 0; i < car.length - 1; i++) {
                if (car[i].getYearOfProduction() > car[i + 1].getYearOfProduction()) {
                    b = false;
                    if (b == false) {
                        tmp = car[i];
                        car[i] = car[i + 1];
                        car[i + 1] = tmp;
                    }
                }
            }
        }
    }

    @Override
    public void searchOfYear(Car[] c) {
       int year = Integer.parseInt(showMessageAndReturnInputData("Input year of car for sorting"));
        int i;
        int e = 0;
        for (i = 0; i < c.length; i++) {
            {
                if (year == c[i].getYearOfProduction()) {
                    e = c[i].getYearOfProduction();
                    System.out.println(c[i]);
                }
            }
        }
    }

    public Car createCar() {
            Car c = new Car(showMessageAndReturnInputData("Input name of car"),
                    Integer.parseInt(showMessageAndReturnInputData("Input year of car")),
                    Double.parseDouble(showMessageAndReturnInputData("Input engine capacity of car")));
            System.out.println(c);
        return c;
    }
}