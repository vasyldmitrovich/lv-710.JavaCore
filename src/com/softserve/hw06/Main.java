package com.softserve.hw06;

import com.softserve.hw06.task1.*;
import com.softserve.hw06.task2.Developer;
import com.softserve.hw06.task2.Employee;

public class Main {
    public static void main(String[] args) {
        //Task 1
        Bird birds[] = new Bird[4];

        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Chicken();

        for (int i = 0; i < birds.length; i++) {
            System.out.println(birds[i].toString());

        }

        //Task 2
        Employee emp1 = new Employee("Kate", 25, 30000);
        System.out.println(emp1.report());

        Developer dev1 = new Developer("Taras", 32, "Average Java Developer", 32735.35);
        System.out.println(dev1.report());




    }
}