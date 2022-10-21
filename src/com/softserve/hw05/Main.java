package com.softserve.hw05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task1
        Months months = new Months();
        months.daysCheck();

        //Task2
        Integers integers = new Integers();
        integers.input();

        //Task3
        Position position = new Position();
        position.postion();

        //Task4
        Car[] cars = new Car[4];

        cars[0] = new Car("Audi", 2020, 2.0);
        cars[1] = new Car("Mercedes", 2019, 3.0);
        cars[2] = new Car("BMW", 2020, 2.0);
        cars[3] = new Car("Volvo", 2017, 2.0);

        System.out.println("Please enter the year of production: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        Arrays.sort(cars);
        for (Car c:cars) {
            System.out.println(c.toString());


        }




    }
}