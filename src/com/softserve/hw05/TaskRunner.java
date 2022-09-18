package com.softserve.hw05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskRunner {
    public static void main(String[] args) throws IOException {
        task1();
        task2();
        task3();

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
        int[] integers = new int[]{1,2,-3,10,22,4,7,9,11,33};
        System.out.println("Sum of integers = " + IntegerUtil.findArraySum(integers));

    }


    public static void task3() {

    }
}
