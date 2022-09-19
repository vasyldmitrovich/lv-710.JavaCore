package com.softserve.hw05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskRunner {
    public static void main(String[] args) throws IOException {
      //  task1();
       // task2();
        task3();
        task4();

    }

    public static void task1() throws IOException {
        System.out.println("~~~~~~~~~~~~~~ TASK 1 ~~~~~~~~~~~~~~~~~");
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter number of month");
        int dayOfMonth = Integer.parseInt(buffReader.readLine());
        Month result = Month.getByNumber(dayOfMonth);
        System.out.println("This month is  " + result);
        System.out.println("and it has %s days".formatted(result.getAmountOfDays()));
        int[] arrayOfDays = new int[result.getAmountOfDays()];
        System.out.println("Array is" + arrayOfDays);


    }


    public static void task2() {
        System.out.println("Task 2");
        int[] integers = new int[]{1, 2, -3, 10, 22, 4, 7, 9, 11, 33};
        System.out.println("Sum of integers = " + IntegerUtil.findArraySum(integers));

    }


    public static void task3() {
        System.out.println("Task 3");
        int[] integers = new int[]{-6, 32, -43, 105, 272};

        System.out.println("Second positive number is  " + IntegerNumberTask3.findSecondPositiveNumber(integers));
        System.out.println("Minimal number is   " + IntegerNumberTask3.findMinNumber(integers));
        System.out.println("sum of numbers =   " + IntegerNumberTask3.sumOfNumbers(integers));

    }

    public static void task4() throws IOException {
        Car car1 = new Car("crossover", 2020, 2580);
        Car car2 = new Car("hatchback", 2021, 2010);
        Car car3 = new Car("cabriolet", 2014, 1590);
        Car car4 = new Car("sedan", 2018, 1600);
        Car[] cars = new Car[] {car1, car2, car3, car4};
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter number certain model year ");
        int year = Integer.parseInt(buffReader.readLine());

        System.out.println("car by year is   " + CarUtil.findCarByYear(year, cars));
    }
}
