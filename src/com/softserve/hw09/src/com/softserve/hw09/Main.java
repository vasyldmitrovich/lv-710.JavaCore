package com.softserve.hw09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1\n");
        Task1 task1 = new Task1();
        task1.set();

        //Task2
        System.out.println("\n Task 2\n");
        Task2 task2 = new Task2();
        task2.map();

        //Task3
        System.out.println("\n Task 3\n");
        List<Student> students = new ArrayList<>();

        students.add(new Student("Kate", 4));
        students.add(new Student("Luke", 3));
        students.add(new Student("Andie", 1));
        students.add(new Student("James", 5));
        students.add(new Student("Lee", 2));

        Collections.sort(students, new Student.compareByName());
        System.out.println(students);

        System.out.println("\n");

        Collections.sort(students, new Student.compareByCourse());
        System.out.println(students);
    }
}