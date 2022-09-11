package com.softserve.hw05.tasks;

import com.softserve.IO.Input;
import com.softserve.IO.Output;
import com.softserve.hw05.tasks.classes.Car;

import java.util.Arrays;
import java.util.Random;

public class Task {
    public static void runTask(){

        // 1. Ask user to enter the number of month. Read the value and write the number of days in this month
        // (create array with amount days of each month).

//        Output.print("Please enter number of month to know amount of days");
//        int monthNumber = Input.inputInt("You need to enter  number of month, 5 fo example");
//        int[] months = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        Output.print(months[monthNumber-1]);

        // 2. Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product
        // of last 5 element in the other case.

//        int[] integerNumbers = new  int[10];
        Random random = new Random();
//        for (int i = 0; i < integerNumbers.length; i++){
//            integerNumbers[i] = random.nextInt(100) - 30;
//        }
//        Output.print(Arrays.toString(integerNumbers));
//
//        if (integerNumbers[1] > 0 && integerNumbers[2] > 0 && integerNumbers[3] > 0 &&
//                integerNumbers[4] > 0 && integerNumbers[0] > 0){
//            int sum = 0;
//            for (int i = 0; i < 5; i++)
//                sum += integerNumbers[i];
//            Output.print("The sum of firs 5 numbers is "+ sum);
//        } else {
//            int product = integerNumbers[5];
//            for (int i = 6; i < integerNumbers.length; i++)
//                product *= integerNumbers[i];
//            Output.print("The product of last 5 numbers is " + product);
//        }

        //3. Enter 5 integer numbers. Find
        // - position of second positive number;
        // - minimum and its position in the array.
        // - product of all entered even numbers.

        int[] numbers = new  int[5];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100) - 40;
        }
        Output.print(Arrays.toString(numbers));

        // - position of second positive number;

//        int secondPositiveNumberPosition = 0;
//        int secondPositiveNumber = 0;
//        int positiveNumberCounter = 0;
//        for (int i = 0; i < numbers.length; i++){
//            if (numbers[i] > 0)
//                positiveNumberCounter++;
//            if (positiveNumberCounter > 1){
//                secondPositiveNumberPosition = i + 1;
//                secondPositiveNumber = numbers[i];
//                Output.print("Second positive number is " + secondPositiveNumber + " and it position is "
//                        + secondPositiveNumberPosition);
//                break;
//            } else if (i == numbers.length - 1 && positiveNumberCounter < 2) {
//                Output.print("There is no second positive number in our array =(");
//            }
//        }

        // - minimum and its position in the array.

//        int minimum = numbers[0];
//        int minimumPosition = 1;
//        for (int i = 1; i < numbers.length; i++){
//            if (minimum > numbers[i]){
//                minimum = numbers[i];
//                minimumPosition = i + 1;
//            }
//        }
//        Output.print("Minimum numbers is " + minimum + ", and it position is " + minimumPosition);

        // - product of all entered even numbers.

//        int productOfEvenNumbers = 1;
//        for (int i = 0; i < numbers.length; i++){
//            if (numbers[i] % 2 == 0 && numbers[i] != 0){
//                productOfEvenNumbers *= numbers[i];
//            }
//        }
//        if (productOfEvenNumbers != 1){
//            Output.print("Product of all even numbers in our array is " + productOfEvenNumbers);
//        } else {Output.print("There is no even numbers in our array");}

        // 4. Create class Car with fields type, year of production and engine capacity.
        //    Create and initialize four instances of class Car. Display cars
        //    - certain model year  (enter year in the console);
        //    - ordered by the field year.

        Car firstCar = new Car("Audi A8", 2007, 2.8f);
        Car secondCar = new Car("Renault Megane", 2010, 1.5f);
        Car thirdCar = new Car("Mitsubishi Eclipse", 2022, 2.0f);
        Car[] cars = new Car[] {firstCar, secondCar, thirdCar};

        // Display cars certain model year  (enter year in the console);
//        Output.print("Pleas, enter car year of production to find needed model");
//        int inputYear = Input.inputInt("You need to enter car year of production, 2020 for example");
//        for (Car template : cars){
//            if (template.getYearOfProduction() == inputYear){
//                Output.print(template.getType() + " " + template.getYearOfProduction());
//            }
//        }

        //    - ordered by the field year.

//        boolean carsAreSorted = false;
//        while(!carsAreSorted){
//            for (int i = 1; i < cars.length; i++){
//                carsAreSorted = true;
//                if (cars[i].getYearOfProduction() < cars[i - 1].getYearOfProduction()){
//                    Car template = cars[i];
//                    cars[i] = cars[i - 1];
//                    cars[i - 1] = template;
//                    carsAreSorted = false;
//                }
//            }
//        }
//        for (Car template : cars)
//            Output.print(template.getType() + " " + template.getYearOfProduction());
    }

}
