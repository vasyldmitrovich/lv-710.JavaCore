package com.softserve.hw05;

import com.softserve.hw05.input.InputReader;

import java.io.IOException;
import java.util.ArrayList;

public class Demo {

    private static void getMonthDays() throws IOException {
        System.out.print("Enter number of month: ");
        int monthNm = InputReader.getInputInt();
        int days = DaysOfMonth.getDaysOfMonth(monthNm);
        String name = DaysOfMonth.getMonthName(monthNm);

        System.out.println(name + " has " + days + " days.");
    }


    private static void get10Numbers() throws IOException {

        System.out.println("Enter 10 numbers: ");
        ArrayList<Integer> numbers10 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers10.add(InputReader.getInputInt());
        }

        Integer checkNum = 0;
        Integer result = 1;

        // pheck negative
        for (int i = 0; i < 5; i++) {
            checkNum += numbers10.get(i);
        }

        // check result
        if (checkNum < 0) {
            for (int i = 5; i < 10; i++) result *= numbers10.get(i);
            System.out.print("Product of last 5 elements: " + result);
        } else {
            result = checkNum;
            System.out.print("Sum of first 5 elements: " + result);
        }

    }


    private static void get5numbers() throws IOException {
        ArrayList<Integer> numbers5 = new ArrayList<>();

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers5.add(InputReader.getInputInt());
        }

        // find second positive number and its position
        int count = 0;
        int scndPositiveNumb = 0;
        int scndPositivePosition = 0;
        for (int i = 0; i < numbers5.size(); i++) {
            if (numbers5.get(i) > 0) {
                count++;
                if (count == 2) {
                    scndPositiveNumb = numbers5.get(i);
                    scndPositivePosition = numbers5.get(i);
                }
            }
        }
        if (count < 2) System.out.println("Array don't have second positive number");
        else System.out.println("Second positive number: " + scndPositiveNumb +
                ", its position: " + scndPositivePosition + ";");

        // find minimum number and its position
        Integer min = 0;
        for (int i = 0; i < numbers5.size(); i++) {
            if (numbers5.get(i) < min) min = numbers5.get(i);
        }

        int minNumber = min;
        int minPosition = numbers5.indexOf(min);
        System.out.println("Minimum number is: " + minNumber +
                ", its position: " + minPosition + ";");

        // find even numbers
        ArrayList<Integer> evenNm = new ArrayList<>();
        for (Integer value : numbers5) {
            if (value % 2 == 0) {
                evenNm.add(value);
            }
        }

        int prodOfAllEven = 1;
        for (Integer integer : evenNm) {
            prodOfAllEven *= integer;
        }
        if (evenNm.size() == 0)
            System.out.println("No even numbers for production.");
        else
            System.out.println("Production of all even numbers: "
                    + prodOfAllEven + ".");

    }


    private static void carCompare() throws IOException {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(2002, 3.2, "sedan"));
        cars.add(new Car(2010, 2.4, "sedan"));
        cars.add(new Car(2002, 2.1, "sedan"));
        cars.add(new Car(1978, 5.9, "sedan"));

        // Sorting based on year of production
        cars.sort(Car.compareYear);

        // Print cars list
        System.out.println("List of all cars:");
        for (Car car: cars)
            System.out.println(car);


        System.out.println("\n");
        System.out.print("Enter car production year: ");
        int searchYear = InputReader.getInputInt();
        for (Car car: cars) {
            if (car.getYearOfProduction() == searchYear)
                System.out.println(car);
        }

    }


    public static void demonstration() throws IOException {
        getMonthDays();
        get10Numbers();
        get5numbers();
        carCompare();
    }

}
