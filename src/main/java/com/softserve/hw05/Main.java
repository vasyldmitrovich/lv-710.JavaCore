package com.softserve.hw05;

import java.util.*;

public class Main {

    static Calculations calc = new Calculations();
    private static final int[] digits = {-3, -5, 4, 6, 9, -8, 0, 2, 1, -10};

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();


    }

    public static void task1() {
        calc.numberDaysMonth();
        calc.numberDaysInYear();
        calc.numberDaysInYearArr();
    }

    public static void task2() {
        calc.firstFivePosNum(digits);
    }

    public static void task3() {
        calc.positionOfSecondPositiveNum(digits);
        calc.indexOfSmallestValue(digits);
        calc.sumOfEvenNumbers(digits);
    }

    public static void task4() {
        Car car = new Car();

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", car.setYearOfProduction(), 3.0));
        cars.add(new Car("BMW", car.setYearOfProduction(), 2.5));

        car.sortByYear(cars);
    }

    public static void task5() {
    }
}
